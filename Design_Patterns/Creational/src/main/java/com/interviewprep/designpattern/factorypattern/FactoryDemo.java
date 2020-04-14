/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.factorypattern;

/**
 * Usage of Factory Pattern
 * @author raghavdutta
 *
 */
public class FactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(site.getPages());
		
		site=WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(site.getPages());

	}

}
