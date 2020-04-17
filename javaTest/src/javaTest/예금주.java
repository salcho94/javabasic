package javaTest;

public class 예금주 {
	private String name, accountNo;

	private int balance;

	private double rate;


	 

	public void setName(String n) { name = n;}

	public void setAccountNo(String a) {accountNo = a;}

	public void setBalance(int b) {balance = b;}

	public void setRate(double r) {rate = r;}


	 

	public String getName() {return name;}

	public String getAccountNo() {return accountNo;}

	public int balance() {return balance;}

	public double rate() {return rate;}


	 

	public String toString() {

	String bank;


	 

	 bank = "이름: " + name + "\n계좌 번호: " + accountNo + "\n잔액: " + balance + "원\n이자율: " + rate + "%\n이자: " + calcInterest();


	 

	return bank;

	 }

	 

	public int calcInterest() {

	double interate;

	interate = rate * (double)balance / 100;

	 

	return (int)interate;

	 }


	
	
}
