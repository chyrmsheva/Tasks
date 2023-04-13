import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] a = new int[9];
        int[] newArray = new int[a.length];
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50);
            if (a[i] > max) {
                max = a[i];
            }
        }

        newArray[0] = max;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] != max) {
                    newArray[i + 1] = a[i];
            }
        }

//        for (int j = 1; j < newArray.length; j++) {
//            if (a[j] != max) {
//                newArray[j] = a[j];
//            }
//
//        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(newArray));
        System.out.println("max: " + max);

    }


}

//        int[] array = {2, 3, 4, 5, 8, 99, 99, 6, 7};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; ) {
//                if (array[i] == array[j]) {
//                    count++;
//                    break;
//
//                }
//                break;
//
//            }
//
//        }
//        System.out.println(count);
//    }
////}------------------------------------------------------------------------------
//        Random random = new Random();
//     //   int[] a = new int[35];
//
//        int [] array = {12,3,47,10,35,16,34,25,34,67,70};
//        int max = array[0];
//        int min = array[0];
//        int change;
//        int indexOfMax = 0;
//        int indexOfMin = 0;
//        for (int i = 0; i < array.length; i++) {
//       //    a[i] = random.nextInt(50);
//            if (array[i] > max) {
//                max = array[i];
//                indexOfMax = i;  //11
//            }
//            if(array[i]<min){
//                min = array[i];
//                indexOfMin = i;//1
//            }
//        }
//     //   System.out.println(Arrays.toString(a));
//        change = array[indexOfMax];  // change = array[11]  change = 70
//        array[indexOfMax] = array[indexOfMin];  // array[11(indexOfMax)](70) = array[1](3)
//        array[indexOfMin] = change; //array[1] = 70
//        for(int san : array){
//            System.out.print(san + " ");
//        }
//
//        int a = 8;
//        int b = 9;
//        int change1;
//        change1 = a;
//        a = b;
//        b = change1;
//        System.out.println();
//        System.out.println(a);
//        System.out.println(b);
//
//
//      //  System.out.println(Arrays.toString(a));
//
//
//    }
//
//
//}

