import java.util.Scanner;
public class EmpEqualMethods{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter your x1 coordinate");
int x1 = input.nextInt();
System.out.println("Enter your y1 coordinate");
int y1 = input.nextInt();
System.out.println("Eneter your x2 coordinate");
int x2 = input.nexxtInt();
System.out.println("Enter your y2 coordinate ");
int y2 = input.nextInt();
System.out.println("Enter your x3 coordinate");
int x3 = input.nextInt();
System.out.println("Enter your y3 coordinate");
int y3 = input.nextInt();
double lengthLine1 = Math.sqrt(MAth.pow(x2-x1),2) (Math.pow(y2-y1),2));
double lengthLine2 = Math.sqrt(Math.pow(x3 - x2),2)(Math.pow(y3-y2),2));
boolean res = lengthLine1.equals(lengthLine2);
if(lengthLine1 == res){
res true;
}
else if(lengthtLine2 == res){
res false;
}
