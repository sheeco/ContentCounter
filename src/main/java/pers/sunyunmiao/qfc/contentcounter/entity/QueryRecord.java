package pers.sunyunmiao.qfc.contentcounter.entity;

import java.net.URL;

public class QueryRecord {

//	private String url;
	private URL url;
	private String title;
	private int countCharacter;
	private int countChineseCharacter;
	private int countEnglishCharacter;
	private int countPunctuation;

	public QueryRecord() {

		this.setUrl(null);
		this.setTitle("无标题");
		this.setCountCharacter(0);
		this.setCountChineseCharacter(0);
		this.setCountEnglishCharacter(0);
		this.setCountPunctuation(0);
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCountCharacter() {
		return countCharacter;
	}

	public void setCountCharacter(int countCharacter) {
		this.countCharacter = countCharacter;
	}

	public int getCountChineseCharacter() {
		return countChineseCharacter;
	}

	public void setCountChineseCharacter(int countChineseCharacter) {
		this.countChineseCharacter = countChineseCharacter;
	}

	public int getCountEnglishCharacter() {
		return countEnglishCharacter;
	}

	public void setCountEnglishCharacter(int countEnglishCharacter) {
		this.countEnglishCharacter = countEnglishCharacter;
	}

	public int getCountPunctuation() {
		return countPunctuation;
	}

	public void setCountPunctuation(int countPunctuation) {
		this.countPunctuation = countPunctuation;
	}
}
