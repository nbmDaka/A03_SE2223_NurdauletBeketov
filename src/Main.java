public class Main {
    public static void main(String[] args) {
        LegacyTemperatureConverter legacyConverter = new LegacyTemperatureConverter();
        TemperatureConverterAdapter adapter = new TemperatureConverterAdapter(legacyConverter);
        double celsiusTemperature = 25.0;
        double fahrenheitTemperature = adapter.convertToFahrenheit(celsiusTemperature);

        System.out.println("Temperature in Celsius: " + celsiusTemperature);
        System.out.println("Temperature in Fahrenheit: " + fahrenheitTemperature);
    }
}