/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.factorypattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raghavdutta
 *
 */
public abstract class Website {
	
	protected List<Page> pages = new ArrayList<Page>();
	
	public List<Page> getPages() {
		return pages;
	}

	public Website() {
		this.createWebsite();
	}
	
	public abstract void createWebsite();
}
