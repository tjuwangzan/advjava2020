package cn.tju.chp02.s04.polymorph;

import cn.tju.chp02.s06.infinal.Bicycle;

public class RoadBike extends Bicycle {

	private int height;
	public RoadBike(int startSpeed, int startGear,int height) {
		super(startSpeed, startGear);
		this.height = height;
		// TODO Auto-generated constructor stub
	}

}
