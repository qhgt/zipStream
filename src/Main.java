import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File src= new File("E:\\java\\basic\\day1");
        File dest= new File("E:\\java\\basic\\day11");
        copydir(src,dest);

    }


    private static void copydir(File src,File dest) throws IOException {
        dest.mkdirs();

        //1.进入数据源
        File[] files = src.listFiles();
        //2.遍历数组
        for (File file : files) {
            if(file.isFile()){
                //是文件，拷贝
                FileInputStream  fis=new FileInputStream(file);
                FileOutputStream fos= new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes=new byte[1024];
                int len;
                while((len=fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }else{
                //不是文件夹，递归
                copydir(file,new File(dest,file.getName()));
            }
        }

    }
}