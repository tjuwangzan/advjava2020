package cn.tju.chp06.s02.annotation;

@MyAnnotation(hello = "TJU",world="SCS")
public class MyAnnTest {
	@MyAnnotation(hello = "TJUMethod",world="SCSMethod")
	@Deprecated
	public void output(){
		System.out.println("Test MyAnnTest");
	}

}
