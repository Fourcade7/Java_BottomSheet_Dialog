package com.pr7.java_bottomsheet_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    Button button;
    BottomSheetDialog bottomSheetDialog;
    LinearLayout linearLayout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button1);

        linearLayout1=findViewById(R.id.linearlay1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view1= LayoutInflater.from(getApplicationContext()).inflate(R.layout.layoutbottomsheet,linearLayout1);

                bottomSheetDialog=new BottomSheetDialog(MainActivity.this,R.style.bottomsheettheme);
                bottomSheetDialog.setContentView(view1);
                bottomSheetDialog.show();

            }
        });
    }
}