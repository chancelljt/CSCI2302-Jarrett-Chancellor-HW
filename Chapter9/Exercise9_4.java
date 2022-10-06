package Chapter9;

import java.util.Random;

public class Exercise9_4 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for(int i = 0; i < 50; i++){
            System.out.printf("%3d ", random.nextInt(101));
            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
