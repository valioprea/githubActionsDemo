import org.example.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class VehicleTest {

    Vehicle vehicle;

    @Test
    public void go_increaseOdometerBy100AndDecreaseGallonsOfGasBy5WhenMilesPerGallonIs20(){
        givenVehicleHas0Odometer15GallonsOfGasAnd20MilesPerHour();
        whenDrive100();
        thenOdometerIncreasesBy100AndGallonsOfGasDecreaseBy5();
    }

    private void givenVehicleHas0Odometer15GallonsOfGasAnd20MilesPerHour() {
        vehicle = new Vehicle();
        vehicle.setGallonsOfGas(15);
        vehicle.setOdometer(0);
        vehicle.setMilesPerGallon(20);
    }

    private void whenDrive100(){
        vehicle.go(100);
    }

    private void thenOdometerIncreasesBy100AndGallonsOfGasDecreaseBy5() {
        assertEquals(10, vehicle.getGallonsOfGas());
        assertEquals(100, vehicle.getOdometer());
    }
}
