//1
class Areas
{
    public static void main(String[] args)
    {
        AreaOf obj = new AreaOf();
        obj.AreaOf(2);
        obj.AreaOf(5,3);
    }
}
class AreaOf
{
    double A;
    void AreaOf(double r)
    {
        A = (r*r*22)/7;
        System.out.println("Area of the circle is "+A);
    }
    void AreaOf(double l,double b)
    {
        A = l*b;
        System.out.println("Area of the reactangle is "+A);
    }
}
