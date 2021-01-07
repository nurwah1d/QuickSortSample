package id.enura;

public class Main {

    public static void main(String[] args) {
        // TODO: Quick sort
        int[] data = {15, 13, 21, 18, 28, 31, 27, 17};
        System.out.println("Banyak elemen : " + data.length);

        // TODO: Tampil data[]
        for (int d: data) System.out.print(d + "  ");

        // TODO: Quick sort
        int bawah = 0;
        int atas = data.length - 1;

        quickSort(data, bawah, atas);

        // TODO: Hasil akhir QuickSort
        System.out.print("\n\nHasil QuickSort : ");
        for (int d: data) System.out.print(d + "  ");
    }

    private static void quickSort(int[] data, int bawah, int atas) {
        if (bawah < atas) {

            int pivot = divArray(data, bawah, atas);

            quickSort(data, bawah, pivot - 1);

            quickSort(data, bawah + 1, atas);
        }
    }

    private static int divArray(int[] data, int bawah, int atas) {
        int pivot = data[atas];

        int i = bawah - 1; // i = -1

        for (int j=bawah; j < atas; j++) {
            if (data[j] < pivot) {
                i++; // i = 0

                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        int temp = data[i+1];
        data[i+1] = data[atas];
        data[atas] = temp;


        return i+1;
    }

}
