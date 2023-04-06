package post02;

import java.io.File;

public class PostFile {
	// field
	private static final String FOLDER = "data";
	private static final String FILE = "data/post.dat";
	
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
		}
	}
	
}
