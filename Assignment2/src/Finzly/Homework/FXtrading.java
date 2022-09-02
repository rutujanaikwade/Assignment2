package Finzly.Homework;

public class FXtrading {
    int tradeNo;
	String Name;
	String CurrencyPair;
	double Amount;    
	double Rate;
	
	
	
	public int getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(int tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCurrencyPair() {
		return CurrencyPair;
	}

	public void setCurrencyPair(String currencyPair) {
		CurrencyPair = currencyPair;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public double getRate() {
		return Rate;
	}

	public void setRate(double rate) {
		Rate = rate;
	}

	public FXtrading(int tradeNo, String Name, String currencyPair, double Amount, double rate ) {
		this.tradeNo = tradeNo;
		this.Name = Name;
		this.CurrencyPair = currencyPair;
		this.Amount = Amount;
		this.Rate =rate;
				
	}

	@Override
	public String toString() {
		return "BookTrades [tradeNo=" + tradeNo + ", Name=" + Name + ", CurrencyPair=" + CurrencyPair + ", Amount="
				+ Amount + ", Rate=" + Rate + "]";
	}

	
}
