package demo.base;

public abstract class Energy {
	String type;
	String unit;
	
	public abstract void addEnergy();
	public abstract void useEnergy();
	
	public String getType(){
		return this.type;
	}
	
	public String getUnit(){
		return this.unit;
	}
}
