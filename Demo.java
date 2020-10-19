public class Demo{
 public static void printLoop(int x){
  for (int i = x; i > 0; i--){
   for (int j = 0; j < i; j++){
    System.out.print(x - i + 1);
   }
   System.out.println(); 
  }    
 } 


 public static void main(String[] args){
  if (args.length == 1){
   printLoop(Integer.parseInt(args[0]));
  }else{
   printLoop(5);
  }  
 }
}