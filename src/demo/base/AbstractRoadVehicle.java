package demo.base;

public abstract class AbstractRoadVehicle implements ITransportation{
	
	private String brand;
	private String type;
	private String startType;
	private String color;
	private Energy Energy;
	private boolean isStart;
	private Integer speed;
	private Integer wheelAmount ;
	private double drivenDistance;
	private double maintainDistance;
	private double energyMax;
	private double energyLeft;
	private double energyConsumption; 
	
	

	public abstract boolean isNeedMaintain();
	public abstract void maintain();
	public abstract void horn();
	
	public AbstractRoadVehicle(String brand, String type, String startType,String color,
			Energy energy, 
			Integer speed, Integer wheelAmount, 
			double drivenDistance,
			double energyMax, double energyLeft,double energyConsumption) {
		
		this.brand = brand;
		this.type = type;
		this.startType = startType;
		this.color = color;
		Energy = energy;
		this.isStart = false;
		this.speed = speed;
		this.wheelAmount = wheelAmount;
		this.drivenDistance = drivenDistance;
		this.maintainDistance = 0;
		this.energyMax = energyMax;
		this.energyLeft = energyLeft;
		this.energyConsumption = energyConsumption;
	}
	
	@Override
	public double showAllDistance(){
		System.out.println("Á`¨½µ{"+this.drivenDistance);
		return getDrivenDistance();
	}
	
	public Energy getEnergy(){
		return this.Energy;
	}
	
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
	
	public String getStartType(){
		return this.startType;
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
