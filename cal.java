class calculator
{
static double  powerInt(int n,int m)
{
return Math.pow(n,m);
}
static double powerdouble(double n,int m)
{
return Math.pow(n,m);
}
}
class cal{
public static void main(String args[])
{
calculator c=new calculator();
System.out.println(c.powerInt(16,11));
System.out.println(c.powerdouble(13,5));
}

}