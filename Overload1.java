import java.io.*;
class Overload
{
void area(int s)
{
int side=s;
int r=side*side;
System.out.println("area of square	"+r);
}
void area(int l,int b)
{
int len=l;
int breath=b;
int r=len*breath;
System.out.println("area of rectangle	"+r);
}
void area(double rad)
{
double radius=rad;
double r=3.14*rad*rad;
System.out.println("area  of circle	"+r);
}}
class Overload1{
public static void main(String arg[])throws IOException
{
Overload ov=new Overload();
DataInputStream din=new DataInputStream(System.in);
System.out.println("enter a side of square	");
int s=Integer.parseInt(din.readLine()); 
System.out.println("enter a length and breath of rectangle");
int l=Integer.parseInt(din.readLine());
int b=Integer.parseInt(din.readLine());
System.out.println("enter a radious of circle");
double rad=Double.parseDouble(din.readLine());
ov.area(s);
ov.area(l,b);
ov.area(rad);

}

}