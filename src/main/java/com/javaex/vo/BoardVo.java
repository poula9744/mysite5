package com.javaex.vo;

public class BoardVo {
	
	//필드
	private int no;
	private String title;
	private String name;
	private int hits;
	private String regDate;
	private String content;
	
	
	//생성자
	public BoardVo() {
		super();
	}


	public BoardVo(int no, String title, String name, int hits, String regDate, String content) {
		super();
		this.no = no;
		this.title = title;
		this.name = name;
		this.hits = hits;
		this.regDate = regDate;
		this.content = content;
	}

	//메소드 - g/s
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHits() {
		return hits;
	}


	public void setHits(int hits) {
		this.hits = hits;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}

	//메소드 - 일반
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", title=" + title + ", name=" + name + ", hits=" + hits + ", regDate=" + regDate
				+ ", content=" + content + "]";
	}

	

	
	
	
}
