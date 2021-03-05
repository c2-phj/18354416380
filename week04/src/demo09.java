import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class demo09 {
    public static void main(String[] args) throws IOException {
        File f1=new File("C:\\Users\\86183\\Desktop\\demo\\csa.txt");
        InputStream is=new FileInputStream(f1);
        byte[] bt=new byte[1024];
        int len=0;
        int count=0;

        while((len=is.read(bt))!=-1)
        {
            count++;
        }
        String str=new String(bt,0,count);
        String[] sp=str.split("csa");
        System.out.println(sp.length);
        is.close();
    }
}
