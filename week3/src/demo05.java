public class demo05 {
    public class TCPException extends Exception{
        public TCPException() {
        }
        public TCPException(String s) {
            super(s);
        }
    }
    public static void main (String[] args) throws Exception{
        int num=25;
        try{
            num=num/0;
        }
        catch (Exception e)
        {
            throw new demo05().new TCPException("发生除0错误");
        }
    }
}
