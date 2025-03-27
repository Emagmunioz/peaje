package dev.peaje;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;
public class TollStationTest {
    public class TollStationTest {
        private TollStation tollStation;
        
        @Before
        public void setUp() {
            tollStation = new TollStation("North Station", "Medellin");
        }
        
        @Test
        public void testTollStationCreation() {
            assertThat(tollStation.getName(), is("North Station"));
            assertThat(tollStation.getCity(), is("Medellin"));
            assertThat(tollStation.getTotalCollected(), is(0.0));
        }
    }

}
