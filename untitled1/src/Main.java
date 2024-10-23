interface Vehicle{
    public void describe();
}
class Bicycle implements Vehicle{
    public void describe(){
        System.out.println("Pojazd jedzie");
    }
}
class VehicleManager{
    private Vehicle vehicle;

    public VehicleManager(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void process(){
        System.out.println("Rozpoczynam opis pojazdu...");
        this.vehicle.describe();
        System.out.println("Opis pojazdu zakonczony");
    }

}
public class Main {
    public static void main(String[] args) {
    Vehicle rower = new Bicycle();
    VehicleManager manager = new VehicleManager(rower);
    manager.process();
    }

}