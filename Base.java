public class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base constructor");
    }
   public void Fun()
    {

        System.out.println("Inside Base Fun");
    }
    public void Sun()
    {

        System.out.println("Inside Base Fun");
    }

}
class Derivedx extends Derived
{

   public P,Q;
   public Derivedx()
   {
    System.out.println("Derivedx constructor");
   }
   public  void Gun()
   {
    System.out.println("Inside Derivedx Gun");
   }



}


class hirarcheal
{
    public static void main(String A[])
    {
     Derivedx dobj = new Derivedx();
     dobj.Fun();
     dobj.Gun();
     dobj.Sun();
    }
} {
    
}
