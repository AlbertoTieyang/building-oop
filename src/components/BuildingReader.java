package components;

import model.Apartment;
import model.Building;

import java.util.Scanner;

public class BuildingReader {
    private final Scanner scanner;
    private final ApartmentReader apartmentReader;

    public BuildingReader(Scanner scanner, ApartmentReader apartmentReader) {
        this.scanner = scanner;
        this.apartmentReader = apartmentReader;
    }

    public Building read(){
        System.out.println("Introduce la dirección del edificio");
        String address = scanner.nextLine();
        System.out.println("Introduce el municipio donde está el edificio");
        String city = scanner.nextLine();
        System.out.println("Introduce cuántos propietarios hay en el edificio");
        int n = scanner.nextInt();

        Apartment[] apartments = new Apartment[n];
        for (int i = 0; i < apartments.length; i++) {
            apartments[i] = apartmentReader.read();
        }

        return new Building(
                address,
                city,
                apartments
        );
    }
}
