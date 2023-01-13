package lesson;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    private final Set<Task> tasks = new HashSet<>();

    public MultiplicationTable(){
        Random random = new Random();
        while (tasks.size() < 15){
            tasks.add(new Task(random.nextInt(9), random.nextInt(9)));
        }
    }

    @Override
    public String toString() {
        return "MultiplicationTable{" +
                "tasks=" + tasks +
                '}';
    }
}
