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
		h.add(3);
		System.out.println(h);
		
		Iterator<Integer>t=h.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		}	
		LinkedHashSet<String>h1=new LinkedHashSet<String>();
		h1.add("one");
		h1.add("two");
		h1.add("one");
		h1.add("five");
		System.out.println(h1);

		TreeSet<Integer>h3=new TreeSet<Integer>();
		h3.add(3);
		h3.add(99);
		h3.add(54);
		h3.add(1);
		System.out.println(h3);	
	}
}