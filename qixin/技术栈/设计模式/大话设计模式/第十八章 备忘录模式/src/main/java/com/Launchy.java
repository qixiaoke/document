package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class Launchy {
    public static void main(String[] args) {
        GamePerson gamePerson = new GamePerson();
        gamePerson.setState("100");

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gamePerson.save());

        gamePerson.setState("0");
        System.out.println("gamePerson state is " + gamePerson.getState());

        gamePerson.load(caretaker.getMemento());
        System.out.println("gamePerson state is " + gamePerson.getState());
    }
}
