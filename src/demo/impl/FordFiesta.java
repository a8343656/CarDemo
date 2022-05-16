package demo.impl;

import demo.base.AbstarctGasCar;

public class FordFiesta extends AbstarctGasCar{
	
	final Integer engineDisplacement = 1600;
	
	public boolean isNeedMaintain(){
		if(getMaintainDistance()>5000){
			return true;
		} else {
			return false;
		}
	}
	
	public void maintain(){
		System.out.println("回福特原廠保養完成");
		setMaintainDistance(0);
	}

	public FordFiesta(String color,double drivenDistance,double energyLeft) {
			this.brand = "Ford";
			this.startType = "key";
			this.type = "Fiesta";
			this.color = color;
			this.wheelAmount = 4;
			this.isStart = false;
			this.speed = 150;
			this.drivenDistance = drivenDistance;
			this.maintainDistance = 0;
			this.energyMax = 50;
			this.energyLeft = energyLeft;
			this.energyConsumption = 0.1;
		
	}
	

}
