package org.example.lesson3.ClassWork;

import java.util.*;

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    Integer maxTry;
    int currentTry;
    String computerWord;
    GameStatus gameStatus = GameStatus.INIT;
    List<String> log;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        this.computerWord = generateWord();
        System.out.println("computerWord = " + this.computerWord);
        this.gameStatus = GameStatus.START;
        this.currentTry = 0;
        this.log = new LinkedList<>();
        this.log.add((new Date()).toString() + ": Start game, computerWord - "
                + this.computerWord + ", try number - " + this.maxTry + ".");
    }

    @Override
    public Answer inputValue(String value) {
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (Character.toLowerCase(value.charAt(i)) == computerWord.charAt(i)) {
                bull++;
                cow++;
            } else if (computerWord.contains(String.valueOf(Character.toLowerCase(value.charAt(i))))) {
                cow++;
            }
        }
        currentTry++;
        Answer res = new Answer(bull, cow, currentTry);
        System.out.println("Try number - " + currentTry + " from " + maxTry + ", bulls - " + bull + ", cows - " + cow + ".");
        log.add((new Date()).toString() + ": input word - " + value + ", try number - " + currentTry
                + " from " + maxTry + ", bulls - " + bull + ", cows - " + cow + ".");

        if (sizeWord.equals(bull)) {
            gameStatus = GameStatus.FINISH;
            System.out.println("You win.");
            log.add((new Date()).toString() + ": Win game.");
        } else if (currentTry >= maxTry) {
            gameStatus = GameStatus.FINISH;
            System.out.println("No more attempts. You loose.");
            log.add((new Date()).toString() + ": Loose game.");
            return null;
        }
        return res;
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    @Override
    public void showLog() {
        for (String s : log)
            System.out.println(s);
    }

    @Override
    public void restartGame() {
        System.out.println("Restart game? Enter y - yes, n - no.");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("y"))
            start(sizeWord, maxTry);
    }

    @Override
    public void pauseGame() {
        gameStatus = GameStatus.PAUSE;
        this.log.add((new Date()).toString() + ": Paused.");
    }

    @Override
    public void continueGame() {
        gameStatus = GameStatus.START;
        this.log.add((new Date()).toString() + ": Continued.");
    }

    abstract List<String> generateCharList();

    private String generateWord() {
        List<String> charList = generateCharList();
        String res = "";
        Random rand = new Random();
        for (int i = 0; i < sizeWord; i++) {
            int randIndex = rand.nextInt(charList.size());
            res += charList.get(randIndex);
            charList.remove(randIndex);
        }
        return res;
    }
}
