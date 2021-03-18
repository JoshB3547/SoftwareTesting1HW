package books;

import java.util.Arrays;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        //setup price + flag
    	double finalPrice = 0;
    	boolean bookListIsEmpty = false;
    	
    	//TEST
		System.out.println(Arrays.toString(books));
    	
   while(!bookListIsEmpty) {
    		   	
    		//setup rest
    		double numberOfSets = Double.MAX_VALUE;
    		double numOfDiffBooks = 0;
    		double currDiscount = 0;
    	
    	
    		//sets numOfDiffBooks and numberOfSets
    		for (int i = 0 ;i<books.length ;i++) {
    			if(books[i]!=0) {
    				numOfDiffBooks++;
    				if(books[i]<numberOfSets)
    					numberOfSets=books[i];
    			}
    		}
    	
    		//chooses discount of current set
    		switch((int)numOfDiffBooks) {
    		default: currDiscount = 0;
    		break;
    		case 1:	currDiscount = 0;
    		break;
    		case 2:	currDiscount = 0.07;
    		break;
    		case 3: currDiscount = 0.14;
    		break;
    		case 4: currDiscount = 0.28;
    		break;
    		case 5: currDiscount = 0.35;
    		break;
    			
    		}
    		
    	
    		//setup flag again idk how to do it differently rip
    		bookListIsEmpty=true;
    		//add price of current set/s and remove set/s from list
    		for (int i = 0 ;i<books.length ;i++) {
    			if(books[i]!=0) {
    				finalPrice+=numberOfSets*8*(1-currDiscount);
    				books[i]-=(int)numberOfSets;
    				bookListIsEmpty=false;
    			}
    		}
    	
    }
    	
    	
    	
    	
    	return finalPrice;
    }	
}
