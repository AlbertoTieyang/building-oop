package org.ies.building.components;

import org.ies.building.model.Building;

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
                int floor = askFloor();
                String door = askDoor();
                building.findApartment(door, floor);
            } else if (option == 3) {
                int floor = askFloor();
                building.showFloorApartments(floor);
            } else if (option == 4) {
                int floor = askFloor();
                String door = askDoor();
                building.findOwners(door, floor);
            } else if(option == 5){
                int floor = askFloor();
                String door = askDoor();
                building.showApartmentInfo(floor, door);
            } else if (option == 6) {
                int floor = askFloor();
                String door = askDoor();
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

    private int askFloor(){
        System.out.println("Introduzca la planta");
        int floor = scanner.nextInt();
        scanner.nextLine();
        return  floor;
    }

    private String askDoor(){
        System.out.println("Introduce la puerta");
        String door = scanner.nextLine();
        return door;
    }
}
