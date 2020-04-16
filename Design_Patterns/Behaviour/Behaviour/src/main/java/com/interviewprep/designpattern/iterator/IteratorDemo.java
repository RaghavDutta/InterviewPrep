/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 15, 2020
 */
package com.interviewprep.designpattern.iterator;

import java.util.Iterator;

/**
 * @author raghavdutta
 *
 */
public class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BikeRepository repository = new BikeRepository();
		
		repository.addBike("Cervelo");
		repository.addBike("Scott");
		repository.addBike("Fuji");
		
		Iterator<String> bikeIterator = repository.iterator();
		while (bikeIterator.hasNext()) {
			System.out.println(bikeIterator.next());
		}
		
//		for (String string : repository) {
//			System.out.println(string);
//		}

	}

}
