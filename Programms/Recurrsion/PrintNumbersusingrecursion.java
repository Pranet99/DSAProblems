package Recurrsion;
public class PrintNumbersusingrecursion {
  public static void printArray(int[] a,int i,int l){
    if(i>a.length-1){
        return;
    }

    System.out.println(a[i]);
    i++;
    printArray(a, i, l);



  }



    public static void main(String[] args) {
        int[] a={11,22,33,4,66,77};
        printArray(a, 0, a.length-1);
        
    }
    
}
