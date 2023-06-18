import java.util.Scanner;
System.out.println("-----------------Welcome To Line comparison Problem----------");
public class CartesianPoint{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter your X1 coordinate");
double x1 = input.nextInt();
System.out.println("Enter your x2 Coordinate ");
double x2 = input.nextInt();
System.out.println("Enter your y1 coordinate");
double y1 = input.nextInt();
System.out.println("Enter your y2 coordinate");
double y2 = input.nextInt();
double lengthLine1 = Math.sqrt((Math.Pow(x2-x1),2)) + (Math.pow((y2-y1),2));
System.out.println("Length of line 1 is: " +lengthofLine1);
System.out.println("Enter the x3 coordinate");
int x3 = input.nextInt();
System.out.println("Enter the y3 coordinate");
int y3 = input.nexInt();
System.out.println("Enter te  x4 coorrdinate");
int x4 = input.nextInt();
System.out.println("Enter y4 coordinate");
int y4 = input.nextInt();
doube lengthLine2 =Math.sqrt((Math.pow(x4-x3),2)) + (Math.pow((y4-y3),2);
System.out.prinln("Length of line 2 is:" +lengthLine2);
boolean res  = lengthLine1.equals(lengthline2);
if(res == true){
System.out.println("Lines are equals");
else{
System.out.println("Line are not equals");
}
input.close();
} 

}
}