package Backtracking.basics;
import java.util.*;
public class Maze1 {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        List<String> list = new ArrayList<>();
//        path1("",3,3,list);
        path2("",3,3,list);
        System.out.println(list);
    }
    static int count(int r,int c)
    {
        if(c==1 || r==1)
        {
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;
    }
    static void path(String str, int r, int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(str);
            return;
        }
        if(r>1)
        {
            path(str+"D",r-1,c);
        }
        if(c>1)
        {
            path(str+"R",r,c-1);
        }
    }
    static void path1(String str,int r,int c,List<String> list)
    {
        if(r==1 && c==1)
        {
            list.add(str);
            return;
        }
        if(r>1)
        {
            path1(str+"D",r-1,c,list);
        }
        if(c>1)
        {
            path1(str+"R",r,c-1,list);
        }
    }
    static void path2(String str,int r,int c,List<String> list)
    {
        if(r==1 && c==1)
        {
            list.add(str);
            return;
        }
        if(r>1 && c>1)
        {
            path2(str+"D",r-1,c-1,list);
        }
        if(r>1)
        {
            path2(str+"V",r-1,c,list);
        }
        if(c>1)
        {
            path2(str+"H",r,c-1,list);
        }
    }
}
