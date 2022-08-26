package Ecosystem;

public class Animal {
    private String symbol;
    private static River river;

    public Animal(){
        symbol= "A";
    }
    public Animal(String symbol){
        this.symbol = symbol;
    }
    public static void setRiver(River river){
        Animal.river = river;
    }

    public String getSymbol(){
        return symbol;
    }


    public void act(int index){
        if(river == null)
            throw new IllegalStateException("Cannot Act - No River Set for Animals");

        int choice = (int)(1 + Math.random()*100);
        if(choice <= 20){
            if(index == 0)
                return;
            Animal nextToMe = river .getAnimalAt(index-1);
            if(nextToMe == null){
                river.clearLoc(index);
                river.addAnimal(this, index-1);
            }
        }
        else if(choice <= 40){
            if(index == 100)
                return;
            Animal nextToMe = river.getAnimalAt(index+1);
            if (nextToMe == null) {
                river.clearLoc(index);
                river.addAnimal(this, index+1);
            }

        }
    }
}
