package Chapter9;

public class Exercise9_2 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Stock name: " + stock1.getName() + " Symbol: " + stock1.getSymbol());
        System.out.println("Previous price: " + stock1.getPreviousClosingPrice());
        System.out.println("Current price: " + stock1.getCurrentPrice());
        System.out.println("Percent change: " + stock1.getChangePercent());
    }
}
