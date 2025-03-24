public class RoboPet {
    protected String name;
    protected String model_number;
    protected int battery_level;

    public RoboPet(String name, String model_number, int battery_level){
        this.name = name;
        this.model_number = model_number;
        this.battery_level = battery_level;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getModel_number(){
        return model_number;
    }
    public int getBattery_level(){
        return battery_level;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setModel_number(String model_number){
        this.model_number = model_number;
    }
    public void setBattery_level(int battery_level){
        this.battery_level = battery_level;
    }

    public void recharge(){
        battery_level = 100;
        System.out.println( name + "'s Battery Recharged");
    }
}
