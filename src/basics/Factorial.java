package basics;

import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the Factorial number:");
        int nTH=in.nextInt();
        int count=1,ans=1,pre=1;

        while(count<=nTH){
            ans*=pre;
            pre++;
            count++;
        }
        System.out.println("Answer: "+ans);

    }
}