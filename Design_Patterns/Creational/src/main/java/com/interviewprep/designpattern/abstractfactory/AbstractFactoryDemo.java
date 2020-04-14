/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.abstractfactory;

/**
 * Usage of Abstract Factory Pattern
 * @author raghavdutta
 *
 */
public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		
		System.out.println(card2.getClass());

	}

}
