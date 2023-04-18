import java.io.*;
import java.util.*;
class Sum {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        int rem,sum=0;
        System.out.println("Enter "+n+" numbers");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            rem=a[i]%10;
            if(rem%2==0)
            sum+=rem;
        }
        System.out.println("The Sum of even last digits in an array is "+sum);
    }
}
