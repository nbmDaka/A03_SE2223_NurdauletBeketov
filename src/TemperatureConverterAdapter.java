public class TemperatureConverterAdapter {
    private LegacyTemperatureConverter adaptee;

    public TemperatureConverterAdapter(LegacyTemperatureConverter adaptee) {
        this.adaptee = adaptee;
    }

    public double convertToFahrenheit(double celsius) {
        // Convert the Celsius temperature to Fahrenheit using the adaptee
        double fahrenheit = adaptee.convertToCelsius(celsius);
        return (fahrenheit * 9/5) + 32;
    }
}
