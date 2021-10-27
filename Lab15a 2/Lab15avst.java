cfkydi69753// Lab15avst.java
// 02-28-15 by Leon Schram
// The "Odd Magic Square" Program
// This is the student, starting version of the Lab15 assignment.


import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab15avst
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

      System.out.print("Enter the odd# size of the Magic Square -->  ");
      int size = input.nextInt();
      MagicSquare magic = new MagicSquare(size);

      magic.computeMagicSquare();
      magic.displayMagicSquare();

}


class MagicSquare
{
    private int size;
    private int magic[][];
    private DecimalFormat output;

    public MagicSquare(int s)
    {
        size = s;
        magic = new int[size][size];
        output = new DecimalFormat("000");
        
    }

    public void computeMagicSquare()
    {
        int len = magic[0].length;
        int even = len - 1;
        int middle = even / 2;
        magic[0][even + 1] = 1;     //This section starts with 
        -try changing matrix value at by increments of [-1][+1],
        -if(current square is at [?][]) do sideWrap();
        -if(curremt square is at [0] [?]) do verticalWrap();
        -for every three squares, move it down 
        
    }
    public void displayMagicSquare()
    {
        System.out.println();
        System.out.println(size + "x" + size + " Magic Square");
        System.out.println("==================");
        System.out.println();
    }

}