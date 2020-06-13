package main;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
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
