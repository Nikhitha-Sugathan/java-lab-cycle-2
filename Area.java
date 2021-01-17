//4
import java.util.Scanner;
class Rectangle{
int length,breadth;
public Rectangle(int l, int b){
length=l;
breadth=b;
}
public  int area()
{
  return length*breadth;
}
}
class Area{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the length: ");
  int l = sc.nextInt();
  System.out.println("Enter the breadth: ");
  int b = sc.nextInt();
  Rectangle a = new Rectangle(l,b);
  System.out.println("Area of rectangle: "+a.area());
}
}
