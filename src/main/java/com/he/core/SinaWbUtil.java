package com.he.core;

import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;

/**
 * Created by hzq on 16/11/21.
 */
public class SinaWbUtil {

	public static String wbApiUrl = "https://api.weibo.com/2/short_url/shorten.json";
	//1313188015
	//2450803749
	public static String source = "2450803749";

	public static String generateShortUrlByWb(String longUrl){
		String shortUrl = "";

		try {
			shortUrl = Jsoup.connect(wbApiUrl)
					.data("url_long", longUrl)
					.data("source", source)
					.ignoreContentType(true)
					.timeout(1000 * 6)
					.post().text();

			JSONObject jsonObject = JSONObject.parseObject(shortUrl);
			shortUrl = jsonObject.getJSONArray("urls").getJSONObject(0).getString("url_short");
		} catch (Throwable t){
			throw new RuntimeException("转换新浪微博短链接失败");
		}

		return shortUrl;
	}

}
