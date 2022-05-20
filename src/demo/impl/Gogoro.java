package demo.impl;

import demo.base.AbstractMotorclycle;
import demo.base.Eletric;
import demo.base.Oil;

public class Gogoro extends AbstractMotorclycle{
	
	public Gogoro(String color,double drivenDistance, double energyLeft) {
		super(	"Gogoro",			// �t�P
				"Gogoro1",			// ����
				"Push Start",		// �Ұʤ覡 
				color, 
				new Eletric(), 		//�෽
				100, 				//�̰��t
				drivenDistance, 
				10, 				//�෽�̤j�q
				energyLeft, 
				0.1					//�෽���Ӷq
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
		System.out.println("�^Gogoro��t�O�i����");
		setMaintainDistance(0);
	}
	

	
}
