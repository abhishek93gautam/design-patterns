package creational.builder.builders;

import creational.builder.cars.CarType;
import creational.builder.components.Engine;
import creational.builder.components.GPSNavigator;
import creational.builder.components.Transmission;
import creational.builder.components.TripComputer;

public interface Builder {
    Builder setCarType(CarType type);
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPSNavigator(GPSNavigator gpsNavigator);
}
