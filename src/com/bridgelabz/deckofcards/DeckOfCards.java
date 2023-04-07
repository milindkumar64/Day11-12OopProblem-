package com.bridgelabz.deckofcards;

public class DeckOfCards { 
    public static void main(String[] args) { 
    	int k=0;
    	String arr[][]= new String[3][4];
    	
        String[] card_rank = new String[13];
        for(int i=0;i<card_rank.length;i++){
            if(i==0)
            card_rank[i]="Ace";
            else if(i==10)
            card_rank[i]="Jack";
            else if(i==11)
            card_rank[i]="Queen";
            else if(i==12)
            card_rank[i]="King";
            else 
            card_rank[i]=Integer.toString(i+1);
        }
        String[] card_suit = {"Clubs", "Hearts", "Spades", "Diamonds"}; 
        int len = 52; 
        String[] cards_deck = new String[len];
        int rank_len=card_rank.length;
        int suit_len=card_suit.length;
		for (int i = 0; i < rank_len; i++) {
			for (int j = 0; j < suit_len; j++) {
				cards_deck[(4) * i + j] = card_rank[i] + " of " + card_suit[j];
			}
		}
		for(int i=0;i<cards_deck.length;i++)
		{
			//System.out.println(cards_deck[i]);
		}
                for (int i=0; i<len; i++) { 
                    int index = i+(int)(Math.random() * (len-i)); 
                    String temp = cards_deck[index]; 
                    cards_deck[index] = cards_deck[i]; 
                    cards_deck[i] = temp;
                    } 
                
                for(int i=0;i<3;i++)
                	for(int j =0;j<4;j++)
                	{
                		arr[i][j] = cards_deck[k];
                		k++;
                		if(i==2 && j==0)
                			break;
                	} 
                for(int i=0;i<3;i++)
                	for(int j =0;j<4;j++)
                	{
                		if(j==0)
                			System.out.println("cards of First player: "+arr[i][j]);
                		else if(j==1 && i != 2 )
                			System.out.println("cards of Second player: "+arr[i][j]);
                		else if(j==2 && i != 2)
                			System.out.println("cards of third player: "+arr[i][j]);
                		else if(j==3 && i != 2)
                			System.out.println("cards of fourth player: "+arr[i][j]);
                			
                	}
    } 
   }