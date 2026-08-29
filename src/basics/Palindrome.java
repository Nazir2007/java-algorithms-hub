package basics;

import java.util.Scanner;

public class Palindrome{
    public static void  main(String[] args) {
        System.out.println("Please enter number you want and see it is palindrome or not");
        Scanner in =new Scanner(System.in);

        int num =in.nextInt();
        int temp=num;
        int reversedNum=0;
        

        if(num<0){
            System.out.println("this number is not palindrome");
            return;
        }
        while(temp>0){
            int lastDigit=temp%10;
            reversedNum=(reversedNum*10)+lastDigit;
            temp/=10;
        }
        if(num==reversedNum){
            System.out.println("this number is palindrome");

        }
        else {
            System.out.println("this number is not palindrome");
        }
    }

}