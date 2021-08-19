package exceptionkdk;

public class numberformat {
static String s= "123.33";   

public static void main(String[] args) {  
  try {  
           int a = Integer.parseInt(s);  
  }catch(NumberFormatException ex){  
      System.out.println("Invalid string in argumment");  
   
  }  
      }  
}  
