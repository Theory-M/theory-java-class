package pl.learn.theory.javaclass1.homework.tic_tac_toe_tablice;

import java.text.CollationElementIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // inicjalizuje rownoboczna 2-wymiarowa tablice Symboli o wielkosci/wymiarach 'size'x'size'
        Symbol[][] board = new Symbol[size][size];

        int row = sc.nextInt();
        int column = sc.nextInt();
        String xORo = sc.next();

        if (xORo.equals("x")){
            board[row][column] = new X();
        }

        System.out.println("there is an " + board[row][column] + " in cell " + row + "." + column);

//        // ulepszonym FORem wstawiam w kazde pole tej tablicy nowy Symbol() typu X()
//        for(int i = 0; i<size; i++){
//            // tablica ma dwa wymiary
//            for(int n = 0; n<size; n++) {
//                board[i][n] = new X("krzyzyk" +"."+ i+"."+ + n);
//            }
//        }
//
//        // wypisywanie zawartosci tablicy -- dwie glebokosci
//        for(int i = 0; i<size; i++) {
//            for(int n = 0; n<size; n++) {
//                System.out.println(board[i][n]);
//            }
//        }
//        System.out.println(board[1][1]);
        // przy 3x3 wygrana jest gdy:
        // rzedy
        // 0: (0.0;0.1;0.2)
        // 1: (1.0;1.1;1.2)
        // 2: (2.0;2.1;2.2)
        // kolumny
        // 0: (0.0;1.0;2.0)
        // 1: (0.1;1.1;2.1)
        // 2: (0.2;1.2;2.2)
        // przekatne
        // \: (0.0;1.1;2.2)
        // /: (2.0;1.1;0.2)
    }
}
