package com.lwu.spring.denpendency.injection;

/**
 * Created by Leon on 5/29/16.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker1, SpellChecker spellChecker2) {
        System.out.println("Inside TextEditor constructor");
        this.spellChecker = spellChecker1;
    }

    public TextEditor(int year, String name) {
        System.out.println("Inside TextEditor constructor2");
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
