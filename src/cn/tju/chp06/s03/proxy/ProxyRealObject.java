package cn.tju.chp06.s03.proxy;

public class ProxyRealObject implements IProxy {

	@Override
	public void performOperations() {
		System.out.println("This is a real object");
	}
	
	

}
