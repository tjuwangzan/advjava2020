package cn.tju.chp06.s03.proxy;

public class StaticClient {

	public static void main(String[] args) {
		ISubject subject = new ProxySubject();
		
		subject.request();
		subject.output();

	}

}
