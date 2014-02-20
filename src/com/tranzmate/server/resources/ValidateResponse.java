package com.tranzmate.server.resources;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class ValidateResponse extends ResourceBase{
	public void validateHttpResponse(String requestMethod, HttpURLConnection con) throws Exception { 
		if (requestMethod.equals("POST")){
			String urlParameters = emptyString;
			// Send post request
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();	
			}
			
			if (requestMethod.equals("GET")){
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
	 
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
	 
			//print result
			System.out.println(response.toString());
			}
		
		
		
//		int responseCode = httpURLConnection.getResponseCode();
//		System.out.println("Response Code : " + responseCode);
//		BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
//		String inputLine;
//		StringBuffer response = new StringBuffer();
// 
//		while ((inputLine = in.readLine()) != null) {
//			response.append(inputLine);
//		}
//		in.close();
// 
//		//print result
//		System.out.println(response.toString());
 
	}
}
