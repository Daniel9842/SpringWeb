package edu.escuelaing.arsw.springWeb.picasYfamas;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Game 
{
	
	private final int LEVEL=4;
	private List<Integer> numbers= new ArrayList<Integer>();
	private List<Integer> numbersCorrection= new ArrayList<Integer>();
	private int picas,famas;
	private boolean win=false;
    
	public void numbers( int[] args )
    {
		duplicate();
    	for(int i=0;i<args.length;i++) {
        	if(args[i]==numbers.get(i)) {
        		picas+=1;
        		numbers.set(i,-5);
        	}
        }
    	for(int j=0;j<args.length;j++) {
    		int positionNumber = numbers.indexOf(args[j]);
        	if(positionNumber!=-1) {
        		famas=+1;
        	}
        if(picas==4) {
        	win=true;
        }
        	}
    	resetList();
    	
    }
    
    public void randomNumber() {
    	numbers.add((int) (Math.random()*8+1));
    	for(int i=0;i<LEVEL-1;i++) {
        	numbers.add((int) (Math.random()*9));
        }
    }
    
    public int getPicas() {
    	return picas;
    }
    
    public void resetPicasFamas() {
    	picas=0;
    	famas=0;
    }
    
    public int getFamas() {
    	return famas;
    }
    
    public String getNumbers() {
    	String numberString = "";
    	for(int j=0;j<numbers.size();j++) {
    		numberString += " "+Integer.toString(numbers.get(j));
    	}
    	return numberString;
    }
    
    public boolean getWin() {
    	return win;
    }
    
    public void resetList() {
    	for(int j=0;j<numbers.size();j++) {
    		numbers.set(j,numbersCorrection.get(j));
    	}
    }
    
    public void duplicate() {
    	for(int j=0;j<numbers.size();j++) {
    		numbersCorrection.add(numbers.get(j));
    	}
    }
    
    public void resetGame() {
    	win=false;
    	for(int j=0;j<numbers.size();j++) {
    		numbers.remove(j);
    	}
    	randomNumber();
    }
    
}
