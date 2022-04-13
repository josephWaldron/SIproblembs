public class ToysRus extends RetailBusiness
{
   public static void main(String [ ] args)
   {  new ToysRus( );  }

   public ToysRus( )
   { System.out.println("too bad they closed");}
 }

 class RetailBusiness extends Business
 {
    public RetailBusiness( )
    {
       this ("order is important");
       System.out.println("more specific");
    }

    public RetailBusiness (String str)
    { System.out.println(str); }
  }

    class Business
    { 
         public Business( ) { System.out.println("Lots of companies here");}
    }
