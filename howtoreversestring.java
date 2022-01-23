package basics;


import java.util.Arrays;

public class howtoreversestring {


    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("56466464");
        a.reverse();


        String aa = "fffffjjjj";
        byte[] bb = aa.getBytes();
        System.out.println(Arrays.toString(bb));
        byte[] cc = new byte[aa.length()];
        for (int i = 0; i < aa.length(); i++) {


            cc[i] = bb[aa.length() - 1 - i];

        }
        String CC = new String( cc);
        System.out.println(CC);


    }


}




