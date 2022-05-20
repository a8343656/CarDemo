package demo.impl;

import demo.base.AbstractCar;
import demo.base.Oil;

public class FordFiesta extends AbstractCar{
	
	public FordFiesta(String color,double drivenDistance, double energyLeft) {
		super(	"Ford",			// �t�P
				"Fiesta",		// ����
				"key",			// �Ұʤ覡 
				color, 
				new Oil(), 		//�෽
				100, 			//�̰��t
				drivenDistance, 
				50, 			//�෽�̤j�q
				energyLeft, 
				0.1				//�෽���Ӷq
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
		System.out.println("�^�֯S��t�O�i����");
		setMaintainDistance(0);
	}


	

}
