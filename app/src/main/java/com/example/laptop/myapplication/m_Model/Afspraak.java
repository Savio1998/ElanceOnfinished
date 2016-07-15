package com.example.laptop.myapplication.m_Model;

/**
 * Created by Sjoerdtje on 7/8/2016.
 */
public class Afspraak {
    String name,propellant,description,key;

    public Afspraak(String name, String propellant, String description) {
        this.name = name;
        this.propellant = propellant;
        this.description = description;
    }

    public Afspraak() {
    }
//    public Afspraak(String name,String propellant, String description) {
//        this.name = getName();
//        this.propellant= getPropellant();
//        this.description= getDescription();
//    }
//    public Afspraak(String name,String propellant, String description, String key) {
//        this.name = getName();
//        this.propellant= getPropellant();
//        this.description= getDescription();
//        this.description = getKey();
//    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPropellant() {
        return propellant;
    }
    public void setPropellant(String propellant) {
        this.propellant = propellant;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getKey() {
        return key;
    }

    public void  setKey(String key){
        this.key = key;
    }


}
