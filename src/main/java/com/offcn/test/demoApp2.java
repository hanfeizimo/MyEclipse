package com.offcn.test;

import com.offcn.MobileCodeWS;
import com.offcn.MobileCodeWSSoap;

public class demoApp2 {

	public static void main(String[] args) {
		//MobileCodeWS codeWS = new MobileCodeWS();

		MobileCodeWSSoap ws = new MobileCodeWS().getPort(MobileCodeWSSoap.class);
		
		String str = ws.getMobileCodeInfo("13863067892", null);
		
		System.out.println(str);
		
		
		
	}
 
}
