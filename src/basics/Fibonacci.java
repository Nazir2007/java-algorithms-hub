package basics;

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        System.out.println("Which Fibonacci number do you want to find?  : ");
        Scanner in=new Scanner(System.in);
        int nTH=in.nextInt();

        int count=2,ans=0,pre=1;

        if(nTH==1){
            System.out.println("Answer is:0 previous:0");
        }
        else if(nTH>1){
            while(count<=nTH){
                int temp=ans;
                ans+=pre;
                pre=temp;
                count++;
            }
            System.out.println("Answer is: "+ans+" previous: "+pre);
        }
    }
}