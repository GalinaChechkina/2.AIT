package practice.barcode;

import practice.ArrayMethods;
import practice.barcode.model.Barcode;

public class CodeAppl {
    public static void main(String[] args) {
        Barcode cod1=new Barcode(1114567091111L);
        Barcode cod2=new Barcode(2235598101212L);
        Barcode cod3=new Barcode(123456780909L);
        Barcode cod4=new Barcode(9871276443215L);
        cod1.display();
        cod2.display();
        cod3.display();
        cod4.display();
        ArrayMethods.split();

        boolean isV=cod1.isValid(cod1.getCode());
        System.out.println("Cod is "+isV);
        ArrayMethods.split();

        long sum=cod2.controlSum(cod2.getCode());
        System.out.println("Sum of digits in code is "+sum);
        ArrayMethods.split();

        boolean isV1= cod3.isValid(cod3.getCode());
        System.out.println("Cod is "+isV1);
        ArrayMethods.split();

        int l=cod4.lengthCode(cod4.getCode());
        System.out.println("Code length is "+l);

    }
}
