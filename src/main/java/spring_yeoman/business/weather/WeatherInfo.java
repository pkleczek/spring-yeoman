package spring_yeoman.business.weather;

import java.util.Date;

public class WeatherInfo {
    private String location;
    private Date measurement;
    private double temperature;
    private double windSpeed;
    private WindDirection windDirection;


    public enum WindDirection {
        N, NE, E, SE, S, SW, W, NW
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Date measurement) {
        this.measurement = measurement;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public WindDirection getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(WindDirection windDirection) {
        this.windDirection = windDirection;
    }
}
