/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.chainofresponsibility;

/**
 * Usage of Chain of Responsibility
 * @author raghavdutta
 *
 */
public class ChainOfResponsibilityDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Director bryan = new Director();
		VP crystal = new VP();
		CEO jeff = new CEO();
		
		bryan.setSuccssor(crystal);
		crystal.setSuccssor(jeff);
		
		Request request=new Request(RequestType.CONFERENCE, 500);
		bryan.handleRequest(request);
		
		request=new Request(RequestType.PURCHASE, 1000);
		bryan.handleRequest(request);
		
		request=new Request(RequestType.PURCHASE, 2000);
		bryan.handleRequest(request);

	}
}
