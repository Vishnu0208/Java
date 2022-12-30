import java.util.*;
class deque
{
	public static void main(String args[])
	{
		Deque<String> ps=new ArrayDeque<String>();
		ps.add("What");
		ps.add("Dhoni");
		ps.add("MSD");

		System.out.println(ps);

		ps.addFirst("Hardhik");
		System.out.println("Elements in the Queue: "+ps);
		ps.addLast("Okay");
		System.out.println("Elements in the Queue: "+ps);
		ps.removeFirst();
		System.out.println("Elements in the Queue: "+ps);
		ps.removeLast();
		System.out.println("Elements in the Queue: "+ps);

	      Iterator vs=ps.iterator();
		while(vs.hasNext())
		{
			System.out.println(vs.next());
		}
	
	}
}