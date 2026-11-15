import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if(move == 0 || array.length == 0 || direction != 'R' && direction != 'L' || move % array.length == 0) //if the move is 0, the array is null, a multiple of the array length, the direction is invalid.
        {
            return array;
        }

        if(direction == 'L') //in case were moving left just move negative right.
        {
            move = -1 * move;
        }

        int actualMove = move % array.length; //if the move is bigger than the array take the mod

        if (actualMove < 0) //if the move is negative, make it positive.
        {
            actualMove += array.length;
        }

        for (int i = 0; i < actualMove; i++)
        {
            int temp = array[array.length - 1]; //store the last value
            for (int j = array.length - 1; j > 0; j--) //move all elements to the right by one
            {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}