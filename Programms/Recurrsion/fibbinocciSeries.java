package Recurrsion;

public class fibbinocciSeries {
    public static int fibbiCal(int N){
        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }
        return fibbiCal(N-2)+fibbiCal(N-1);
    }
     public static void main(String[] args) {
        System.out.println(fibbiCal(5));
        
     }
    
}
