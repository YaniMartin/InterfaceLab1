package martin.aiyani.InterfaceLab1;

import java.util.Scanner;

/**
 * Created by yanimartin on 2/2/16.
 */
public class GasStation implements FuelStation {
    private int gasFuel= 200;
    private int fuelLevel = 0;

    public void driveToStation() {
        if (fuelLevel <=2){
            System.out.println("Danger! You've got a fuel leak! Low fuel! Coasting into gas station...\n");
        }
    }

    public void refuelCars() {

        do{
            System.out.println("Refueling..." + fuelLevel + " gallons.\n");
            fuelLevel++;
            gasFuel--;
            if(gasFuel == 0){
                System.out.println("Yer out'ta luck, kid. Zombie hoard sucked the last of our tanks dry last night. No gas here. Good riddance, punk.\n");
                System.exit(0);
            }
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while(fuelLevel<20);
        System.out.println("You're all fueled and ready to tear up the dirt!\n");
        }



    public void driveBack() {
        Jeep jeep = new Jeep();
        if (fuelLevel == 20){
            Scanner in = new Scanner(System.in);
            System.out.println("Do you want to keep truckin'? 'yes' or 'no'\n");
            String answer = in.next();
            answer.toLowerCase();

            if (answer.equals("yes")) {
                jeep.drive();
            }
            else {
                System.out.println(0);
            }

        }
    }
}