package cn.tju.chp06.s02.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection {

	public static void main(String[] args) throws Exception {
		MyAnnTest mytest = new MyAnnTest();
		Class<MyAnnTest> c = MyAnnTest.class;
		Method m = c.getMethod("output", new Class[]{});
		
		Boolean flag = c.isAnnotationPresent(MyAnnotation.class);
//		System.out.println(flag);
		if (flag){
			m.invoke(mytest, new Object[]{});
			MyAnnotation myann = m.getAnnotation(MyAnnotation.class);
			System.out.println(myann.hello() + " ,  " + myann.world());
		}
		
		System.out.println("----------------------");
		Annotation[] annotations = m.getAnnotations();
		for(Annotation annotation: annotations) {
			System.out.println(annotation.annotationType().getName());
		}
		

	}

}
