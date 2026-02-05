package org.itmo.lab4;

import javax.swing.text.StyledEditorKit;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //printOddNumbers();
        //secondTask();
        //thirdTask();
        //fourthTask(5, 20, 15);
        fifthTask(5,6,9,10,5,3);
        //sixthTask();

        //sortedArray(1,2,2,3,4,5);
        //userArray();
        //changeArray(5,6,7,2);
        //uniqueNumber(1,2,3,1,2,4);
        //int [] result = mergeSort(5,9,2,3,7,1,500);
        //System.out.println(Arrays.toString(result));
    }

    public static void printOddNumbers() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void secondTask() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
        }
    }

    public static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        Boolean isTrue;

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        if (a + b == c) {
            isTrue = true;
            System.out.print("Результат: " + isTrue);
        }
    }

    public static void fourthTask(int a, int b, int c) {
        Boolean isTrue;

        if (b > a) {
            if (c > b) {
                isTrue = true;
                System.out.print("Результат: " + isTrue);
            } else {
                isTrue = false;
                System.out.print("Результат: " + isTrue);
            }
        }
    }

    public static boolean fifthTask(int... array) {
        if (array.length >= 2) {
            if (array[0] == 3 || array[array.length - 1] == 3) {
                return true;
            }
        }
        return  false;
    }

    public static boolean sixthTask(int... numbers) {
        for (int num : numbers) {
            if (num == 1 || num == 3) {
                return true;
            }
        }
        return false;
    }

    public static void sortedArray(int... numbers) {
        Boolean isSorted = false;
        for (int i = 0; i < numbers.length - 1; i ++) {
            if (numbers[i + 1] >= numbers[i]) {
                isSorted = true;
            } else {
                isSorted = false;
                break;
            }
        }

        if (isSorted == true) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static void userArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какая будет длинна массива?");
        int a = scanner.nextInt();
        int[] array = new int[a];
        System.out.println("Введите числа:");

        for (int i = 0; i < a; i ++) {
            int b = scanner.nextInt();
            array[i] = b;
        }

        System.out.println("Result: " + Arrays.toString(array));
    }

    public static void changeArray(int... numbers) {
        int a = numbers[0];
        int b = numbers[numbers.length - 1];

        int[] newArray = new int[numbers.length];
        newArray[0] = b;

        for (int i = 1; i < newArray.length - 1; i ++) {
            newArray[i] = numbers[i];
        }

        newArray[newArray.length - 1] = a;

        System.out.println("Array 1: " + Arrays.toString(numbers));
        System.out.println("Array 2: " + Arrays.toString(newArray));
    }

    public static void uniqueNumber(int... nums) {

        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println("Первое уникальное число = " + nums[i]);
                break;
            }
        }
    }


    public static int[] mergeSort(int... numbers) {
        if (numbers.length < 2) {
            return numbers;
        }

        int mid = numbers.length / 2;

        int[] left = new int[mid];
        int[] right;

        if (numbers.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = numbers[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = numbers[mid + i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left, right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resPointer = 0;

        while (leftPointer <left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    res[resPointer++] = left[leftPointer++];
                } else {
                    res[resPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                res[resPointer++] = left[leftPointer++];
            } else {
                res[resPointer++] = right[rightPointer++];
            }
        }

        return res;
    }
}
