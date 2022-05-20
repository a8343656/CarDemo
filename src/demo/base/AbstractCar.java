package demo.base;

public abstract class AbstractCar extends AbstractRoadVehicle{
	
	public AbstractCar(String brand, String type, String startType,String color, Energy energy, 
			Integer speed,
			double drivenDistance,
			double energyMax, double energyLeft,double energyConsumption) {
		
		super(brand, type, startType, color, 
				energy, speed, 4,
				drivenDistance, 
				energyMax, energyLeft,energyConsumption);
	}

	public void horn(){
		System.out.println("�T����z�T");
	};
	
	@Override
	public boolean isEnergyEnough(int range){
		if(getEnergyLeft() / getEnergyMax() <0.1){
			System.out.println("�T����"+getEnergy().getType()+"�C��10%");
		}
		// �p�G�Ѿl��q��ݭn�h�A�h��q�R��
		if(getEnergyLeft() > getEnergyConsumption() * range){
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void start(){
		if(getEnergyLeft()>0){
			// �}�l�ϥί෽
			getEnergy().useEnergy();
			setStart(true);
			System.out.println("�Ұʦ��\");
		} else {
			setStart(false);
			System.out.println(getEnergy().getType()+"�����A�T���Ұʥ���");
		}

	}
	
	@Override
	public void stop(){
		setStart(false);
		System.out.println("�T���w����");
	}

	public void move (int range){
		if(isStart()){
			// �}�l�ϥί෽
			getEnergy().useEnergy();
			
			// �P�_�෽�O�_�R���A�ӨM�w���ʪ��Z��
			int moveRange = 0;
			if(isEnergyEnough(range)){
				moveRange = range;
			}else {
				moveRange = (int) (getEnergyLeft()/getEnergyConsumption());
				System.out.println("�෽����");
			}
			
			// �W�[�`���{�P�O�i���{
			setDrivenDistance(getDrivenDistance()+ moveRange);
			setMaintainDistance(getMaintainDistance()+moveRange);
			setEnergyLeft(getEnergyLeft() - moveRange*getEnergyConsumption());
			
			// �q�X���ʸ�T
			System.out.println("����"+moveRange+"����"+
					getEnergy().getType()+"�Ѿl"+getEnergyLeft()+getEnergy().getUnit()+
					"����"+getEnergyLeft()/getEnergyMax()*100+"%");
		} else {
			System.out.println("�Х��Ұ�");
		}
		
	}

	public void addEnergy(double volume){
		if(!isStart()){
			getEnergy().addEnergy();
			
			if(getEnergyLeft() + volume >= getEnergyMax()){
				System.out.println("�Ӻ��F!!�u�["+ 
									(getEnergyMax()-getEnergyLeft())
									+ getEnergy().getUnit());
				setEnergyLeft(getEnergyMax());
			} else {
				setEnergyLeft(getEnergyLeft() + volume);
				System.out.println("�[�F"+ volume+ getEnergy().getUnit()+
									"�A�ثe�`�@��"+getEnergyLeft()+getEnergy().getUnit());
			}
		} else {
			System.out.println("�Х�����");
		}
		
	}
	
}
