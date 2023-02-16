
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //objetos
        Scanner entradaDeDados = new Scanner(System.in);
        ConversoesTemperatura conversor = new ConversoesTemperatura();
        //\objetos

        System.out.println("digite a temperatura: ");
        double temperaturaDeEntrada = entradaDeDados.nextDouble();
        
        System.out.println("Digite a inicial da unidade dessa temperatura: ");
        String inicialUnidade = entradaDeDados.next().toUpperCase();
        
        
        while (!(inicialUnidade.equals("F")||inicialUnidade.equals("C")||inicialUnidade.equals("K"))) {
            System.out.println("Digite um entrada válida!: ");
            inicialUnidade = entradaDeDados.next().toUpperCase();
            
        }

        System.out.println("======");

        

        

        if(inicialUnidade.equals("C")){
            System.out.println("Convertendo "+temperaturaDeEntrada+" Celsius para: ");
            System.out.println(conversor.celsiusToKelvin(temperaturaDeEntrada)+" K");
            System.out.println(conversor.celsiusToFahrenheit(temperaturaDeEntrada)+" F");
        }else if(inicialUnidade.equals("F")){
            System.out.println("Convertendo "+temperaturaDeEntrada+" Fahrenheit para: ");
            System.out.println(conversor.fahrenheitToCelsius(temperaturaDeEntrada)+" C");
            System.out.println(conversor.fahrenheitToKelvin(temperaturaDeEntrada)+" K");

        }else if(inicialUnidade.equals("K")){
            System.out.println("Convertendo "+temperaturaDeEntrada+" Kelvin para: ");
            System.out.println(conversor.kelvinToCelsius(temperaturaDeEntrada)+" C");
            System.out.println(conversor.kelvinToFahrenheit(temperaturaDeEntrada)+" F");
        }



    }
}
