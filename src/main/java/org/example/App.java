package org.example;

import org.example.Data.CityDaoImpl;
import org.example.Model.City;

public class App {
    public static void main(String[] args) {

        CityDaoImpl cityDao = new CityDaoImpl();

        System.out.println(cityDao.findById(1));
        System.out.println(cityDao.findByCountryCode("USA"));
        System.out.println(cityDao.findByName("New York [New York]"));
//        System.out.println(cityDao.findAll());

        City zombieCity = new City("zombieCity", "DEAD", "No Walking zone", 0);
        cityDao.add(zombieCity);

        City zombieCityUpdate = cityDao.findById(1000);
        zombieCityUpdate.setName("zombie to Virus");
        zombieCityUpdate.setPopulation(1);
        System.out.println(cityDao.update(zombieCityUpdate));

        City deletedCity = cityDao.findById(10);
        System.out.println(cityDao.delete(deletedCity));
    }
}
