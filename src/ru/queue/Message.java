package ru.queue;

public class Message implements Comparable<Message>{
    private String theme;
    private String text;
    private int priority;

    public Message(String theme, String text, int priority) {
        this.theme = theme;
        this.text = text;
        this.priority = priority;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString(){
        return String.format("(%d) %s\n%s", priority, theme, text);
    }

    @Override
    public int compareTo(Message alertMessage) {
        return this.priority - alertMessage.priority;
    }
}
