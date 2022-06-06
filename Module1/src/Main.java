public class Main {
    public static void main(String[] args) {

        int[] unsortedNumbers = new int[10];
        unsortedNumbers[0] = 26;
        unsortedNumbers[1] = 3452;
        unsortedNumbers[2] = 12;
        unsortedNumbers[3] = 32;
        unsortedNumbers[4] = 5;
        unsortedNumbers[5] = 59;
        unsortedNumbers[6] = 246;
        unsortedNumbers[7] = 247;
        unsortedNumbers[8] = 69;
        unsortedNumbers[9] = 35;

        System.out.println("Before sort: ");
        printArrayElements(unsortedNumbers);

        bubbleSort(unsortedNumbers);
        System.out.println("\n\nAfter Bubble sort: ");
        printArrayElements(unsortedNumbers);

        selectionSort(unsortedNumbers);
        System.out.println("\n\nAfter Selection sort: ");
        printArrayElements(unsortedNumbers);
    }

    private static void bubbleSort(int[] arr)
    {
        for (int unsortedIndex = arr.length; unsortedIndex > 0; unsortedIndex--)
        {
            for (int i = 1; i < unsortedIndex; i++)
            {

                if (arr[i - 1] < arr[i])
                {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            int highestValIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++)
            {
                if (arr[i] < arr[highestValIndex])
                {
                    highestValIndex = i;
                }
            }
            int temp = arr[lastUnsortedIndex];
            arr[lastUnsortedIndex] = arr[highestValIndex];
            arr[highestValIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + "  ");
        }
    }
}