package com.offcn.test;

import com.offcndemo.DemoService;
import com.offcndemo.DemoServiceService;

public class demoApp {
	
	public static void main(String[] args) {
		
		DemoService service = new DemoServiceService().getDemoServicePort();
		
		String name = service.getValue("¶ºÄãÍæ");
		
		System.out.println("name="+name);
	
	}

}
