package threads;

public class Start extends Thread {
public void run() {
	System.out.println("thread is created");
}
public static void main(String rgs[]) {
	Start s1=new Start();
	s1.start();
	//s1.run12();
	
}
}
