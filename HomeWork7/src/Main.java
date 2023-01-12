import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine();
        e1.setPower(138);
        e1.setProducer("Ford");

        Driver d1 = new Driver();
        d1.setName("Sasha");
        d1.setDrivingAge(15);

        SportCar s1 = new SportCar();
        s1.setBrand("Porshe");
        s1.setClassAuto("Sport");
        s1.setDriver(d1);
        s1.setEngine(e1);
        s1.setWeightAuto(1460);
        s1.setTopSpeed(380);

        Lorry l1 = new Lorry();
        l1.setClassAuto("Buisnes");
        l1.setBrand("Skania");
        l1.setDriver(d1);
        l1.setClassAuto("B");
        l1.setWeightAuto(5500);
        l1.setBodyLoadCapacity(3500);

        Car c1 = new Car();
        c1.setBrand("Mercedes");
        c1.setDriver(d1);
        c1.setClassAuto("S");
        c1.setEngine(e1);
        c1.setWeightAuto(2480);
        print(c1);
        print(l1);
        print(s1);
    }

    private static void print(Car car) {
        System.out.println(car);
    }
}