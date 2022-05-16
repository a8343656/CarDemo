package demo.base;

public interface ITransportation {
	
	public void start(); 
	public boolean isEnergyEnough(int range);
	public void move (int range);
	public double showAllDistance();
	public void addEnergy(double volume);
	public void stop();                 
	
}
