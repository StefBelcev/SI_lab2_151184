import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SILab2 {
    public static List<String> function(List<String> list) {
        if (list.size() <= 0) {
            throw new IllegalArgumentException("List length should be greater than 0");
        }
        List<String> numMines = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals("#")) {
                int num = 0;
                if (i - 1 >= 0 && list.get(i - 1).equals("#")) {
                    num++;
                }
                if (i + 1 < list.size() && list.get(i + 1).equals("#")) {
                    num++;
                }
                numMines.add(String.valueOf(num));
            } else {
                numMines.add(list.get(i));
            }
        }
        return numMines;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] minesweeper_array = input.split(" ");
        List<String> minesweeper_list = new ArrayList<String>();
        minesweeper_list = Arrays.asList(minesweeper_array);

        List<String> minesweeper_transformed;
        minesweeper_transformed = SILab2.function(minesweeper_list);
        String output_list = "";
        for (String m: minesweeper_transformed){
            output_list += m + " ";
        }
        System.out.println(output_list);
    }
}
