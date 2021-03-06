package demo.base;

public abstract class AbstractElectricCar extends AbstractCar{
	@Override
	public boolean isEnergyEnough(int range){
		if(getEnergyLeft() / getEnergyMax() <0.1){
			System.out.println("汽車的電量低於10%");
		}
		// 如果剩餘電量比需要電量多
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
			System.out.println("啟動成功");
		} else {
			setStart(false);
			System.out.println("電量不足，汽車啟動失敗");
		}
	}
	
	@Override
	public void stop(){
		setStart(false);
		System.out.println("馬達已停機");
	}

	public void move (int range){
		if(isStart){
			// 判斷能源是否充足，來決定移動的距離
			int moveRange = 0;
			if(isEnergyEnough(range)){
				moveRange = range;
			}else {
				moveRange = (int) (getEnergyLeft()/getEnergyConsumption());
				System.out.println("移動的電量不足");
			}
			// 增加里程與保養里程
			setDrivenDistance(getDrivenDistance()+ moveRange);
			setMaintainDistance(getMaintainDistance()+moveRange);
			setEnergyLeft(getEnergyLeft() - moveRange*getEnergyConsumption());
			System.out.println("已經移動"+moveRange+"公里"+
					"電量剩餘"+getEnergyLeft()+"W"+
					"等於"+getEnergyLeft()/getEnergyMax()*100+"%");
		} else {
			System.out.println("請先啟動");
		}
	}

	public double showAllDistance(){
		System.out.println("總里程"+drivenDistance);
		return getDrivenDistance();
	}

	public void addEnergy(double volume){
		if(getEnergyLeft() + volume >= getEnergyMax()){
			System.out.println("太滿了!!只加"+ (getEnergyMax()-getEnergyLeft())+"W");
			setEnergyLeft(getEnergyMax());
		} else {
			setEnergyLeft(getEnergyLeft() + volume);
			System.out.println("加了"+ volume+"W，目前總共有"+getEnergyLeft()+"W");
		}
	}
}
