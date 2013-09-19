package spring_yeoman.infrastructure.spring_yeoman.business.weather;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class WeatherService {
    public WeatherInfo getWeather() {
        WeatherInfo info = new WeatherInfo();
        info.setLocation("Rzeszów");
        info.setMeasurement(new Date());
        info.setTemperature(19D);
        info.setWindSpeed(10D);
        info.setWindDirection(WeatherInfo.WindDirection.NE);
        return info;
    }
}
