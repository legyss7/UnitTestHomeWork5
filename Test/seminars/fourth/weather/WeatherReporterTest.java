package seminars.fourth.weather;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherReporterTest {

    @Test
    public void testWeatherReporter() {
        // Создаем мок для WeatherService
        WeatherService mockWeatherService = mock(WeatherService.class);

        // Определяем поведение мока. Когда метод getCurrentTemperature() будет вызван,
        // он вернет 25
        //when(mockWeatherService.getCurrentTemperature())...

        // Создаем объект класса WeatherReporter, передаем ему в конструктор наш мок


        // Вызываем метод generateReport()


        // Проверяем, что отчет содержит ожидаемую информацию о температуре

    }






















//    @Test
//    public void testWeatherReporter() {
//        // Создаем мок для WeatherService
//        WeatherService mockWeatherService = mock(WeatherService.class);
//
//        // Определяем поведение мока. Когда метод getCurrentTemperature() будет вызван,
//        // он вернет 25
//        when(mockWeatherService.getCurrentTemperature()).thenReturn(30);
//
//        // Создаем объект класса WeatherReporter, передаем ему в конструктор наш мок
//        WeatherReporter weatherReporter = new WeatherReporter(mockWeatherService);
//
//        // Вызываем метод generateReport()
//        String report = weatherReporter.generateReport();
//
//        // Проверяем, что отчет содержит ожидаемую информацию о температуре
//        assertEquals("Текущая температура: 30 градусов.", report);
//    }

}