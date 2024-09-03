package model;

public class Member {

	private String id;
	private String pw;
	private String name;
	private int clear;

	public Member(String id, String pw, String name, int clear) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.clear = clear;
	}

	public Member(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public int getClear() {
		return clear;
	}

	public void setClear(int rank) {
		this.clear = clear;
	}

	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public Member(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
