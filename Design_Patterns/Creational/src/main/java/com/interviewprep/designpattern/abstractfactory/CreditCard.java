/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 14, 2020
 */
package com.interviewprep.designpattern.abstractfactory;

/**
 * @author raghavdutta
 *
 */
public abstract class CreditCard {

	protected int cardNumberLength;
	protected int cscNumber;
	
	public int getCardNumberLength() {
		return cardNumberLength;
	}
	public void setCardNumberLength(int cardNumberLength) {
		this.cardNumberLength = cardNumberLength;
	}
	public int getCscNumber() {
		return cscNumber;
	}
	public void setCscNumber(int cscNumber) {
		this.cscNumber = cscNumber;
	}
}
