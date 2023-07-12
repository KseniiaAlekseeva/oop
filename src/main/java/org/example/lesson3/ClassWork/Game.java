package org.example.lesson3.ClassWork;

public interface Game {
    /**
     * @param sizeWord Number of symbols in word
     * @param maxTry   Maximum number of attempts
     * @apiNote Starting new game
     */
    void start(Integer sizeWord, Integer maxTry);

    /**
     * @param value Input word
     * @return Number of bulls and cows
     * @apiNote Cheks if input word is similar to computer word and counts bulls and cows
     */
    Answer inputValue(String value);

    /**
     * @return Status of the game
     * @apiNote Returns game status
     */
    GameStatus getGameStatus();

    /**
     * @apiNote Shows the list of log records
     */
    void showLog();

    /**
     * @apiNote Suggests to restart game
     */
    void restartGame();

    /**
     * @apiNote Make a pause in game
     */
    void pauseGame();

    /**
     * @apiNote Continues the game
     */
    void continueGame();
}
