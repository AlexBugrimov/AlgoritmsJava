package pro.bugrimov_dev;

public class HighArray {

    private long[] arr;

    private int nElements;

    public HighArray(final int max) {
        arr = new long[max];
        nElements = 0;
    }

    /**
     * Поиск
     * @param searchKey значение
     * @return найден/не найден
     */
    public boolean find(long searchKey) {
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

    public void insert(long value) {
        arr[nElements] = value;
        nElements++;
    }

    public boolean delete(long value) {
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
}
