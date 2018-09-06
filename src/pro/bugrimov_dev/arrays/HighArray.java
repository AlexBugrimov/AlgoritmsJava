package pro.bugrimov_dev.arrays;

public class HighArray {

    private long[] arr;

    private int nElements;

    HighArray(final int max) {
        arr = new long[max];
        nElements = 0;
    }

    /**
     * Поиск
     * @param searchKey значение
     * @return найден/не найден
     */
    boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElements; j++) {
            if (arr[j] == searchKey)
                break;
        }
        if (j == nElements) {
            return false;
        } else {
            return true;
        }
    }

    void insert(long value) {
        arr[nElements] = value;
        nElements++;
    }

    boolean delete(long value) {
        int j;
        for (j = 0; j < nElements; j++) {
            if (value == arr[j])
                break;
        }
        if (j == nElements) {
            return false;
        } else {
            for (int k = j; k < nElements; k++) {
                arr[k] = arr[k + 1];
            }
            nElements--;
            return true;
        }
    }

    void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
