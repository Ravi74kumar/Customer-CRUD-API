package com.shellCompany.Ravikumar.CRED.Utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.shellCompany.Ravikumar.CRED.dto.CustomerDetails;
import com.shellCompany.Ravikumar.CRED.dto.CustomerRequest;

public class Utils {
	
	public static Date convertStringToDate(String dateString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return new java.sql.Date( sdf.parse(dateString).getTime());
		} catch (ParseException e) {
			return null;
		}
		
	}
	
	

}
