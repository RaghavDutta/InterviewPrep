/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.chainofresponsibility;

/**
 * @author raghavdutta
 *
 */
public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType()==RequestType.CONFERENCE) {
			System.out.println("Directors can approve Conferences");
			
		} else {
			successor.handleRequest(request);
		}
	}

}
