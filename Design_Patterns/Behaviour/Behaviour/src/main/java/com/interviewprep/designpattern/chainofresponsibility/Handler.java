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
public abstract class Handler {
	
	protected Handler successor;
	
	public void setSuccssor(Handler successor) {
		this.successor=successor;
	}
	public abstract void handleRequest(Request request);
}
