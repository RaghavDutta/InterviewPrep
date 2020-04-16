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
public class BikeRepository implements Iterable<String> {
	private String[] bikes;
	private int index;
	
	public BikeRepository() {
		bikes=new String[10];
		index=0;
	}
	
	public void addBike(String bike) {
		if (index==bikes.length) {
			String[] largerBikes = new String[bikes.length+5];
			System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
			bikes = largerBikes;
			largerBikes=null;
		}
		bikes[index]=bike;
		index++;
	}

	public Iterator<String> iterator() {
		Iterator<String> itr = new Iterator<String>() {
			
			private int currentIndex = 0;

			public boolean hasNext() {
				return currentIndex<bikes.length 
						&& bikes[currentIndex]!=null;
			}

			public String next() {
				return bikes[currentIndex++];
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
		return itr;
		
	}
}
