package com.matsuura.FaceMusicBatch.util;

public class CommonUtil {

	/** 数字のみが含まれているかを判定する関数です **/

	public static boolean isAllNumber(String number) {

		boolean flag = true;

		for (int i=0; i < number.length(); i++) {

			if (Character.isDigit(number.charAt(i))) {

				continue;

			} else {

				flag = false;
				break;

			}
		}

		return flag;
	}

}
