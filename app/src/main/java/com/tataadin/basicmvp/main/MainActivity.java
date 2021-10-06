package com.tataadin.basicmvp.main;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.tataadin.basicmvp.R;

public class MainActivity extends AppCompatActivity implements MainView {
    private MainPresenter mainPresenter;
    private Button btnTest;
    private EditText fieldTextA, fieldTextB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTest = findViewById(R.id.btn_test);
        fieldTextA = findViewById(R.id.fieldTextA);
        fieldTextB = findViewById(R.id.fieldTextB);

        mainPresenter = new MainPresenter();
        onAttachVIew();
    }

    @Override
    public void onAttachVIew() {
        mainPresenter.onAttach(this);
        addListener();
    }

    @Override
    public void onDetachView() {
        mainPresenter.onDetach();
    }

    @Override
    public void showDataInDialog(int count) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Button Counter");
        builder.setMessage(" Button Click Count :  "+count);
        builder.show();
    }

    @Override
    public void showError() {
        Toast.makeText(this, "Error Text A dan atau Text B kosong", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSuccess() {
        Toast.makeText(this, "Text A dan Text B terisi", Toast.LENGTH_SHORT).show();
    }

    private void addListener(){
        btnTest.setOnClickListener(view ->
                mainPresenter.showData(fieldTextA.getText().toString(),fieldTextB.getText().toString())
        );
    }
}