import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Car> carros = new ArrayList<>();

        carros.add(new Mitsubish("lancer", "Preta"));
        carros.add(new Toyota("renegade", "Vermelha"));
        carros.add(new Fiat("UNO", "Branca"));
        ImprimirCarros(carros);
    }

    public static void ImprimirCarros(List<? extends Car> lista) {
        for (Car car : lista) {
            System.out.println(car);
        }
    }

}
