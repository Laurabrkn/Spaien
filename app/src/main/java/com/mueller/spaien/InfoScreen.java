package com.mueller.spaien;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class InfoScreen extends AppCompatActivity implements View.OnClickListener {

    // The textView field in which the long version of the rules are displayed
    TextView textView;

    //The infoText for the textView
    CharSequence infoText = "Der Name ist Programm.\n" +
            "Tipp für den Gamemaster:\n" +
            "Beim Vorlesen der Folien darauf achten, dass erst abgestimmt, gewählt oder die Aufgabe " +
            "erfüllt werden muss und erst danach die zu trinkenden/verteilenden Schlucke vorgelesen werden*\n" +
            "\n" +
            "* Das Team von SPAIEN unterstützt in keinem Fall den Konsum von Alkohol. Alkohol als " +
            "Spielgerät wird lediglich empfohlen. Das Team von SPAIEN setzt sich aktiv für die " +
            "Initiative für verantwortungsvollen Alkoholkonsum ein. Kennt euer Limit. " +
            "Alle Spieler sind dazu aufgerufen auf ihre Mitspieler aufzupassen. " +
            "Mit dem Spielen dieser App erkennt man an, selbst für die Konsequenzen des, " +
            "aus dem Spiel potentiell resultierenden Alkoholkonsums verantwortlich zu sein. " +
            "Niemals unter Alkoholeinfluss am Straßenverkehr teilnehmen. " +
            "Niemals Alkohol in Kombination mit Medikamenten oder Drogen konsumieren! " +
            "Wer sich in einer physischen, oder psychischen Ausnahmesituation befindet, " +
            "oder generell krank ist, sollte gänzlich auf Alkohol verzichten. " +
            "Hilfe und Informationen unter bzga.de. Wenn sich jemand von Begriffen, " +
            "oder Formulierungen in dieser App angegriffen fühlt entschuldigen wir uns inständig. " +
            "Dies war nie unsere Intention und wir bitten um Nachsicht, " +
            "da die App in einem humoresken Kontext entwickelt wurde. Inspiriert von PicoloApp.\n" +
            "Grüße von: L. Brunken, S. Dirks, D. Müller & D. Schroeder. Mail: spaienapp@gmail.com\n";

    // The button which start's the StartScreen and ends' the InfoScreen when touched
    ImageButton imageButton;

    StartScreen startScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            getSupportActionBar().hide();
        } catch (Exception e) {}
        setContentView(R.layout.content_infoscreen);

        textView = (TextView) findViewById(R.id.textView);
        textView.setTextSize(14);
        textView.setText(infoText);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setMaxWidth(25);
        imageButton.setMaxHeight(10);
        imageButton.setOnClickListener(this);

        startScreen = new StartScreen();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.imageButton:
                if(startScreen.getStartGameAfterInfo() == true) {
                    intent = new Intent(this, InfoShortScreen.class);
                    startActivity(intent);
                    this.finish();
                } else if (startScreen.getStartGameAfterInfo() == false){
                    intent = new Intent(this, StartScreen.class);
                    startActivity(intent);
                    this.finish();
                }
                break;
        }
    }

}
