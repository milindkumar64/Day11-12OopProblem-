package com.bridgelabz.StockProblem;
import java.util.Scanner;

public class Stock {

	String shareName;
	int numberOfShare;
	int sharePrice;

	public Stock(String shareName, int numberOfShare, int sharePrice) {
		super();
		this.shareName = shareName;
		this.numberOfShare = numberOfShare;
		this.sharePrice = sharePrice;
	}

	public Stock() {

	}

	
	
	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public int getNumberOfShare() {
		return numberOfShare;
	}

	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public void addStock() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter shareName: ");
		shareName = sc.next();
		setShareName(shareName);

		System.out.println("Enter numberOfShare: ");
		int numberOfShare = sc.nextInt();
		setNumberOfShare(numberOfShare);

		System.out.println("Enter sharePrice: ");
		int sharePrice = sc.nextInt();
		setSharePrice(sharePrice);

	}
	
	public String toString()
	{
		return "shareName : "+shareName+" numberOfShare : "+numberOfShare+" sharePrice : "+sharePrice;
		
	}

}
