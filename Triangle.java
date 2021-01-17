//3
public class Triangle {
public Triangle() {
double perimeter;
double area;
int a=3,b=4,c=5;
perimeter=a+b+c;
double s = (a+b+c)/2;//finding semi perimeter
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));// Heron's Formula to calculate Area

System.out.println("Perimeter Of Triangle with sides 3,4,5 = "+perimeter);
System.out.println("Area Of Triangle with sides 3,4,5 = "+area);

}
public static void main(String[] args) {
Triangle ob = new Triangle();
}
} 
