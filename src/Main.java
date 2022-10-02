import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Human maksim = new Human("maksim","minsk" , 27, "brand-manager");
    Human anya = new Human("anya","moskva" , 29, "methodist");
    Human katya = new Human("katya", "kaliningrad", 28, "prodact-manager");
    Human artem = new Human("artem", "moskva", 27, "director");


    Car lada = new Car("Lada", "Grande", 1.7, "yellow", 2002, "Russia");
    Car audi = new Car("Audi A8", "50 L TDI quattro", 3.0, "black", 2020, "Germany");
    Car kia = new Car("Kia Sportage", "4 поколение", 2.4, "red", 2018, "South Korea");
    Car hundai = new Car("Hyundai", "Avante", 1.6, "oranje", 2016, "South Korea");
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(kia.toString());
        System.out.println(hundai.toString());
}
}
