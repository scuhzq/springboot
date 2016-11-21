package com.he;

import com.he.core.SinaWbUtil;
import com.he.domain.AbstractEntity;
import com.he.util.MathUtil;
import com.he.util.RandomUtil;
import org.junit.Test;

/**
 * Created by hzq on 16/11/15.
 */
public class Test1 {

	@Test
	public void testEqualAndHashCode(){
		AbstractEntity a1 = new AbstractEntity();
		a1.setId(1L);

		AbstractEntity a2 = new AbstractEntity();
		a2.setId(1L);

		System.out.println(a1.equals(a2));
	}

	@Test
	public void testRandomNum(){
		Long code = RandomUtil.generateRandomNumByLength(6);
		System.out.println(code);
	}

	@Test
	public void testRandomUUID(){
		String slug = RandomUtil.generateUUID();
		System.out.println(slug);
	}

	@Test
	public void testMathUtil(){
		Long price = 1999L;
		System.out.println(MathUtil.convert2Doller(price));

		Double doller = 19.99;
		System.out.println(MathUtil.convert2Cent(doller));

		System.out.println(int.class);
		System.out.println(Integer.class);
		System.out.println(Integer.TYPE);
	}

	@Test
	public void testWbShortUrl(){
		String longUrl = "http://weike.duobeiyun.com/course/jz94cbf0ba24ac4cd3a2eec4a6d313e183";
		System.out.println(SinaWbUtil.generateShortUrlByWb(longUrl));
	}
}
