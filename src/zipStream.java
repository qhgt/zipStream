import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class zipStream {
    public static void main(String[] args) throws IOException {
        File src=new File("");
        File dest= new File("");
        upzip(src,dest);
    }

    //解压
    public  static void upzip(File src ,File dest) throws IOException {

        //解压的本质：把压缩包里面的每一个文件或文件夹读取出来，按照层级目录拷贝到目的地中
        //创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip=new ZipInputStream(new FileInputStream(src));

        //先获取到压缩包里面的每一个zipentry对象

        //表示当前在压缩包中获取到党的文件或文件夹
        ZipEntry entry;
        while((entry=zip.getNextEntry())!=null){
            System.out.println(entry);
            if(entry.isDirectory()){
                //文件夹：需要在目的地dest处创建一个同样的文件夹
                File file   =new File(dest,entry.toString());
                file.mkdirs();
            }else{
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b=zip.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
