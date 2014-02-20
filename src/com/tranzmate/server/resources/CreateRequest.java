package com.tranzmate.server.resources;

	import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Logger;
	 
import javax.net.ssl.HttpsURLConnection;
	 
	public class CreateRequest extends ResourceBase{
		
		private HttpURLConnection con;
		
		public void createHttpRequest(String requestMethod, String url, String userId, String clientVersion) throws Exception {
			 
			URL obj = new URL(url);
			con = (HttpURLConnection) obj.openConnection();
			//HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			//con1 = con;
			setHttpMethod(con, "GET");
			setHttpHeader(con, "user_id", userId);
			setHttpHeader(con, "client_version", clientVersion);
	 
//			if (requestMethod.equals("POST")){
//			String urlParameters = emptyString;
//			// Send post request
//			con.setDoOutput(true);
//			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//			wr.writeBytes(urlParameters);
//			wr.flush();
//			wr.close();	
//			}
//			
//			if (requestMethod.equals("GET")){
//			BufferedReader in = new BufferedReader(
//			        new InputStreamReader(con.getInputStream()));
//			String inputLine;
//			StringBuffer response = new StringBuffer();
//	 
//			while ((inputLine = in.readLine()) != null) {
//				response.append(inputLine);
//			}
//			in.close();
//	 
//			//print result
//			System.out.println(response.toString());
//			}
	}
		
		public HttpURLConnection getHttpConnection(){
			return con;
		}
		
		private void setHttpMethod (HttpURLConnection con, String requestMethod){
			if (requestMethod.equals("GET") ||requestMethod.equals("POST")){
				try {
					con.setRequestMethod(requestMethod);
				} catch (ProtocolException e) {
					e.printStackTrace();
				}
				}
			else {
				System.out.println("HTTP Method: " + requestMethod + "- is not GET or POST");
			}
		}

		private HttpURLConnection setHttpHeader (HttpURLConnection con, String headerName, String headerValue){
			if (!headerValue.equals(nullVariable) || !headerValue.isEmpty()){
				if (headerName.equals("user_id")){
				try {
					con.setRequestProperty(headerName, headerValue);
				} catch (Exception e) {
					e.printStackTrace();
				}
				}
				if (headerName.equals("client_version")){
					try {
						con.setRequestProperty(headerName, headerValue);
					} catch (Exception e) {
						e.printStackTrace();
					}
					}
				}
			else{
				System.out.println("Header parameter: " + headerName + "- is not user_id or client_version");
			}
			return con;
		}
		
//		private void createPostRequest() throws Exception {
//			 
//			String url = "https://selfsolve.apple.com/wcResults.do";
//			URL obj = new URL(url);
//			HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
//	 
//			//add request header
//			con.setRequestMethod("POST");
//			con.setRequestProperty("user_id", "100");
//			con.setRequestProperty("client_version", "3.3.0");
//	 
//			String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
//	 
//			// Send post request
//			con.setDoOutput(true);
//			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//			wr.writeBytes(urlParameters);
//			wr.flush();
//			wr.close();
//		
//	}
		
		


}