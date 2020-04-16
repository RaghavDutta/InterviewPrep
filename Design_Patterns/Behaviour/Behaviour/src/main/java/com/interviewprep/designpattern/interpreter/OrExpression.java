/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 15, 2020
 */
package com.interviewprep.designpattern.interpreter;

/**
 * @author raghavdutta
 *
 */
public class OrExpression implements IExpression {

	private IExpression expression1;
	private IExpression expression2;

	public OrExpression(IExpression expression1, IExpression expression2) {
		this.expression1=expression1;
		this.expression2=expression2;
	}
	public boolean interpret(String context) {
		return expression1.interpret(context)
				||expression2.interpret(context);
	}

}
