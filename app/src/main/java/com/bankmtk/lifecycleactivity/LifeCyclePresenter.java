package com.bankmtk.lifecycleactivity;

public final class LifeCyclePresenter {
    private static LifeCyclePresenter instanse = null;
    private int counter;
    private LifeCyclePresenter(){
        counter = 0;
    }
    public void incrementCounter(){
        counter++;
    }
    public static LifeCyclePresenter getInstance(){
        if (instanse ==null){
            instanse = new LifeCyclePresenter();
        }
        return instanse;
    }
}
