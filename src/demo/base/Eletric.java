package demo.base;

public class Eletric extends Energy{
	@Override
	public void addEnergy() {
		System.out.println("充電中");
	}

	@Override
	public void useEnergy() {
		System.out.println("使用電力");	
	}
	
	public Eletric(){
		this.type = "電";
		this.unit = "W";
	}
}
