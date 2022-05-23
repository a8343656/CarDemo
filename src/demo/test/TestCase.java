package demo.test;



import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import demo.base.AbstractRoadVehicle;
import demo.impl.FordFiesta;
import demo.impl.Gogoro;
import demo.impl.SYMGT125;
import demo.impl.TeslaModel3;

public class TestCase {

	AbstractRoadVehicle fordFiesta;
	AbstractRoadVehicle teslaModel3;
	AbstractRoadVehicle symGt125;
	AbstractRoadVehicle gogoro1;
	
	List<AbstractRoadVehicle> vehicleList = new ArrayList<AbstractRoadVehicle>();
	
	
	@Before
	public void before(){
		fordFiesta = new FordFiesta("white", 0, 30);
		teslaModel3 = new TeslaModel3("Red", 0, 0);
		symGt125 = new SYMGT125("Blue", 500, 10);
		gogoro1 = new Gogoro("Yellow", 1000, 25);
		
		vehicleList.add(fordFiesta);
		vehicleList.add(teslaModel3);
		vehicleList.add(symGt125);
		vehicleList.add(gogoro1);
		
	}
	
	@Test
	public void testBaseData(){
		Assert.assertEquals("Ford",fordFiesta.getBrand());
		Assert.assertEquals("white", fordFiesta.getColer());
		Assert.assertEquals(Integer.valueOf(4),fordFiesta.getWheelAmount());
		Assert.assertEquals(0,fordFiesta.getDrivenDistance(),0);
		Assert.assertEquals(30,fordFiesta.getEnergyLeft(),0);
		
		Assert.assertEquals("Tesla",teslaModel3.getBrand());
		Assert.assertEquals("Red", teslaModel3.getColer());
		Assert.assertEquals(Integer.valueOf(4),teslaModel3.getWheelAmount());
		Assert.assertEquals(0,teslaModel3.getDrivenDistance(),0);
		Assert.assertEquals(0,teslaModel3.getEnergyLeft(),0);
		
		Assert.assertEquals("SYM",symGt125.getBrand());
		Assert.assertEquals("Blue", symGt125.getColer());
		Assert.assertEquals(Integer.valueOf(2),symGt125.getWheelAmount());
		Assert.assertEquals(500,symGt125.getDrivenDistance(),0);
		Assert.assertEquals(10,symGt125.getEnergyLeft(),0);
		
		Assert.assertEquals("Gogoro",gogoro1.getBrand());
		Assert.assertEquals("Yellow", gogoro1.getColer());
		Assert.assertEquals(Integer.valueOf(2),gogoro1.getWheelAmount());
		Assert.assertEquals(1000,gogoro1.getDrivenDistance(),0);
		Assert.assertEquals(25,gogoro1.getEnergyLeft(),0);
		
	}

	@Test
	public void testStart(){
		boolean[] ansArr = {true,false,true,true};
		
		for(int i=0 ; i<vehicleList.size() ; i++){
			vehicleList.get(i).start();
			Assert.assertEquals(ansArr[i],vehicleList.get(i).isStart());
		}
		
	}
	
	@Test
	public void testIsEnergyEnough(){
		boolean[] ansArr = {true,false,true,true};
		
		for(int i=0 ; i<vehicleList.size() ; i++){
			Assert.assertEquals(ansArr[i],vehicleList.get(i).isEnergyEnough(25));
		}
		
	}
	
	@Test
	public void testShowDistance(){
		double[] ansArr = {0,0,500,1000};
		
		for(int i=0 ; i<vehicleList.size() ; i++){
			Assert.assertEquals(ansArr[i],vehicleList.get(i).showAllDistance(),0);
		}
		
	}
	
	@Test
	public void testMove(){
		double[] ansArr = { 0+25, 0, 500+25, 1000+25};
		
		for(int i=0 ; i<vehicleList.size() ; i++){
			vehicleList.get(i).start();
			vehicleList.get(i).move(25);
			Assert.assertEquals(ansArr[i],vehicleList.get(i).getDrivenDistance(),0);
		}
		
	}
	
	@Test
	public void testAddEnergy(){
		double [] ansArr = {30+10, 0+10, 10+10, 25+10};
		
		for(int i=0 ; i<vehicleList.size() ; i++){
			vehicleList.get(i).addEnergy(10);
			Assert.assertEquals(ansArr[i],vehicleList.get(i).getEnergyLeft(),0);
		}
		
	}
	
	@Test
	public void testStop(){
		boolean [] ansArr = {false,false,false,false};
		
		for(int i=0 ; i<vehicleList.size() ; i++){
			vehicleList.get(i).start();
			vehicleList.get(i).stop();
			Assert.assertEquals(ansArr[i],vehicleList.get(i).isStart());
		}
		
	}
}
