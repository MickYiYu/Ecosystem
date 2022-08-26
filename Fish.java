package Ecosystem;

public class Fish extends Animal{
    private String Symbol;
    private Animal Fish;
    private Animal Bear;
    Animal river[];

    public Fish() {
        Symbol = "F";
    }

    public Fish(String symbol) {
        Symbol = symbol;
    }

    @Override
    public String getSymbol() {
        return Symbol;
    }

    public void EatennIncrease(River river, int index) {
        if(river.getAnimalAt(index).equals(Fish)&& river.getAnimalAt(index + 1).equals(Bear)){
            river.clearLoc(index);
        }
        else if(river.getAnimalAt(index).equals(Fish)&& river.getAnimalAt(index - 1).equals(Bear)){
            river.clearLoc(index);
        }
        //increase
        else if(river.getAnimalAt(index).equals(Fish)&& river.getAnimalAt(index + 1).equals(Fish)){
            if(river.getAnimalAt(index-1)==null){
                river.addAnimal(Fish,index-1);
            }
            else if(river.getAnimalAt(index+2)==null){
                river.addAnimal(Fish,index+2);
            }
        }

        else if(river.getAnimalAt(index).equals(Fish)&& river.getAnimalAt(index - 1).equals(Fish)){
            if(river.getAnimalAt(index-1)==null){
                river.addAnimal(Fish,index+1);
            }
            else if(river.getAnimalAt(index-2)==null){
                river.addAnimal(Fish,index-2);
            }
        }

    }
}
