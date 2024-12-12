package components;

import model.Apartment;
import model.Owner;

import java.util.Scanner;

public class ApartmentReader {
    private final Scanner scanner;
    private final OwnerReader ownerReader;

    public ApartmentReader(Scanner scanner, OwnerReader ownerReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
    }

    public Apartment read(){
        System.out.println("Introduce la planta");
        int floor = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce la puerta");
        String door = scanner.nextLine();
        System.out.println("¿Cuántos propietarios hay?");
        int n = scanner.nextInt();
        scanner.nextLine();

        Owner[] owner = new Owner[n];
        for (int i = 0; i < owner.length; i++) {
            owner[i] = ownerReader.read();
        }

        return new Apartment(
                floor,
                door,
                owner
        );
    }
}
