import java.util.Random; 

public class Flip_Coin { 

    public static void main( String [] args ) { 
    	
    	int count = 1;
    	double result;
    	while(count < 10)
    	{
    	result = Math.random();
    	if(result <= 0.5)
    	System.out.println("Heads.");
    	else
    	System.out.println("Tails.");
    	count++;
    	}

    	}
    
}