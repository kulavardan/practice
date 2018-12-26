package set;



import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;


public class SortedSetDemo {

	public static void main(String[] args) {
				
				TreeSet<String> al3=new TreeSet<String>();
				al3.add("Sai");
				al3.add("bintu");
				al3.add("kumar");
				al3.add("goud");
				System.out.println(al3.headSet("Sai"));;
				//al.add(1,"dimpu");
				//al.add(al.size(),"chiru");
				Iterator<String> itr=al3.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}

			}

	

	}

