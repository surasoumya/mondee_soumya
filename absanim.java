            abstract class animals
      {
             abstract void cat();
               abstract void dog();
           }
           class duper extends animals
           {
               void cat() {
            	  System.out.println(" cat drinks milk")  ;
              }
           void dog() {
        	   System.out.println(" dog eats pure non veg");
           }
           }
 class absanim {
     public static void main(String []args){
        animals a1=new duper();
        a1.cat();
        a1.dog();
     }
     }
           
         