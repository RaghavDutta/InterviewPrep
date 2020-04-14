/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.command;

/**
 * Client
 * @author raghavdutta
 *
 */
public class CommandDemo {
	
	public static void main(String[] args) {
		Light light = new Light();
		Switch lightSwitch=new Switch();
		
//		ICommand onCommand = new OnCommand();
		
		ICommand onCommand = new ToggleCommand(light);
		lightSwitch.storeAndExecute(onCommand);
		lightSwitch.storeAndExecute(onCommand);
		lightSwitch.storeAndExecute(onCommand);
	}

}
