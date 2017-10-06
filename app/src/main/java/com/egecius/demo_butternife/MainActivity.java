package com.egecius.demo_butternife;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.Optional;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.optional_text_view)
    TextView optionalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        printFields();
    }

    private void printFields() {
        Log.i("Eg:MainActivity:31", "printFields optionalTextView " + optionalTextView);
    }

    @OnClick(R.id.show_toast)
    void showToast() {
        showToast("show toast clicked");
    }

    private void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

        @OnCheckedChanged(R.id.checkBox)
    void onCheckChanged(boolean isChanged) {
        showToast("is checked " + isChanged);
    }

    /* OPTIONAL FIELDS */

    @Optional
    @OnClick(R.id.optional_button)
    void onOptionalClicked() {
        showToast("onOptionalClicked");
    }

}