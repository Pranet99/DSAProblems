public class Print_Array_Using_Recurssion {
    public static int[] print_Array_Using_Recurssionprint(int[] a){
        int i=0;
        int l=a.length-1;
        if(i<l){
            return a;
        }
        a[i]=a[l];
        i++;
        l--;
        return print_Array_Using_Recurssionprint(a);
        

    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(print_Array_Using_Recurssionprint(a));
        
    }
    
}
