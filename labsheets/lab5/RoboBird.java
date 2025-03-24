public class RoboBird extends RoboPet{
    RoboBird(String name ,String model_number ,int battery){
        super(name ,model_number ,battery);
    }

    public void fly(){
        System.out.println(getName() + " Can Flying");
    }
    public void compete(){
        if(getBattery_level() < 20){
            System.out.println(getName() + "'s Battery is low. charge first");
        }else {
            System.out.println(getName() + " Competing in a guarding challenge ");
            setBattery_level(getBattery_level() - 35);
            System.out.println(getName() + " Battery Level is " + getBattery_level() + "%");
        }
    }
}
