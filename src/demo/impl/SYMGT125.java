package demo.impl;

import demo.base.AbstractGasMotorcycle;

public class SYMGT125 extends AbstractGasMotorcycle{
	
	final Integer engineDisplacement = 125;
	
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
		System.out.println("回SYM原廠保養完成");
		setMaintainDistance(0);
	}
	
	public SYMGT125(String color,double drivenDistance,double energyLeft) {
			this.brand = "SYM";
			this.type = "GT125";
			this.wheelAmount = 2;
			this.color = color;
			this.isStart = false;
			this.speed = 100;
			this.drivenDistance = drivenDistance;
			this.maintainDistance = 0;
			this.energyMax = 20;
			this.energyLeft = energyLeft;
			this.energyConsumption = 1;
	}
}
