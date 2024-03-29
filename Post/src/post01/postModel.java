package post01;

import java.time.LocalDateTime;

public class postModel {
	private int pid;
	private String title;
	private String content;
	private String author;
	private LocalDateTime createdTime;
	private LocalDateTime modifiedTime;
	
	public postModel() {}

	public postModel(int pid, String title, String content, String author, LocalDateTime createdTime, LocalDateTime modifiedTime) {
		this.pid = pid;
		this.title = title;
		this.content = content;
		this.author = author;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}

	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(LocalDateTime modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	
	@Override
	public String toString() {
		return String.format("post(pid=%d, title=%s, content=%s, author=%s, createdTime=%s, modifiedTime=%s)", 
				pid, title, content, author, createdTime, modifiedTime);
	}
	

}