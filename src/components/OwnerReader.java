package components;

import model.Owner;

import java.util.Scanner;

public class OwnerReader {
    private final Scanner scanner;

    public OwnerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Owner read(){
        System.out.println("Introuduce tu nif");
        String nif = scanner.nextLine();
        System.out.println("Introduce tu nombre");
        String name = scanner.nextLine();
        System.out.println("Introduce tu apellido");
        String surname = scanner.nextLine();

        return new Owner(
                nif,
                name,
                surname
        );
    }
}