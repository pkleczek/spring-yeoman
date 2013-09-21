package spring_yeoman.business.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeatherController {
    @Autowired
    WeatherService weatherService;

    @ResponseBody
    @RequestMapping(value = "/weather", produces = MediaType.APPLICATION_JSON_VALUE)
    public WeatherInfo getWeatherInfo() {
        return weatherService.getWeather();
    }

}
