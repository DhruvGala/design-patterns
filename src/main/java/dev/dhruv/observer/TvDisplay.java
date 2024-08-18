package dev.dhruv.observer;

public class TvDisplay implements IObserver {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("TV Display: Weather update - " + weather);
    }

    @Override
    public String getWeather() {
        return weather;
    }
}
