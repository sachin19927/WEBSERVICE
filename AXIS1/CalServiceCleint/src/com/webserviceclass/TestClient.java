package com.webserviceclass;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.apache.axis.AxisFault;

public class TestClient {

	
	public static void main(String[] args) throws Exception {
		
		
		java.net.URL endPointURL=new java.net.URL("http://localhost:8081/CalCalutionService/services/CaslService");
		org.apache.axis.client.Service service=new org.apache.axis.client.Service();

		CaslServiceSoapBindingStub  stub=new CaslServiceSoapBindingStub(endPointURL, service);

		int result=stub.add(10, 10);add
System.err.println("REsut is "+result ); 

int result1=stub.sub(10, 10);

System.out.println("REsut is "+result1 );

	
	}
	
}