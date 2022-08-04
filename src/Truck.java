public class Truck extends  Transport implements ServiceStation,CheckEngineInterfes,WheelsUpdate{


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель У " + getModelName());
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем машину " + getModelName());
        checkEngine();
        updateTyre();
        checkTrailer();
    }

    @Override
    public void updateTyre() {
        System.out.println("Обслуживаем " + getModelName());
    }
    private void checkTrailer() {
        for (int i=1;i<=getWheelsCount();i++){
            System.out.println("меняем колесо у грузовика"+i);}
    }
}






