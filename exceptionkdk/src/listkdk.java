import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class listkdk {
	public static void main (String[] args)
	{
		HashSet<String> kdk = new HashSet<String>();
		kdk.add("KDK");
		kdk.add("cbn");
		kdk.add("ysr");
		kdk.add("boom");
		Iterator<String> k=kdk.iterator();
		{
			while(k.hasNext())
			{
				System.out.println(k.next());
			}
			
		}
		
	

	}
}

