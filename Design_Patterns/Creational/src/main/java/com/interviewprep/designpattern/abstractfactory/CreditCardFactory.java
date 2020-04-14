/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.abstractfactory;

/**
 * Abstract Factory
 * @author raghavdutta
 *
 */
public abstract class CreditCardFactory {
	
	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if (creditScore>650) {
			return new AmexFactory();
		}
		else {
			return new VisaFactory();
		}
		
	}

	/**
	 * @param cardType
	 * @return
	 */
	public abstract CreditCard getCreditCard(CardType cardType) ;
	public abstract Validator getValidator(CardType cardType);
	

}
