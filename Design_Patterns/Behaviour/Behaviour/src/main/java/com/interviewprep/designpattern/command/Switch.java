/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.command;

/**
 * @author raghavdutta
 *
 */
public class Switch {
	
	public void storeAndExecute(ICommand command) {
		command.execute();
	}

}
