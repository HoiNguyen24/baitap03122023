import java.lang.String;

public class Main {
    public static void Max(int[] arr){
        int max  = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
    public static boolean increase(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
    public static void reverse(int[] arr){
        int l = 0;
        int r = arr.length-1;
        while(l < r){
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            l++;
            r--;
        }
    }
    public static boolean isPRIME(int element){
        if(element < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(element) ; i++){
            if(element % i == 0) return false;
        }
        return true;
    }
    public static void PRIMEn(int n){
        for(int i = 0; i < n;i++){
            if(isPRIME(i)) System.out.println(i);
        }
    }
    public static void triagle(int n){
        for(int  i = 0 ; i < n ;i++){
            for(int j = 0;j < i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ;j++){
                if(j < n-i-1)
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = n ; i > 0 ;i--){
            for(int j = 0; j < i ;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n; i >0 ; i--) {
            for (int j = 0 ; j < n;j++){
                if(j > n-i-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void BCUC(int a,int b){
        int l = a;
        int r = b;
        while(l != r){
            if(l > r) l = l - r;
            else r = r - l;
        }
        System.out.println("UCLN: " + l);
        System.out.println("BCNN: "+ a*b/l);
    }
    public static String reverseString (String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        s = String.valueOf(arr);
        return s;
    }
    public static int sum(int n){
        int sum = 0;
        while(n/10 > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
     public static int position(int[] arr,int l,int r){
        int pivot = arr[r];
        int index = l;
        for(int i = l ; i < r ;i++){
            if( arr[i] <= pivot)
            {
                int temp = arr[index];
                arr[index]  = arr[i];
                arr[i] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[r];
        arr[r] = temp;
        return index;
     }
     public static int positionMAX(int[] arr,int k){
        quicksort(arr,0,arr.length-1);
        return arr[arr.length - k];
     }
     public static void quicksort(int[] arr,int l,int r){
        if( l < r )
        {
            int position = position(arr,l,r);
            quicksort(arr,position+1,r);
            quicksort(arr,l,position-1);
        }
     }
     public static void OutputPrime(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            if(isPRIME(arr[i])) System.out.println(arr[i]);
        }
     }
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4,2,4,5,12,6,3,6,4,6,7,8,3,2};
        System.out.println(reverseString("anbc"));
        quicksort(arr,0,arr.length-1);
        for (int i:
             arr) {
            System.out.print(i+",");
        }
        System.out.println("max 1:" + positionMAX(arr,1));
        System.out.println("max 2:" + positionMAX(arr,2));
        System.out.println("max 3:" + positionMAX(arr,3));
        OutputPrime(arr);

    }
}
