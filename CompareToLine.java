import java.util.Scanner;
public class CompareToLine{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter your x1 coordinate");
int x1 = input.nextInt();
System.out.println("Enetr your x2 coordinate");
int x2 = input.nextInt();
System.out.println("Eneter your y1 coordinate");
int y1 = input.nextInt();
System.out.println("Enter  your y2 coordinate");
int y2 = input.nextInt();
double lengthLine1 = Math.sqrt((Math.pow(x2-x1)),2 + ((Math.pow(y2-y1)),2);
System.out.println("The length of Line1 is :" +lengthLine1);
System.out.println("Enter your  x3 Coordinate :");
int x3 = input.nextInt();
System.out.println("Enter your y3 coordinate");
int y3 = input.nextInt();
System.out.println("Enter your x4 coordinate");
int x4 = input.nextInt();
System.out.println("Enter your y4 coordinate");
int y4 = input.nextInt();
double lengthLine2 = Math.sqrt((math.pow(x4-x3),2) +(math.pow(y4-y3),2)));
res = lengthLine1.compare2(lengthLine2);
if(lengthLine1 == res){
System.out.println("The length of lengthline1 is equal");
}
else if(lengthLine1 >= lengthLine2){
System.out.println("lengthLine1 is greater");
}
else{
System.out.println("lengthLine1 is smaller");
}
}}
