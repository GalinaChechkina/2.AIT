package practice.io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputAppl {
    public static void main(String[] args) {
        try (FileOutputStream fout1 = new FileOutputStream("./dest/data.txt")) {
            fout1.write(65);
            fout1.write(27);
            fout1.write(257); //в байте 256 значений, дальше значения выдаются по модулю 256; здесь будет 1
            fout1.write(3);
//            fout1.write(6);
//            fout1.write(9);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileOutputStream fout2 = new FileOutputStream("./dest/data0.txt")) {
            fout2.write(65);
            fout2.write(27);
            fout2.write(257); //в байте 256 значений, дальше значения выдаются по модулю 256; здесь будет 1
            fout2.write(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
