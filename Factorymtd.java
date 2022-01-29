	 abstract class computers{
    abstract void Apple();
    abstract void dell();
    abstract void hp();
}   
class mac extends computers{
      void Apple()
      {
         System.out.println("Apple Uses mac OS");
      }
      void dell()
      {
        System.out.println(" Oneplues dont use ios");
      }
      void hp()
      {
         System.out.println(" hp dont use ios");
      }
}
class linux extends computers{
     void Apple()
      {
         System.out.println(" Apple dont use linux os");
      }
      void dell()
      {
        System.out.println(" dell use linux os");
      }
      void hp()
      {
         System.out.println(" hp use  linux os");
      }
}
class windows extends computers{
   void Apple()
      {
         System.out.println(" ios dont use windows os");
      }
      void dell()
      {
        System.out.println(" Oneplues dont use windows os");
      }
      void hp()
      {
         System.out.println(" hp uses windows os");
      }
}
class cfactory{
    computers getdata(String x)
   {
     if(x.equals("mac"))
     return new mac();
     else if(x.equals("linux"))
     return new linux();
     else if(x.equals("windows"))
     return new windows();
     else 
        return null;
    }
}
class Factorymtd{
    public static void main(String args[]){
        cfactory cf=new cfactory();
         computers m=cf.getdata("linux");
         m.Apple();
         m.dell();
         m.hp();
    } 
}