public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ServiceStation serviceStation=new ServiceStation();

        Car bmw = new Car("Bmw",4);
        Car mercedes = new Car("Mercedes",4);

        Truck betty = new Truck("Betty",6);
        Truck chief = new Truck("Chief",8);


        Bicycle merida = new Bicycle("Merida",2);
        Bicycle ghost = new Bicycle("Ghost",2);

        serviceStation.service(bmw);
        serviceStation.service(mercedes);
        System.out.println("--------------------------");
        serviceStation.service(betty);
        serviceStation.service(chief);
        System.out.println("---------------------------");
        serviceStation.service(merida);
        serviceStation.service(ghost);

    }
}
}