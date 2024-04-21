package org.mathematics_module1;

public class ReverseNumber {

    public int revNumber(int num){

        int rev = 0;
        while (num>0){
            int r = num%10;
            rev = rev*10 + r;
            num = num/10;
        }
        return rev;
    }

    public static void main(String agrs[]){

        int number = 1234;
        System.out.println("Original Number is : "+number);
        ReverseNumber obj = new ReverseNumber();
        System.out.println("Reverse number is : "+obj.revNumber(number));
    }

}

//Original Number is : 1234
//Reverse number is : 4321