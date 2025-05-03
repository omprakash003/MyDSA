package String;

public class Stringbuffer {
    public static void main(String[] args) {
        String s="abcdefgh";
        StringBuilder sb=new StringBuilder("abcdefgh");
        StringBuffer sb2=new StringBuffer(s);
        String substring=sb.substring(0,3);
        System.out.println(sb2.substring(0,3));
        System.out.println(substring);
    }
}
