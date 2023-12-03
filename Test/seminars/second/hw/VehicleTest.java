package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Ford", "Focus", 2010);
        motorcycle = new Motorcycle("Yamaha", "R8", 2020);
    }

    @Test
    public void testCarIsIstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarIsHavingFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void testMotorcycleIsHavingTwoWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testCarIsHavingSpeedTestDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @Test
    public void testMotorcycleIsHavingSpeedTestDrive() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    @Test
    public void testCarParkingSpeedIsZero() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test

    public void testMotorcycleParkingSpeedIsZero() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}