package demo.impl;

import demo.base.AbstractElectricCar;

public class TeslaModel3 extends AbstractElectricCar{

	final Integer engineDisplacement = 0;
	
	public boolean isNeedMaintain(){
		if(getMaintainDistance()>20000){
			return true;
		} else {
			return false;
		}
	}
	
	public void maintain(){
		System.out.println("回特斯拉原廠保養完成");
		setMaintainDistance(0);
	}
	
	public TeslaModel3(String color,double drivenDistance,double energyLeft) {
			this.brand = "Tesla";
			this.type = "Model3";
			this.wheelAmount = 4;
			this.color = color;
			this.isStart = false;
			this.speed = 300;
			this.drivenDistance = drivenDistance;
			this.maintainDistance = 0;
			this.energyMax = 100;
			this.energyLeft = energyLeft;
			this.energyConsumption = 0.5;
	}

}
