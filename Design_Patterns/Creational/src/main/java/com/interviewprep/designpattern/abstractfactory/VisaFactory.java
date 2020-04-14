/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.abstractfactory;

/**
 * Concrete Factory
 * @author raghavdutta
 *
 */
public class VisaFactory extends CreditCardFactory {
	
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new VisaGoldCreditCard();
		
		case PLATINUM:
			return new VisaBlackCreditCard();
			
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}
	
	

}
