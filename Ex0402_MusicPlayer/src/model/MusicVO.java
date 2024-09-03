package model;

public class MusicVO {
	
	// value object
	private String title;
	private String singer;
	private String path;
	
	// 메소드(생성자, Getter, toString)
	public MusicVO(String title, String singer, String path) {
		super();
		this.title = title;
		this.singer = singer;
		this.path = path;
	}
	@Override
	public String toString() {
		return ". "+singer+" - "+title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}


	
	
	

}
