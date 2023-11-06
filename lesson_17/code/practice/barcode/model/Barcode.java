package practice.barcode.model;

public class Barcode {
//Штрих-код имеет строго регламентированную длину, то есть количество цифр,
// которое в нем содержится (обычно это 8 или 13 цифр).
// Создать класс Code, в котором реализовать методы:
//  -lengthCode(long code), который возвращает длину штрих-кода
//  -controlSum(long code), который возвращает сумму всех цифр штрих кода
//  -isValid(long code), который проверяет штрих-код на правильное количество цифр

    long code;

    public Barcode(long code) {
        this.code = code;
    }
    public long getCode() {
        return code;
    }
    public void setCode(long code) {
        this.code = code;
    }

    public void display(){
        System.out.println("Code: "+code);
    }

    public int lengthCode(long code){
        int count=1;
        while (code/10!=0){
            code=code/10;
            count++;
        }
        return count;
    }
    public long controlSum(long code){
        long sum=0;
        while (code/10!=0){
            sum= sum+code%10;
            code=code/10;
        }
        sum=sum+code%10;
        return sum;
    }
    public boolean isValid(long code) {
        boolean isVal;
        int count = 1;
        while (code / 10 != 0) {
            count++;
            code=code/10;
        }
        if (count == 8 | count == 13) {
            isVal = true;
        } else {isVal=false;}
        return isVal;
    }
}
