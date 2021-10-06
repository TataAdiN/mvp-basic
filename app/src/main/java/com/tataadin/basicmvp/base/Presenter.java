package com.tataadin.basicmvp.base;

public interface Presenter <T extends View> {
    void onAttach(T view);
    void onDetach();
}