package com.tataadin.basicmvp.main;

import com.tataadin.basicmvp.base.Presenter;

public class MainPresenter implements Presenter<MainView> {
    private MainView mainView;
    private int count = 0;
    @Override
    public void onAttach(MainView view) {
        mainView = view;
    }

    @Override
    public void onDetach() {
        mainView = null;
    }

    void showData(String textA, String textB){
        if (textA.isEmpty() && textB.isEmpty()){
            mainView.showError();
        }else {
            mainView.showSuccess();
            mainView.showDataInDialog(count++);
        }
    }
}
