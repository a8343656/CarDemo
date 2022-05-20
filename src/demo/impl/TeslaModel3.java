package demo.impl;

import demo.base.AbstractCar;
import demo.base.Eletric;
import demo.base.Oil;

public class TeslaModel3 extends AbstractCar{

	
	public TeslaModel3(String color,double drivenDistance, double energyLeft) {
		super(	"Tesla",			// �t�P
				"Model3",			// ����
				"Push start",		// �Ұʤ覡 
				color, 
				new Eletric(), 		//�෽
				300, 				//�̰��t
				drivenDistance, 
				100, 				//�෽�̤j�q
				energyLeft, 
				1					//�෽���Ӷq
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
		System.out.println("�^�S���ԭ�t�O�i����");
		setMaintainDistance(0);
	}

}
