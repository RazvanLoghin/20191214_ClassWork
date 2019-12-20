import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] copii = new int[10];
        for (int i = 0; i <10 ; i++) {
            copii[i] = 10;
        }
        boolean isWinner = false;
        Random r = new Random();
        while(!isWinner){
            for (int i = 0; i < 10; i++) {
                if(copii[i] > 0){
                    int otherChild = r.nextInt(10);
                    int nrCandies = r.nextInt(5);
                    if(nrCandies > copii[i]){
                        nrCandies = copii[i];
                    }
                    if(copii[otherChild] > 0){
                        copii [i] = copii[i] - nrCandies;
                        copii [otherChild] = copii[otherChild] + nrCandies;
                    }
                }
            }
            for (int i = 0; i < 10; i++) {
                System.out.print(copii[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < copii.length; i++) {
                if(copii[i] == 10*10){
                    isWinner = true;
                }
            }
        }

    }
}
