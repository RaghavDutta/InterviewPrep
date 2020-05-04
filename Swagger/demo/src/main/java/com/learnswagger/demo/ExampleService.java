/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 16, 2020
 */
package com.learnswagger.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author raghavdutta
 *
 */
@RestController
public class ExampleService {
	
	@RequestMapping(value = "/schedule" , method = RequestMethod.GET)
	public String getSchedule() {
		return "Your schedule is M-F 9-5";
	}
	
	@RequestMapping(value = "/custom", method = RequestMethod.POST)
    public String custom() {
        return "custom";
    }

}
