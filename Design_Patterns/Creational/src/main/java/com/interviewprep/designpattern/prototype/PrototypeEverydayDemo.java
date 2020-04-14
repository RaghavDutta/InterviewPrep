/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Shallow clone example
 * @author raghavdutta
 *
 */
public class PrototypeEverydayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String sql = "select * from movies where title = ?";
		List<String> parameters = new ArrayList<String>();
		parameters.add("Star Wars");
		Record record = new Record();
		Statement firstStatement = new Statement(sql, parameters, record);
		
		System.out.println(firstStatement.getSql());
		System.out.println(firstStatement.getParameters());
		System.out.println(firstStatement.getRecord());
		
		Statement secondStatement = firstStatement.clone();
		System.out.println(secondStatement.getSql());
		System.out.println(secondStatement.getParameters());
		System.out.println(secondStatement.getRecord());
		

	}

}
