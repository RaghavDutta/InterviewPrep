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
public class CEO extends Handler{

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEOs can approve anything they want");
	}

}
