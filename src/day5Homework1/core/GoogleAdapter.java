package day5Homework1.core;

import day5Homework1.google.GoogleManager;

public class GoogleAdapter implements GoogleService {
    @Override
    public void login(String message) {
        GoogleManager manager=new GoogleManager();
        manager.log(message);
    }
}
