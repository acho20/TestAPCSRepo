import java.util.Random;

public class Demo{
 public static void printLoop(int x){
  for (int i = x; i > 0; i--){
   for (int j = 0; j < i; j++){
    System.out.print(x - i + 1);
   }
   System.out.println(); 
  }    
 } 

 public static String arrToString(int[] arr){
  String x = "{";
  for(int i = 0; i < arr.length; i++){
   x += Integer.toString(arr[i]);
   if (i == arr.length - 1){
    x +="}";
   }else{
    x +=", ";
   }
  }
  if(arr.length == 0){
   return "{}";
  }
  return x;
 }

 public static String arrayDeepToString(int[][]arr){
  String x = "{";
  for(int i = 0; i < arr.length; i++){
   x += arrToString(arr[i]);
   if (i == arr.length - 1){
    x +="}";
   }else{
    x +=", ";
   }
  }
  return x;
 }

 public static int[][] create2DArray(int rows, int cols, int maxValue){
  int[][] x = new int[rows][cols];
  Random rand = new Random();
  for (int i = 0; i < x.length; i++){
   for (int j = 0; j < x[0].length; j++){
    x[i][j] = rand.nextInt(maxValue+1);
   }
  }
  return x;
 }

 public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
  int[][] x = new int[rows][];
  Random rand = new Random();
  for(int i = 0; i < x.length; i++){
   x[i] = new int[rand.nextInt(cols + 1)];
  }
  for (int i = 0; i < x.length; i++){
   for (int j = 0; j < x[i].length; j++){
    x[i][j] = rand.nextInt(maxValue+1);
   }
  }
  return x;
 }



 public static void main(String[] args){
  if (args.length == 1){
   printLoop(Integer.parseInt(args[0]));
  }else{
   printLoop(5);
  }  
 }

}

