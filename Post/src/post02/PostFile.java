package post2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PostFile {
	// field
	private static final String FOLDER = "data";
	private static final String FILE = "data/post.dat";
	
	// constructor
	private PostFile() {}
	
	// method
	public static void makeFolder() {
		File folder = new File(FOLDER);
		
		if (folder.exists()) {
			System.out.println("폴더가 이미 있습니다.");
			return;
		}
		
		folder.mkdir();
		System.out.println("폴더를 생성 하였습니다.");	
	}
	
	public static void makeFile() {
		File file = new File(FILE);
		if (file.exists()) {
			System.out.println("파일이 이미 있습니다.");
			return;
		}
		try {
			file.createNewFile();
			System.out.println("파일을 생성하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 파일을 불러와 리스트 형태로 리턴
	 */
	public static List<PostModel> readFile(){ 
		File file = new File(FILE);
		if (file.exists()) {
			try (FileInputStream in = new FileInputStream(FILE);
					BufferedInputStream bin = new BufferedInputStream(in);
					ObjectInputStream oin =  new ObjectInputStream(bin); 
			){
				List<PostModel> list = (List<PostModel>) oin.readObject();
				return list;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		List<PostModel> empty = new ArrayList<>();
		return empty;
	}
	
	/**
	 * 리스트를 받아와 파일에 쓰기
	 */
	public static void writeToFile(List<PostModel> list) {
		try (FileOutputStream out = new FileOutputStream(FILE);
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oout = new ObjectOutputStream(bout);
		){
			oout.writeObject(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}