package cn.tju.chp06.s01.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

class Customer{
	private Long id;
	private String name;
	private int age;
	
	public Customer(){
		super();
	}
	
	public Customer(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Customer(Long id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id=" + id + ",name=" + name + ",age=" + age;
	}
	
}

public class ReflectCustomer {
	
	public Object copy(Object object) throws Exception{
		Class<?> clazz = object.getClass();
//		Constructor<?> cons = clazz.getConstructor(new Class[]{Long.class,String.class,int.class});
//		Object obj = cons.newInstance(new Object[]{12L,"test",2});
				
		Constructor<?> cons2 = clazz.getConstructor(new Class[]{});
		Object obj2 = cons2.newInstance(new Object[]{});
		
		Field[] fields = clazz.getDeclaredFields();
		for(Field f:fields) {
			String name = f.getName();
			String firstLetter = name.substring(0,1).toUpperCase();
			String getMethodName = "get" + firstLetter + name.substring(1);
			String setMethodName = "set" + firstLetter + name.substring(1);
			
			Method getMethod = clazz.getMethod(getMethodName, new Class[] {});
			Method setMethod = clazz.getMethod(setMethodName, new Class[] {f.getType()});
			
			Object value = getMethod.invoke(object, new Object[] {});
			setMethod.invoke(obj2, new Object[] {value});
		}
		
		

//		System.out.println(obj2);
			
		return obj2;
	}

	public static void main(String[] args) throws Exception {
		
		ReflectCustomer rc = new ReflectCustomer();
		Customer customer = (Customer) rc.copy(new Customer(11L,"tom",1));
		
		System.out.println(customer.getId()+"," + customer.getName() + "," + customer.getAge());

	}

}
