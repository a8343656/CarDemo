package demo.main;
import java.util.Scanner;

import demo.base.AbstractRoadVehicle;
import demo.impl.FordFiesta;
import demo.impl.Gogoro;
import demo.impl.SYMGT125;
import demo.impl.TeslaModel3;


public class Main {
	public static void main(String[] args) {

		Scanner inputReader = new Scanner(System.in);

		System.out.println("請輸入車型");
		String input = inputReader.next();
		AbstractRoadVehicle vehicle = createVehicle(input);
		
		while(true){
			System.out.println("請輸入指令");
			
			input = inputReader.next();
			if(input.equals("start")){
				vehicle.start();
				
			} else if (input.equals("isEnergyEnough")){
				System.out.println(vehicle.isEnergyEnough(1));
				
			} else if (input.equals("move")){
				System.out.println("輸入距離");
				vehicle.move(inputReader.nextInt());
				
			} else if (input.equals("showAllDistance")){
				vehicle.showAllDistance();
				
			} else if (input.equals("addEnergy")){
				System.out.print("輸入增加的量");
				vehicle.addEnergy(inputReader.nextDouble());
				
			} else if (input.equals("stop")){
				vehicle.stop();
				
			} else if (input.equals("horn")){
				vehicle.horn();
				
			}else if (input.equals("maintain")){
				vehicle.maintain();
				
			}else{
				System.out.println("輸入指令錯誤");
			} 
		}


	} 
	
	public static AbstractRoadVehicle createVehicle (String input){
		if(input.equals("ford")){
			return new FordFiesta("white", 0, 30);
			
		} else if (input.equals("tesla")){		
			return new TeslaModel3("Red", 0, 0);
			
		} else if (input.equals("sym")){
			return new SYMGT125("Blue", 500, 10);
			
		} else {
			return new Gogoro("Yellow", 1000, 25);
			
		}
	}

}
