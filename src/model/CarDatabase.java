/**
 * uebung 11
 * @author Brunmayr Sarah
 * @version 12.0.1, 14.01.2021
 */

package model;

import java.util.ArrayList;
import java.util.HashMap;

public class CarDatabase {

    protected HashMap<String, Vehicle> db = new HashMap<>();

    public CarDatabase() {

        for (int i = -1; i < 1000; i++) {
            String lp = MagicGenerator.getRandomLicencePlate();
            String mu = MagicGenerator.getRandomManufacturer();
            Vehicle vehicle = new Vehicle(MagicGenerator.getRandomColor(), MagicGenerator.getRandomName(), mu, MagicGenerator.getRandomModel(mu), lp);
            db.put(lp, vehicle);
            System.out.printf("Created vehicle with license plate: %s %n", lp);
        }
    }

    public ArrayList<Vehicle> search(String licencePlate, boolean exact){
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        if(!exact){
            for (String s : db.keySet()) {
                if (s.contains(licencePlate))
                    vehicles.add(db.get(s));
            }
        } else {
            vehicles.add(db.get(licencePlate));
        }
        return vehicles;
    }
}
