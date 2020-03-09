package cn.tju.chp03.s01.exception;

public class ExceptionChain {
	/**
	 * test1() 抛出了AddException异常
	 * test2() 
	 * @param args
	 */

	public static void main(String[] args) {
		ExceptionChain ec = new ExceptionChain();
		ec.test2();
	}
	
	public void test1() throws AddException{
		throw new AddException("参数过大");
	}
	
	public void test2() {
		try {
			test1();
		} catch (AddException e) {
			RuntimeException newExc = new RuntimeException("参数有问题");
			newExc.initCause(e);
			throw newExc;
		}
	}

}
