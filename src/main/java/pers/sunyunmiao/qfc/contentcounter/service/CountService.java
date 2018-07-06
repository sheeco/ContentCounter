package pers.sunyunmiao.qfc.contentcounter.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import pers.sunyunmiao.qfc.Utils;
import pers.sunyunmiao.qfc.contentcounter.entity.CountResult;

import java.io.IOException;
import java.net.URL;

class CountService {

	public static CountResult count(String url) throws IOException {

		//		String html = Utils.downloadTextFromUrl(url),
		Document document = Jsoup.connect(url).get();
		String title = document.title();
		//Strip text out from html documents
		String text = document.text();
		int countCharacter = countCharacter(text),
				countChineseCharacter = countChinese(text),
				countEnglishCharacter = countEnglish(text),
				countPunctuation = countPunctuation(text);

		CountResult result = new CountResult(new URL(url), title, countCharacter, countChineseCharacter,
				countEnglishCharacter,countPunctuation);
		return result;
	}

	/**
	 * Count non-whitespace characters in <a>text</a>.
	 * @param text
	 * @return
	 */
	public static int countCharacter(String text) {
		return Utils.countMatch(text, "\\S");
	}

	public static int countChinese(String text) {
//		//java7
//		return Utils.countMatch(text, "\\p{Han}");
		//java8
		return Utils.countMatch(text, "\\p{sc=Han}");
	}

	public static int countEnglish(String text) {
		return Utils.countMatch(text, "[a-zA-z]");
	}

	/**
	 * Consider all the non-whitespace characters except Chinese/English characters as punctuation.
	 * (including number digits)
	 * @param text
	 * @return
	 */
	public static int countPunctuation(String text) {
		return countCharacter(text) - countChinese(text) - countEnglish(text);
	}
}
