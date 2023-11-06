package practice.sensetices;

public class Sentence {
    // Редактируем текст от некоторых опечаток и считаем слова
    public int countWords(String str) {
        String str1=str.replace("  "," ");
        String str2=str1.replace(" ,",",");
        String str3=str2.replace(" .",".");
        String str4=str3.replace(" !","!");
        String str5=str4.replace(" ?","?");
        String str6=str5.replace(" :",":");
        String str7=str6.replace(" ;",";");
        String[] words = str7.split(" ");
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("–")||words[i].equals("-")) {
                n++;
            }
        }
        return words.length - n;
    }

    //count symbols
    public int countSymbols(String str) {
        String[] symb = str.split("");
        int n=0;
        for (int i = 0; i < symb.length; i++) {
            if(symb[i].equals(" ")){
                n++;
            }
        }
        return symb.length-n;
    }
}
