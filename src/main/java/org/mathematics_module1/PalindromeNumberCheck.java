package org.mathematics_module1;

public class PalindromeNumberCheck {

    public int palindromeCheck(int num){

        int rev = 0;
        while (num>0){
            int r = num%10;
            rev = rev*10 + r;
            num = num/10;
        }
        return rev;
    }

    public static void main(String agrs[]){

        int number1 = 1234;
        int number2 = 121;
        System.out.println("Number is : "+number1);
        PalindromeNumberCheck obj = new PalindromeNumberCheck();
        System.out.println("Reverse number is : "+obj.palindromeCheck(number1));
        if(number1 == obj.palindromeCheck(number1)){
            System.out.println("Entered Number Palindrome");
        }else{
            System.out.println("Entered Number Not Palindrome");
        }

        System.out.println("Number is : "+number2);
        System.out.println("Reverse number is : "+obj.palindromeCheck(number2));
        if(number2 == obj.palindromeCheck(number2)){
            System.out.println("Entered Number Palindrome");
        }else{
            System.out.println("Entered Number Not Palindrome");
        }
    }
}