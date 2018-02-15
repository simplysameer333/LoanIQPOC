package com.poc.loans.bbgtrades.util;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;

import org.apache.commons.lang3.StringUtils;


public class TimeStampUtil {

	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_DATE_TIME;
	
	public static String getCurrentSystemTimeStamp(){
		LocalDateTime localDateTime = LocalDateTime.now();
		String unparsedTimeStamp = localDateTime.format(FORMATTER);
		return unparsedTimeStamp;
	}
	
	public static String getExpiryTimeStamp(Long duration){
		LocalDateTime expiryTimeStamp = LocalDateTime.now().plusHours(duration);
		String unparsedExpiryTimeStamp = expiryTimeStamp.format(FORMATTER);
		return unparsedExpiryTimeStamp;
	}
	
	public static LocalDateTime parseTimeStamp(String timeDate) throws DateTimeParseException {
		LocalDateTime localDateTime = LocalDateTime.parse(timeDate);
		return localDateTime;
	}
	
	public static String changeTimestampValue(String date, int days) {
		try {
			date = StringUtils.replace(date, "T", " ");
			
			Timestamp timestamp = Timestamp.valueOf(date);
			Calendar cal = Calendar.getInstance();
			cal.setTime(timestamp);
			cal.roll(Calendar.DATE, days);
			timestamp.setTime(cal.getTime().getTime()); // or
			//timestamp = new Timestamp(cal.getTime().getTime());
			return timestamp.toString();
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
}
