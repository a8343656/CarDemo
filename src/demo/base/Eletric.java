package demo.base;

public class Eletric extends Energy{
	@Override
	public void addEnergy() {
		System.out.println("�R�q��");
	}

	@Override
	public void useEnergy() {
		System.out.println("�ϥιq�O");	
	}
	
	public Eletric(){
		this.type = "�q";
		this.unit = "W";
	}
}
