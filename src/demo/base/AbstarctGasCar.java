package demo.base;

public abstract class AbstarctGasCar extends AbstractCar{
	@Override
	public boolean isEnergyEnough(int range){
		if(getEnergyLeft() / getEnergyMax() <0.1){
			System.out.println("汽車的油量低於10%");
		}
		// 如果剩餘油量比需要油量多，啟動成功
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
			System.out.println("油量不足，汽車啟動失敗");
		}
	}
	
	@Override
	public void stop(){
		setStart(false);
		System.out.println("引擎已停止");
	}

	public void move (int range){
		if(isStart){
			// 判斷能源是否充足，來決定移動的距離
			int moveRange = 0;
			if(isEnergyEnough(range)){
				moveRange = range;
			}else {
				moveRange = (int) (getEnergyLeft()/getEnergyConsumption());
				System.out.println("移動的油量不足");
			}
			// 增加里程與保養里程，並扣除消耗的油量
			setDrivenDistance(getDrivenDistance()+ moveRange);
			setMaintainDistance(getMaintainDistance()+moveRange);
			Double a = moveRange*getEnergyConsumption();
			setEnergyLeft(getEnergyLeft() - moveRange*getEnergyConsumption());
			
			System.out.println("已經移動"+moveRange+"公里"+
					"油量剩餘"+getEnergyLeft()+"L"+
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
			System.out.println("太滿了!!只加"+ (getEnergyMax()-getEnergyLeft())+"L");
			setEnergyLeft(getEnergyMax());
		} else {
			setEnergyLeft(getEnergyLeft() + volume);
			System.out.println("加了"+ volume+"L，目前總共有"+getEnergyLeft()+"L");
		}
	}

}
