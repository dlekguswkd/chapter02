package com.javaex.ex05;

public class Song {
	
	//필드
	private String title; //노래의 제목
	private String artist; //가수
	private String album;  //앨범제목
	private String composer;  //작곡가
	private int year; //발표된 연도
	private String track;  //트랙번호
	
	//생성자
	public Song() {
		
	}
	
	public Song(String title, String artist, String album, String composer, int year, String track) {
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}
	
	/*
	 //필드 5개 로직
	 public Song(String title, String artist, String album, String composer, int year) {
	 //메모리에 올리기
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
	 	
	 	if (yaer>=2000) {
	 	   this.year=year;
	 	}else{
	 		this.year=0;
	 	}
	 }
	 	
	 //필드 6개짜리 따로
	   public Song(String title, String artist, String album, String composer, int year, String track) {
	 		this.(title, artist, album, composer, year);  //Song 5개
	 		
	 		this.track=track;
	 	}	
	 */
	
	//메소드-g/s
	//title 저장
	public void setTitle(String title) {
		this.title=title;
	}
	//title 읽기
	public String getTitle() {
		return title;
	}
	
	//artist 저장
	public void setArtist(String artist) {
		this.artist=artist;
	}
	//artist 읽기
	public String getArtist() {
		return artist;
	}
	
	//album 저장
	public void setAlbum(String album) {
		this.album=album;
	}
	//album 읽기
	public String getAlbum() {
		return album;
	}
	
	//composer 저장
	public void setComposer(String composer) {
		this.composer=composer;
	}
	//composer 읽기
	public String getComposer() {
		return composer;
	}
	
	//year 저장
	public void setYear(int year) {
		this.year=year;
	}
	//year 읽기
	public int getYear() {
		return year;
	}
	
	//track 저장
	public void setTrack(String track) {
		this.track= track;
	}
	//track 읽기
	public String getTrack() {
		return track;
	}
	
	//메소드-일반
	public void showInfo() {
		System.out.println(artist+", "+title+ " ("+album+ ", "+year+", "+track+" track, "+composer+" 작곡)");
	}
	
	

}
