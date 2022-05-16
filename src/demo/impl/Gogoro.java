package demo.impl;

import demo.base.AbstarctElectricMotocycle;

public class Gogoro extends AbstarctElectricMotocycle{
	
	final Integer engineDisplacement = 0;
	
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
		System.out.println("回Gogoro原廠保養完成");
		setMaintainDistance(0);
	}
	
	public Gogoro(String color,double drivenDistance,double energyLeft) {
			this.brand = "Gogoro";
			this.startType = "keyLess";
			this.type = "Gogoro1";
			this.color = color;
			this.wheelAmount = 2;
			this.isStart = false;
			this.speed = 100;
			this.drivenDistance = drivenDistance;
			this.maintainDistance = 0;
			this.energyMax = 50;
			this.energyLeft = energyLeft;
			this.energyConsumption = 1;
	}
	
}
