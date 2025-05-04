package String;

public class RotatedString {
    public static void main(String[] args) {
        System.out.println( IsRotated("daxjheq","eqdaxjh"));

    }
    private static  boolean IsRotated(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        String s=s1.substring(2);

       StringBuilder clockwise=new StringBuilder(s);
       clockwise.append(s1.substring(0,2));
        if(s2.equals((clockwise).toString())){
            return true;
        }
        StringBuilder anticlockwise=new StringBuilder(s1.substring(s1.length()-2));
        anticlockwise.append(s1.substring(0,s1.length()-2));


        if(s2.equals(anticlockwise.toString())){
            return true;
        }
        return false;

    }
}
