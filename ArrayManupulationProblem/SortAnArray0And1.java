public class SortAnArray0And1 {
    static int[] sortZeroAndOne(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while ((start < end)) {
            if (arr[start] == 0) {
                start++;
            } else if (arr[end] == 1) {
                end--;
            } else if (arr[start] == 1 && arr[end] == 0) {
                int temp;
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }

        }
        return arr;
    }
        public static void main (String[]args){
            int arr[] = {1, 0, 1, 1, 1, 0, 1};

            System.out.println("the original array");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            int result[] = sortZeroAndOne(arr);

            System.out.println();
            System.out.println("sorted array");
            for (int i : result) {
                System.out.print(i + " ");

            }
        }
    }

