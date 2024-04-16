package fitnes;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        FitnessClub fitnessClub = new FitnessClub();

        addOwnerToZone(fitnessClub, FitnessZone.Gym);
        addOwnerToZone(fitnessClub, FitnessZone.Pool);
        addOwnerToZone(fitnessClub, FitnessZone.Group);

        fitnessClub.printOwnerInZones();
    }

    private static void addOwnerToZone(FitnessClub fitnessClub, FitnessZone zone)
    {
        fitnessClub.enterZone(zone, createMember("Елизавета", "Владимирова", 1993));
        fitnessClub.enterZone(zone, createMember("Кира", "Кузьмина", 2002));
        fitnessClub.enterZone(zone, createMember("София", "Андреева", 1962));
        fitnessClub.enterZone(zone, createMember("Ева", "Авдеева", 2005));
        fitnessClub.enterZone(zone, createMember("Мария", "Коровина", 1990));
        fitnessClub.enterZone(zone, createMember("Андрей", "Попов", 1987));
        fitnessClub.enterZone(zone, createMember("Лев", "Пантелеев", 1962));
        fitnessClub.enterZone(zone, createMember("Милана", "Зайцева", 1976));
        fitnessClub.enterZone(zone, createMember("Ксения", "Максимова", 1964));
        fitnessClub.enterZone(zone, createMember("Андрей", "Прохоров", 1968));
        fitnessClub.enterZone(zone, createMember("Мария", "Попова", 1990));
        fitnessClub.enterZone(zone, createMember("Маргарита", "Фролова", 1978));
        fitnessClub.enterZone(zone, createMember("Валерия", "Смирнова", 1972));
        fitnessClub.enterZone(zone, createMember("Мелания", "Лапшина", 1996));
        fitnessClub.enterZone(zone, createMember("Кирилл", "Комаров", 1987));
        fitnessClub.enterZone(zone, createMember("Надежда", "Воробьева", 1962));
        fitnessClub.enterZone(zone, createMember("Анастасия", "Киселева", 1975));
        fitnessClub.enterZone(zone, createMember("Аврора", "Михеева", 2005));
        fitnessClub.enterZone(zone, createMember("Ксения", "Корчагина", 1997));
        fitnessClub.enterZone(zone, createMember("Елизавета", "Чернышева", 1984));

    }

    private static Member createMember(String Name, String surName, int year)
    {
        Owner owner = new Owner(Name, surName, year);
        LocalDate regDate = LocalDate.now();
        LocalDate exDate = regDate.plusMonths(1);
        return new Member(regDate, exDate, owner);
    }
}