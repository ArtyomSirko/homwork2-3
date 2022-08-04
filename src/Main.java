import java.util.concurrent.Callable;

public class Main {


    public static void main(String[] args) {

        Car car=new Car("car1",4);
        Car car2=new Car("car2",4);



        ServiceStation truck = new Truck("truck1",6);
        ServiceStation truck2 = new Truck("truck",8);

        ServiceStation bicycle = new Bicycle("bicycle1",2);
        ServiceStation bicycle2 = new Bicycle("bicycle2",2);


        ServiceStationList.chech(car);
        ServiceStationList.chech(car2);
        ServiceStationList.chech(truck);
        ServiceStationList.chech(truck2);
        ServiceStationList.chech(bicycle);
        ServiceStationList.chech(bicycle2);

    }
}