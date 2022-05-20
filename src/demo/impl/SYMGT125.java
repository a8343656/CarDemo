package demo.impl;

import demo.base.AbstractMotorclycle;
import demo.base.Oil;



public class SYMGT125 extends AbstractMotorclycle{
	
	public SYMGT125(String color,double drivenDistance, double energyLeft) {
		super("SYM",		// �t�P
				"GT125",	// ����
				"key",		// �Ұʤ覡 
				color, 
				new Oil(), 	//�෽
				100, 		//�̰��t
				drivenDistance, 
				10, 		//�෽�̤j�q
				energyLeft, 
				0.1			//�෽���Ӷq
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
		System.out.println("�^SYM��t�O�i����");
		setMaintainDistance(0);
	}

}
