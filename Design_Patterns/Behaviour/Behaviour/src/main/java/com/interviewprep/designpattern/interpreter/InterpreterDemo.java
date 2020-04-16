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
public class InterpreterDemo {
	
	static IExpression buildInterpreterTree() {
		
		IExpression terminal1=new TerminalExpression("Lions");	
		IExpression terminal2=new TerminalExpression("Tigers");
		IExpression terminal3=new TerminalExpression("Bears");	
		//Tigers and Bears
		IExpression alternation1 = new AndExpression(terminal2, terminal3);
		//Lions or(Tigers and Bears)
		IExpression alternation2 = new OrExpression(terminal1, alternation1);
		return new AndExpression(terminal3, alternation2);
	}
	/**
	 * Main method- build an interpreter and build a specific sequence
	 * @param args
	 */
	public static void main(String[] args) {
		String context="Lions";
		IExpression define = buildInterpreterTree();
		System.out.println(context+" is "+define.interpret(context));
	}
}
