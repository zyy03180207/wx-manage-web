package com.program.wxmanage.util;

import java.io.UnsupportedEncodingException;

public class StringUtil {

	public static boolean isEmpty(Object object) {
		if (object != null) {
			if (object instanceof String) {
				if (!object.equals(""))
					return false;
				return true;
			}
			return false;
		}
		return true;
	}
	
	public static String utfToIso(String str) {
		String ss = "";
		try {
			ss = new String(str.getBytes("utf-8"), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return ss;
	}
}
