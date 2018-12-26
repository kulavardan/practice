package list;

import java.util.LinkedList;
import java.util.List;

class emp
{
	int num;
	String name;
	String rank;
	public emp(int num,String name,String rank)
	{
		this.num=num;
		this.name=name;
		this.rank=rank;
	}
	
}
public class LinkedlistDemo2 {

	public static void main(String[] args) {
		
		List<emp> bk=new LinkedList<emp>();
		emp e1=new emp(100,"sai", "bintu");
		emp e2=new emp(200,"ramesh", "vemula");
		emp e3=new emp(300,"shiva", "apuri");
		
		bk.add(e1);
		bk.add(e2);
		bk.add(e3);
		for(emp a:bk)
		{
			System.out.println(+a.num+" "+a.name+" "+a.rank);
		}
	}

}
