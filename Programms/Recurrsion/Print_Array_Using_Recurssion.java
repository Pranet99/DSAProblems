package Recurrsion;
public class Print_Array_Using_Recurssion {
    public static int[] print_Array_Using_Recurssionprint(int[] a,int i,int l){
        
        int temp=0;
        
        if(i>= l){
            return a;
        }
        temp=a[i];
        a[i]=a[l];
        a[l]=temp;
        i++;
        l--;
        return print_Array_Using_Recurssionprint(a,i,l);
        

    }

    public static void main(String[] args) {
        int[] a={0,0};
        int[] arr=print_Array_Using_Recurssionprint(a,0,a.length-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
        
    }
    
}
