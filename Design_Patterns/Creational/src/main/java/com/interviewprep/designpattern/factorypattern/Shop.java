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
public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());

	}

}
