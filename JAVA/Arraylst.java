import java.util.*;
class Hs
{
	public static void main(String ars[])
	{
		HashSet<Integer>h=new HashSet<Integer>();
		h.add(3);
		h.add(99);
		h.add(54);
		h.add(1);
		System.out.println(h);
		
		Iterator t=h.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		}		
	}
}