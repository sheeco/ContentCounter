package pers.sunyunmiao.qfc.contentcounter.entity;

import com.google.common.base.MoreObjects;

import java.net.MalformedURLException;
import java.net.URL;

public class CountResult {

//	private String url;
	private URL url;
	private String title;
	private int countCharacter;
	private int countChinese;
	private int countEnglish;
	private int countPunctuation;

	public CountResult(URL url, String title, int countCharacter, int countChinese,
	                   int countEnglish, int countPunctuation) throws MalformedURLException {

		this.setUrl(url);
		this.setTitle(title);
		this.setCountCharacter(countCharacter);
		this.setCountChinese(countChinese);
		this.setCountEnglish(countEnglish);
		this.setCountPunctuation(countPunctuation);
	}

	public CountResult() throws MalformedURLException {

		this(new URL("http://"), "无标题", 0, 0, 0, 0);
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

	public int getCountChinese() {
		return countChinese;
	}

	public void setCountChinese(int countChinese) {
		this.countChinese = countChinese;
	}

	public int getCountEnglish() {
		return countEnglish;
	}

	public void setCountEnglish(int countEnglish) {
		this.countEnglish = countEnglish;
	}

	public int getCountPunctuation() {
		return countPunctuation;
	}

	public void setCountPunctuation(int countPunctuation) {
		this.countPunctuation = countPunctuation;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("url", url)
				.add("title", title)
				.add("countCharacter", countCharacter)
				.add("countChinese", countChinese)
				.add("countEnglish", countEnglish)
				.add("countPunctuation", countPunctuation)
				.toString();
	}
}
