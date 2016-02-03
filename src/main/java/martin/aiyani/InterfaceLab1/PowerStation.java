package martin.aiyani.InterfaceLab1;

import java.util.Scanner;

/**
 * Created by yanimartin on 2/2/16.
 */
public class PowerStation implements FuelStation{
    private int watts = 500000;
    private int fuelLevel = 0;


    public void driveToStation() {
        if (fuelLevel <= 1000){
            System.out.println("Warning! Warning! Power levels critical! Auto pilot to outpost engaged...\n");
        }

    }

    public void refuelCars() {

        do{
            System.out.println("Refueling..." + fuelLevel + " watts.\n");
            fuelLevel+=10000;
            watts -=10000;
            if(watts ==0){
                System.out.println("Oh, bad luck there, pal. We've just been hit by a gang of Tuscen Raiders. No more fuel here. So long.\n");
                System.exit(0);
            }

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while(fuelLevel<100001);
        System.out.println("You're all powered up and ready to fly!...if only Chewie can fix that autopilot...\n");

    }

    public void driveBack() {
        MillenniumFalcon millenniumFalcon = new MillenniumFalcon();
        if (fuelLevel == 100000){
            Scanner in = new Scanner(System.in);
            System.out.println("Do you want to keep flying? 'yes' or 'no'\n");
            String answer = in.next();
            answer.toLowerCase();

            if(answer.equals("yes")){
                millenniumFalcon.drive();
            }
            else{
                System.exit(0);
            }


        }

    }
 }

