package com.lab2;

import java.util.Random;

public class utilRandomNum {
	
	
	  public int randomNum(int range){
	    	Random rand = new Random();
	    	int  n = rand.nextInt(range) + 1;
	    
	    	return n;
	    	
	    }

}
