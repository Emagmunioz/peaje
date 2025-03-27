package dev.peaje;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
    public class TollStationTest {
        private TollStation tollStation;
        
    
        @org.junit.jupiter.api.Test
        public void testTollStationCreation() {
            assertThat(tollStation.getName(), is("North Station"));
            assertThat(tollStation.getCity(), is("Medellin"));
            assertThat(tollStation.getTotalCollected(), is(0.0));
        }
    }


