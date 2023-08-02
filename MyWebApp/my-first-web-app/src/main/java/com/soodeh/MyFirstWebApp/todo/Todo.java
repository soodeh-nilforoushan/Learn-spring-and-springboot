package com.soodeh.MyFirstWebApp.todo;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String userName;
    private String description;
    private LocalDate dueDate;
    private boolean done;

    public Todo(int id, String userName, String description, LocalDate dueDate, boolean done) {
        this.setId(id);
        this.setUserName(userName);
        this.setDescription(description);
        this.setDueDate(dueDate);
        this.setDone(done);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    @Override
    public String toString() {
        return "Todo [id=" + id + ", username=" + userName + ", description=" + description + ", targetDate="
                + dueDate + ", done=" + done + "]";
    }


}
