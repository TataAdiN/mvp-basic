package com.tataadin.basicmvp.main;

import com.tataadin.basicmvp.base.View;

public interface MainView extends View {
    void showDataInDialog(int a);
    void showError();
    void showSuccess();
}
