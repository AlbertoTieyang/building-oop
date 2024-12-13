package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String address;
    private String city;
    private Apartment[] apartments;

    public Building(String address, String city, Apartment[] apartments) {
        this.address = address;
        this.city = city;
        this.apartments = apartments;
    }

    public void showInfoBuilding() {
        for (var apartment : apartments) {
            apartment.showInfo();
        }
    }

    public Apartment findApartment(String doorNumber, int floorNumber) {
        var door = findDoor(doorNumber);
        var floor = findFloor(floorNumber);
        if (door == null) {
            System.out.println("La puerta no existe");
        } else if (floor == null) {
            System.out.println("La planta no existe");
        } else {
            for (var apartment : apartments) {
                return apartment;
            }
        }
        return null;
    }

    public void showFloorApartments(int floorNumber) {
        var floor = findFloor(floorNumber);
        if (floor == null) {
            System.out.println("No existe la planta");
        } else {
            for (var apartment : apartments) {
                System.out.println(apartment);
            }
        }
    }

    public Apartment findOwners(String doorNumber, int floorNumber) {
        var door = findDoor(doorNumber);
        var floor = findFloor(floorNumber);
        if (floor == null) {
            System.out.println("No existe la planta");
        } else if (door == null) {
            System.out.println("No existe la puerta");
        } else {
            for (var apartment : apartments) {
                return apartment;
            }
        }
        return null;
    }
    public void showApartmentInfo(int floorNumber, String doorNumber) {
        var apartment = findApartment(doorNumber, floorNumber);
        if(apartment == null){
            System.out.println("No existe el apartamento");
        } else {
            apartment.showInfo();
        }
    }

    public void showOwnersInfo(String doorNumber, int floorNumber){
        var owner = findOwners(doorNumber, floorNumber);
        if(owner == null ){
            System.out.println("No existe el apartamento");
        }else{
            for (var apartment: apartments) {
                System.out.println(apartment);
            }
        }
    }

    public Apartment findDoor(String door) {
        for (var apartment : apartments) {
            if (apartment.getDoor().equals(door)) {
                return apartment;
            }
        }
        return null;
    }

    public Apartment findFloor(int floor) {
        for (var apartment : apartments) {
            if (apartment.getFloor() == floor) {
                return apartment;
            }
        }
        return null;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(address, building.address) && Objects.equals(city, building.city) && Objects.deepEquals(apartments, building.apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, city, Arrays.hashCode(apartments));
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", apartments=" + Arrays.toString(apartments) +
                '}';
    }
}
