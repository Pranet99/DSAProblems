package Recurrsion;
public class Factorial{

  public static int cal(int i){
    if(i==1 || i==0){
        return 1;
    }
    return i*cal(i-1);
  }
    public static void main(String[] args) {
        System.out.println(cal(0));
    }
}