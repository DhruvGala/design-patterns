package dev.dhruv.observer.weather;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherStationTest {

    @Test
    public void test() {
        WeatherStation weatherStation = new WeatherStation();
        String expected = "Sunny";

        IObserver phoneDisplay = new PhoneDisplay();
        IObserver tvDisplay = new TvDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setWeather("Sunny");

        assertEquals(expected, phoneDisplay.getWeather());
        assertEquals(expected, tvDisplay.getWeather());
    }
}
