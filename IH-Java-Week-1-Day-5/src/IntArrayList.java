public class IntArrayList implements IntList {
    private int[] array;
    private int counter = 0;

    public IntArrayList() {
        array = new int[10];
    }

    public void add(int number) {

        if (counter >= array.length) {
            int[] newArray = new int[(int) (array.length * 1.5)];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[counter] = number;
        counter++;

    }

    public int get(int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Index out of bounds");
            return 0;
        }

        return array[index];
    }

    public int[] getArray() {
        return array;
    }
}
