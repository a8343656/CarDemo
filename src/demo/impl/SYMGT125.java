package demo.impl;

import demo.base.AbstractMotorclycle;
import demo.base.Oil;



public class SYMGT125 extends AbstractMotorclycle{
	
	public SYMGT125(String color,double drivenDistance, double energyLeft) {
		super("SYM",		// 紅礟
				"GT125",	// 腹
				"key",		// 币笆よΑ 
				color, 
				new Oil(), 	//方
				100, 		//程蔼硉
				drivenDistance, 
				10, 		//方程秖
				energyLeft, 
				0.1			//方秖
				);
	}
	
	@Override
	public boolean isNeedMaintain(){
		if(getMaintainDistance()>1000){
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void maintain(){
		System.out.println("SYM紅玂緄ЧΘ");
		setMaintainDistance(0);
	}

}
