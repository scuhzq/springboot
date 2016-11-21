package com.he.util;

import java.lang.reflect.Method;
import java.math.BigDecimal;

/**
 * Created by hzq on 16/11/16.
 */
public class MathUtil {

	public static <T> T add(Number addNum1, Number addNum2, Class<T> clazz){
		BigDecimal bd1 = new BigDecimal(addNum1.toString());
		BigDecimal bd2 = new BigDecimal(addNum2.toString());

		try {
			return convert2Number(bd1.add(bd2), clazz);
		} catch (Throwable t){
			throw new RuntimeException(t.getMessage(), t);
		}

	}

	public static <T> T subtract(Number maxNum, Number subNum, Class<T> clazz){
		BigDecimal bd1 = new BigDecimal(maxNum.toString());
		BigDecimal bd2 = new BigDecimal(subNum.toString());

		try {
			return convert2Number(bd1.subtract(bd2), clazz);
		} catch (Throwable t){
			throw new RuntimeException(t.getMessage(), t);
		}
	}


	public static <T> T mutiply(Number number, Number mulNum, Class<T> clazz){
		BigDecimal bd1 = new BigDecimal(number.toString());
		BigDecimal bd2 = new BigDecimal(mulNum.toString());

		try {
			return convert2Number(bd1.multiply(bd2), clazz);
		} catch (Throwable t){
			throw new RuntimeException(t.getMessage(), t);
		}
	}

	public static <T> T divide(Number number, Number divNum, Class<T> clazz){
		BigDecimal bd1 = new BigDecimal(number.toString());
		BigDecimal bd2 = new BigDecimal(divNum.toString());

		try {
			return convert2Number(bd1.divide(bd2), clazz);
		} catch (Throwable t){
			throw new RuntimeException(t.getMessage(), t);
		}
	}

	public static long convert2Cent(double price){
		return mutiply(price, 100, Long.class);
	}

	public static double convert2Doller(long price){
		return divide(price, 100, Long.class);
	}

	private static <T> T convert2Number(BigDecimal bigDecimal, Class<T> clazz) throws Exception{
		if(clazz.equals(Integer.class)){
			Method method = clazz.getMethod("valueOf", int.class);
			return (T)method.invoke(null, bigDecimal.intValue());
		} else if(clazz.equals(Long.class)){
			Method method = clazz.getMethod("valueOf", long.class);
			return (T)method.invoke(null, bigDecimal.longValue());
		} else if(clazz.equals(Double.class)){
			Method method = clazz.getMethod("valueOf", double.class);
			return (T)method.invoke(null, bigDecimal.doubleValue());
		} else if(clazz.equals(Float.class)){
			Method method = clazz.getMethod("valueOf", float.class);
			return (T)method.invoke(null, bigDecimal.floatValue());
		} else {
			throw new RuntimeException("不是Number类型");
		}
	}

}
