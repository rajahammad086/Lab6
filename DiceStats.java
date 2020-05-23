// This program computes and displays statistics on the frequency of sums obtained when rolling a pair of dice
// Raja Hammad Mehmood.
public class DiceStats {


    public static void main ( String[] args ) {

        int[] sums=generateStats(6,400);// calling generate stats function while giving the parameters to the function
        printHistogram(sums,2,13);// calling the printHistogram function which in itself utilizes the printHashes function.
    }

    /**
     *prints out "#" a number of times in a line
     *@param takes a positive integer value. That value represents number of times "#" is to be printed
     */
    public static void printHashes (int number) {
        for (int count=0; count<number; count++) {
            System.out.print("#");
        }
        System.out.println();
    }
    /**
     *prints out the number of the sum followed by a number of hashes determined by number of times that sum has occured.
     *@param 1 is an array of positive numbers
     *@param 2 is inclusive starting value of the array of positive integers
     *@param 3 is exclusive ending value os the array of positive integers
     */
    public static void printHistogram(int list [], int low, int high) {
        for (int count=low; count<high; count++) {
            System.out.print(count + " :  ");
            printHashes(list[count]);
        }
    }
    /**
     * calculates how many times a particular sum rolled.
     *@param1 is the number of sides of a dice
     *@param 2 is the number of times a dice is rolled
     *@return returns an array where slot i of the array contains the number of times the sum i was rolled.
     */
    public static int[] generateStats(int numsides,int timesroll ) {
        // counts[i] is the number of times sum i has been rolled
        int[] counts = new int[(numsides*2)+1];
        for ( int i = 0 ; i < counts.length ; i++ ) {
            counts[i] = 0;
        }

        // repeat a bunch of times
        for ( int count = 0 ; count < timesroll ; count++ ) {
            //   roll a pair of dice
            int die1 = (int)(Math.random()*numsides)+1;
            int die2 = (int)(Math.random()*numsides)+1;
            //   sum the values rolled
            int sum = die1+die2;
            //   count that sum (increment a counter)
            counts[sum]++;
        }


        return counts;
    }


}
