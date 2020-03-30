package cn.tju.chp07.s01.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutofMemoryDemo {

	public static void main(String args[]){
	    ArrayList<byte[]> list=new ArrayList<byte[]>();
		    for(int i=0;i<1024;i++){
		        list.add(new byte[5*1024*1024]);
		    }
	}
//	
//	public static void main(String[] args) {
//		List<TestCase> demolist = new ArrayList<TestCase>();
//		while(true) {
//			demolist.add(new TestCase());
//		}
//	}
	
//	public static void main(String[] args) {
//		String str = "tju cic scs 2018";
//		while(true) {
//			str += str + new Random().nextInt(88888888) + new Random().nextInt(999999999);
//		}
//	}

}
