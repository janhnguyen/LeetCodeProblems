class DynamicArray {

    private int[] array;
    private int size;
    private int capacity;

    public DynamicArray(int initialCapacity) {
        this.capacity = initialCapacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        array[size++] = n;
    }

    public int popback() {
        int value = array[--size];
        return value;
    }

    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

}
