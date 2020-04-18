package com.mueller.spaien;

import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * TODO
 * Vom StartScreen zum InfoScrenn und zurück ist PlayerList leer
 * Pop Up bei zu wenig Spieler (Such dir Freunde usw.)
 * Am Anfang Warnhinweis
 */

public class PlayScreen extends AppCompatActivity implements View.OnClickListener {

    // Integer variables which can be used for saving random generated numbers
    private int random1, random2, random3, random4, random5;
    // The taskbuilder for initializing all the tasks
    private TaskBuilder builder;
    // The list of all the player names
    private ArrayList<String> players;
    // A string variable which contains the last player who was on the row to execute a task
    private String lastPlayer;
    // A integer variable which contains the last rules which were activated
    private ArrayList<Integer> lastRules;
    // A integer variable which contains the last tasks which were displayed
    private ArrayList<Integer> lastTasks;
    // A counter which counts the number of rounds after a rule has been displayed
    private int ruleCounter;
    // Integer variables for saving the id from the current active rules
    private int activeRule1ID, activeRule2ID;
    // Integer variables for counting rounds in which the current active rules stay active
    private int activeRuleCounter1, activeRuleCounter2;

    // The constraint layout from the playscreen
    ConstraintLayout cLayout;
    // The textview where the tasks will be shown.
    TextView aufgabe;
    // A instance of the startscreen from where the static player list can be taken
    StartScreen startScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            getSupportActionBar().hide();
        } catch (Exception e) {}
        setContentView(R.layout.content_playscreen);

        // Set screen horizontal
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // Initialize all objects and variables
        aufgabe = (TextView) findViewById(R.id.textView);

        startScreen = new StartScreen();
        players = startScreen.getplayers();
        lastPlayer = "";
        lastRules = new ArrayList<>();
        lastTasks = new ArrayList<>();

        ruleCounter = 0;
        activeRule1ID = 0;
        activeRule2ID = 0;
        activeRuleCounter1 = 0;
        activeRuleCounter2 = 0;

        cLayout = (ConstraintLayout) findViewById(R.id.startLayout);
        cLayout.setOnClickListener(this);

        builder = new TaskBuilder();
        builder.initializeTasks();

        generateTask();
    }

    /**
    Generates a random task and checks if a rule has to be set active or deactive
    */
    public void generateTask() {
        try{
            /** Old Version of displaying rules (full functioning)
            random1 = (new Random().nextInt(750) + 1);
            Task task = builder.getTasks().get(random1);
            String s = task.getDescription();
            System.out.println(builder.getTasks().get(random1).getID());
            s = insertName(s);

            if(task.getIsRule() == true){
                    System.out.println("REGEL");
                    cLayout.setBackgroundResource(R.drawable.bg_rule);
                    aufgabe.setTypeface(null, Typeface.BOLD);
            } else {
                cLayout.setBackgroundResource(R.drawable.bg_normal);
                aufgabe.setTypeface(null, Typeface.NORMAL);
            }

            aufgabe.setText(s);
             */

            String s;
            // Check if a rule has to be set active (every 15 rounds)
            if (ruleCounter == 15) {
                random1 = (new Random().nextInt(818) + 1); //Zahl erhöhen, an die Anzahl der Tasks
                Task task;
                while(true){
                    random1 = (new Random().nextInt(818) + 1);
                    task = builder.getTasks().get(random1);
                    if(task.getIsRule() && !lastRules.contains(task.getID())){
                        System.out.println("Neue Regel: ID " + builder.getTasks().get(random1).getID());
                        break;
                    }
                }
                lastRules.add(task.getID());
                // Check which activeRuleCounter and activeRuleID has to be set
                if(activeRuleCounter1 == 0) {
                    activeRule1ID = random1 + 1;
                    activeRuleCounter1 = 1;
                } else if (activeRuleCounter2 == 0) {
                    activeRule2ID = random1 + 1;
                    activeRuleCounter2 = 1;
                } else {
                    System.out.println("NO ACTIVE RULE COUNTER IS FREE!");
                }
                // Display the rule
                //System.out.println("REGEL");
                cLayout.setBackgroundResource(R.drawable.bg_rule);
                aufgabe.setTypeface(null, Typeface.BOLD);
                s = task.getDescription();
                //System.out.println(builder.getTasks().get(random1).getID());
                s = insertName(s);
                ruleCounter = 0;

            } else{
                // Check if a rule has to be set deactive
                if (activeRuleCounter1 == 19) {
                    System.out.println("ActiveRuleID1: " + (activeRule1ID + 10000));
                    for (int i = 819; i <= 845; i++){ //size: 846
                        //System.out.print(i + " ");
                        if (builder.getTasks().get(i).getID() == (activeRule1ID + 10000)){
                            activeRule1ID = i;
                            System.out.println("ActiveRuleCounter1 is set!");
                        }
                    }
                    Task task = builder.getTasks().get(activeRule1ID);
                    System.out.println("Auflösung der Regel " + builder.getTasks().get(activeRule1ID).getID());
                    cLayout.setBackgroundResource(R.drawable.bg_rule);
                    aufgabe.setTypeface(null, Typeface.BOLD);
                    s = task.getDescription();
                    //System.out.println(builder.getTasks().get(activeRule1ID).getID());
                    activeRuleCounter1 = 0;

                } else if (activeRuleCounter2 == 19){
                    System.out.println("ActiveRuleID2: " + (activeRule2ID + 10000));
                    for (int i = 819; i <= 845; i++){ //size: 846
                        //System.out.print(i + " ");
                        if (builder.getTasks().get(i).getID() == (activeRule2ID + 10000)){
                            activeRule2ID = i;
                            System.out.println("ActiveRuleCounter2 is set!");
                        }
                    }
                    Task task = builder.getTasks().get(activeRule2ID);
                    System.out.println("Auflösung der Regel " + builder.getTasks().get(activeRule2ID).getID());
                    cLayout.setBackgroundResource(R.drawable.bg_rule);
                    aufgabe.setTypeface(null, Typeface.BOLD);
                    s = task.getDescription();
                    //System.out.println(builder.getTasks().get(activeRule2ID).getID());
                    activeRuleCounter2 = 0;

                } else { //If not, generate a random task (not a rule)
                    random1 = (new Random().nextInt(818) + 1);
                    Task task;
                    while(true){
                        random1 = (new Random().nextInt(818) + 1);
                        task = builder.getTasks().get(random1);
                        if(!task.getIsRule() && !lastTasks.contains(task.getID())){
                            System.out.println("Neuer Task: ID " + builder.getTasks().get(random1).getID());
                            break;
                        }
                    }
                    lastTasks.add(task.getID());
                    cLayout.setBackgroundResource(R.drawable.bg_normal);
                    aufgabe.setTypeface(null, Typeface.NORMAL);
                    s = task.getDescription();
                    //System.out.println("Task ID: " + builder.getTasks().get(random1).getID());
                    s = insertName(s);
                    // Increment all rulecounters
                    ruleCounter++;
                    if (activeRuleCounter1 > 0) {
                        activeRuleCounter1++;
                    }
                    if (activeRuleCounter2 > 0) {
                        activeRuleCounter2++;
                    }
                }
            }
            checkLastRules(lastRules);

            checkLastTasks(lastTasks);

            aufgabe.setText(s);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            generateTask();
        }
    }

    /**
     * Inserts one, two, three or four (or none if not needed) names in the generated task.
     * @param s The String which must be checked
     * @return The String in which the random player names are written
     */
    public String insertName(String s){

        // Check if the task description contains a "name1", if yes replace it with a name from
        // the player list
        if(s.contains("Name1")){
            random1 = (new Random().nextInt(players.size()));
            while (players.get(random1).equals(lastPlayer)) {
                random1 = (new Random().nextInt(players.size()));
            }
            //System.out.println(players.get(random1));
            s = s.replaceAll("Name1", players.get(random1));

            // Check if the task description contains a "name2", if yes replace it with a different
            // name from the player list then other
            if(s.contains("Name2")){
                random2 = new Random().nextInt(players.size());
                while (random2 == random1){
                    random2 = new Random().nextInt(players.size());
                }
                //System.out.println(players.get(random2));
                s = s.replaceAll("Name2", players.get(random2));

                // Check if the task description contains a "name3", if yes replace it with a different
                // name from the player list then other
                if(s.contains("Name3")){
                    random3 = new Random().nextInt(players.size());
                    while (random3 == random2 || random3 == random1){
                        random3 = new Random().nextInt(players.size());
                    }
                    //System.out.println(players.get(random3));
                    s = s.replaceAll("Name3", players.get(random3));

                    // Check if the task description contains a "name4", if yes replace it with a different
                    // name from the player list then other
                    if(s.contains("Name4")){
                        random4 = new Random().nextInt(players.size());
                        while (random4 == random3 || random4 == random2 || random4 == random1){
                            random4 = new Random().nextInt(players.size());
                        }
                        //System.out.println(players.get(random4));
                        s = s.replaceAll("Name4", players.get(random4));

                        // Check if the task description contains a "name5", if yes replace it with a different
                        // name from the player list then other
                        if(s.contains("Name5")) {
                            random5 = new Random().nextInt(players.size());
                            while (random5 == random4 || random5 == random3 || random5 == random2 || random5 == random1) {
                                random5 = new Random().nextInt(players.size());
                            }
                            //System.out.println(players.get(random4));
                            s = s.replaceAll("Name5", players.get(random5));
                        }
                    }
                }
            }
        }
        return s;
    }

    /**
     * Checks if the List of the last activated Rules must be emptied
     * @param lastRules The ArrayList of the last activated Rules which must be checked
     */
    private void checkLastRules(ArrayList<Integer> lastRules){
        if (lastRules.size() == 20) {
            System.out.println("LastRules-Liste ist voll (" + lastRules.size() + ")!");
            int lastRulesSize = lastRules.size();
            // For testing
            // Collections.sort(lastTasks);
            for (int i = 0; i < lastRulesSize; i++) {
                System.out.println("Lösche Regel mit der ID " + lastRules.get((lastRulesSize - i) - 1) + " aus der Liste...");
                lastRules.remove((lastRulesSize - i) - 1);
            }
        }
    }

    /**
     * Checks if the List of the last displayed Tasks must be emptied
     * @param lastTasks The ArrayList of the last displayed Tasks which must be checked
     */
    private void checkLastTasks(ArrayList<Integer> lastTasks){
        if (lastTasks.size() == 500) {
            System.out.println("LastTasks-Liste ist voll (" + lastTasks.size() + ")!");
            int lastTasksSize = lastTasks.size();
            // For testing
            // Collections.sort(lastTasks);
            for (int i = 0; i < lastTasksSize; i++) {
                System.out.println("Lösche Task mit der ID " + lastTasks.get((lastTasksSize - i) - 1) + " aus der Liste...");
                lastTasks.remove((lastTasksSize - i) - 1);
            }
        }
    }

    @Override
    public void onClick(View v){
        generateTask();
    }

}