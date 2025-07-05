package recursion.medium;

import java.util.ArrayList;

public class PhoneNumberLeetcode {
    static void generateLetter(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        if(digit==9)
        {
            for(int i=(digit-1)*3;i<digit*3-1;i++) {
                char ch = (char) ('a' + i);
                generateLetter(p + ch, up.substring(1));
            }
        }
        else{
            for(int i=(digit-1)*3;i<digit*3;i++) {
                char ch = (char) ('a' + i);
                generateLetter(p + ch, up.substring(1));
            }
        }

    }
    static ArrayList<String> generateLetterList(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        if(digit==9)
        {
            for(int i=(digit-1)*3;i<digit*3-1;i++)
            {
                char ch = (char)('a'+i);
                list.addAll(generateLetterList(p+ch,up.substring(1)));
            }
        }
        else
        {
            for(int i=(digit-1)*3;i<digit*3;i++)
            {
                char ch = (char)('a'+i);
                list.addAll(generateLetterList(p+ch,up.substring(1)));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        generateLetter("","9");
        ArrayList<String> list = generateLetterList("","9");
        System.out.println(list);
    }
}
