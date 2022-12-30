import java.util.*;
class st
{
	public static void main(String args[])
	{
		Stack<String> st=new Stack<String>();
		st.push("Sandy");
		st.push("Is");
		st.push("Very");
		st.push("Bulsut");
		st.push("Boy");

		System.out.println("Elements in the Stack: "+st);
		System.out.println("Elements in the Top of the Stack: "+st.peek());
		System.out.println("Remove Stack: "+st.pop());
		System.out.println("Elements in the Stack: "+st);
	}
}