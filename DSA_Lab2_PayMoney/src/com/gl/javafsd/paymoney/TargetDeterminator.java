package com.gl.javafsd.paymoney;

public class TargetDeterminator {
	private int[] transactions;
	private int dailyTarget;
	private boolean outcome;
	
	public TargetDeterminator(int[] transactions,int dailyTarget) {
		this.transactions=transactions;
		this.dailyTarget=dailyTarget;
	}

	public int[] getTransactions() {
		return transactions;
	}

	public void setTransactions(int[] transactions) {
		this.transactions = transactions;
	}

	public int getDailyTarget() {
		return dailyTarget;
	}

	public void setDailyTarget(int dailyTarget) {
		this.dailyTarget = dailyTarget;
	}

	public boolean isOutcome() {
		return outcome;
	}

	public void setOutcome(boolean outcome) {
		this.outcome = outcome;
	}
	
	void determine() {
		int tempSum=0;
		int transactionCounter=0;
		for(int i=0;i<transactions.length;i++) {
			tempSum = transactions[i]+tempSum;
			if(tempSum >= dailyTarget) {
				outcome=true;
				transactionCounter=i+1;
				//System.out.println("Target achieved after "+transactionCounter+" transactions");
				break;
			}
		}
		if(outcome)
			System.out.println("Target achieved after "+transactionCounter+" transactions");
		else
			System.out.println("Given target is not achieved");
	}
	
	
}
