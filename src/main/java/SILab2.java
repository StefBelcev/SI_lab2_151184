import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SILab2 {
    public static List<String> function(List<String> list) {
        if (list.size() <= 0) { //B.1
            throw new IllegalArgumentException("List length should be greater than 0"); //B.2
        }
        List<String> numMines = new ArrayList<>(); //B.3
        for (int i = 0; i < list.size(); i++) { //B.4
            if (!list.get(i).equals("#")) { //B.4.1
                int num = 0; //B.4.1.1
                if (i - 1 >= 0 && list.get(i - 1).equals("#")) { //B.4.1.2
                    num++; //B.4.1.3
                }
                if (i + 1 < list.size() && list.get(i + 1).equals("#")) { //B.4.1.4
                    num++; //B.4.1.3
                }
                numMines.add(String.valueOf(num)); //B.4.1.5
            } else {// B.4.2
                numMines.add(list.get(i)); //B.4.2.1
            }
        }
        return numMines; //B.5
    }
}
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //A
        String[] minesweeper_array = input.split(" "); //A
        List<String> minesweeper_list = Arrays.asList(minesweeper_array); //A

        List<String> minesweeper_transformed; //A
        minesweeper_transformed = SILab2.function(minesweeper_list); //B
        String output_list = ""; //C
        for (String m: minesweeper_transformed){ //D
            output_list += m + " "; // E
        }
        System.out.println(output_list); // F
    }
}
