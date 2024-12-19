package org.ies.building.components;

import org.ies.building.model.Building;

import java.util.Scanner;

public class BuildingApp1 {
    private final Scanner scanner;
    private final BuildingReader buildingReader;

    public BuildingApp1(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }

    public void run(){
        Building building = buildingReader.read();

        System.out.println("Introduce una planta, para buscar");
        int floor = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce una puerta de la planta "+floor);
        String door = scanner.nextLine();

        if(building.findApartment(door, floor) == null){
            System.out.println("No se ha encontrado el apartamento");
        }else{
            building.showApartmentInfo(floor, door);
        }

    }
}
