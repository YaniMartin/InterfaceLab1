package martin.aiyani.InterfaceLab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by yanimartin on 2/2/16.
 */
public class DriveACar {



    public static void main(String[] args) {

        Jeep jeep = new Jeep();
        MillenniumFalcon millenniumFalcon = new MillenniumFalcon();
        Mirai mirai = new Mirai();
        ArrayList<Car> coolCars = new ArrayList<Car>();
        coolCars.add(jeep);
        coolCars.add(millenniumFalcon);
        coolCars.add(mirai);

        for (int i= 0; i<coolCars.size(); i++){
            coolCars.get(i).turnOn();
            coolCars.get(i).refuel();
            coolCars.get(i).turnOff();
        }

    }

}
