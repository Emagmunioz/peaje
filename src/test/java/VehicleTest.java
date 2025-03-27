import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import dev.peaje.Vehicle;
import dev.peaje.VehicleType;

public class VehicleTest {
    @Test
    public void testCarCreation() {
        Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
        assertThat(car.getLicensePlate(), is("ABC123"));
        assertThat(car.getType(), is(VehicleType.CAR));
    }

}
