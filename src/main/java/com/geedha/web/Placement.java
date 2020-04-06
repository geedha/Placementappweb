package com.geedha.web;
public class Placement {
    private String name;
    private String location;
    private String domain;
    private float eligibility;
    private String startingsalary;
    private int no_of_rounds;

    public Placement(){

    }
    public Placement(String name, String location,String domain,float eligibility, String startingsalary,int no_of_rounds)
    {
        this.name = name;
        this.location = location;
        this.domain = domain;
        this.eligibility = eligibility;
        this.startingsalary = startingsalary;
        this.eligibility = eligibility;
        this.no_of_rounds = no_of_rounds;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getLocation()
    {
        return this.location;
    }
    public void setLocation(String location)
    {
            this.location = location;
    }
    public String  getDomain()
    {
        return this.domain;

    }
    public void setDomain(String domain){
        this.domain = domain;
    }
    public float getEligibility(){
        return this.eligibility;
    }
    public void setEligibility(float eligibility){
        this.eligibility = eligibility;
    }
    public String getStartingsalary(){
        return this.startingsalary;
    }
    public void setStartingsalary(String startingsalary){
        this.startingsalary = startingsalary;
    }
    public int getNoofrounds(){
        return this.no_of_rounds;
    }
    public void setNoofrounds(int no_of_rounds){
         this.no_of_rounds = no_of_rounds;
    }
    

}