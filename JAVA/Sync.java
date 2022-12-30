class Bolder
{
	synchronized void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
              System.out.println();

	}

}
class Thread1 extends Thread
{
	Bolder b;
	Thread1(Bolder b)
	{
		this.b=b;
	}
	public void run()
	{
		b.printTable(8);
	}
	

}
class Thread2 extends Thread
{
	Bolder b;
	Thread2(Bolder b)
	{
		this.b=b;
	}
	public void run()
	{
		b.printTable(4);
	}

}
class Sync
{
	public static void main(String arg[])
	{
		Bolder obj=new Bolder();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);

		t1.start();
		t2.start();
	}
}













