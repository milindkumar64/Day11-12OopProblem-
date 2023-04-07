package com.bridgelabz.StockProblem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StockPortfolio {
	
	List<Stock>stockList = new ArrayList<>();
	
	public void listStock()
	{
		Stock share = new Stock();
		share.addStock();
	
		stockList.add(share);
	}
	
	public void calculateStockValue()
	{
		int stockValue=0;
		int totalStockValue=0;
		for (Stock stock : stockList) {
            
			stockValue = (stock.numberOfShare*stock.sharePrice);
			System.out.println("value of Stock "+ stock.shareName+" is :"+stockValue);
			totalStockValue = totalStockValue + stockValue;
        }  
		System.out.println("Total Value of the Stocks is : "+totalStockValue);
	}
	
	public void displayStock(){
        for (Stock stock : stockList) {
            System.out.println(stock);
        }
    }
	
	public static void main(String[] args) {
		
		String check="Yes";
		
		StockPortfolio portfolio = new StockPortfolio();
		
		Scanner sc = new Scanner(System.in);
		
		while(check.equals("Yes"))
		{
		System.out.println("Adding a new stock");	
		portfolio.listStock();
		portfolio.displayStock();
		System.out.println("Want to add More Tyep 'Yes' else 'No' or any key ");
		check=sc.next();
		}
		
		portfolio.calculateStockValue();
		
	}

}
