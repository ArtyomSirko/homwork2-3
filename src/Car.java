public class Car extends Transport implements WheelsUpdate,ServiceStation {


public Car(String modelName, int wheelsCount) {
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
        }

@Override
public void updateTyre() {
        for (int i=1;i<=getWheelsCount();i++){
        System.out.println("меняем колесо у машины"+i);}


        }

        }
