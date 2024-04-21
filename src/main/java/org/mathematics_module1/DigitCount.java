package org.mathematics_module1;

public class DigitCount {

    public int digitCount(int num){

        int count =0;
        while(num>0){
            num = num/10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int number = 123456;
        DigitCount d1 = new DigitCount();
        System.out.println("Number of integer is : "+d1.digitCount(number));
    }
}
