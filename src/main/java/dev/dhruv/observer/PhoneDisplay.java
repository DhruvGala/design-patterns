package dev.dhruv.observer;

public class PhoneDisplay implements IObserver {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("Phone Display: Weather update - " + weather);
    }

    @Override
    public String getWeather() {
        return weather;
    }
}
