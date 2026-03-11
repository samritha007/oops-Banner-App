public class UC5 {
    public static void main(String[] args) {

        // Define and populate the array at declaration
        String[] lines = {
            String.join(" ", " *** ", " *** ", " ***** ", " ***** "),
            String.join(" ", "** **", "** **", "** ** ", "**    "),
            String.join(" ", "** **", "** **", "** ** ", "**    "),
            String.join(" ", "** **", "** **", "***** ", " ***  "),
            String.join(" ", "** **", "** **", "**    ", "   ** "),
            String.join(" ", "** **", "** **", "**    ", "   ** "),
            String.join(" ", " *** ", " *** ", "**    ", "***** ")
        };

        // Print each line using a for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}