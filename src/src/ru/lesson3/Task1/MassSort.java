package src.ru.lesson3.Task1;

public class MassSort {

    public int[] sort(int[] a) {
        int[] temp;
        int[] b = a;
        int[] c = new int[a.length];
        int size = 1;

        while (size < a.length) {
            for (int i = 0; i < a.length; i += 2 * size) {
                merge(b, i, b, i + size, c, i, size);
            }
            temp = b;
            b = c;
            c = temp;

            size = size * 2;
        }
        return a;
    }

    public void merge(int[] a, int aStart, int[] b, int bStart, int[] c, int cStart, int size) {

        int index1 = aStart;
        int index2 = bStart;

        int aEnd = Math.min(aStart + size, a.length);
        int bEnd = Math.min(bStart + size, b.length);
        int count = aEnd - aStart + bEnd - bStart;

        for (int i = cStart; i < cStart + count; i++) {
            if (index1 < aEnd && (index2 >= bEnd || a[index1] < b[index2])) {
                c[i] = a[index1];
                index1++;
            } else {
                c[i] = b[index2];
                index2++;
            }
        }
    }
}

