package threads;

public class Sleep extends Thread{  
	public void run(){  
		for(int i=1;i<5;i++){  
			try{
				Thread.sleep(500);
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}  
			System.out.println(i);  
		}  
	}  
	public static void main(String args[]){  
		Sleep t1=new Sleep();  
		Sleep t2=new Sleep();  

		t1.start();  
		t2.start();  
	}  
}  

