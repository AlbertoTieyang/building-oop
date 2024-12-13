package org.ies.building.components;

import org.ies.building.model.Apartment;
import org.ies.building.model.Building;

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
        if(n <=0 ){
            System.out.println("Número de propietarios inválido, introduce otro");
            n = scanner.nextInt();
            scanner.nextLine();
        }
        Apartment[] apartments = new Apartment[n];
        for (int i = 0; i < apartments.length; i++) {
            int newI = i+1;
            System.out.println("Introduce los datos del apartamento "+newI);
            apartments[i] = apartmentReader.read();
        }

        return new Building(
                address,
                city,
                apartments
        );
    }
}
