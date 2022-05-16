package demo.base;

public abstract class AbstarctElectricMotocycle extends AbstractMotorclycle{
	@Override
	public boolean isEnergyEnough(int range){
		if(getEnergyLeft() / getEnergyMax() <0.1){
			System.out.println("�������q�q�C��10%");
		}
		// �p�G�Ѿl�q�q��ݭn�q�q�h�A�Ұʦ��\
		if(getEnergyLeft() >= getEnergyConsumption() * range){
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
			System.out.println("�q�q�����A�����Ұʥ���");
		}
	}
	
	@Override
	public void stop(){
		setStart(false);
		System.out.println("���F�w����");
	}

	public void move (int range){
		if(isStart){
			// �P�_�෽�O�_�R���A�ӨM�w���ʪ��Z��
			int moveRange = 0;
			if(isEnergyEnough(range)){
				moveRange = range;
			}else {
				moveRange = (int) (getEnergyLeft()/getEnergyConsumption());
				System.out.println("���ʪ��q�q����");
			}
			// �W�[���{�P�O�i���{
			setDrivenDistance(getDrivenDistance()+ moveRange);
			setMaintainDistance(getMaintainDistance()+moveRange);
			setEnergyLeft(getEnergyLeft() - moveRange*getEnergyConsumption());
			System.out.println("�w�g����"+moveRange+"����"+
					"�q�q�Ѿl"+getEnergyLeft()+"W"+
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
			System.out.println("�Ӻ��F!!�u�["+ (getEnergyMax()-getEnergyLeft())+"W");
			setEnergyLeft(getEnergyMax());
		} else {
			setEnergyLeft(getEnergyLeft() + volume);
			System.out.println("�[�F"+ volume+"W�A�ثe�`�@��"+getEnergyLeft()+"W");
		}
	}
}
