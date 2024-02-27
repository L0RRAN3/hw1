public class ServiceStation {
    public void service(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем траснпорт"+" "+ transport.getModelName());
            transport.service();

        }
    }
}
