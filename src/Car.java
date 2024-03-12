public abstract class Car {
    private String carName;
    private String color;

    public Car(String carName, String color) {
        this.carName = carName;
        this.color = color;
    }

    @Override
    public String toString() {
        return "O Carro Selecionado da " + getClass().getSimpleName() + " Modelo " +
                carName + " tem a cor "
                + color;
    }
}
