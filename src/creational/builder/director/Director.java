package creational.builder.director;

import creational.builder.builders.Builder;
import creational.builder.cars.CarType;
import creational.builder.components.Engine;
import creational.builder.components.GPSNavigator;
import creational.builder.components.Transmission;
import creational.builder.components.TripComputer;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR)
                .setSeats(2)
                .setEngine(new Engine(3.0, 0))
                .setTransmission(Transmission.SEMI_AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR)
                .setSeats(2)
                .setEngine(new Engine(1.2, 0))
                .setTransmission(Transmission.AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV)
                .setSeats(4)
                .setEngine(new Engine(2.5, 0))
                .setTransmission(Transmission.MANUAL)
                .setGPSNavigator(new GPSNavigator());
    }
}
