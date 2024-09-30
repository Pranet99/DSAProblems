package Recurrsion;
public class SumOfNaturalNumber {
    public static int sum(int N){
      
    
            if(N==1){
            return N;
            }
        
        
        return N +sum(N-1);

    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    
}
