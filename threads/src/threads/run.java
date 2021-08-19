package threads;

public class run extends Thread  {

        public void run(){  
         for(int i=1;i<5;i++){  
           try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
           System.out.println(i);  
         }  
        }  
        public static void main(String args[]){  
        	 run t1=new run();  
        	 run t2=new  run();  
          
         t1.run();  
         t2.run();  
        }  
       }  

