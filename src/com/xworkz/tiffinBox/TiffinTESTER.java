package com.xworkz.tiffinBox;

import org.springframework.context.ApplicationContext;

import resources.springutil.SpringUtil;

public class TiffinTESTER {

	public static void main(String[] args) {

		try {
			ApplicationContext context = SpringUtil.getContext("init.xml");

			TiffinBox tiffin = context.getBean("tiffinbox" ,TiffinBox.class);

			tiffin.haveLunch();
		} catch (Exception e) {
          e.printStackTrace();
		}finally {
			try {
				SpringUtil.closeContext();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}