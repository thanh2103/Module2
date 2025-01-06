package ss7_DSA_List.exercise1;

public class MyArrayList {
    private int capacity;
    private int[] arr;
    private int size;
    private int[] emptyArray = {};

    public int size() {
        return size;
    }

    public MyArrayList() {
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public void add(int element) {
        if (arr == emptyArray) {
            this.capacity = 10;
            this.arr = new int[this.capacity];
        }
        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }
            int[] brr = new int[this.capacity];
            for (int i = 0; i < size; i++) {
                brr[i] = arr[i];
            }
            arr = brr;
        }
        arr[size] = element;
        size++;
    }

    //toString:trả về thông tin đối tượng

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append("\t");
        }
        return sb.toString();
    }

    //
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("Index ngoài phạm vi");
            return;
        }

        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }
            int[] brr = new int[this.capacity];

            for (int i = 0; i < index; i++) {
                brr[i] = arr[i];
            }
            brr[index] = element;

            for (int i = index; i < size; i++) {
                brr[i + 1] = arr[i];
            }
            arr = brr;
        } else {
            for (int i = size; i > index; i++) {
                arr[i] = arr[i - 1];
            }
            arr[index] = element;
        }
        size++;
    }

    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoai pham vi");
            return;
        }
        arr[index] = element;
    }

    public Integer get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Ben ngoai pham vi ");
            return null;
        }
        return arr[index];
    }

    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int element) {
        for (int i = size - 1; i <= 0; i--) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoai pham vi");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void removeElement(int element) {
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != element) {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }
        size = newIndex;
    }

}
