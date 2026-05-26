package Transport;

public class Car extends Vehicle{
    public int numOfDoors;
    public String Transmissiontype;

    Car(String name, String model, int noOfTyres,String numOfDoors , String transmissiontype){
        super(name , model , noOfTyres);
        this.numOfDoors = noOfTyres;
        this.Transmissiontype = transmissiontype;
//        super.startEngine();

    }
    public void startAc(){
        System.out.println("Ac started of " + name);
    }
}
