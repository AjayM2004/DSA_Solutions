package Backtracking.basics;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.* ;
import java.io.*;
public class Main {
    static void generatePath(String str,int[][] maze,ArrayList<String> paths,int rows,int cols)
    {
        if(rows==maze.length-1 && cols==maze[0].length-1)
        {
            paths.add(str);
            return;
        }
        if(maze[rows][cols]==0)
        {
            return;
        }
        maze[rows][cols]=0;
        if(rows<maze.length-1)
        {
            generatePath(str+"D",maze,paths,rows+1,cols);
        }
        if(cols<maze[0].length-1)
        {
            generatePath(str+"R",maze,paths,rows,cols+1);
        }
        if(rows>0)
        {
            generatePath(str+"U",maze,paths,rows-1,cols);
        }
        if(cols>0)
        {
            generatePath(str+"L",maze,paths,rows,cols-1);
        }
        maze[rows][cols]=1;
    }
    public static ArrayList < String > findSum(int[][] arr, int n) {
        ArrayList<String> paths = new ArrayList<>();
        generatePath("",arr,paths,0,0);
        return paths;
    }
    public static void main(String[] args) {
        int[][] maze = {{1,1,1},{1,1,1},{1,1,1}};
        System.out.println(findSum(maze,3));
    }
}
