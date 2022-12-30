import java.util.*;
class prq1
{
	public static void main(String args[])
	{
		PriorityQueue<String> ls=new PriorityQueue<String>();
		ls.add("Happy");
		ls.add("Good");
		ls.add("Nice");
             ls.add("Wonder");

		System.out.println(ls);
		System.out.println("Head: "+ls.element());
		System.out.println("Head: "+ls.peek());
		System.out.println(ls.remove());
		System.out.println("After removing: "+ls);
		System.out.println("Poll Method: "+ls.poll());
		System.out.println("After Poll Method: "+ls);

		Iterator vp=ls.iterator();
		while(vp.hasNext())
		{
			System.out.println(vp.next());
		}
	}
}