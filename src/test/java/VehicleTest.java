import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class VehicleTest {
    @Test
    public void testCarCreation() {
        Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
        assertThat(car.getLicensePlate(), is("ABC123"));
        assertThat(car.getType(), is(VehicleType.CAR));
    }

}
