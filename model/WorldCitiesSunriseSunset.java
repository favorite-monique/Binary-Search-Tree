/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author 44773
 */
public class WorldCitiesSunriseSunset implements Comparable<WorldCitiesSunriseSunset>, Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(WorldCitiesSunriseSunset.class.getName());
    private String city;
    private String country;
    private long sunrise;
    private long sunset;

    public WorldCitiesSunriseSunset() {
        this.city= null;
        this.country = null;
        this.sunrise = 0;  
        this.sunrise = 0;
    }
    
    public WorldCitiesSunriseSunset(String City, String Country, long Sunrise, long Sunset) {
        this.city = City;
        this.country = Country;
        this.sunrise = Sunrise; 
        this.sunset = (int) Sunset;
    }  
    

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param City
     * @param City the city to set
     */
    public void setCity(String City) {
        this.city = city;
    }

    /**
     * @return the Country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param Country the country to set
     */
    public void setStockItem(String Country) {
        this.country = country;
    }

    /**
     * @return the Sunrise
     */
    public long getSunrise() {
        return sunrise;
    }

    /**
     * @param Sunrise the sunrise to set
     */
    public void setSunrise(long Sunrise) {
        this.sunrise = sunrise;
    }
    
     /**
     * @return the Sunrise
     */
    public long getSunset() {
        return sunset;
    }

    /**
     * @param Sunset the sunset to set
     */
    public void setSunset(long Sunset) {
        this.sunset = sunset;
    }
    
    @Override
    public String toString() {
        return this.getCity() + "," + this.getCountry() +  "," + this.getSunrise() +  "," + this.getSunset();
    }    

    /**
     *
     * @param theSunset
     * @return
     */
    @Override
    public int compareTo(WorldCitiesSunriseSunset theSunset){  
       if(this.sunrise == theSunset.sunset) {
           return 0;
       } else if(this.sunrise < theSunset.sunset) {
           return 1;
       } else {
           return -1;
       }  
    }    
    
}

