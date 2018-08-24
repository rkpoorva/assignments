import java.util.objects;
class Complex
{
final double re,im;
void plus(Complex b) 
{
        Complex a = this;             
        double real = a.re + b.re;
        double imag = a.im + b.im;
}


public static void main(String[] args) 
{
   Complex c=new Complex();
   Complex a = new Complex(5.0, 6.0);
   Complex b = new Complex(-3.0, 4.0);
   c.plus();

   System.out.println("b + a = " + b.plus(a));

}
}