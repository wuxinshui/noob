package org.noob.codewars.train.learn.prac160331;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Travel {

	public static void main(String[] args) {
		String r = "123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432";
		// String zipcode = "OH 43071";
		String zipcode = "AA 45521";

		String ad = "123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432,"
				+ "54 Holy Grail Street Niagara Town ZP 32908,3200 Main Rd. Bern AE 56210,1 Gordon St. Atlanta RE 13000,"
				+ "10 Pussy Cat Rd. Chicago EX 34342,10 Gordon St. Atlanta RE 13000,58 Gordon Road Atlanta RE 13000,"
				+ "22 Tokyo Av. Tedmondville SW 43098,674 Paris bd. Abbeville AA 45521,10 Surta Alley Goodtown GG 30654,"
				+ "45 Holy Grail Al. Niagara Town ZP 32908,320 Main Al. Bern AE 56210,14 Gordon Park Atlanta RE 13000,"
				+ "100 Pussy Cat Rd. Chicago EX 34342,2 Gordon St. Atlanta RE 13000,5 Gordon Road Atlanta RE 13000,"
				+ "2200 Tokyo Av. Tedmondville SW 43098,67 Paris St. Abbeville AA 45521,11 Surta Avenue Goodtown GG 30654,"
				+ "45 Holy Grail Al. Niagara Town ZP 32918,320 Main Al. Bern AE 56215,14 Gordon Park Atlanta RE 13200,"
				+ "100 Pussy Cat Rd. Chicago EX 34345,2 Gordon St. Atlanta RE 13222,5 Gordon Road Atlanta RE 13001,"
				+ "2200 Tokyo Av. Tedmondville SW 43198,67 Paris St. Abbeville AA 45522,11 Surta Avenue Goodville GG 30655,"
				+ "2222 Tokyo Av. Tedmondville SW 43198,670 Paris St. Abbeville AA 45522,114 Surta Avenue Goodville GG 30655,"
				+ "2 Holy Grail Street Niagara Town ZP 32908,3 Main Rd. Bern AE 56210,77 Gordon St. Atlanta RE 13000";
		// System.out.println(travel(r, zipcode));
		System.out.println(travel(ad, zipcode));
	}

	public static String travel(String r, String zipcode) {
		// Your code
		if (zipcode.length() < 8 || !r.contains(zipcode)) {
			return zipcode + ":/";
		}
		StringBuilder builder = new StringBuilder(zipcode + ":");
		StringBuilder code = new StringBuilder("/");
		String[] array = r.split(",");
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			// String temp = array[i].substring(array[i].length() - 8);
			if (array[i].endsWith(zipcode)) {
				String codeTemp = array[i].split(" ")[0];
				code.append(codeTemp);
				builder.append(array[i].substring(codeTemp.length() + 1, array[i].length() - 9));
				builder.append(",");
				code.append(",");
			}
		}
		String address = builder.toString();
		String codeStr = code.toString();
		if (address.endsWith(",") || codeStr.endsWith(",")) {
			address = address.substring(0, address.length() - 1);
			codeStr = codeStr.substring(0, codeStr.length() - 1);
		}
		address = address + codeStr;
		return address;
	}

	public static String travel1(String r, String zipcode) {
		if (zipcode.isEmpty()) {
			return zipcode + ":/";
		}

		String[] addresses = r.split(",");
		String streets = "", houseNumbers = "/";

		Pattern regex = Pattern.compile("(\\d+)\\s((\\w+\\.?\\s)+)" + zipcode);
		Matcher matcher;

		for (String address : addresses) {
			if (address.endsWith(zipcode)) {
				matcher = regex.matcher(address);
				while (matcher.find()) {
					houseNumbers += matcher.group(1).trim() + ",";
					streets += matcher.group(2).trim() + ",";
				}
			}
		}

		if (streets.isEmpty()) {
			return zipcode + ":/";
		} else {
			return zipcode + ":" + streets.substring(0, streets.length() - 1)
					+ houseNumbers.substring(0, houseNumbers.length() - 1);
		}
	}

}
