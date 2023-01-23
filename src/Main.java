
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int size = 10;
        ArrayList<Integer> randomList = new ArrayList<>();
        int maxCount = 0;
        int minCount = 0;
        int sum = 0;
        double average = 0;
        for (int i = 0; i < size; i++) {
            int randomNum = (int) (Math.random() * 100); // generates a random number between 0 and 99
            randomList.add(randomNum);


            maxCount = randomList.get(0);
            for (int j = 1; j < randomList.size(); j++) {
                if (randomList.get(j) > maxCount) {
                    maxCount = randomList.get(j);
                }
            }

            minCount = randomList.get(0);
            for (int k = 0; k < randomList.size(); k++) {
                if (randomList.get(k) < minCount) {
                    minCount = randomList.get(k);
                }
            }


            for (int number : randomList) {
                sum += number;
            }
            average = (double) sum / randomList.size();

        }
        System.out.println(maxCount);
        System.out.println(minCount);
        System.out.println(randomList);
        System.out.println(average);
    }
}
