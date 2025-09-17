import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Elements");
        int[] arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        Syste.out.println("Reversed Array:");
        int[] rev_arr =new int[n];
        for(int i=n-1;i>=0;i--){
            rev_arr[n-i-1]=arr[i];
        }
        System.out.println(Arrays.toString(rev_arr));
        sc.close();
    }
}
/*
INPUT:
Enter the size of an array : 3
Enter 3 Elements : 1 2 3
Reversed Array : [3, 2, 1]
*/
