package oop1;

public class Car {


    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public void setModel(String model){
        String validModel = model.toLowerCase();

        if(validModel.equals("s500") || validModel.equals("c300")){
            this.model = model;
        } else {
            this.model = "unknown";
        }

    }

    public String getModel(){
        return this.model;
    }

}
