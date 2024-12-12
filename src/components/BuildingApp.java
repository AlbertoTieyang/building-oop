package components;

import model.Building;

import java.util.Scanner;

public class BuildingApp {
    private final Scanner scanner;
    private final BuildingReader buildingReader;

    public BuildingApp(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }

    public void run() {
        Building building = buildingReader.read();

        int option;
        do{
            option = chooseOption();
            if(option==1){
                building.showInfoBuilding();
            } else if (option == 2) {
                System.out.println("Introduce una planta");
                int floor = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce una puerta");
                String door = scanner.nextLine();
                building.findApartment(door, floor);
            } else if (option == 3) {
                System.out.println("Introduce una planta");
                int floor = scanner.nextInt();
                scanner.nextLine();
                building.showFloor(floor);
            } else if (option == 4) {
                System.out.println("Introduce una planta");
                int floor = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce una puerta");
                String door = scanner.nextLine();
                building.showOwner(door, floor);
            } else if(option == 5){
                System.out.println("Introduce una planta");
                int floor = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce una puerta");
                String door = scanner.nextLine();
                building.showApartmentInfo(floor, door);
            } else if (option == 6) {
                System.out.println("Introduce una planta");
                int floor = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce una puerta");
                String door = scanner.nextLine();
                building.showOwnersInfo(door, floor);
            } else if (option == 7 ) {
                System.out.println("Saliendo...");
            }else {
                System.out.println("Opción no válida, introduzca otro");
            }
        } while (option !=7);

    }

    private int chooseOption(){
        System.out.println("Elige una opción");
        System.out.println("1. Mostrar la información del edificio");
        System.out.println("2. Encontrar un apartamento");
        System.out.println("3. Mostrar los apartamentos en una planta");
        System.out.println("4. Mostrar los propietarios de un apartamento");
        System.out.println("5. Mostrar los datos de un apartamento ");
        System.out.println("6. Mostrar los propietarios de un apartamento");
        System.out.println("7. Salir");
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }
}
