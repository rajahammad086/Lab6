// Printing the contents of args array.
// Raja Hammad Mehmood.

public class CommandlineArgs {

    public static void main ( String[] args ) {

        if (args.length == 0) {
            System.out.println("no commandline argument");
        }

        else {

            for (int count=0; count<args.length; count++) { // count variable is going to run the program  to the length of args array.
                System.out.println(args[count]);// printing every compartment of array one per line

            }

        }


    }

}
