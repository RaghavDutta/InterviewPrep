package com.interviewprep.designpattern.builder;
/**
 * Telescoping constructor usage
 * @author raghavdutta
 *
 */
public class LunchOrderTeleDemo {

	public static void main(String[] args) {
		
		LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");
		/**
		 * Setters not available in telescoping constructors
		 */
		
//		lunchOrderBean.setBread("Wheat");
//		lunchOrderBean.setCondiments("Condiments");
//		lunchOrderBean.setDressing("Mustard");
//		lunchOrderBean.setMeat("Ham");
		
		System.out.println(lunchOrderTele.getBread());
		System.out.println(lunchOrderTele.getCondiments());
		System.out.println(lunchOrderTele.getDressing());
		System.out.println(lunchOrderTele.getMeat());
		
		
	}

}
