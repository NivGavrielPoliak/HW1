public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");   

        //first two nums are 1,1 which are odd, x=>3
        System.out.print("1 ");
        System.out.print("1 ");
        int numOdd = 2;
        int last = 1;
        int curr = 1;

        for (int i = 2; i < x; i++)
        {
            curr = curr + last;
            last = curr - last;
            if(curr % 2 == 1) //check if the current number is odd
            {
                numOdd++;

            }
                System.out.print(curr + " "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
