package com.example.project4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    Switch switchAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button button, button2;
    ImageView imgPet;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        switchAgree = (Switch) findViewById(R.id.SwitchAgree);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoDog = (RadioButton) findViewById(R.id.RdoDog);
        rdoCat = (RadioButton) findViewById(R.id.RdoCat);
        rdoRabbit = (RadioButton) findViewById(R.id.RdoRabbit);

        button = (Button) findViewById(R.id.Button);
        button2 = (Button) findViewById(R.id.Button2);
        imgPet = (ImageView) findViewById(R.id.ImgPet);

        switchAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(switchAgree.isChecked() == true){
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    button.setVisibility(android.view.View.VISIBLE);
                    button2.setVisibility(android.view.View.VISIBLE);
                    imgPet.setVisibility(android.view.View.VISIBLE);
                }
                else{
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    button.setVisibility(android.view.View.INVISIBLE);
                    button2.setVisibility(android.view.View.INVISIBLE);
                    imgPet.setVisibility(android.view.View.INVISIBLE);
                }
            }

        });

        rdoDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                        imgPet.setImageResource(R.drawable.nuga);
                }
            });

        rdoCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imgPet.setImageResource(R.drawable.oreo);
            }
        });

        rdoRabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imgPet.setImageResource(R.drawable.pie);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchAgree.setChecked(false);
                rdoDog.setChecked(false);
                rdoCat.setChecked(false);
                rdoRabbit.setChecked(false);
                imgPet.setImageResource(0);
            }
        });


    }


}