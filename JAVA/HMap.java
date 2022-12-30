import java.util.*;
class HMap
{
	public static void main(String ars[])
	{
		Map<Integer,String>ma=new HashMap<Integer,String>();
		ma.put(3,"three");
		ma.put(99,"nine nine");
		ma.put(54,"five four");
		ma.put(1,"one");
		ma.put(3,"three");
		System.out.println(ma);
		
		for(Map.Entry m:ma.entrySet())
		{
			System.out.println("Key: "+m.getKey()+ " value: "+m.getValue());
		}	
		Map<Integer,String>ma1=new LinkedHashMap<Integer,String>();
		ma1.put(3,"three");
		ma1.put(99,"nine nine");
		ma1.put(54,"five four");
		ma1.put(1,"one");
		ma1.put(3,"three");
		System.out.println(ma1);

		Map<Integer,String>ma2=new TreeMap<Integer,String>();
		ma2.put(3,"three");
		ma2.put(99,"nine nine");
		ma2.put(54,"five four");
		ma2.put(1,"one");
		ma2.put(3,"three");
		System.out.println(ma2);
	}
}