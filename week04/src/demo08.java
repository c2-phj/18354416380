import java.io.*;

public class demo08 {
    public static void main(String[] args) throws IOException {
        InputStream is=new FileInputStream(new File("C:\\Users\\86183\\Desktop\\demo\\csa.txt"));
        OutputStream os=new FileOutputStream(new File("C:\\Users\\86183\\Desktop\\demo\\csa02.txt"));

        int len=0;
        byte[] bt=new byte[1024];
        while((len=is.read(bt))!=-1)
        {
            os.write(bt);
        }
    }
}
