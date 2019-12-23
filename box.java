class box
{
double w,b,h;
double a;
box(double w,double b,double h)
{
w=w;
b=b;
h=h;
a=w*b*h;
}
void area()
{

System.out.println("area is :"+a);
}
public static void main(String args[])
{
box b=new box(2,5,7);
b.area();
}
}