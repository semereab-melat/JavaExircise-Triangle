
import java.util.Scanner;
/***************************************************************
 Filename: Triangle
 Created by: melat zerai
 Created on: 26/10/2021
 Comment: identify type of the triangle from the given sides
 ***************************************************************/


public class Main {

     public static int readInteger(String side)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter " + side + " of the triangel: ");
        return keyboard.nextInt();
    }
    public static String checkTriangle(int pSide1, int pSide2, int pSide3)
    {
        if (pSide1 >= 0 && pSide2 >=0 && pSide3 >=0)
        {
            if ((pSide1 == pSide2) && (pSide1 == pSide3) && (pSide2==pSide3))
                return "Equalaterial Trangle.";
            else if ((pSide1 == pSide2 || pSide2 ==pSide3))
                return "Isosceles Trangle.";
            else
                return "Scalen Triangle.";
        }

        return "Its not a triangle";
    }

    public static void main(String[] args)
    {
        int side1, side2, side3;

        side1 = readInteger("side number one ");
        side2 = readInteger("Side number two ");
        side3 = readInteger("Side number three");
        System.out.println(checkTriangle(side1, side2, side3));

    }//main
}//class

