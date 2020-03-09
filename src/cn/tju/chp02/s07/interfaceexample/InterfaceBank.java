package cn.tju.chp02.s07.interfaceexample;

interface Bank{
	float rateOfInterest();
}

class ICBC implements Bank{
	public float rateOfInterest(){
		return 9.15f;
	}
}

class BC implements Bank{
	public float rateOfInterest(){
		return 9.7f;
	}
}

class ABC implements Bank{
	@Override
	public float rateOfInterest() {
		// TODO Auto-generated method stub
		return 10.2f;
	}
}
public class InterfaceBank {

	public static void main(String[] args) {
		Bank b = new BC();
		System.out.println("ROI:" + b.rateOfInterest());

	}

}
