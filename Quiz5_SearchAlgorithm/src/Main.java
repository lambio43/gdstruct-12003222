import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int numbers[] = {60, 39, 45, 61, 12, 70, 25};

        int numbers2[] = {1, 4, 5, 8, 10, 15, 50, 60, 2003, 50043};

        System.out.println(gachaSearch(numbers, 45));
        System.out.println(gachaBinarySearch(numbers2, 2003));
    }

    public static int gachaSearch(int[] input, int value)
    {

        LinkedList<Integer> indexLinkedList = new LinkedList<Integer>();


        for (int i = 0; i < input.length; i++)
        {
            indexLinkedList.add(i);
        }

        int gachaIndex;

        while (indexLinkedList.size() != 0) {

            gachaIndex = ThreadLocalRandom.current().nextInt(indexLinkedList.size());

            if(input[indexLinkedList.get(gachaIndex)] == value)
            {
                return indexLinkedList.get(gachaIndex);
            }
            else
            {
                indexLinkedList.remove(gachaIndex);
            }
        }
        return -1;
    }

    public static int gachaBinarySearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length - 1;
        int middle;

        while (start <= end)
        {
           middle = ThreadLocalRandom.current().nextInt(start, end + 1);

            if(input[middle] == value)
            {
                return middle;
            }
            else if(value < input[middle]) // value might be in left half
            {
                end = middle - 1;
            }
            else if (value > input[middle]) // value might be in right half
            {
                start = middle + 1;
            }
        }
        return -1;
    }
}