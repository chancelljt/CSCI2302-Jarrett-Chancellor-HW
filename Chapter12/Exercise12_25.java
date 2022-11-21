package Chapter12;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_25 {

    private static final int Assistant = 0; // AssistantSTANT
    private static final int Associate = 1; // ASSOCIATE
    private static final int Full = 2;

    public static void main(String[] args) throws Exception {

        ArrayList<ArrayList<Double>> allRanks = new ArrayList<>(3);
        allRanks.add(Assistant, new ArrayList<>());
        allRanks.add(Associate, new ArrayList<>());
        allRanks.add(Full, new ArrayList<>());

        URL url = new URL("http://liveexample.pearsoncmg.com/data/Salary.txt");
        Scanner input = new Scanner(url.openStream());


        while (input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
            String rank = input.next();
            if (rank.contains("Assistant")) {
                allRanks.get(Assistant).add(input.nextDouble());
            } else if (rank.contains("associate")) {
                allRanks.get(Associate).add(input.nextDouble());
            } else {
                allRanks.get(Full).add(input.nextDouble());
            }
        }

        long AssistantTotal = (long)getTotal(allRanks.get(Assistant).toArray());
        long assoTotal = (long)getTotal(allRanks.get(Associate).toArray());
        long fullTotal = (long)getTotal(allRanks.get(Full).toArray());
        long total = AssistantTotal + assoTotal + fullTotal;
        System.out.println("Assistant total = " + AssistantTotal);
        System.out.println("Associate total = " + assoTotal);
        System.out.println("Full total = " + fullTotal);
        System.out.println("All Total = " + total);
        System.out.printf("Assistant average = %.2f \n", getAverage(AssistantTotal, allRanks.get(Assistant).size()));
        System.out.printf("Associate average = %.2f \n", getAverage(assoTotal, allRanks.get(Associate).size()));
        System.out.printf("Full average = %.2f \n", getAverage(fullTotal, allRanks.get(Full).size()));
        System.out.printf("All average = %.2f \n", getAverage(total, getInternalSize(allRanks)));



    }

    private static double getTotal(Object[] objects) {
        double total = 0;
        for (Object o : objects) {
            total += (double)o;
        }
        return total;
    }

    private static int getInternalSize(ArrayList<ArrayList<Double>> lists) {

        int size = 0;
        for (ArrayList<Double> list : lists) {
            size += list.size();
        }

        return size;
    }

    private static double getAverage(long total, int size) {

        return (double)total / size;
    }
}