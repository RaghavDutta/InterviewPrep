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
public class ToggleCommand implements ICommand {
	
	private Light light;
	
	public ToggleCommand(Light light) {
		this.light=light;
	}
		

	public void execute() {
		light.toggle();
	}

}
