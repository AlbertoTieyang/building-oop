package org.ies.building;

import org.ies.building.components.ApartmentReader;
import org.ies.building.components.BuildingApp;
import org.ies.building.components.BuildingReader;
import org.ies.building.components.OwnerReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OwnerReader ownerReader = new OwnerReader(scanner);
        ApartmentReader apartmentReader = new ApartmentReader(scanner, ownerReader);
        BuildingReader buildingReader = new BuildingReader(scanner, apartmentReader);
        BuildingApp buildingApp = new BuildingApp(scanner, buildingReader);

        buildingApp.run();
    }
}