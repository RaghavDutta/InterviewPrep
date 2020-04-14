/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.command;

/**
 * Receiver
 * @author raghavdutta
 *
 */
public class Light {
	
	private boolean isOn=false;
	
	public void toggle() {
		if(isOn) {
			off();
			isOn=false;
		}else {
			on();
			isOn=true;
		}
		
	}
	
	public void on() {
		System.out.println("Light switched on");
	}
	
	public void off() {
		System.out.println("Light switched off");
	}

}
