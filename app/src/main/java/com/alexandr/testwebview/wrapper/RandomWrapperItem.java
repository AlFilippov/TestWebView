package com.alexandr.testwebview.wrapper;

public class RandomWrapperItem {
    private int id ;
    private int icon;

    public RandomWrapperItem(int id, int icon) {
        this.id = id;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
