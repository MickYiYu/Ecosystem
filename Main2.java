package Ecosystem;

public class Main2 {

    public static void main(String[] args) throws InterruptedException{
        River myRiver = new River();

        myRiver.getAnimalAt(5);
        myRiver.getAnimalAt(50);
        myRiver.getAnimalAt(70);

        while(true){
            myRiver.stepSim();
            System.out.println(myRiver);
            Thread.sleep(400);
        }

    }
}
