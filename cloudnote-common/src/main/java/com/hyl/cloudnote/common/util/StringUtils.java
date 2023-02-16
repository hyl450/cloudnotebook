package com.hyl.cloudnote.common.util;

import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/1/30 8:19
 * @description :
 */
public class StringUtils {

	/**
	 * 验证字符串是否为空
	 *
	 * @param str 验证对象
	 * @return 非空:true,null:false,空:false
	 */
	public static boolean isNotEmpty(String str) {
		return str != null && str.trim().length() > 0;
	}

	/**
	 * 验证字符串是否为长整数
	 *
	 * @param str 验证对象
	 * @return 是:true,其他:false
	 */
	public static boolean isLongNumber(String str) {
		try {
			Long.parseLong(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	/**
	 * 验证字符串是否为数字
	 *
	 * @param str 验证对象
	 * @return 是:true,其他:false
	 */
	public static boolean isNumber(String str) {
		try {
			Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static String replace(String str, String[] args) {
		String result = str;
		for (int i = 0; i < args.length; i++) {
			result = result.replaceAll("\\{" + i + "\\}", args[i]);
		}

		return result;
	}

	/**
	 * 验证字符串数组是否包含指定的字符串
	 *
	 * @param str 验证对象
	 * @return 是:true,其他:false
	 */
	public static boolean isContains(String str, String[] args) {
		boolean isContain = false;
		for (String string : args) {
			if (string.equals(str)) {
				isContain = true;
				break;
			}
		}
		return isContain;
	}

	/**
	 * 对象为NULL时，转换为空
	 *
	 * @param obj 验证对象
	 * @return 空对象
	 */
	public static String convertEmptyWhenNull(Object obj) {
		if (obj == null) {
			return "";
		} else {
			return obj.toString();
		}
	}

	/**
	 * 验收数字是否为正数
	 *
	 * @param str 验证对象
	 * @return 正数:true,其他:false
	 */
	public static boolean isPositiveNum(String str) {
		Pattern pattern = null;
		if (str == null) {
			return false;
		}
		pattern = Pattern.compile("^\\d+$");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}

	/**
	 * 验证两个对象是否相等
	 *
	 * @param obj1 对象一
	 * @param obj2 对象二
	 * @return 相等 true，不相等：false
	 */
	public static boolean isEqual(Object obj1, Object obj2) {
		if (obj1 == null && obj2 == null) {
			return true;
		} else if (obj1 == null) {
			return false;
		} else if (obj2 == null) {
			return false;
		} else {
			return obj1.equals(obj2);
		}
	}

	/**
	 * 验证对象是否为空或NULl
	 *
	 * @param str 验证对象
	 * @return 处理结果 空/Null:true,否则:false
	 */
	public static boolean isEmptyOrNull(Object str) {
		if ("".equals(str) || null == str) {
			return true;
		}
		return false;
	}

	/**
	 * 验证字符串是否为空字符串或NULl
	 *
	 * @param str 验证对象
	 * @return 处理结果 空/Null:true,否则:false
	 */
	public static boolean isSpaceOrNull(String str) {
		if (null == str || "".equals(str.trim())) {
			return true;
		}
		return false;
	}

	/**
	 * 验证对象不为空也不为NULL
	 *
	 * @param str 验证对象
	 * @return 处理结果 空/Null:true,否则:false
	 */
	public static boolean isNotEmptyOrNull(Object str) {
		if (!"".equals(str) && null != str) {
			return true;
		}
		return false;
	}

	/**
	 * 验证对象是否为null
	 *
	 * @param str 验证对象
	 * @return 处理结果 null:true,否则:false
	 */
	public static boolean isNull(Object str) {
		if (null == str || "".equals(str)) {
			return true;
		}
		return false;
	}

	/**
	 * 验证字符串为数据
	 *
	 * @param str 字符串
	 * @return 数字：true，其他：false
	 */
	public static boolean isNumeric(String str) {
		if (isSpaceOrNull(str)) {
			return false;
		}
		Pattern pattern = null;
		pattern = Pattern.compile("^-?\\d+$");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}

	/**
	 * 自定义正则表达式进行各类验证
	 *
	 * @param str   待验证字符串
	 * @param regex
	 * @return 验证通过：true, 不通过：false
	 */
	public static boolean regularValid(String str, String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		if (!m.matches()) {
			return false;
		}
		return true;
	}

	/**
	 * 获取一个字符串的后两位的ASCII码，取每个ASCII码的最后一位作为返回字符串
	 *
	 * @param str
	 * @return
	 */
	public static String getAsciiSuffixByLastTwo(String str) {
		if (null == str || "".equals(str)) {
			return null;
		}
		if (str.length() < 2) {
			return null;
		}

		return String.valueOf(Integer.valueOf(str.charAt(str.length() - 2)) % 10)
				+ String.valueOf(Integer.valueOf(str.charAt(str.length() - 1)) % 10);
	}

	/**
	 * 将字符串分解
	 *
	 * @param str      字符串
	 * @param separate 分隔符
	 * @return 分隔数组
	 */
	public static String[] splitToArr(String str, String separate) {
		if (isEmptyOrNull(str)) {
			return new String[0];
		} else {
			return str.split(separate);
		}
	}

	/**
	 * 将java对象转换为String，对象为null时返回null
	 *
	 * @param value 要转换的对象
	 * @return String
	 */
	public static final String castToString(Object value) {

		if (value == null)
			return "";
		else
			return value.toString();
	}

	public static String objToString(Object obj) {
		if (obj == null) {
			return null;
		}
		return String.valueOf(obj).trim();
	}

	public static String formatTimeStr(Object obj) {
		if (obj == null || "".equals(obj)) {
			return "";
		}
		String oprTime = String.valueOf(obj).trim();
		if (oprTime.length() >= 14) {
			String year = oprTime.substring(0, 4);
			String month = oprTime.substring(4, 6);
			String day = oprTime.substring(6, 8);
			String hours = oprTime.substring(8, 10);
			String minute = oprTime.substring(10, 12);
			String second = oprTime.substring(12, 14);
			oprTime = year + "-" + month + "-" + day + " " + hours + ":" + minute + ":" + second;
		} else {
			oprTime = "";
		}
		return oprTime;
	}

	public static int getstringNum(String str, String str2) {
		int strNum = 0;
		String temp = str;
		while (temp.indexOf(str2) != -1) {
			temp = temp.substring(temp.indexOf(str2) + 1);
			strNum++;
		}
		return strNum;
	}

	public static String[] pubTxtSplit(String str, String str2) {

		int strIndex = getstringNum(str, str2) + 1;
		System.out.println("--------strIndex-----" + strIndex);
		String[] outStr = new String[strIndex];
		String temp = str;
		for (int i = 0; i < strIndex - 1; i++) {
			outStr[i] = temp.substring(0, temp.indexOf(str2));
			temp = temp.substring(temp.indexOf(str2) + 1);
		}
		if (StringUtils.isNotEmptyOrNull(temp)) {
			outStr[strIndex - 1] = temp;
		} else {
			outStr[strIndex - 1] = "";
		}
		return outStr;
	}

	public static String BlobToString(Blob blob) throws SQLException {// CLOB
		try {
			return new String(blob.getBytes(1, (int) blob.length()), "GB2312");
		} catch (UnsupportedEncodingException e) {
			return "";
		}//blob 转 String;
	}
	//关于下发家庭亲情网（全国版）业务支撑改造方案的通知 shizl

	// addBy wangyf_bj 2018/01/04
	public static Map<String, Object> ObjectToMap(Object arg0) {
		Map<String, Object> outMap = new HashMap<String, Object>();
		if (arg0 instanceof Map) {
			return (Map<String, Object>) arg0;
		} else if (arg0 instanceof List) {
			if (((List) arg0).get(0) instanceof Map) {
				return (Map<String, Object>) ((List) arg0).get(0);
			}

			return outMap;
		} else {
			return outMap;
		}
	}

	// addBy wangyf_bj 2018/01/04
	public static List<Map<String, Object>> ObjectToList(Object arg0) {
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if (arg0 instanceof Map) {
			outList.add((Map<String, Object>) arg0);
			return outList;
		} else if (arg0 instanceof List) {
			return (List<Map<String, Object>>) arg0;
		} else {
			return outList;
		}
	}

	public static String formatTimeStrDyn(Object obj) {
		if (obj == null || "".equals(obj)) {
			return "";
		}
		String oprTime = String.valueOf(obj).trim();
		if (oprTime.length() >= 14) {
			String year = oprTime.substring(0, 4);
			String month = oprTime.substring(4, 6);
			String day = oprTime.substring(6, 8);
			String hours = oprTime.substring(8, 10);
			String minute = oprTime.substring(10, 12);
			String second = oprTime.substring(12, 14);
			oprTime = year + "/" + month + "/" + day + " " + hours + ":" + minute + ":" + second;
		} else {
			oprTime = "";
		}
		return oprTime;
	}

	/**
	 * 按字节截取字符串
	 *
	 * @param str
	 * @param len
	 * @return
	 */
	public static String subStringByByte(Object obj, int len) {
		String str = objToString(obj);
		String result = null;
		if (str != null) {
			byte[] a = str.getBytes();
			if (a.length <= len) {
				result = str;
			} else if (len > 0) {
				result = new String(a, 0, len);
				int length = result.length();
				if (str.charAt(length - 1) != result.charAt(length - 1)) {
					if (length < 2) {
						result = null;
					} else {
						result = result.substring(0, length - 1);
					}
				}
			}
		}
		return result;
	}
}
