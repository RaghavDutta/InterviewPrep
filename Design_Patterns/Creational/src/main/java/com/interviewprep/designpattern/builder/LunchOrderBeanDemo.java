package com.interviewprep.designpattern.builder;
/**
 * Basic Java Bean Usage
 * @author raghavdutta
 *
 */
public class LunchOrderBeanDemo {
	

	public static void main(String[] args) {
		
		LunchOrderBean lunchOrderBean = new LunchOrderBean();
		
		lunchOrderBean.setBread("Wheat");
		lunchOrderBean.setCondiments("Condiments");
		lunchOrderBean.setDressing("Mustard");
		lunchOrderBean.setMeat("Ham");
		
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());
		
		

	}

}
