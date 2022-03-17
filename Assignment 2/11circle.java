import java.util.Scanner;
class circle{
 
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter radius ");
 double r = sc.nextDouble();
  System.out.println("Perimeter is "+(2*(22.0/7)*r));
 System.out.println("Area is "+((22.0/7)*r*r));
 }
}