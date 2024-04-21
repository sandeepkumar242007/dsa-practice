package org.mathematics_module1;

public class NumberReverseOrder {

    public void revNumber(int num){

        int rev;
        while (num>0){
            rev = num%10;
            System.out.print(rev);
            num = num/10;
        }
    }

    public static void main(String agrs[]){

        int number = 1234;
        System.out.println("Original Number is : "+number);
        NumberReverseOrder obj = new NumberReverseOrder();
        obj.revNumber(number);
    }
}

//Input : Original Number is : 1234
//Output : 4321