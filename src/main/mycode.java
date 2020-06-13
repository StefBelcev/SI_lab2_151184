package main;
import java.util.List;
import java.util.Scanner;

public class mycode {
        public String[] transform(String [] minesweeper){
            int length = minesweeper.length;
            String[] minesweeper_transformed = new String[length];
            for (int i = 0; i < minesweeper.length; i++){
                String current;
                String next;
                String previous;
                if(i == 0){
                    current = minesweeper[i];
                    next = minesweeper[i + 1];
                    if(current.equals("#")){
                        minesweeper_transformed[i] = "#";
                    } else if(current.equals("0") && next.equals("#")){
                        minesweeper_transformed[i] = "1";
                    }else{
                        minesweeper_transformed[i] = "0";
                    }
                }
                else if(i == minesweeper.length - 1){
                    current = minesweeper[i];
                    previous = minesweeper[i - 1];
                    if(current.equals("#")){
                        minesweeper_transformed[i] = "#";
                    } else if(previous.equals("#") && current.equals("0")){
                        minesweeper_transformed[i] = "1";
                    }else{
                        minesweeper_transformed[i] = "0";
                    }
                }
                else{
                    current = minesweeper[i];
                    next = minesweeper[i + 1];
                    previous = minesweeper[i - 1];
                    if(current.equals("#")){
                        minesweeper_transformed[i] = "#";
                    } else if (current.equals("0") && next.equals("#") && previous.equals("#")){
                        minesweeper_transformed[i] = "2";
                    } else if (current.equals("0") && next.equals("0") && previous.equals("#")){
                        minesweeper_transformed[i] = "1";
                    } else if (current.equals("0") && next.equals("#") && previous.equals("0")) {
                        minesweeper_transformed[i] = "1";
                    } else {
                        minesweeper_transformed[i] = "0";
                    }
                }
            }
            return minesweeper_transformed;
        }
    }
