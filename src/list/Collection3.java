package list;

import java.util.ArrayList;

class Student
{
	String num;
	String name;
	String city;
	public Student(String num,String name,String city)
	{
		this.num=num;
		this.name=name;
		this.city=city;
		//System.out.println( num+" "+name+" "+city);
	}
}
public class Collection3 {

	public static void main(String[] args) {
		Student str=new Student("test","sai","hyd");
		Student str1=new Student("test","bintu","Dli");
		Student str2=new Student("test","goud","Ben");
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(str);
		al.add(str1);
		al.add(str2);
		java.util.Iterator<Student> itr=al.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
			//System.out.println(st.city);
			
		}
		
		

	}

}
