public class Truck extends MotorTransport{
    public Truck(String modelName,int wheelsCount){
        super(modelName,wheelsCount);

    }
    @Override
    public void service(){
        updateTyre();
        checkEngine();
        checkTrailer();
    }


    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
