package org.mathematics_module1;

public class DecimalToBinary {

    public static void main(String[] args) {

        int number = 23;

        StringBuilder str = new StringBuilder();

        while (number > 0){

          int r = number % 2;
            str.append(r) ;
            number = number/2;
        }

        System.out.println(str.reverse());
    }
}
