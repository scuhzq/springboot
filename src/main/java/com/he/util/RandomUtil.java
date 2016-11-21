package com.he.util;

import java.util.Random;
import java.util.UUID;

/**
 * Created by hzq on 16/11/15.
 */
public class RandomUtil {

	public static Long generateRandomNumByLength(int length){
		if(length <= 0){
			return 0L;
		}

		Random random = new Random();
		StringBuffer sb = new StringBuffer();

		for(int i = 0; i < length; i++){
			if(i == 0){
				sb.append(random.nextInt(9) + 1);
			} else {
				sb.append(random.nextInt(10));
			}
		}

		return Long.valueOf(sb.toString());
	}

	public static String generateUUID(){
		String slug = UUID.randomUUID().toString().replace("-", "");
		return slug;
	}

}
