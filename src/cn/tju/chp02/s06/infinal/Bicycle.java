package cn.tju.chp02.s06.infinal;

public class Bicycle {
	 // the Bicycle class has two fields
    public int gear;
    public int speed;
    int test;
        
    // the Bicycle class has one constructor
    public Bicycle( int startSpeed, int startGear) {
        this.gear = startGear;
        this.speed = startSpeed;
    }
        
    // the Bicycle class has three methods
   
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }

}
