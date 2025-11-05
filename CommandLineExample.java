public class CommandLineExample {
    public static void main(String[] args) {

        // Check if arguments are passed
        if (args.length == 0) {
            System.out.println("No command line arguments found!");
        } else {
            System.out.println("***** Command Line Arguments *****");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
