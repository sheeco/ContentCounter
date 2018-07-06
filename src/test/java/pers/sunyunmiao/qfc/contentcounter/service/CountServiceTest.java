package pers.sunyunmiao.qfc.contentcounter.service;

import org.junit.Test;
import pers.sunyunmiao.qfc.Utils;
import pers.sunyunmiao.qfc.contentcounter.entity.CountResult;

public class CountServiceTest {

	private static String[] demoUrls = {
			"https://www.poetryfoundation.org/poems/47311/the-waste-land",
			"https://site.douban.com/129080/widget/notes/6290577/note/194889247/",
	};

	@Test
	public void count() throws Exception {
		String sample = "english chracters 中文字符 .,?;-";
		int[] answers = {25, 4, 16, 5};
//		Assert.assertEquals(CountService.countCharacter(sample), answers[0]);
//		Assert.assertEquals(CountService.countChinese(sample), answers[1]);
//		Assert.assertEquals(CountService.countEnglish(sample), answers[2]);
//		Assert.assertEquals(CountService.countPunctuation(sample), answers[3]);
		System.out.println("Counting characters in sample string \"" + sample + "\":");
		System.out.println("Total(non-whitespace): " + CountService.countCharacter(sample));
		System.out.println("Chinese: " + CountService.countChinese(sample));
		System.out.println("English: " + CountService.countEnglish(sample));
		System.out.println("Punctuation: " + CountService.countPunctuation(sample));

		for (String url : demoUrls) {

			System.out.println("\nCounting content from url \"" + url + "\":");
			CountResult result = CountService.count(url);
			System.out.println(result.toString());
		}
	}

}