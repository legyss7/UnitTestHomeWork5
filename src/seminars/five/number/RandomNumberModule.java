package seminars.five.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {
    public ArrayList<Integer> generatedList(int i) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int j = 0; j < i; j++) {
            list.add(rand.nextInt(11));
        }
        return list;
    }

}
