import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;

public class test2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("text.txt");
        StringBuilder sb=new StringBuilder();
        int ch;
        while((ch=fr.read())!=-1){
            sb.append((char)ch);
        }
        Integer[] arr = Arrays.stream(sb.toString()
                        .split("-"))
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                }).sorted()
                .toArray(Integer[]::new);
        FileWriter fw =new FileWriter("text1.txt");
        String s = Arrays.toString(arr).replace(", ", "-");
        String result =s.substring(1,s.length()-1);
        fw.write(result);
        fw.close();

    }
}
