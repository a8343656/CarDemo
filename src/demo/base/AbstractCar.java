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
		System.out.println("汽車喇叭響");
	};
	
	@Override
	public boolean isEnergyEnough(int range){
		if(getEnergyLeft() / getEnergyMax() <0.1){
			System.out.println("汽車的"+getEnergy().getType()+"低於10%");
		}
		// 如果剩餘能量比需要多，則能量充足
		if(getEnergyLeft() > getEnergyConsumption() * range){
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void start(){
		if(getEnergyLeft()>0){
			// 開始使用能源
			getEnergy().useEnergy();
			setStart(true);
			System.out.println("啟動成功");
		} else {
			setStart(false);
			System.out.println(getEnergy().getType()+"不足，汽車啟動失敗");
		}

	}
	
	@Override
	public void stop(){
		setStart(false);
		System.out.println("汽車已停止");
	}

	public void move (int range){
		if(isStart()){
			// 開始使用能源
			getEnergy().useEnergy();
			
			// 判斷能源是否充足，來決定移動的距離
			int moveRange = 0;
			if(isEnergyEnough(range)){
				moveRange = range;
			}else {
				moveRange = (int) (getEnergyLeft()/getEnergyConsumption());
				System.out.println("能源不足");
			}
			
			// 增加總里程與保養里程
			setDrivenDistance(getDrivenDistance()+ moveRange);
			setMaintainDistance(getMaintainDistance()+moveRange);
			setEnergyLeft(getEnergyLeft() - moveRange*getEnergyConsumption());
			
			// 秀出移動資訊
			System.out.println("移動"+moveRange+"公里"+
					getEnergy().getType()+"剩餘"+getEnergyLeft()+getEnergy().getUnit()+
					"等於"+getEnergyLeft()/getEnergyMax()*100+"%");
		} else {
			System.out.println("請先啟動");
		}
		
	}

	public void addEnergy(double volume){
		if(!isStart()){
			getEnergy().addEnergy();
			
			if(getEnergyLeft() + volume >= getEnergyMax()){
				System.out.println("太滿了!!只加"+ 
									(getEnergyMax()-getEnergyLeft())
									+ getEnergy().getUnit());
				setEnergyLeft(getEnergyMax());
			} else {
				setEnergyLeft(getEnergyLeft() + volume);
				System.out.println("加了"+ volume+ getEnergy().getUnit()+
									"，目前總共有"+getEnergyLeft()+getEnergy().getUnit());
			}
		} else {
			System.out.println("請先停止");
		}
		
	}
	
}
