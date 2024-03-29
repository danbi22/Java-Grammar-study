package recorderController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.OracleDriver;
import static recoderOjdbc.OracleConnect.*;
import static recorderModel.Recorder.Entity.*;


import recorderModel.Recorder;

public class RecorderDaoImpl implements RecorderDao{
	
	private static RecorderDaoImpl instance = null;
	
	private RecorderDaoImpl() {}
	
	public static RecorderDaoImpl getInstance() {
		if (instance == null) {
			instance = new RecorderDaoImpl();
		}
		return instance;
	}
	
	private Connection getConnection() throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		return conn;
	}
	
	private void closeResources(Connection conn, Statement stmt, ResultSet rs) throws SQLException {
		rs.close();
		stmt.close();
		conn.close();
	}
	
	private void closeResources(Connection conn, Statement stmt) throws SQLException {
		stmt.close();
		conn.close();
	}
	
	private static final String SQL_INSERT = String.format("insert into recorder (%s, %s, %s, %s, %s) values (?, ?, ?, ?, ?)", 
			COL_NAME, COL_INIT, COL_GROW, COL_FIN, COL_MEMO);
	
	@Override
	public int create(Recorder recorder) {
		int result = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = getConnection();
			
			stmt = conn.prepareStatement(SQL_INSERT);
			System.out.println(SQL_INSERT);
			stmt.setString(1, recorder.getName());
			stmt.setDouble(2, recorder.getInitialValue());
			stmt.setDouble(3, recorder.getGrowthRate());
			stmt.setDouble(4, recorder.getFinalValue());
			stmt.setString(5, recorder.getMemo());
			
			result = stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeResources(conn, stmt);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	private final String SQL_SELECT_ALL = "select * from recorder order by id";
	
	@Override
	public List<Recorder> read() {
		List<Recorder> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			System.out.println(SQL_SELECT_ALL);
			stmt = conn.prepareStatement(SQL_SELECT_ALL);
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(COL_ID);
				String name = rs.getString(COL_NAME);
				double initialValue = rs.getDouble(COL_INIT);
				double growthRate = rs.getDouble(COL_GROW);
				double finalValue = rs.getDouble(COL_FIN);
				String memo = rs.getString(COL_MEMO);
				
				Recorder recorder = new Recorder(id, name, initialValue, growthRate, finalValue, memo);
				list.add(recorder);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				closeResources(conn, stmt, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	private final String SQL_UPDATE = String.format("update %s set %s = ?, %s = ?, %s = ?, %s = ?, %s = ? where %s = ?", 
			TBL_NAME, COL_NAME, COL_INIT, COL_GROW, COL_FIN, COL_MEMO, COL_ID);
	
	@Override
	public int update(Recorder recorder) {
		int result = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = getConnection();
			System.out.println(SQL_UPDATE);
			stmt = conn.prepareStatement(SQL_UPDATE);
			stmt.setString(1, recorder.getName());
			stmt.setDouble(2, recorder.getInitialValue());
			stmt.setDouble(3, recorder.getGrowthRate());
			stmt.setDouble(4, recorder.getFinalValue());
			stmt.setString(5, recorder.getMemo());
			stmt.setInt(6, recorder.getId());
			
			result = stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeResources(conn, stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	private final String SQL_DELETE = String.format("delete from %s where %s = ?", TBL_NAME, COL_ID);
	
	@Override
	public int delete(Integer id) {
		int result = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = getConnection();
			System.out.println(SQL_DELETE);
			
			stmt = conn.prepareStatement(SQL_DELETE);
			stmt.setInt(1, id);
			
			result = stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeResources(conn, stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return 0;
	}
	
	

}