import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean checkDuplicates(int[][] test) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int r = 0; r < test.length; r++) {
            for(int c = 0; c < test[0].length; c++) {
                numbers.add(test[r][c]);
            }
        }

        if (checkIfAllDiff(numbers)) {
            return true;
        } else {
            ArrayList<Integer> pattern = getPattern(numbers, test);

            for(int i = 0; i < numbers.size(); i++) {
                if(!numbers.get(i).equals(pattern.get(    (i + 1 % pattern.size()) - 1)  )) {
                    return false;
                }

            }

            return true;
        }


    }

    public static ArrayList<Integer> getPattern(ArrayList<Integer> list, int[][] list2) {
        int columnSize = list2[0].length;
        ArrayList<Integer> pattern = new ArrayList<>();

        for(int i = 0; i < columnSize; i++) {
            list.get(i);
        }

        return pattern;
    }

    public static boolean checkIfAllDiff(ArrayList<Integer> list) {
        Collections.sort(list);

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) == list.get(i -1)) {
                return false;
            }
        }

        return true;
    }
}
