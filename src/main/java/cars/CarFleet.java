package cars;

import cars.Comfort.Comfort;
import cars.Comfort.Mercedes_sls_WW70394;
import cars.suv.Bmw_x5_WW90678;
import cars.suv.Suv;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CarFleet {
   private Suv bmw_x5 = new Bmw_x5_WW90678();
   private Comfort mercedes_sls = new Mercedes_sls_WW70394();

    private ArrayList<Car> cars = new ArrayList();
    private ArrayList<Suv> suvs = new ArrayList();
    private ArrayList<Comfort> comforts  = new ArrayList();


    public ArrayList<Car> makeCarsFleet() {
    cars.addAll(suvs);
    cars.addAll(comforts);
    return cars;
    }
    public void getFleet(){
       // Stream.of().flatMap(suvs)

        //makeCarsFleet().forEach((o)-> System.out.println(o));
    }

    public ArrayList<Suv> suvCarsFleet() {
        suvs.add(bmw_x5);

        return suvs;
    }
    public ArrayList<Comfort> comfortCarsFleet() {
        comforts.add(mercedes_sls);

        return comforts;
    }

    public void getComfortLIst(){

        comfortCarsFleet().forEach((n)-> System.out.println("samochód ="+ n));
    }
}
