package org.ot5usk.pages.internet.frames;

public class IFramePage {

    private final TextEditor textEditor = new TextEditor();

    public void enterTextIntoTextEditor(String text) {
        textEditor.enterText(text);
    }

    public void makeTextBoldInTextEditor() {
        textEditor.makeTextBold();
    }
}
