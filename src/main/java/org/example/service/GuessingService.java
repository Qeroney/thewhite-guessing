package org.example.service;

public interface GuessingService {
    int randomNumbers(int min, int max);

    boolean startGuessing();
    void askToPlay();
}
