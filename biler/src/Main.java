public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        GasolinCar car1 = new GasolinCar("abc1234","audi","model 2", 5,20);
        DieselCar car2 = new DieselCar("erf123","bmw","m3",4,30,false);
        ElectricCar car3 = new ElectricCar("EFG456", "Tesla", "Model 3", 4, 75, 400, 18);

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);

        int totalRegistrationFee = fleet.getTotalRegistrationFeeForFleet();

        System.out.println(fleet);
        System.out.println("Total Registration Fee for the Fleet: " + totalRegistrationFee + " kr");
    }
}
