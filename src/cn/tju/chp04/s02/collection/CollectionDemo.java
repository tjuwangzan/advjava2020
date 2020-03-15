package cn.tju.chp04.s02.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;



class Name implements Comparable{
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Name(String f, String l){
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Name) {
            Name name = (Name)obj;
            return (this.firstName.equals(name.firstName) ) &&
            		(this.lastName.equals(name.lastName) );
         
        }
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return this.firstName + "/" + this.lastName;
	}
//	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return firstName.hashCode();
	}
	@Override
	public int compareTo(Object o) {
		
			Name name = (Name)o;
			int lastCom = this.lastName.compareTo(name.lastName);
			return (lastCom!=0?lastCom:this.firstName.compareTo(name.firstName));
			}
	
}

public class CollectionDemo {

	
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add(new Name("Zhang", "San"));
	
		c.add(new Integer(400));
		c.add("Test");
		
		System.out.println(c.size());
		System.out.println(c);
		System.out.println("------------------------");
		
		c.remove(new Integer(400));
		c.remove("Test"); 
		c.remove(new Name("Zhang","San"));
		System.out.println(c.size());
		System.out.println(c);
		
//		c.forEach(o->System.out.println(o));
//		
//		System.out.println("------------------------");		
//		Iterator iterator = c.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		
		
//		
//		Collection cc = new TreeSet();
//		cc.add(new Name("f1","L1"));
//		cc.add(new Name("f2","L2"));
//		cc.add(new Name("f2","L2"));
//		System.out.println(cc);
//		System.out.println(cc.contains(new Name("f2","L2")));
//		cc.remove(new Name("f1","L1"));
//		System.out.println(cc);

	}

}
