package demo.base;

public abstract class AbstractRoadVehicle implements ITransportation{
	
	protected String brand;
	protected String type;
	protected String color;
	protected String startType;
	protected Integer wheelAmount ;
	protected boolean isStart;
	protected Integer speed;
	protected double drivenDistance;
	protected double maintainDistance;
	protected double energyMax;
	protected double energyLeft;
	protected double energyConsumption; 
	
	

	public abstract boolean isNeedMaintain();
	public abstract void maintain();
	public abstract void horn();
	
	public String getColer(){
		return this.color;
	}
	
	public Integer getWheelAmount(){
		return this.wheelAmount;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getType() {
		return type;
	}
	
	public boolean isStart() {
		return isStart;
	}
	
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	
	public double getDrivenDistance() {
		return drivenDistance;
	}
	public void setDrivenDistance(double drivenDistance) {
		this.drivenDistance = drivenDistance;
	}
	
	public double getMaintainDistance() {
		return maintainDistance;
	}
	public void setMaintainDistance(double maintainDistance) {
		this.maintainDistance = maintainDistance;
	}
	
	public double getEnergyMax() {
		return energyMax;
	}
	
	public double getEnergyLeft() {
		return energyLeft;
	}
	public void setEnergyLeft(double energyLeft) {
		this.energyLeft = energyLeft;
	}
	
	public double getEnergyConsumption() {
		return energyConsumption;
	}
	
}
