package demo.base;

public class Oil extends Energy{

 
	@Override
	public void addEnergy() {
		System.out.println("�[�o��");
	}

	@Override
	public void useEnergy() {
		System.out.println("�ϥΨT�o");	
	}
	
	public Oil(){
		this.type = "�T�o";
		this.unit = "L";
	}

}
