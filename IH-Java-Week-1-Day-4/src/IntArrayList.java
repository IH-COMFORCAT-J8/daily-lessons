public class IntArrayList {

    private int[] array = new int[10];
    private int counter = 0;

    public IntArrayList() {
    }


    public void add(int num) {

        if (counter < array.length) {
            array[counter] = num;
            counter++;
        } else {
            int[] arrayTransicional = new int[(int) (array.length * 1.5)];
            for (int i = 0; i < array.length; i++) {
                arrayTransicional[i] = array[i];
            }
            array = arrayTransicional;
            array[counter] = num;
            counter++;
        }

    }

    public int[] getArray() {
        return array;
    }
}
