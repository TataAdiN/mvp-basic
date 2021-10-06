package com.tataadin.basicmvp.main;

import com.tataadin.basicmvp.base.Presenter;
import com.tataadin.basicmvp.main.MainView;

public class MainPresenter implements Presenter<MainView> {
    private MainView mainView;
    @Override
    public void onAttach(MainView view) {
        mainView = view;
    }

    @Override
    public void onDetach() {
        mainView = null;
    }
}
