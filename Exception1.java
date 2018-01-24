public class Exception1
{
    public static void cal()throws Exception 
       {
       for(int i=5;i>0;i--)
          {
             int c=10/i;
         }
       }
    public static void main(String []args)
    {
        try
        {
       cal();
       System.out.println("no exception");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       
    }
}