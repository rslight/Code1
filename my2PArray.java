/**
 * Robert Lightfoot
 * CSCE 111
 * 2 d array examples
 * my2DArray
 */
public class my2PArray {
    public static void main(String[] args) {
        String[] ta = new String[]{"TA","Nikki", "Jay", "Haley","Hannah", "Neha","Quinn", "Stella",
            "Emmie", "Molly", "Nikki R", "Kirthika", "Xingyu"};
        String[] major = new String[]{"Major", "Math", "Phyc", "CS", "Math", "CS", "Comp",
            "CS", "CS", "CS", "CS", "CS", "Stat"};

        System.out.printf("\nFor each TA, thier major is: \n");
        for (int i = 1; i < major.length; i++) {
            System.out.printf("%2d. %s  \t %s.\n", i, ta[i], major[i]);
        }
        System.out.println("\nTo be a TA, do well in one of my classes and ask me if there are any openings.\n\n");
    }
    
}