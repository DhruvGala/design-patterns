package dev.dhruv.observer.weather;

public interface IObserver {
    void update(String weather);
    String getWeather();
}
