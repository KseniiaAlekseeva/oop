package org.example.lesson3.ClassWork;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        AbstractGame game = new EnGame();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of symbols in word and number of attempts: ");
        game.start(sc.nextInt(), sc.nextInt());
        sc.nextLine();

        while (!game.getGameStatus().equals(GameStatus.FINISH)) {
            if (game.getGameStatus().equals(GameStatus.START)) {
                System.out.println("Enter your variant or press P to pause: ");
                String value = sc.nextLine();
                Answer answer;
                if (value.toLowerCase().equals("p"))
                    game.pauseGame();
                else
                    answer = game.inputValue(value);
                if (game.getGameStatus().equals(GameStatus.FINISH)) {
                    game.showLog();
                    game.restartGame();
                }
            } else if (game.getGameStatus().equals(GameStatus.PAUSE)) {
                System.out.println("Paused. Press C to continue: ");
                if (sc.nextLine().toLowerCase().equals("c"))
                    game.continueGame();
            }
        }
    }


}
