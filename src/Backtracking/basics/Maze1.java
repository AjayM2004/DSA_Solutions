package Backtracking.basics;
import java.util.*;
public class Maze1 {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        List<String> list = new ArrayList<>();
//        path1("",3,3,list);

//        path2("",3,3,list);
        boolean[][] maze = {{true, true, true},
                            {true, true, true},
                            {true,true,true}};
        int[][] path = {{0,0,0},{0,0,0},{0,0,0}};
        path4_1("",maze,0,0,path,0);
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
    static void path3(String str,boolean[][] maze,int r,int c,List<String> list)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            list.add(str);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        if(r<maze.length-1)
        {
            path3(str+"D",maze,r+1,c,list);
        }
        if(c<maze[0].length-1) {
            path3(str+"R", maze, r, c + 1, list);
        }
    }
    static void path4(String str, boolean[][] maze, int r, int c, List<String> ans)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            ans.add(str);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c] = false;
        if(r<maze.length-1)
        {
            path4(str+"D",maze,r+1,c,ans);
        }
        if(c<maze[0].length-1)
        {
            path4(str+"R",maze,r,c+1,ans);
        }
        if(r>0)
        {
            path4(str+"U",maze,r-1,c,ans);
        }
        if(c>0)
        {
            path4(str+"L",maze,r,c-1,ans);
        }
//        before going back remove the changes
        maze[r][c] = true;
    }
    static void path4_1(String str,boolean[][] maze,int r,int c,int[][] path,int cnt)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            path[r][c]=cnt+1;
            System.out.println(str);
            for(int[] arr:path)
            {
                System.out.println(Arrays.toString(arr));
            }
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c] = false;
        if(r<maze.length-1)
        {
            path[r][c]=cnt+1;
            path4_1(str+"D",maze,r+1,c,path,cnt+1);
            path[r][c] = 0;
        }
        if(c<maze[0].length-1)
        {
            path[r][c]=cnt+1;
            path4_1(str+"R",maze,r,c+1,path,cnt+1);
            path[r][c] = 0;
        }
        if(r>0)
        {
            path[r][c]=cnt+1;
            path4_1(str+"U",maze,r-1,c,path,cnt+1);
            path[r][c] = 0;
        }
        if(c>0)
        {
            path[r][c]=cnt+1;
            path4_1(str+"L",maze,r,c-1,path,cnt+1);
            path[r][c] = 0;
        }
//        before going back remove the changes
        maze[r][c] = true;
    }
}
