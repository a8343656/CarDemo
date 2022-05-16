package demo.base;

public abstract class AbstarctGasCar extends AbstractCar{
	@Override
	public boolean isEnergyEnough(int range){
		if(getEnergyLeft() / getEnergyMax() <0.1){
			System.out.println("�T�����o�q�C��10%");
		}
		// �p�G�Ѿl�o�q��ݭn�o�q�h�A�Ұʦ��\
		if(getEnergyLeft() > getEnergyConsumption() * range){
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void start(){
		if(getEnergyLeft()>0){
			setStart(true);
			System.out.println("�Ұʦ��\");
		} else {
			setStart(false);
			System.out.println("�o�q�����A�T���Ұʥ���");
		}
	}
	
	@Override
	public void stop(){
		setStart(false);
		System.out.println("�����w����");
	}

	public void move (int range){
		if(isStart){
			// �P�_�෽�O�_�R���A�ӨM�w���ʪ��Z��
			int moveRange = 0;
			if(isEnergyEnough(range)){
				moveRange = range;
			}else {
				moveRange = (int) (getEnergyLeft()/getEnergyConsumption());
				System.out.println("���ʪ��o�q����");
			}
			// �W�[���{�P�O�i���{�A�æ������Ӫ��o�q
			setDrivenDistance(getDrivenDistance()+ moveRange);
			setMaintainDistance(getMaintainDistance()+moveRange);
			Double a = moveRange*getEnergyConsumption();
			setEnergyLeft(getEnergyLeft() - moveRange*getEnergyConsumption());
			
			System.out.println("�w�g����"+moveRange+"����"+
					"�o�q�Ѿl"+getEnergyLeft()+"L"+
					"����"+getEnergyLeft()/getEnergyMax()*100+"%");
		} else {
			System.out.println("�Х��Ұ�");
		}
	}

	public double showAllDistance(){
		System.out.println("�`���{"+drivenDistance);
		return getDrivenDistance();
	}

	public void addEnergy(double volume){
		if(getEnergyLeft() + volume >= getEnergyMax()){
			System.out.println("�Ӻ��F!!�u�["+ (getEnergyMax()-getEnergyLeft())+"L");
			setEnergyLeft(getEnergyMax());
		} else {
			setEnergyLeft(getEnergyLeft() + volume);
			System.out.println("�[�F"+ volume+"L�A�ثe�`�@��"+getEnergyLeft()+"L");
		}
	}

}
