import java.io.FileOutputStream;
import java.io.IOException;

public class test4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("text.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);

    }
}
