package demo.impl;

import demo.base.AbstractMotorclycle;
import demo.base.Eletric;
import demo.base.Oil;

public class Gogoro extends AbstractMotorclycle{
	
	public Gogoro(String color,double drivenDistance, double energyLeft) {
		super(	"Gogoro",			// 紅礟
				"Gogoro1",			// 腹
				"Push Start",		// 币笆よΑ 
				color, 
				new Eletric(), 		//方
				100, 				//程蔼硉
				drivenDistance, 
				10, 				//方程秖
				energyLeft, 
				0.1					//方秖
				);
	}
	
	@Override
	public boolean isNeedMaintain(){
		if(getMaintainDistance()>2000){
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void maintain(){
		System.out.println("Gogoro紅玂緄ЧΘ");
		setMaintainDistance(0);
	}
	

	
}
