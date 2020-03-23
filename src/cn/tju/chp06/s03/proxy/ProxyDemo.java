package cn.tju.chp06.s03.proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		IProxy proxy = new ProxyObject(new ProxyRealObject());
		proxy.performOperations();

	}

}
