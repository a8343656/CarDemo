package demo.impl;

import demo.base.AbstractCar;
import demo.base.Oil;

public class FordFiesta extends AbstractCar{
	
	public FordFiesta(String color,double drivenDistance, double energyLeft) {
		super(	"Ford",			// 紅礟
				"Fiesta",		// 腹
				"key",			// 币笆よΑ 
				color, 
				new Oil(), 		//方
				100, 			//程蔼硉
				drivenDistance, 
				50, 			//方程秖
				energyLeft, 
				0.1				//方秖
				);
	}

	final Integer engineDisplacement = 1600;
	
	public boolean isNeedMaintain(){
		if(getMaintainDistance()>5000){
			return true;
		} else {
			return false;
		}
	}
	
	public void maintain(){
		System.out.println("褐疭紅玂緄ЧΘ");
		setMaintainDistance(0);
	}


	

}
