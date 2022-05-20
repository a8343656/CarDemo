package demo.base;

public class Oil extends Energy{

 
	@Override
	public void addEnergy() {
		System.out.println("加油中");
	}

	@Override
	public void useEnergy() {
		System.out.println("使用汽油");	
	}
	
	public Oil(){
		this.type = "汽油";
		this.unit = "L";
	}

}
