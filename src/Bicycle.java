public class Bicycle extends Transport implements WheelsUpdate,ServiceStation {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {

    }


    @Override
    public void updateTyre() {
        for (int i=1;i<=getWheelsCount();i++){
            System.out.println("меняем колесо у велосипеда"+i);}

    }

    @Override
    public void check() {
        System.out.println("Обслуживаем "+getModelName());
        updateTyre();
    }
}
