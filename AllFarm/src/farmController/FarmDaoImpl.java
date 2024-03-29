package farmController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Ojdbc.OracleUtil;
import farmModel.Crop;
import logModel.LoginInfo;
import static farmModel.Crop.Entity.*;

public class FarmDaoImpl implements FarmDao{
	
	private static FarmDaoImpl instance = null;
	private FarmDaoImpl() {}
	public static FarmDaoImpl getinstance() {
		if (instance == null) {
			instance = new FarmDaoImpl();
		}
		return instance;
	}

	
	private static final String SQL_CREATE_NEW_CROP = String.format("insert into %s values(?, ?, ?, ?)", CROP_TBL_NAME);
	
	@Override
	public int createNewCrop(Crop crop) {
		int result = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = OracleUtil.getConnection();
			System.out.println(SQL_CREATE_NEW_CROP);
			stmt = conn.prepareStatement(SQL_CREATE_NEW_CROP);
			stmt.setString(1, crop.getId());
			stmt.setString(2, crop.getName());
			stmt.setDouble(3, crop.getLevelPoint());
			stmt.setString(4, crop.getType());
			
			result = stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				OracleUtil.closeResources(conn, stmt);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	private static final String SQL_GET_CROPINFO = String.format("select * from %s where %s = ?", 
			CROP_TBL_NAME, CROP_COL_ID);
	
	@Override
	public Crop getCropInfo(LoginInfo loginInfo) {
		Crop crop = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = OracleUtil.getConnection();
			System.out.println(SQL_GET_CROPINFO);
			stmt = conn.prepareStatement(SQL_GET_CROPINFO);
			stmt.setString(1, loginInfo.getId());
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(CROP_COL_ID);
				String name = rs.getString(CROP_COL_NAME);
				double levelpoint = rs.getDouble(CROP_COL_LEVELPOINT);
				String type = rs.getString(CROP_COL_TYPE);
				
				crop = new Crop(id, name, levelpoint, type);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				OracleUtil.closeResources(conn, stmt, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return crop;
	}
	
	
	
	@Override
	public void watering(Crop crop) {
		Crop resultCrop = null;
		double result = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = OracleUtil.getConnection();
			System.out.println(SQL_GET_CROPINFO);
			stmt = conn.prepareStatement(SQL_GET_CROPINFO);
			stmt.setString(1, crop.getId());
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(CROP_COL_ID);
				String name = rs.getString(CROP_COL_NAME);
				double levelpoint = rs.getDouble(CROP_COL_LEVELPOINT);
				String type = rs.getString(CROP_COL_TYPE);
				
				levelpoint += 10;
				
				resultCrop = new Crop(id, name, levelpoint, type);
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				OracleUtil.closeResources(conn, stmt, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
