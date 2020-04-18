package com.mueller.spaien;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class StartScreen extends AppCompatActivity implements View.OnClickListener {

    // Contains all the player names which are inserted to the listview
    public static ArrayList<String> players;
    // A counter which helps to know how many players are in the list
    int counter;
    // A boolean for deciding  if the game should start after a player is on the InfoScreen or not
    public static boolean startGameAfterInfo;

    // The textfield field in which the user can add a player to the player list
    EditText editText;
    // The listview which contain's all the players
    ListView listView;
    // The button which start's the InfoShortScreen and ends' the StartScreen when touched
    ImageButton imageButton;
    // The button which start's the InfoScreen and ends' the StartScreen when touched
    ImageButton imageButtonInfo;
    // The textview which is shown when the player wants to start the game with just one player
    //TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            // getSupportActionBar().hide();
        } catch (Exception e) {}
        setContentView(R.layout.content_startscreen);

        // Initialize all objects and variables
        counter = 1;
        players = new ArrayList<>();
        startGameAfterInfo = false;

        editText = (EditText) findViewById(R.id.editText);
        editText.setHint("Spieler " + counter);

        // textView = (TextView) findViewById(R.id.textView);
        // textView.setText("");

        listView = (ListView) findViewById(R.id.listView);
        final CustomAdapter adapter = new CustomAdapter();
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = ((TextView) view.findViewById(R.id.listItemText)).getText().toString();
                // System.out.println(selected);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(this);

        imageButtonInfo = (ImageButton) findViewById(R.id.imageButtonInfo);
        imageButtonInfo.setOnClickListener(this);

        // Set the keylistener which handles a insert from the edittext to the listview
        editText.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View view, int keyCode, KeyEvent keyevent) {
                //If the keyevent is a key-down event on the "enter" button
                if ((keyevent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    if(!editText.getText().toString().equals("")) {
                        players.add(editText.getText().toString());
                        //System.out.println(players.get(counter - 1));
                        counter++;
                        editText.setText("");
                        editText.setHint("Spieler " + counter);
                        return true;
                    }
                }
                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.imageButton:
                /**
                if(players.size() == 0){
                    textView.setText("Trage mindestens 2 Spieler in die Liste ein!");
                    textView.setVisibility(View.VISIBLE);
                    break;
                } else if(players.size() == 1){
                    textView.setText("Such dir Freunde!");
                    textView.setVisibility(View.VISIBLE);
                    break;
                } else { */
                    intent = new Intent(this, InfoShortScreen.class);
                    startActivity(intent);
                    this.finish();
                    break;
                //}
            case R.id.imageButtonInfo:
                intent = new Intent(this, InfoScreen.class);
                startActivity(intent);
                this.finish();
                break;
        }
    }

    public ArrayList<String> getplayers() {
        return players;
    }

    public boolean getStartGameAfterInfo() {
        return startGameAfterInfo;
    }

    public void setStartGameAfterInfo() {
        this.startGameAfterInfo = true;
    }

    /**
    The adapter which handle's the listview
    */
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return players.size();
        }

        @Override
        public Object getItem(int position) {
            return players.get(position);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout, null);

            TextView textViewPlayerName = (TextView) view.findViewById(R.id.listItemText);

            textViewPlayerName.setText(players.get(i));
            return view;
        }
    }
}
