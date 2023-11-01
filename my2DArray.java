/**
 * Robert Lightfoot
 * CSCE 111
 * 2 d array examples
 * my2DArray
 */
public class my2DArray {
    public static void main(String[] args) {
        String[] instructor = new String[]{"Professor", "Robert"};
        String[] ta = new String[]{"TA","Nikki", "Jay", "Haley"};
        String[] table1 = new String[]{"Table-1", "Alex"};
        String[] table2 = new String[]{"Table-2", "Alex"};
        String[] table3 = new String[]{"Table-3", "Houston","Isaac","Owen","Mauricio"};

        String[][] myClass = new String[][]{instructor, ta, table1, table2, table3};

        for (String[] t : myClass) {
            for (String n : t) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
    
}