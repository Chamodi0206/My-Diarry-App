package com.chamodi.mydiarry;

public class ModelMyDiarry {
    private String Title, Description, Date, Directory;
    private int id;

    public ModelMyDiarry(String title, String description, String date, String directory, int id) {
        Title = title;
        Description = description;
        Date = date;
        Directory = directory;
        this.id = id;
    }

    public ModelMyDiarry(String title, String description, String date, String directory) {
        Title = title;
        Description = description;
        Date = date;
        Directory = directory;
    }

    public ModelMyDiarry() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDirectory() {
        return Directory;
    }

    public void setDirectory(String directory) {
        Directory = directory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

