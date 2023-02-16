


public class ConversoesTemperatura {

    double celsiusToKelvin(double tempC){  
        return tempC +273.15;
    }
    double celsiusToFahrenheit(double tempC){
        return  1.8*tempC +32;
    }
    double fahrenheitToCelsius (double tempF){
        return (tempF-32)/1.8;
    }
    double fahrenheitToKelvin (double tempF){
        return ((tempF-32)/1.8)+273.15;
    }
    double kelvinToFahrenheit (double tempK){
        return (1.8*(tempK-273.15))+32;
    }
    double kelvinToCelsius (double tempK){
        return tempK -273.15;

    }
}