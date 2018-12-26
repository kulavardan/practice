package queue;
import java.util.Iterator;
import java.util.PriorityQueue;

   
    
    class PriorityQueueDemo
    {  
    	
    public static void main(String args[]){  
    PriorityQueue<Integer> queue=new PriorityQueue<Integer>();  
    /*queue.add("Amit");  
    queue.add("Vijay");  
    queue.add("Karan");  
    queue.add("Jai");  
    queue.add("Rahul"); */ 
    queue.add(4);  
    queue.add(5);  
    queue.add(3);  
    queue.add(1);  
    queue.add(2); 
    System.out.println("head:"+queue.element());  //top element displys
    System.out.println("head:"+queue.peek());  //top element displays
    System.out.println("iterating the queue elements:");  
    Iterator itr=queue.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }  
   System.out.println("remove element"+ queue.remove());  //removes top elements
    while(itr.hasNext()){  
        System.out.println(itr.next());  
        } 
    
   System.out.println("polling element "+ queue.poll());  
    System.out.println("after removing two elements:");  
    Iterator<Integer> itr2=queue.iterator();  
    while(itr2.hasNext()){  
    System.out.println(itr2.next());  
    }  
    }  
    
    //poll will remove the top element where as peek will not remove the top element , just it displays the element
    }  