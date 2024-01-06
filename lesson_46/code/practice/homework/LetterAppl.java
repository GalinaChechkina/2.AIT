package practice.homework;

import java.util.ArrayList;
import java.util.List;

public class LetterAppl {
    public static void main(String[] args) {
        List<Character>let= new ArrayList<>();
        for (char c='A';c<='Z';c++) {
            let.add(c);
        }
        System.out.println(let);
    }
}
