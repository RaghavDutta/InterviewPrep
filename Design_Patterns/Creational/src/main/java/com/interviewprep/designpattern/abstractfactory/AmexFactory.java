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
public class AmexFactory extends CreditCardFactory{

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new AmexGoldCreditCard();

		case PLATINUM:
			return new AmexPlatinumCreditCard();
			
		default:
			break;
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new AmexGoldValidator();

		case PLATINUM:
			return new AmexPlatinumValidator();	
	
		}
	
	return null;
	}

}
