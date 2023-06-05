import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class test1 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("");
        StringBuilder sb=new StringBuilder();
        int ch;
        while((ch=fr.read())!=-1){
            sb.append((char)ch);
        }
        fr.close();
        String str=sb.toString();
        String[] arr = str.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arr) {
            int i = Integer.parseInt(s);
            list.add(i);
        }
        Collections.sort(list);
        FileWriter fw =new FileWriter("");
        for (int i=0;i< list.size();i++){
            if(i==list.size()-1){
                fw.write(list.get(i)+"");
            }else{
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();
    }
}
