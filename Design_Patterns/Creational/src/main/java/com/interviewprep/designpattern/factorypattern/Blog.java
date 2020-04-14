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
public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
