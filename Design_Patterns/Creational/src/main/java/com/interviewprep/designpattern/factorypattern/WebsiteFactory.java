/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.factorypattern;

/**
 * @author raghavdutta
 *
 */
public class WebsiteFactory {

	public static Website getWebsite(WebsiteType siteType) {
		switch(siteType) {
		case BLOG:
		{
			return new Blog();
			}
		case SHOP:
		{
			return new Shop();
			}
		default: {
			return null;
			}
		}
	}
}
