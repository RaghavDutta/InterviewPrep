/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.command;

/**
 * Concrete Command
 * @author raghavdutta
 *
 */
public class OnCommand implements ICommand {
	
	private Light light;
	
	public OnCommand(Light light) {
		this.light=light;
	}

	public void execute() {
		light.on();
	}

}
