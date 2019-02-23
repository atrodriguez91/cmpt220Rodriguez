import java.util.Scanner;

public class Lab3_4{
    public static void main(String[] args){
        
    	int n;
        
    	System.out.println("Highest Number value: ");
        
    	Scanner in = new Scanner(System.in);
        
    	n = in.nextInt();
        
    	while(primeN(n) == false){
            n--;
        }                                     
        
    	System.out.println(n);                    

    }


    public static boolean primeN(int p){
        int n=p;
        
        for(int i = 2; i < n ; i++){
            if(n % i == 0){
                return false;
            }

        }   
        return true;
    }
}