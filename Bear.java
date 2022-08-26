package Ecosystem;

public class Bear extends Animal {
    private String symbol;
    Animal Bear;

    public Bear(){
        symbol = "B";
    }

    public Bear(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
