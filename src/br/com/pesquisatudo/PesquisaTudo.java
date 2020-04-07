package br.com.pesquisatudo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import br.com.pesquisatudo.dao.Pessoa;

public class PesquisaTudo {

	public static String wsdl;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setWsdl("http://api.pesquisatudo.com.br:5001/deepsearch");
		getInformations("your JWT","<your token>","cpf",new Date(),"uf");
	}

	public static Pessoa getInformations(String JWT, String token, String cpf, Date datanascimento, String uf) {
		return null;
		
	}
	
	public static String buildJwtString() {
		return "S";
	}
	
   	 public static void call_me() throws Exception {
   	    URL url = new URL(getWsdl());
   	    Map params = new LinkedHashMap<>();
   	    StringBuilder postData = new StringBuilder();
   	    byte[] postDataBytes = postData.toString().getBytes("UTF-8");
   	    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
   	    conn.setRequestMethod("POST");
   	    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
   	    conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
   	    conn.setDoOutput(true);
   	    conn.getOutputStream().write(postDataBytes);
   	    Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
   	    StringBuilder sb = new StringBuilder();
   	    for (int c; (c = in.read()) >= 0;)
   	        sb.append((char)c);
   	    String response = sb.toString();
   	    System.out.println(response);
   	    System.out.println("result after Reading JSON Response");
   	}

	public static String getWsdl() {
		return wsdl;
	}

	public static void setWsdl(String wsdl) {
		PesquisaTudo.wsdl = wsdl;
	}
}
