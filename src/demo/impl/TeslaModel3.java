package demo.impl;

import demo.base.AbstractCar;
import demo.base.Eletric;
import demo.base.Oil;

public class TeslaModel3 extends AbstractCar{

	
	public TeslaModel3(String color,double drivenDistance, double energyLeft) {
		super(	"Tesla",			// 紅礟
				"Model3",			// 腹
				"Push start",		// 币笆よΑ 
				color, 
				new Eletric(), 		//方
				300, 				//程蔼硉
				drivenDistance, 
				100, 				//方程秖
				energyLeft, 
				1					//方秖
				);
	}
	
	public boolean isNeedMaintain(){
		if(getMaintainDistance()>20000){
			return true;
		} else {
			return false;
		}
	}
	
	public void maintain(){
		System.out.println("疭吹┰紅玂緄ЧΘ");
		setMaintainDistance(0);
	}

}
