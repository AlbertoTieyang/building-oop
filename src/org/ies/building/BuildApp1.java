package org.ies.building;

import org.ies.building.components.ApartmentReader;
import org.ies.building.components.BuildingApp1;
import org.ies.building.components.BuildingReader;
import org.ies.building.components.OwnerReader;

import java.util.Scanner;

public class BuildApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OwnerReader ownerReader = new OwnerReader(scanner);
        ApartmentReader apartmentReader = new ApartmentReader(scanner, ownerReader);
        BuildingReader buildingReader = new BuildingReader(scanner, apartmentReader);
        BuildingApp1 buildingApp1 = new BuildingApp1(scanner, buildingReader);

        buildingApp1.run();
    }
}
