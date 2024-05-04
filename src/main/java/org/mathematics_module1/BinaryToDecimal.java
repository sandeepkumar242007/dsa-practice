package org.mathematics_module1;

public class BinaryToDecimal {

    public static void main(String[] args) {

        int number = 10111; //expected value 23

        int rem = 0;
        int count = 0;
        int finalValue =0;

        while(number>0){

            rem = number%2;
            if(rem==1) {
                int result = (int) Math.pow(2, count);
                finalValue = finalValue + result;

            }
            number = number / 10;
            count++;


        }
        System.out.println(finalValue);



    }
}
