public class UC6 {

    // Method for letter O
    public static String[] getOPattern() {
        return new String[]{
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        };
    }

    // Method for letter P
    public static String[] getPPattern() {
        return new String[]{
            "**** ",
            "** **",
            "** **",
            "**** ",
            "**   ",
            "**   ",
            "**   "
        };
    }

    // Method for letter S
    public static String[] getSPattern() {
        return new String[]{
            " ****",
            "**   ",
            "**   ",
            " *** ",
            "   **",
            "   **",
            "**** "
        };
    }

    public static void main(String[] args) {

        // Get patterns
        String[] oPattern1 = getOPattern();
        String[] oPattern2 = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print banner
        for (int i = 0; i < oPattern1.length; i++) {
            System.out.println(oPattern1[i] + " " + oPattern2[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
}