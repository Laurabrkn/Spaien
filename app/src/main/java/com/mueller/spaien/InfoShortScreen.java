package com.mueller.spaien;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class InfoShortScreen extends AppCompatActivity implements View.OnClickListener {

    // The textView field in which the short version of the rules are displayed
    TextView textView;

    //The infoText for the textView
    String infoText = "<b>- Handyverbot!</b><br />" +
            "<b>- Gamemaster ist <br /> \u0009 \u0009 Schiedsrichter</b><br />" +
            "<b>- Im Zweifel trinken</b><br />" +
            "<b>- Exen rettet</b><br />" +
            "<b>- Kein Pillepalle</b><br />";

    // The button which start's the PlayScreen and ends' the InfoShortScreen when touched
    ImageButton imageButton;
    // The button which start's the InfoScreen and ends' the InfoShortScreen when touched
    ImageButton imageButtonInfo;

    StartScreen startScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            getSupportActionBar().hide();
        } catch (Exception e) {}

        setContentView(R.layout.content_infoshortscreen);

        textView = (TextView) findViewById(R.id.textView);
        textView.setHorizontallyScrolling(true);
        textView.setText(Html.fromHtml(infoText));

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(this);

        imageButtonInfo = (ImageButton) findViewById(R.id.imageButtonInfo);
        imageButtonInfo.setOnClickListener(this);

        startScreen = new StartScreen();
        startScreen.setStartGameAfterInfo();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.imageButton:
                Intent intent = new Intent(this, PlayScreen.class);
                startActivity(intent);
                this.finish();
                break;
            case R.id.imageButtonInfo:
                intent = new Intent(this, InfoScreen.class);
                startActivity(intent);
                this.finish();
                break;
        }
    }

}
