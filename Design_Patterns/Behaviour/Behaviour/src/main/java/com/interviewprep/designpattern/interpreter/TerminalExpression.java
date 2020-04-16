/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 15, 2020
 */
package com.interviewprep.designpattern.interpreter;

import java.util.StringTokenizer;

/**
 * @author raghavdutta
 *
 */
public class TerminalExpression implements IExpression {
	
	private String data;
	public TerminalExpression(String data) {
		this.data=data;
	}

	public boolean interpret(String context) {
		StringTokenizer st = new StringTokenizer(context);
		while(st.hasMoreTokens()) {
			String test=st.nextToken();
			if (test.equals(data))
				return true;
		}
		return false;
	}

}
