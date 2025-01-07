package study.test0106;

import java.io.IOException;
import java.util.List;

public class ApiExplorer {

    public static void main(String[] args) {

        List<WeatherInfo> weatherList = null;
        try {
            weatherList = ApiService.getWeatherInfoList("20250106", "0500", "60", "127");

            for (WeatherInfo info : weatherList) {
                System.out.println(info.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // WeatherInfo 객체 -> DB 저장
        WeatherDAO weatherDAO = new WeatherDAO();

        int count = 0;
        for (WeatherInfo wi : weatherList) {
            count += weatherDAO.saveWeatherInfo(wi);
        }
        System.out.println(count + "개 저장 성공");
    }
}