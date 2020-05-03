package com.mueller.spaien;

import java.util.ArrayList;


public class TaskBuilder {

    private ArrayList<Task> tasks = new ArrayList<>();

    protected TaskBuilder(){

    }

    public void initializeTasks(){

        Task task1 = new Task(1, "Handyturm! Alle legen ihr Handy mit Internet und voller Lautstärke auf den Tisch. Die Person, die als erstes eine Benachrichtigung erhält muss 3 Schlucke trinken.", false);
        tasks.add(task1) ;

        Task task2 = new Task(2, "Name1: Hattest du schon Mal einen Finger im Po? Wenn ja: 6 Schlucke verteilen.", false);
        tasks.add(task2) ;

        Task task3 = new Task(3, "Name1, Name2 und Name3: Wer von euch hat SPAIEN auf dem Handy? Ihr dürft 4 Schlucke verteilen.", false);
        tasks.add(task3) ;

        Task task4 = new Task(4, "Handyturm! Alle legen ihr Handy mit Internet und voller Lautstärke auf den Tisch. Die Person, die als erstes eine Benachrichtigung erhält muss 5 Schlucke trinken.", false);
        tasks.add(task4) ;

        Task task5 = new Task(5, "Handyturm! Alle legen ihr Handy mit Internet und voller Lautstärke auf den Tisch. Die Person, die als erstes eine Benachrichtigung erhält darf 6 Schlucke verteilen.", false);
        tasks.add(task5) ;

        Task task6 = new Task(6, "Name1, mache ein Video für deine Instagram-/Snapchat Story und sage folgenden Text: Mein Name ist Name1, ich SPAIE und habe Spaß! Oder trinke 5 Schlucke. ", false);
        tasks.add(task6) ;

        Task task7 = new Task(7, "Jeder der schonmal an einer Bollerwagentour teilgenommen hat, trinkt 2 Schlucke.", false);
        tasks.add(task7) ;

        Task task8 = new Task(8, "REGEL \n Man darf nicht mehr auf Mitspieler zeigen.", true);
        tasks.add(task8) ;

        Task task9 = new Task(9, "REGEL \n Name1 spricht ab jetzt wie ein Asozialer.", true);
        tasks.add(task9) ;

        Task task10 = new Task(10, "Name1 und Name2: Trinkt für jedes i in eurem Vornamen einen Schluck", false);
        tasks.add(task10) ;

        Task task11 = new Task(11, "Name1, sage in 60 Sekunden das Alphabet rückwärts auf. Geschafft: 7 verteilen. Für jeden vergessenen Buchstaben einen halben Schluck trinken.", false);
        tasks.add(task11) ;

        Task task12 = new Task(12, "Name1 befüllt Name2 ein Glas mit 2 alkoholischen- und 1 nicht alkoholischen Getränk/en vom Tisch. Damit spielt Name2 weiter, oder ext eine 40/60 Mische seiner/ihrer Wahl.", false);
        tasks.add(task12) ;

        Task task13 = new Task(13, "Name1: Mache ein Foto und bearbeite es wie du willst. Niemand darf es sehen. Schicke es Name2. Name2: Skala 1-10 wie findest du es? 1-3: Name1 trinkt 4 Schlucke; 4-6: Name2 trinkt 3 Schlucke; 7-10: Name1 verteilt 6 Schlucke.", false);
        tasks.add(task13) ;

        Task task14 = new Task(14, "Name1: Wer ist am nüchternsten? Die gewählte Person trinkt 4 Schlucke.", false);
        tasks.add(task14) ;

        Task task15 = new Task(15, "Die Person links von Name1 trinkt 3 Schlucke.", false);
        tasks.add(task15) ;

        Task task16 = new Task(16, "Stimmt ab! Wer trinkt heute am meisten? Die gewählte Person darf 6 verteilen.", false);
        tasks.add(task16) ;

        Task task17 = new Task(17, "Alle Blondinen trinken 2 Schlucke.", false);
        tasks.add(task17) ;

        Task task18 = new Task(18, "Die Person rechts von Name1 trinkt 3 Schlucke.", false);
        tasks.add(task18) ;

        Task task19 = new Task(19, "Name1: Mache ein Foto und bearbeite es wie du willst. Niemand darf es sehen. Schicke es Name2. Name2: Skala 1-10 wie findest du es? 1-3: Name1 verteilt 5 Schlucke; 4-6: Name2 trinkt 2 Schlucke; 7-10: Name1 trinkt 3 Schlucke.", false);
        tasks.add(task19) ;

        Task task20 = new Task(20, "Nennt Sachen, die Name1 im Portmonee hat. Name2 beginnt.", false);
        tasks.add(task20) ;

        Task task21 = new Task(21, "Wenn ein Spieler bisher noch nie getrichtert hat, holt er/sie es jetzt nach oder ext sein/ihr Glas.", false);
        tasks.add(task21) ;

        Task task22 = new Task(22, "Wer wurde schon Mal angekotzt? Diese Mitspielenden verteilen je 4 Schlucke.", false);
        tasks.add(task22) ;

        Task task23 = new Task(23, "Name1: Trinke einen Kurzen Korn oder küsse die Person links neben dir auf den Mund.", false);
        tasks.add(task23) ;

        Task task24 = new Task(24, "Jeder der ne Brille trägt verteilt 4 Schlucke.", false);
        tasks.add(task24) ;

        Task task25 = new Task(25, "Trinke 4 Schlucke, wenn dein Handyakku bei über 70% ist.", false);
        tasks.add(task25) ;

        Task task26 = new Task(26, "Wer hat mehr als 50€ dabei? Ihr trinkt 4 Schlucke.", false);
        tasks.add(task26) ;

        Task task27 = new Task(27, "Name1 startet einen Wasserfall.", false);
        tasks.add(task27) ;

        Task task28 = new Task(28, "Name1: Wie viele Kondome hast du dabei? Für jedes 1 Schluck verteilen. Keins? 3 Schlucke trinken!", false);
        tasks.add(task28) ;

        Task task29 = new Task(29, "Name1: hast du Kippen dabei? Nein: verteile 3 Schlucke. Ja: Zerbrich jetzt 3 Zigaretten in der Mitte, oder trinke 6 Schlucke.", false);
        tasks.add(task29) ;

        Task task30 = new Task(30, "REGEL \n Name1 darf nur noch Englisch sprechen.", true);
        tasks.add(task30) ;

        Task task31 = new Task(31, "REGEL \n Name1 hält die Klappe.", true);
        tasks.add(task31) ;

        Task task32 = new Task(32, "REGEL \n Name1 darf nur noch mit norddeutschem Akzent sprechen.", true);
        tasks.add(task32) ;

        Task task33 = new Task(33, "Name1 muss Wahrheit oder Pflicht spielen. Name2 darf entscheiden was die Wahrheit bzw. Pflicht ist. Wird verweigert mit Name1 5 Schlucke trinken.", false);
        tasks.add(task33) ;

        Task task34 = new Task(34, "Alle, die mit der Zunge ihre Nase berühren können, verteilen 3 Schlucke. Vorführen!", false);
        tasks.add(task34) ;

        Task task35 = new Task(35, "Name1 verteilt einen Schluck pro weiblicher Brust unter den Mitspielenden (Max. 8) ", false);
        tasks.add(task35) ;

        Task task36 = new Task(36, "Alle Ostfriesen trinken 2 Schlucke.", false);
        tasks.add(task36) ;

        Task task37 = new Task(37, "Trinke einen Schluck, wenn du schonmal einen Deich gesehen hast.", false);
        tasks.add(task37) ;

        Task task38 = new Task(38, "Name1: Pro Stern, den du SPAIEN jetzt im Appstore gibst, darfst du 1 Schluck verteilen. Schon bewertet: 5 verteilen", false);
        tasks.add(task38) ;

        Task task39 = new Task(39, "Nennt Trinkspiele. Name1 beginnt.", false);
        tasks.add(task39) ;

        Task task40 = new Task(40, "Wer hat einen Abschlussschnitt von 3,0 oder schlechter? Verteilt 4 Schlucke.", false);
        tasks.add(task40) ;

        Task task41 = new Task(41, "Name1: Mache ein Bild für deine Story mit der Überschrift: Wow, SPAIEN! Richtig geil! Oder trinke 5 Schlucke.", false);
        tasks.add(task41) ;

        Task task42 = new Task(42, "Name1: Mache ein Bild für deine Story mit der Überschrift: Wow, SPAIEN! Richtig geil! Oder trinke 5 Schlucke.", false);
        tasks.add(task42) ;

        Task task43 = new Task(43, "Stimmt ab: Wer ist größte Opfer unter euch? Diese Person trinkt 6 Schlucke, verteilt aber auch 6.", false);
        tasks.add(task43) ;

        Task task44 = new Task(44, "Alle Studenten trinken 4 Schlucke.", false);
        tasks.add(task44) ;

        Task task45 = new Task(45, "Nennt die Namen der Mütter aller Mitspieler. Name1 beginnt. (Die eigene Mutter zählt nicht)", false);
        tasks.add(task45) ;

        Task task46 = new Task(46, "Nennt die Namen der Geschwister aller Mitspieler. Name1 beginnt. (Die eigenen Geschwister zählen nicht)", false);
        tasks.add(task46) ;

        Task task47 = new Task(47, "Die Person mit dem vollsten Glas trinkt 4 Schlucke.", false);
        tasks.add(task47) ;

        Task task48 = new Task(48, "Name1 und Name2 teilen unter sich so viele Schlucke auf, wie es Mitspielende gibt.", false);
        tasks.add(task48) ;

        Task task49 = new Task(49, "Name1, errate 6 Apps auf Name2's Handy. Wenn du es schaffst, darfst du 5 Schlucke verteilen. Wenn nicht, musst du selber trinken.", false);
        tasks.add(task49) ;

        Task task50 = new Task(50, "Trinke, wenn du schon einmal gesagt hast, dass du nie wieder Alkohol trinken wirst.", false);
        tasks.add(task50) ;

        Task task51 = new Task(51, "Name1: Mache ein Bild für deine Story mit der Überschrift: Wow, SPAIEN! Richtig geil! Oder trinke 5 Schlucke.", false);
        tasks.add(task51) ;

        Task task52 = new Task(52, "Name1: Wie oft warst du in den letzten drei Wochen betrunken? Verteile so viele Schlucke.", false);
        tasks.add(task52) ;

        Task task53 = new Task(53, "Alle, die schon mal außerhalb ihres Heimatbundeslandes gewohnt haben, trinken 4 Schlucke.", false);
        tasks.add(task53) ;

        Task task54 = new Task(54, "Stimmt ab! Wer stirbt als erstes in der Runde? Die gewählte Person trinkt 6, verteilt aber auch 6.", false);
        tasks.add(task54) ;

        Task task55 = new Task(55, "REGEL \n Gegenüber trinkt mit.", true);
        tasks.add(task55) ;

        Task task56 = new Task(56, "REGEL \n Rechts trinkt mit.", true);
        tasks.add(task56) ;

        Task task57 = new Task(57, "REGEL \n Links trinkt mit.", true);
        tasks.add(task57) ;

        Task task58 = new Task(58, "Guckt in euer Portmonee! Pro 1-Cent Stück dürft ihr 1 Schluck verteilen.", false);
        tasks.add(task58) ;

        Task task59 = new Task(59, "REGEL \n Alle müssen mit beiden Handflächen ihren Kopf berühren. Ausnahme: zum trinken.", true);
        tasks.add(task59) ;

        Task task60 = new Task(60, "Stimmt ab! Werist die dümmste und wer die schlauste Person hier?. Der Schlauste trinkt 5 Schlucke und der Dümmste verteilt 5 Schlucke.", false);
        tasks.add(task60) ;

        Task task61 = new Task(61, "Nennt Länder der Europäischen Union. Name1 beginnt.", false);
        tasks.add(task61) ;

        Task task62 = new Task(62, "Nennt Makeup Marken. Name1 beginnt.", false);
        tasks.add(task62) ;

        Task task63 = new Task(63, "Wählt unter den Mitspielern zwei Leute aus. Die beiden ausgewählten Personen müssen sich entweder küssen, oder ihr Glas exen.", false);
        tasks.add(task63) ;

        Task task64 = new Task(64, "Alle mit Heimatdörfern unter 7000 Einwohner trinken 3 Schlucke.", false);
        tasks.add(task64) ;

        Task task65 = new Task(65, "Alle, die schon mal aus einem Club/Kneipe geflogen sind, trinken 4 Schlucke.", false);
        tasks.add(task65) ;

        Task task66 = new Task(66, "Name1: Wer ist heute besser gekleidet: Name2 oder Name3? Die gewählte Person verteilt 5 Schlucke.", false);
        tasks.add(task66) ;

        Task task67 = new Task(67, "Alle, die schonmal bei einer roten Ampel stehen geblieben sind trinken 2 Schlucke.", false);
        tasks.add(task67) ;

        Task task68 = new Task(68, "Alle, die schon einmal nachsitzen mussten trinken 2 Schlucke.", false);
        tasks.add(task68) ;

        Task task69 = new Task(69, "Name1: Wer ist heute besser gekleidet: Name2 oder Name3? Die gewählte Person trinkt 4 Schlucke.", false);
        tasks.add(task69) ;

        Task task70 = new Task(70, "Alle, die schon mal bei einem Festival in einem anderen Zelt aufgewacht sind, trinken 3 Schlucke.", false);
        tasks.add(task70) ;

        Task task71 = new Task(71, "Alle, die schon mal auf einem Festival in einem Sani-Zelt behandelt werden mussten, trinken 3 Schlucke.", false);
        tasks.add(task71) ;

        Task task72 = new Task(72, "Alle Einzelkinder verteilen 4 Schlucke.", false);
        tasks.add(task72) ;

        Task task73 = new Task(73, "Name1: Erstelle ein Rangliste: Welcher Mitspielende war heute am freundlichsten zu dir? Jeder trinkt seinen Rang in Schlucken.", false);
        tasks.add(task73) ;

        Task task74 = new Task(74, "Alle Mitspieler, die schon einmal mit einander geschlafen haben, trinken 5 Schlucke vom Glas des jeweils anderen. ", false);
        tasks.add(task74) ;

        Task task75 = new Task(75, "Name1: Erstelle eine Rangliste der Mitspielenden für ein Thema, dass Name2 aussucht. Jeder trinkt seinen Rang in Schlucken.", false);
        tasks.add(task75) ;

        Task task76 = new Task(76, "Name1 verteilt so viele Schlucke, wie Plastikflaschen auf  dem Tisch stehen.", false);
        tasks.add(task76) ;

        Task task77 = new Task(77, "Name1 trinkt so viele Schlucke, wie Plastikflaschen auf dem Tisch stehen.", false);
        tasks.add(task77) ;

        Task task78 = new Task(78, "Name1 trinkt 5 Schlucke. Dein rechter Sitznachbar trinkt einen Schluck weniger usw. bis ihr bei 0 angekommen seid.", false);
        tasks.add(task78) ;

        Task task79 = new Task(79, "Alle, die schon mal am Meer waren trinken 2 Schlucke.", false);
        tasks.add(task79) ;

        Task task80 = new Task(80, "Name1: Erstelle eine Rangliste der Mitspielenden für ein Thema, dass Name2 aussucht. Jeder trinkt seinen Rang in Schlucken.", false);
        tasks.add(task80) ;

        Task task81 = new Task(81, "Stimmt ab, Aids oder Krebs. Die Verlierer trinken 3 Schlucke.", false);
        tasks.add(task81) ;

        Task task82 = new Task(82, "Alle, die mit dem Bus zur Schule fahren mussten, trinken 3 Schlucke.", false);
        tasks.add(task82) ;

        Task task83 = new Task(83, "Name1: Erstelle eine Rangliste der Mitspielenden für ein Thema, dass Name2 aussucht. Jeder trinkt seinen umgedrehten Rang (Letzter ist Erster) in Schlucken.", false);
        tasks.add(task83) ;

        Task task84 = new Task(84, "Name1: Erstelle eine Rangliste der Mitspielenden für ein Thema, dass Name2 aussucht. Jeder trinkt seinen umgedrehten Rang (Letzter ist Erster) in Schlucken.", false);
        tasks.add(task84) ;

        Task task85 = new Task(85, "Name1: Verteile so viele Schlucke, wie du sauber ausgeführte Kniebeugen mit Name2 auf dem Rücken ausführen kannst.", false);
        tasks.add(task85) ;

        Task task86 = new Task(86, "Nennt Minderheiten. Name1 beginnt.", false);
        tasks.add(task86) ;

        Task task87 = new Task(87, "Alle Studienabbrecher verteilen pro abgebrochenem Studium 3 Schlucke.", false);
        tasks.add(task87) ;

        Task task88 = new Task(88, "Alle, die schon mal die Pille danach genommen haben trinken 3 Schlucke.", false);
        tasks.add(task88) ;

        Task task89 = new Task(89, "Alle, die schon mal eine Hausarbeit geschrieben haben trinken 3 Schlucke.", false);
        tasks.add(task89) ;

        Task task90 = new Task(90, "Alle, die ein iPhone haben trinken 4 Schlucke.", false);
        tasks.add(task90) ;

        Task task91 = new Task(91, "Nennt Landkreise in Ostfriesland. Name1 beginnt.", false);
        tasks.add(task91) ;

        Task task92 = new Task(92, "Nennt Hauptstädte US Amerikanischer Staaten. Name1 beginnt.", false);
        tasks.add(task92) ;

        Task task93 = new Task(93, "Alle Menschen in einer Beziehung trinken 3 Schlucke.", false);
        tasks.add(task93) ;

        Task task94 = new Task(94, "Alle Menschen, die single sind, trinken 3 Schlucke.", false);
        tasks.add(task94) ;

        Task task95 = new Task(95, "Alle, die schonmal freiwillig in einer Kunstaustellung/ im Museum waren, verteilen 3 Schlucke.", false);
        tasks.add(task95) ;

        Task task96 = new Task(96, "Name1 summt die Melodie eines beliebigen Songs. Wer ihn zuerst errät verteilt 5 Schlucke.", false);
        tasks.add(task96) ;

        Task task97 = new Task(97, "REGEL \n Ab jetzt wird sich nur noch gesiezt!", true);
        tasks.add(task97) ;

        Task task98 = new Task(98, "REGEL \n Name1 darf ab jetzt nur noch ohne Hände trinken.", true);
        tasks.add(task98) ;

        Task task99 = new Task(99, "Name1 lässt sich von Name2 eine Backpfeife geben, oder ext sein/ihr Glas.", false);
        tasks.add(task99) ;

        Task task100 = new Task(100, "Alle die schon mal mehr als 12km am Stück gejoggt sind verteilen 3 Schlucke", false);
        tasks.add(task100) ;

        Task task101 = new Task(101, "Alle Mitspielenden, welche Name1 schon Mal auf den Mund geküsst haben, trinken 3 Schlucke.", false);
        tasks.add(task101) ;

        Task task102 = new Task(102, "Kaugummi oder Fisherman`s Friend? Stimmt ab. Die Verlierer trinkt 2 Schlucke.", false);
        tasks.add(task102) ;

        Task task103 = new Task(103, "Name1 muss für jede Wein- und Bierflasche auf dem Tisch 1 Schluck trinken. Wenn keine da sind darf Name1 5 Schlucke verteilen.", false);
        tasks.add(task103) ;

        Task task104 = new Task(104, "SHOT für den/die Jüngste/n.", false);
        tasks.add(task104) ;

        Task task105 = new Task(105, "Name1 trinkt 2 Schlucke, weil Name1 es nötig hat.", false);
        tasks.add(task105) ;

        Task task106 = new Task(106, "Name1 muss pro Karte im Portemonnaie (Bankkarte, Perso, Führerschein, etc.) 1 Schluck trinken.", false);
        tasks.add(task106) ;

        Task task107 = new Task(107, "Name1 darf pro 1-Cent-Stück im Portmonnaie 2 Schlucke verteilen.", false);
        tasks.add(task107) ;

        Task task108 = new Task(108, "Alle, die Socken tragen welche NICHT Schwarz oder weiß sind, verteilen 5 Schlucke.", false);
        tasks.add(task108) ;

        Task task109 = new Task(109, "Nennt Minister inkl. ihrer Ministerien der aktuellen Bundesregierung. Name1 beginnt.", false);
        tasks.add(task109) ;

        Task task110 = new Task(110, "Name1 singt ein Lied seiner/ihrer Wahl, oder ext sein/ihr Glas.", false);
        tasks.add(task110) ;

        Task task111 = new Task(111, "Name1, Name2 und Name3 dürfen je pro besuchtem Kontinent 1 Schluck verteilen.", false);
        tasks.add(task111) ;

        Task task112 = new Task(112, "Jeder der denkt, dass Tobias Simmering ein unfassbar geiler Kerl ist, trinkt so viel er möchte.", false);
        tasks.add(task112) ;

        Task task113 = new Task(113, "Der/Die Gastgeber/in darf 2 Shots verteilen.", false);
        tasks.add(task113) ;

        Task task114 = new Task(114, "Name1 darf für jede Wein- und Bierflasche auf dem Tisch 1 Schluck verteilen. Wenn keine da sind muss sie 5 Schlucke trinken.", false);
        tasks.add(task114) ;

        Task task115 = new Task(115, "Name1 und Name2: Verteilt pro Bundesland, in welchem ihr dieses Jahr schon eine Nacht verbracht habt einen Schluck.", false);
        tasks.add(task115) ;

        Task task116 = new Task(116, "Alle Menschen in Hemd/Bluse trinken 2 Schlucke.", false);
        tasks.add(task116) ;

        Task task117 = new Task(117, "Alle Mitspieler, die schon Mal einen Menschen des gleichen Geschlechts geküsst haben, trinken 2 Schlucke.", false);
        tasks.add(task117) ;

        Task task118 = new Task(118, "Der/die Älteste verteilt ein Viertel seines/ihres Alters an Schlucken.", false);
        tasks.add(task118) ;

        Task task119 = new Task(119, "Nennt Tiere mit Rüssel. Name1 beginnt.", false);
        tasks.add(task119) ;

        Task task120 = new Task(120, "Nennt Ostfriesische Inseln. Name1 beginnt.", false);
        tasks.add(task120) ;

        Task task121 = new Task(121,  "Wählt den/die Unsportlichste/n. Er/sie darf so viele Schlucke verteilen, wie er/sie Liegestütze vorführt.", false);
        tasks.add(task121) ;

        Task task122 = new Task(122,  "Die Person, die als letztes ihre Hand auf dem Bein von Name1 hat, trinkt 4 Schlucke.", false);
        tasks.add(task122) ;

        Task task123 = new Task(123,  "Stimmt ab! Wer hat den/die attraktivste/n Mutter/Vater. Das Kind der gewählten Person trinkt 3 Schlucke.", false);
        tasks.add(task123) ;

        Task task124 = new Task(124,  "Alle, die bei der letzten Bundestags-,Landtags-, Kommunal-, oder Europawahlen nicht gewählt haben trinken 8 Schlucke und schämen sich.", false);
        tasks.add(task124) ;

        Task task125 = new Task(125,  "Nennt Monate im Jahr. Name1 beginnt.", false);
        tasks.add(task125) ;

        Task task126 = new Task(126,  "Alle, die schon Mal in Finnland waren dürfen 5 Schlucke verteilen.", false);
        tasks.add(task126) ;

        Task task127 = new Task(127,  "Die Person, die als letztes ihre Hand auf dem Kopf von Name1 hat trinkt 4 Schlucke.", false);
        tasks.add(task127) ;

        Task task128 = new Task(128,  "Name1, lass dir von Name2 ein Getränk seiner/ihrer Wahl mischen, oder exe dein Glas", false);
        tasks.add(task128) ;

        Task task129 = new Task(129,  "Nennt Vögel. Name1 beginnt.", false);
        tasks.add(task129) ;

        Task task130 = new Task(130,  "Nennt Landeshauptstädte Deutschlands. Name1 beginnt.", false);
        tasks.add(task130) ;

        Task task131 = new Task(131,  "Pantomime! Name1 stellt ein Wort da, welches Name2 ihm sagt. Alle außer die beiden raten mit. Erraten/zu schwierig: Name2 trinkt 4 Schlucke. nicht: alle trinken 2 Schlucke außer Name2. ", false);
        tasks.add(task131) ;

        Task task132 = new Task(132,  "Name1 und Name2: Wer bekommt es schneller hin ein Obst/Gemüse zu schälen, welches gerade zur Hand ist? Der Gewinner darf 7 Schlucke verteilen.", false);
        tasks.add(task132) ;

        Task task133 = new Task(133,  "Die Person mit dem größten Bizeps verteilt 4 Schlucke.", false);
        tasks.add(task133) ;

        Task task134 = new Task(134,  "Name1 und Name2: Spielt Tip Top im Raum. der Gewinner darf 5 Schlucke verteilen.", false);
        tasks.add(task134) ;

        Task task135 = new Task(135,  "Die Person, die als letztes ihre Hand auf dem Bein von Name1 hat, trinkt 4 Schlucke.", false);
        tasks.add(task135) ;

        Task task136 = new Task(136,  "Die Person, die als letztes ihre Hand auf dem Kopf von Name1 hat, trinkt 4 Schlucke.", false);
        tasks.add(task136) ;

        Task task137 = new Task(137,  "Name1 und Name2: Kopf oder Zahl? Name3 wirft. Der Verlierer trinkt 5 Schlucke.", false);
        tasks.add(task137) ;

        Task task138 = new Task(138,  "Name1 und Name2: Kopf oder Zahl? Name3 wirft. Der Verlierer trinkt 5 Schlucke.", false);
        tasks.add(task138) ;

        Task task139 = new Task(139,  "Name1 und Name2: Kopf oder Zahl? Name3 wirft. Der Verlierer trinkt 5 Schlucke.", false);
        tasks.add(task139) ;

        Task task140 = new Task(140,  "Schätzt den Preis eines Produktes auf Amazon, welches sich Name1 aussucht. Die Person die am nähesten dran ist verteilt 6 Schlucke.", false);
        tasks.add(task140);

        Task task141 = new Task(141,  "Der Gamemaster trinkt 2 Schlucke.", false);
        tasks.add(task141);

        Task task142 = new Task(142,  "Zeit zum Aufräumen! Name1 stellt alle leeren Flaschen vom Tisch und befüllt alle leeren Gläser neu.", false);
        tasks.add(task142);

        Task task143 = new Task(143,  "REGEL \n Niemand (außer: Gamemaster) darf den Buchstaben `N´ benutzen. Für jedes `N´ 1 Schluck. ", true);
        tasks.add(task143);

        Task task144 = new Task(144,  "Nennt Trinksprüche. Name1 beginnt.", false);
        tasks.add(task144);

        Task task145 = new Task(145,  "Nennt Städte in Ostfriesland mit über 20.000 Einwohnern. Name1 beginnt.", false);
        tasks.add(task145);

        Task task146 = new Task(146,  "Nennt ganze Zahlen von 1 bis 5. Name1 beginnt. (Jeder trinkt die von ihm genannte Zahl in Schlucken)", false);
        tasks.add(task146);

        Task task147 = new Task(147,  "Name1 hat 1 Minute Zeit Name2 zum Lachen zu bringen. Gelingt das, darf er/sie 6 Schlucke verteilen. Falls nicht: 5 selbst", false);
        tasks.add(task147);

        Task task148 = new Task(148,  "Bottleflip! Name1 hat 3 Versuche eine Plastikflasche mit einer Drehung im Wurf zum Stehen zu bringen. Gelingt das: 10 Schlucke verteilen. wenn nicht 8 Schlucke selbst.", false);
        tasks.add(task148);

        Task task149 = new Task(149,  "Jeder der ein Taschentuch dabei hat verteilt 2 Schlucke.", false);
        tasks.add(task149);

        Task task150 = new Task(150,  "Nennt Lampengeschäfte. Name1 beginnt.", false);
        tasks.add(task150);

        Task task151 = new Task(151,  "Nennt ganze Zahlen von 1 bis 5. Name1 beginnt. (Jeder verteilt die von ihm genannte Zahl an Schlucken)", false);
        tasks.add(task151);

        Task task152 = new Task(152,  "Wählt die am schlechtesten gekleidetste Person im Raum. Er/sie darf 7 verteilen. ", false);
        tasks.add(task152);

        Task task153 = new Task(153,  "Name1: Ziehe nach Sachsen, oder trinke 3 Schlucke.", false);
        tasks.add(task153);

        Task task154 = new Task(154,  "Alle die noch nie einen elektrischen Schlag bekommen haben trinken 3 Schlucke, oder stecken jetzt einen Nagel in die Steckdose.", false);
        tasks.add(task154);

        Task task155 = new Task(155,  "Alle, die diesen Monat in Hamburg waren trinken", false);
        tasks.add(task155);

        Task task156 = new Task(156,  "Alle trinken so viele Schlucke, wie sie in diesem Jahr im Ausland waren", false);
        tasks.add(task156);

        Task task157 = new Task(157,  "Name1,lass dir jetzt von Name2 die Haare schneiden, oder trinke 5 Schlucke.", false);
        tasks.add(task157);

        Task task158 = new Task(158,  "Stimmt ab wer sein Glas exen soll.", false);
        tasks.add(task158);

        Task task159 = new Task(159,  "Trinkt für jedes Zwillingspaar welches ihr kennt 1 Schluck.", false);
        tasks.add(task159);

        Task task160 = new Task(160,  "Alle, die schon mal eine Glatze gestreichelt haben trinken 3 Schlucke.", false);
        tasks.add(task160);

        Task task161 = new Task(161,  "Alle, die in der Bibliothek schon einmal den Sinn ihrer Existenz hinterfragt haben, trinken 3 Schlucke.", false);
        tasks.add(task161);

        Task task162 = new Task(162,  "Name1 sucht sich einen Trinkbuddy aus.", false);
        tasks.add(task162);

        Task task163 = new Task(163,  "Name1: Stimmt ab wer sein Glas exen darf.", false);
        tasks.add(task163);

        Task task164 = new Task(164,  "Alle, deren Handy Display einen Sprung hat trinken", false);
        tasks.add(task164);

        Task task165 = new Task(165,  "Alle, die ihren Ex hassen, oder wirklich nicht mögen, trinken 2 Schlucke.", false);
        tasks.add(task165);

        Task task166 = new Task(166,  "Schätzt den Preis eines Produktes auf Amazon, welches sich Name1 aussucht. Die Person die am nähesten dran ist verteilt 6 Schlucke.", false);
        tasks.add(task166);

        Task task167 = new Task(167,  "Shots!", false);
        tasks.add(task167);

        Task task168 = new Task(168,  "Alle, die mit ihrem Ex befreundet sind, trinken 2 Schlucke.", false);
        tasks.add(task168);

        Task task169 = new Task(169,  "Name1 ex!", false);
        tasks.add(task169);

        Task task170 = new Task(170,  "Name1 ex!", false);
        tasks.add(task170);

        Task task171 = new Task(171,  "Alle deren Handy Display heile ist, trinken.", false);
        tasks.add(task171);

        Task task172 = new Task(172,  "Nennt Songs aus der aktuellen Spotify Top10 Weltweit. Name1 beginnt. Name2 kontrolliert und trinkt dafür 1 Schluck.", false);
        tasks.add(task172);

        Task task173 = new Task(173,  "Nennt Gründe, warum es besser ist single zu sein. Name1 beginnt.", false);
        tasks.add(task173);

        Task task174 = new Task(174,  "Nennt Gründe, warum es besser ist in einer Beziehung zu sein. Name1 beginnt.", false);
        tasks.add(task174);

        Task task175 = new Task(175,  "Nennt Songs aus der aktuellen Spotify Top10 Deutschland. Name1 beginnt. Name2 kontrolliert und trinkt dafür 1 Schluck.", false);
        tasks.add(task175);

        Task task176 = new Task(176,  "Name1, lass dir von Name2 3 Sekunden die Zunge ins Ohr stecken, oder trinke 5 Schlucke.", false);
        tasks.add(task176);

        Task task177 = new Task(177,  "Nennt Menschen, welche Name1 schon Mal nackt und erregt gesehen haben. Name2 beginnt.", false);
        tasks.add(task177);

        Task task178 = new Task(178,  "Die Person die als erstes den Tisch berührt, ext ihr Glas.", false);
        tasks.add(task178);

        Task task179 = new Task(179,  "Name1: Beginne mit dem Text eines Liedes. Wer nicht mehr weiter weiß trinkt 2 Schlucke.", false);
        tasks.add(task179);

        Task task180 = new Task(180,  "Name1 und Name2: Wer bekommt den weitesten Spagat hin? Führt vor, alle anderen stimmen ab! Sieger: verteilt 6. Verlierer: Selbst 3.", false);
        tasks.add(task180);

        Task task181 = new Task(181,  "Nennt Pferderassen. Name1 beginnt.", false);
        tasks.add(task181);

        Task task182 = new Task(182,  "Name1 darf 5 Schlucke verteilen.", false);
        tasks.add(task182);

        Task task183 = new Task(183,  "Name1 darf 3 Schlucke verteilen.", false);
        tasks.add(task183);

        Task task184 = new Task(184,  "Name1 darf 8 Schlucke verteilen.", false);
        tasks.add(task184);

        Task task185 = new Task(185,  "Name1 darf 10 Schlucke verteilen.", false);
        tasks.add(task185);

        Task task186 = new Task(186,  "Name1 muss 2 Schlucke trinken.", false);
        tasks.add(task186);

        Task task187 = new Task(187,  "Name1 muss 3 Schlucke trinken.", false);
        tasks.add(task187);

        Task task188 = new Task(188,  "Name1 muss 4 Schlucke trinken.", false);
        tasks.add(task188);

        Task task189 = new Task(189,  "Name1 muss 5 Schlucke trinken.", false);
        tasks.add(task189);

        Task task190 = new Task(190,  "Name1 muss 8 Schlucke trinken.", false);
        tasks.add(task190);

        Task task191 = new Task(191,  "Name1 muss 10 Schlucke trinken.", false);
        tasks.add(task191);

        Task task192 = new Task(192,  "Wer spricht die meisten Sprachen. Diese Person verteilt die Anzahl an Sprachen in Schlucken.", false);
        tasks.add(task192);

        Task task193 = new Task(193,  "Der erste Mitspielende, der den Kühlschrank berührt verteilt 5 Schlucke.", false);
        tasks.add(task193);

        Task task194 = new Task(194,  "Name1 und Name2: Daumenkampf! Der Gewinnende verteilt 4 Schlucke.", false);
        tasks.add(task194);

        Task task195 = new Task(195,  "Name1: Such dir irgendeine Flasche auf dem Tisch, welche noch Inhalt hat und trinke sie auf Ex.", false);
        tasks.add(task195);

        Task task196 = new Task(196,  "Name1 darf so viele Schlucke verteilen, wie er/sie Kniebeugen auf einem Bein vorführen kann.", false);
        tasks.add(task196);

        Task task197 = new Task(197,  "Alle, die schon mal an drei aufeinander folgenden Tagen betrunken waren trinken 2 Schlucke.", false);
        tasks.add(task197);

        Task task198 = new Task(198,  "Jeder darf so viele Schlucke verteilen, wie er/sie in diesem Jahr in der Kirche war. ", false);
        tasks.add(task198);

        Task task199 = new Task(199,  "Name1 und Name2 verteilen die Anzahl an 2 Euro Münzen die sie jeweils dabei haben.", false);
        tasks.add(task199);

        Task task200 = new Task(200, "Name1, Name2 und Name3: Trinkt die Anzahl an Zigaretten die ihr gerade dabei habt in Schlücken. (Max. 8)", false);
        tasks.add(task200);

        Task task201 = new Task(201, "GIRLPOWER! Alle Damen trinken 3 Schlucke.", false);
        tasks.add(task201);

        Task task202 = new Task(202, "EMANZIPATION! Alle Damen trinken einen Shot.", false);
        tasks.add(task202);

        Task task203 = new Task(203, "Wählt den/das größte/n Fuckboy/girl im Raum. Er/Sie trinkt 5 Schlucke.", false);
        tasks.add(task203);

        Task task204 = new Task(204, "Name1: Wie viele Bücher hast du dieses Jahr gelesen? Pro Buch ein Schluck verteilen", false);
        tasks.add(task204);

        Task task205 = new Task(205, "Name1: Mit wem würdest du am ehesten einen Dreier haben wollen? Mit Name2 und Name3, oder mit Name4 und Name5? Die gewählten Personen verteilen je 5 Schlucke", false);
        tasks.add(task205);

        Task task206 = new Task(206, "Wer einen besseren Abi-Schnitt als 3,0 hat trinkt.", false);
        tasks.add(task206);

        Task task207 = new Task(207, "Name1: Mit wem würdest du am ehesten einen Dreier haben wollen? Mit Name2 und Name3, oder mit Name4 und Name5? Die gewählten Personen verteilen je 5 Schlucke", false);
        tasks.add(task207);

        Task task208 = new Task(208, "Trinke, wenn du schon mal etwas mit jemandem hattest, der/die jünger war als du.", false);
        tasks.add(task208);

        Task task209 = new Task(209, "Trinke, wenn du schon mal etwas mit jemandem hattest, der/die älter war als du.", false);
        tasks.add(task209);

        Task task210 = new Task(210, "Nennt Angeklagte der Nürnberger Prozesse. Name1 beginnt.", false);
        tasks.add(task210);

        Task task211 = new Task(211, "Nennt Bundestagsabgeordnete der SPD. Name1 beginnt.", false);
        tasks.add(task211);

        Task task212 = new Task(212, "Name1 muss innerhalb von 90 Sekunden `Bundesinnenministerium´ rückwärts buchstabieren. Geschafft: 5 verteilen. Nicht: 4 selbst.", false);
        tasks.add(task212);

        Task task213 = new Task(213, "Stimmt ab! Wer ist der beste Mensch im Raum. Er/Sie darf 8 Schlucke verteilen.", false);
        tasks.add(task213);

        Task task214 = new Task(214, "Nennt die Schöpfenden dieser App. Name1 beginnt.", false);
        tasks.add(task214);

        Task task215 = new Task(215, "Name1! Dürresaison! EX!", false);
        tasks.add(task215);

        Task task216 = new Task(216, "Name1: Trinke für jeden Stuhl im Raum 1 Schluck. (Max. 8)", false);
        tasks.add(task216);

        Task task217 = new Task(217, "Trinkt für jede Leuchte im Raum 2 Schlucke (Max. 8)", false);
        tasks.add(task217);

        Task task218 = new Task(218, "Wer kann am besten wie ein Hund bellen? Bellt und stimmt ab. Der/Die Gewinner/in verteilt 8 Schlucke.", false);
        tasks.add(task218);

        Task task219 = new Task(219, "Wer kann am besten wie eine Katze miauen? Miaut und stimmt ab. Der/Die Gewinner/in verteilt 8 Schlucke", false);
        tasks.add(task219);

        Task task220 = new Task(220, "Wer hat die meisten Instagram Follower? Derjenige verteilt 6 Schlucke.", false);
        tasks.add(task220);

        Task task221 = new Task(221, "SHOTS für alle!", false);
        tasks.add(task221);

        Task task222 = new Task(222, "Wie viele Bücher hat Name1 diese Jahr gelesen? So viele Schlücke muss er/sie trinken.", false);
        tasks.add(task222);

        Task task223 = new Task(223, "Korn oder Korn? Stimmt ab. Alle trinken.", false);
        tasks.add(task223);

        Task task224 = new Task(224, "Name1: Poste ein Nacktbild von dir bei Instagram oder so, oder trinke 3 Schlucke", false);
        tasks.add(task224);

        Task task225 = new Task(225, "Name1: Poste ein Nacktbild von dir bei Instagram oder so, oder trinke 3 Schlucke", false);
        tasks.add(task225);

        Task task226 = new Task(226, "Name1: Zerreisse ein DinA4 Blatt in der Mitte. Für jedes Mal, dass du es vorher in der Mitte gefaltet hast, darfst du 1 Schluck verteilen. 1 Versuch.", false);
        tasks.add(task226);

        Task task227 = new Task(227, "Name1: Würfel 3 Mal mit 5 Würfeln. Für jede gleiche Augenzahl darfst du 2 Schlücke verteilen.", false);
        tasks.add(task227);

        Task task228 = new Task(228, "Name1: Würfel 3 Mal mit 5 Würfeln. Für jede gleiche Augenzahl darfst du 2 Schlücke verteilen.", false);
        tasks.add(task228);

        Task task229 = new Task(229, "Jeder rät die das Thema der Schlagzeile der aktuellen Bild.de Startseite. Name1 guckt nach und entscheidet wer falsch liegt und trinken muss.", false);
        tasks.add(task229);

        Task task230 = new Task(230, "Name1: Aus wie vielen Testamenten besteht die Bibel? So viele Schlucke darfst du verteilen.", false);
        tasks.add(task230);

        Task task231 = new Task(231, "Alle die heute mit dem Rad gefahren sind verteilen 3 Schlucke.", false);
        tasks.add(task231);

        Task task232 = new Task(232, "Name1 denkt an eine Zahl. Wer am nächsten dran ist darf 10 Schlucke verteilen. Name2 fängt an.", false);
        tasks.add(task232);

        Task task233 = new Task(233, "Pro Ikea Möbelstück im Raum muss Name1 1 Schluck trinken (Max. 6)", false);
        tasks.add(task233);

        Task task234 = new Task(234, "Pro Ikea Möbelstück im Raum darf Name1 1 Schluck verteilen (Max. 8)", false);
        tasks.add(task234);

        Task task235 = new Task(235, "Nennt Farben der polnischen Flagge. Name1 beginnt.", false);
        tasks.add(task235);

        Task task236 = new Task(236, "Wählt die Person im Raum mit dem meisten Niveau. Er/Sie verteilt 8 Schlucke.", false);
        tasks.add(task236);

        Task task237 = new Task(237, "Nennt Europäische Hauptstädte. Name1 beginnt.", false);
        tasks.add(task237);

        Task task238 = new Task(238, "Wer kann am höchsten springen? Name1 beurteilt. Wer gewinnt draf 6 Schlucke verteilen. Wer gar nicht springt trinkt 2 Schlucke.", false);
        tasks.add(task238);

        Task task239 = new Task(239, "Name1 darf 5 Schlucke verteilen.", false);
        tasks.add(task239);

        Task task240 = new Task(240, "Name1 darf 3 Schlucke verteilen.", false);
        tasks.add(task240);

        Task task241 = new Task(241, "Name1 darf 5 Schlucke verteilen.", false);
        tasks.add(task241);

        Task task242 = new Task(242, "Name1 darf 3 Schlucke verteilen.", false);
        tasks.add(task242);

        Task task243 = new Task(243, "Name1 darf 10 Schlucke verteilen.", false);
        tasks.add(task243);

        Task task244 = new Task(244, "Name1 darf 3 Schlucke verteilen.", false);
        tasks.add(task244);

        Task task245 = new Task(245, "Name1 muss 2 Schlucke trinken.", false);
        tasks.add(task245);

        Task task246 = new Task(246, "Name1 muss 3 Schlucke trinken.", false);
        tasks.add(task246);

        Task task247 = new Task(247, "Name1 muss 2 Schlucke trinken.", false);
        tasks.add(task247);

        Task task248 = new Task(248, "Name1 muss 2 Schlucke trinken.", false);
        tasks.add(task248);

        Task task249 = new Task(249, "Wer als letztes den DAUMEN auf den Tisch legt muss 2 Schlucke trinken.", false);
        tasks.add(task249);

        Task task250 = new Task(250, "Wer als letztes den DAUMEN auf den Tisch legt muss 2 Schlucke trinken.", false);
        tasks.add(task250);

        Task task251 = new Task(251, "Wer als letztes den DAUMEN auf den Tisch legt muss 2 Schlucke trinken.", false);
        tasks.add(task251);

        Task task252 = new Task(252, "Name1: Errate 3 der letzten 5 Leute mit denen Name2 auf WhatsApp geschrieben hat. Wenn du es nichts schaffst trinke 4 Schlucke.", false);
        tasks.add(task252);

        Task task253 = new Task(253, "Nennt alle US-Staaten mit `O´. Name1 beginnt.", false);
        tasks.add(task253);

        Task task254 = new Task(254, "Nennt Tiere mit Euter. Name1 beginnt.", false);
        tasks.add(task254);

        Task task255 = new Task(255, "Name1: Würfel 3 Mal mit 5 Würfeln. Für jede gleiche Augenzahl darfst du 2 Schlücke verteilen.", false);
        tasks.add(task255);

        Task task256 = new Task(256, "Name1 buchstabiere `Neighborhood´ in 60 Sekunden. Geschaft: 6 verteilen. Nicht: Trinke 2.", false);
        tasks.add(task256);

        Task task257 = new Task(257, "Name1 buchstabiere `Rückgrat´ in 60 Sekunden. Geschaft: 6 verteilen. Nicht: Trinke 2.", false);
        tasks.add(task257);

        Task task258 = new Task(258, "Name1 buchstabiere `Sisyphusarbeit´ in 60 Sekunden. Geschaft: 6 verteilen. Nicht: Trinke 2.", false);
        tasks.add(task258);

        Task task259 = new Task(259, "Name1 buchstabiere `Landmine´ in 60 Sekunden. Geschaft: 6 verteilen. Nicht: Trinke 2.", false);
        tasks.add(task259);

        Task task260 = new Task(260, "Name1 buchstabiere `Tür´ in 60 Sekunden. Geschaft: 6 verteilen. Nicht: Trinke 2.", false);
        tasks.add(task260);

        Task task261 = new Task(261, "Name1 buchstabiere `Kuh´ in 60 Sekunden. Geschaft: 6 verteilen. Nicht: Trinke 2.", false);
        tasks.add(task261);

        Task task262 = new Task(262, "Name1: Bring ein Film-Zitat! Wer den richtigen Film errät darf 6 Schlucke verteilen.", false);
        tasks.add(task262);

        Task task263 = new Task(263, "Pantomime! Name1 sagt Name2 ein Wort. Er/Sie muss es ohne Worte darstellen. Wer es in 90 Sekunden errät darf zusammen mit dem Spielenden 10 Schlucke verteilen.", false);
        tasks.add(task263);

        Task task264 = new Task(264, "Alle die keinen Fako im Glas haben trinken.", false);
        tasks.add(task264);

        Task task265 = new Task(265, "Alle die Fako im Glas haben trinken.", false);
        tasks.add(task265);

        Task task266 = new Task(266, "Alle die schon mal im Weserstadion waren trinken 2 Schlucke.", false);
        tasks.add(task266);

        Task task267 = new Task(267, "Name1 verteilt einen Shot!", false);
        tasks.add(task267);

        Task task268 = new Task(268, "Nennt ganze Zahlen von 1 bis 8. Name1 beginnt.", false);
        tasks.add(task268);

        Task task269 = new Task(269, "Wer geht dieses Jahr auf die meisten Festivals? Diese Person verteilt 5 Schlucke.", false);
        tasks.add(task269);

        Task task270 = new Task(270, "Alle Pärchen küssen sich. Wer sich als letztes küsst muss sich trennen oder 4 Schlucke trinken.", false);
        tasks.add(task270);

        Task task271 = new Task(271, "Alle die Nike tragen trinken 5 Schlucke.", false);
        tasks.add(task271);

        Task task272 = new Task(272, "Alle mit einem Anhängerführerschein trinken.", false);
        tasks.add(task272);

        Task task273 = new Task(273, "Alle ohne eigenes Auto trinken.", false);
        tasks.add(task273);

        Task task274 = new Task(274, "Alle, die schon mal eine Wattwanderung mitgemacht haben trinken.", false);
        tasks.add(task274);

        Task task275 = new Task(275, "Nennt öffentlich rechtliche Sender in Deutschland. Name1 beginnt.", false);
        tasks.add(task275);

        Task task276 = new Task(276, "Alle die Adidas tragen trinken.", false);
        tasks.add(task276);

        Task task277 = new Task(277, "Name1! Nicht schlapp machen! Trink mal lieber!", false);
        tasks.add(task277);

        Task task278 = new Task(278, "Name1: Du darfst für jede social Media App + Account, welche du jetzt von deinem Handy löschst 5 Schlucke verteilen", false);
        tasks.add(task278);

        Task task279 = new Task(279, "Name1 und Name2: Wer von euch mehr Kleidungsstücke auszieht, darf 10 Schlucke verteilen", false);
        tasks.add(task279);

        Task task280 = new Task(280, "Eine Runde REISE NACH JERUSALEM! Die Person die gewinnt darf 2 Leute bestimmen die exen müssen.", false);
        tasks.add(task280);

        Task task281 = new Task(281, "Alle trinken!", false);
        tasks.add(task281);

        Task task282 = new Task(282, "Wenn du schon mal bei einem Stadt-, oder Schützenfest gekotzt hast, trinke 2 Schlucke.", false);
        tasks.add(task282);

        Task task283 = new Task(283, "Wenn deine Eltern geschieden sind, trinke 2 Schlucke.", false);
        tasks.add(task283);

        Task task284 = new Task(284, "REGEL \n Wählt die nüchternste Person. Er/Sie muss immer +1 trinken.", true);
        tasks.add(task284);

        Task task285 = new Task(285, "Nennt geile Menschen im Raum. Name1 beginnt.", false);
        tasks.add(task285);

        Task task286 = new Task(286, "Name1: befördere Name2 in eine korrekte stabile Seitenlage. Gaschafft: Verteile 5. Nicht: Mache 1. Erste Hilfe Kurs und trinke 3.", false);
        tasks.add(task286);

        Task task287 = new Task(287, "Alle, die in den letzten zwei Jahren einen Erste Hilfe Kurs gemacht haben verteilen 5 Schlucke.", false);
        tasks.add(task287);

        Task task288 = new Task(288, "Alle mit Weisheitszähnen trinken 4 Schlucke oder ziehen sie jetzt heraus.", false);
        tasks.add(task288);

        Task task289 = new Task(289, "Wer war als letztes beim Zahnarzt? Diese Person verteilt 4 Schlucke.", false);
        tasks.add(task289);

        Task task290 = new Task(290, "Nennt Städte in Australien. Name1 beginnt.", false);
        tasks.add(task290);

        Task task291 = new Task(291, "Nennt Fußballvereine aus der 3. Bundesliga. Name1 beginnt.", false);
        tasks.add(task291);

        Task task292 = new Task(292, "Nennt aktuelle GNTM Juroren. Name1 beginnt.", false);
        tasks.add(task292);

        Task task293 = new Task(293, "Nennt US-Präsidenten auf Banknoten oder Münzen. Name1 beginnt.", false);
        tasks.add(task293);

        Task task294 = new Task(294, "Alle die größer als 1,85m sind trinken.", false);
        tasks.add(task294);

        Task task295 = new Task(295, "Alle die kleiner als 1,80m sind trinken.", false);
        tasks.add(task295);

        Task task296 = new Task(296, "Nennt NFL Teams. Name1 beginnt.", false);
        tasks.add(task296);

        Task task297 = new Task(297, "Alle, die ihren Führerschein nicht im ersten Versuch geschafft haben trinken.", false);
        tasks.add(task297);

        Task task298 = new Task(298, "Bei wem ist der letzte Zahnarztbesuch am längsten her? Diese Person macht jetzt einen Termin und trinkt 4 Schlucke.", false);
        tasks.add(task298);

        Task task299 = new Task(299, "Alle mit Katze trinken.", false);
        tasks.add(task299);

        Task task300 = new Task(300, "Alle mit Katze trinken.", false);
        tasks.add(task300);

        Task task301 = new Task(301, "Alle mit einer Allergie trinken.", false);
        tasks.add(task301);

        Task task302 = new Task(302, "Alle, die diesen Monat beim Arzt waren trinken 3 Schlucke.", false);
        tasks.add(task302);

        Task task303 = new Task(303, "Alle, die diesen Monat beim Arzt waren verteilen 3 Schlucke.", false);
        tasks.add(task303);

        Task task304 = new Task(304, "Name1 zieht ein Kleidungsstück aus, oder ext.", false);
        tasks.add(task304);

        Task task305 = new Task(305, "Name1 zieht ein Kleidungsstück aus, oder ext.", false);
        tasks.add(task305);

        Task task306 = new Task(306, "Name1 zieht ein Kleidungsstück aus, oder ext.", false);
        tasks.add(task306);

        Task task307 = new Task(307, "Name1, Name2 und Name3: Wie oft habt ihr diese Woche Fleisch gegessen? Für jedes Mal dürft ihr 1 Schluck trinken.", false);
        tasks.add(task307);

        Task task308 = new Task(308, "Alle die schon mal in einem Kanal geschwommen sind trinken.", false);
        tasks.add(task308);

        Task task309 = new Task(309, "Alle die schon mal auf einem Kanal Schlittschuh gelaufen sind trinken.", false);
        tasks.add(task309);

        Task task310 = new Task(310, "Jeder trinkt pro 100 Instagram Follower einen Schluck. (321 Follower = 3 Schlucke.)", false);
        tasks.add(task310);

        Task task311 = new Task(311, "Name1 und Name2: Wie oft habt ihr diese Woche Fleisch gegessen? Für jedes Mal dürft ihr 1 Schluck trinken.", false);
        tasks.add(task311);

        Task task312 = new Task(312, "Nennt Pornodarstellerinnen (W). Name1 beginnt.", false);
        tasks.add(task312);

        Task task313 = new Task(313, "Nennt Pornodarsteller (M). Name1 beginnt.", false);
        tasks.add(task313);

        Task task314 = new Task(314, "Alle mit HUAWEI Handy trinken.", false);
        tasks.add(task314);

        Task task315 = new Task(315, "Alle die Google nutzen trinken.", false);
        tasks.add(task315);

        Task task316 = new Task(316, "Alle die atmen trinken", false);
        tasks.add(task316);

        Task task317 = new Task(317, "Alle die von ihren Eltern schon mal beim Sex/Masturbieren erwischt wurden trinken.", false);
        tasks.add(task317);

        Task task318 = new Task(318, "Alle die schon mal im Zug gekotzt haben trinken.", false);
        tasks.add(task318);

        Task task319 = new Task(319, "Alle die schon mal ins Taxi/Auto gekotzt haben trinken.", false);
        tasks.add(task319);

        Task task320 = new Task(320, "Name1 und Name2: Macht ein Wettrennen auf einem Bein! Wenn jemand umkippt oder das zweite Bein absetzt: 3 trinken, Sieger: 6 verteilen.", false);
        tasks.add(task320);

        Task task321 = new Task(321, "Alle die schon mal Stress mit der Polizei hatten trinken.", false);
        tasks.add(task321);

        Task task322 = new Task(322, "Alle die schon mal Geburtstag hatten trinken.", false);
        tasks.add(task322);

        Task task323 = new Task(323, "Name1 und Name2: Wer kann mehr Liegestütze? Name3 zählt. Die Siegende darf 5 Schluck verteilen.", false);
        tasks.add(task323);

        Task task324 = new Task(324, "Name1 muss Name2 mit einem Deckel abwerfen. Wenn er/sie trifft muss Name2 5 Schlucke trinken. Wenn nicht muss Name1 5 Schlucke trinken.", false);
        tasks.add(task324);

        Task task325 = new Task(325, "Name1: welche/n Mitspieler/in findest du am attraktivsten? Diese Person trinkt 5 Schlucke.", false);
        tasks.add(task325);

        Task task326 = new Task(326, "Name1 entscheide dich: Name2, oder Name3? Die gewählte Person darf 6 Schlucke trinken.", false);
        tasks.add(task326);

        Task task327 = new Task(327, "Alle die Hemd tragen trinken.", false);
        tasks.add(task327);

        Task task328 = new Task(328, "Name1 entscheide dich: Name2, oder Name3? Die gewählte Person darf 7 Schlucke verteilen.", false);
        tasks.add(task328);

        Task task329 = new Task(329, "Nennt Lampenfassungen. Name1 beginnt.", false);
        tasks.add(task329);

        Task task330 = new Task(330, "Nennt Religionen. Name1 beginnt.", false);
        tasks.add(task330);

        Task task331 = new Task(331, "Nennt Städte in Russland. Name1 beginnt.", false);
        tasks.add(task331);

        Task task332 = new Task(332, "Nennt Häuser bei Game of Thrones. Name1 beginnt.", false);
        tasks.add(task332);

        Task task333 = new Task(333, "Nennt Politiker mit `G´. Name1 beginnt.", false);
        tasks.add(task333);

        Task task334 = new Task(334, "Wenn es gerade regnet, müssen Name1 und Name2 4 Schlucke trinken.", false);
        tasks.add(task334);

        Task task335 = new Task(335, "Alle die gerade trinken mussten, trinken die gleiche Anzahl nochmal.", false);
        tasks.add(task335);

        Task task336 = new Task(336, "Alle die gerade trinken mussten, trinken die gleiche Anzahl nochmal.", false);
        tasks.add(task336);

        Task task337 = new Task(337, "Wenn es gerade nicht regnet müssen Name1 und Name2 3 Schlucke trinken.", false);
        tasks.add(task337);

        Task task338 = new Task(338, "Nennt Länder in Afrika. Name1 beginnt.", false);
        tasks.add(task338);

        Task task339 = new Task(339, "Alle mit 10 Fingern trinken 2 Schlucke.", false);
        tasks.add(task339);

        Task task340 = new Task(340, "Wenn es draußen gerade über 15°C sind, müssen Name1 und Name2 3 Schlucke trinken.", false);
        tasks.add(task340);

        Task task341 = new Task(341, "Alle die schon mal eine Waffe abgefeuert haben trinken 5 Schlucke.", false);
        tasks.add(task341);

        Task task342 = new Task(342, "Wenn es draußen gerade über 20°C sind, müssen Name1 und Name2 3 Schlucke trinken.", false);
        tasks.add(task342);

        Task task343 = new Task(343, "Nennt Landkreise in Niedersachsen. Name1 beginnt.", false);
        tasks.add(task343);

        Task task344 = new Task(344, "Name1 darf so viele Schlucke verteilen, wie sie Bäume vom Sitzplatz aus sieht.", false);
        tasks.add(task344);

        Task task345 = new Task(345, "Alle die schon mal gebrannt haben trinken.", false);
        tasks.add(task345);

        Task task346 = new Task(346, "Name1 darf pro lebender Pflanze im Raum 1 Schluck verteilen. (Max. 8)", false);
        tasks.add(task346);

        Task task347 = new Task(347, "Alle die heute schon mal ihre Hände gewaschen haben trinken 2 Schlucke.", false);
        tasks.add(task347);

        Task task348 = new Task(348, "Alle die schon mal selbst ihre Klamotten gewaschen haben trinken.", false);
        tasks.add(task348);

        Task task349 = new Task(349, "Alle die bei ihren Eltern wohnen trinken 4 Schlucke.", false);
        tasks.add(task349);

        Task task350 = new Task(350, "Wählt die Person mit dem kleinstem Bizeps. Diese Person verteilt 6 Schlucke.", false);
        tasks.add(task350);

        Task task351 = new Task(351, "Alle die schon mal in einer Spielothek waren trinken 3 Schlucke.", false);
        tasks.add(task351);

        Task task352 = new Task(352, "Alle die eine eigene Wohnung haben trinken 3 Schlucke.", false);
        tasks.add(task352);

        Task task353 = new Task(353, "Nennt Brotsorten. Name1 beginnt.", false);
        tasks.add(task353);

        Task task354 = new Task(354, "Alle die heute gut gefrühstückt haben trinken 2 Schlucke.", false);
        tasks.add(task354);

        Task task355 = new Task(355, "Alle die schon mal Probleme mit ihrem Knie hatten trinken 2 Schlucke.", false);
        tasks.add(task355);

        Task task356 = new Task(356, "Alle die schon mal Operiert wurden trinken 2 Schlucke.", false);
        tasks.add(task356);

        Task task357 = new Task(357, "Alle die schon mal das Abendmahl nachgestellt haben verteilen zwei Schlucke.", false);
        tasks.add(task357);

        Task task358 = new Task(358, "Alle Mitspielenden mit einem Akademischen Titel verteilen 5 Schlucke.", false);
        tasks.add(task358);

        Task task359 = new Task(359, "Pantomime! Name1 sagt Name2 ein Wort. Er/Sie muss es ohne Worte darstellen. Wer es in 90 Sekunden errät darf zusammen mit dem Spielenden 10 Schlucke verteilen.", false);
        tasks.add(task359);

        Task task360 = new Task(360, "Alle die schon mal geblutet haben trinken.", false);
        tasks.add(task360);

        Task task361 = new Task(361, "Name1: Wer darf 10 Schlucke verteilen? Name2, oder Name3?", false);
        tasks.add(task361);

        Task task362 = new Task(362, "Alle die schon mal von Alkohol gespait haben trinken 2 Schlucke.", false);
        tasks.add(task362);

        Task task363 = new Task(363, "Stimmt ab: Wer wird heute als erstes spaien? Diese Person darf 6 Schlucke verteilen.", false);
        tasks.add(task363);

        Task task364 = new Task(364, "Nennt Rapper mit `lil´ im Namen. Name1 beginnt.", false);
        tasks.add(task364);

        Task task365 = new Task(365, "Nennt deutsche Rapperinnen. Name1 beginnt.", false);
        tasks.add(task365);

        Task task366 = new Task(366, "Nennt Nobelpreisträger. Name1 beginnt.", false);
        tasks.add(task366);

        Task task367 = new Task(367, "Nennt Lieder von Herbert Grönemeyer. Name1 beginnt.", false);
        tasks.add(task367);

        Task task368 = new Task(368, "Name1: Trinke 5 Schlucke während du dich auf einem Bein drehst.", false);
        tasks.add(task368);

        Task task369 = new Task(369, "Alle die schon mal auf einem Festival außerhalb Niedersachsens waren trinken.", false);
        tasks.add(task369);

        Task task370 = new Task(370, "Name1: Errate die Farbe der Unterwäsche von Name2. Richtig? Verteile 5. Falsch? Trinke 3.", false);
        tasks.add(task370);

        Task task371 = new Task(371, "Alle Mitspieldenen mit einem Akademischen Titel trinken 4 Schlucke.", false);
        tasks.add(task371);

        Task task372 = new Task(372, "Wer wurde am häufigsten geblitzt? Diese Person verteilt 6 Schlucke.", false);
        tasks.add(task372);

        Task task373 = new Task(373, "Alle die während des Spiels nicht ganz ehrlich waren trinken 2 Schlucke.", false);
        tasks.add(task373);

        Task task374 = new Task(374, "Nennt Städte in Brasilien. Name1 beginnt.", false);
        tasks.add(task374);

        Task task375 = new Task(375, "Nennt Grundrechte. Name1 beginnt.", false);
        tasks.add(task375);

        Task task376 = new Task(376, "Name1: Nenne in 60 Sekunden alle 10 Gebote. Schaffst du es nicht, trinke 1 Schluck für jedes fehlende Gebot.", false);
        tasks.add(task376);

        Task task377 = new Task(377, "Die letzte Person die beide Arme in der Luft hat, trinkt 4 Schlucke.", false);
        tasks.add(task377);

        Task task378 = new Task(378, "Nennt menschliche Organe. Name1 beginnt.", false);
        tasks.add(task378);

        Task task379 = new Task(379, "Name1, wann hat Name2 Geburtstag? Richtig: 5 verteilen. Faslsch: 4 selbst.", false);
        tasks.add(task379);

        Task task380 = new Task(380, "Nennt ehemalige Vereine aus der 1. Bundesliga. Name1 beginnt.", false);
        tasks.add(task380);

        Task task381 = new Task(381, "Die mit dem höchsten Bildungsabschluss dürfen 5 Schlucke verteilen.", false);
        tasks.add(task381);

        Task task382 = new Task(382, "Nennt Songs von ABBA. Name1 beginnt.", false);
        tasks.add(task382);

        Task task383 = new Task(383, "Name1, du bist ab jetzt 5 Minuten blind. Name2 stellt den Timer.", false);
        tasks.add(task383);

        Task task384 = new Task(384, "Nennt Charaktere bei Spongebob. Name1 beginnt.", false);
        tasks.add(task384);

        Task task385 = new Task(385, "Nennt Charaktere bei den Simpsons. Name1 beginnt.", false);
        tasks.add(task385);

        Task task386 = new Task(386, "Name1 und Name2: Postet den PlayStore-Link der SPAIEN App in eurer Instagram Story, oder trinkt jeder 8 Schlucke.", false);
        tasks.add(task386);

        Task task387 = new Task(387, "Alle die schon mal Sex im Auto hatten trinken.", false);
        tasks.add(task387);

        Task task388 = new Task(388, "Name1 und Name2, rechnet eure letzten 3 Amazon Bestellungen zusammen. Die mit der höheren Summe verteilt 4 Schlucke.", false);
        tasks.add(task388);

        Task task389 = new Task(389, "Alle die schon mal einen Mitspieler nackt gesehen haben trinken.", false);
        tasks.add(task389);

        Task task390 = new Task(390, "Name1: Mache einen Salto, oder trinke 3 Schlucke.", false);
        tasks.add(task390);

        Task task391 = new Task(391, "Name1: Du siehst ja wieder aus! Trink erst mal einen", false);
        tasks.add(task391);

        Task task392 = new Task(392, "Name1: Du siehst zu gut aus. Trink erst mal einen.", false);
        tasks.add(task392);

        Task task393 = new Task(393, "Name1 und Name2, rechnet eure letzten 3 Amazon Bestellungen zusammen. Die mit der niedrigeren Summe verteilt 4 Schlucke.", false);
        tasks.add(task393);

        Task task394 = new Task(394, "Alle die schon mal etwas zusammengeschweißt haben verteilen 3 Schlucke.", false);
        tasks.add(task394);

        Task task395 = new Task(395, "Name1 und Name2: Stellt eine Sexposition nach, oder ext euer Glas.", false);
        tasks.add(task395);

        Task task396 = new Task(396, "Name1: Nenne 5 Länder in denen Name2 schon mal mindestens eine Nacht geschlafen hat. Geschafft: 5 verteilen. Nicht: 4 selbst.", false);
        tasks.add(task396);

        Task task397 = new Task(397, "Stimmt ab: Lieber die Intelligenz von Name1, oder den Sexappeal von Name2 haben? Die gewählte Person verteilt 7 Schlucke.", false);
        tasks.add(task397);

        Task task398 = new Task(398, "Nennt Sternzeichen. Name1 beginnt.", false);
        tasks.add(task398);

        Task task399 = new Task(399, "Alle die diesen Monat schon gegrillt haben trinken.", false);
        tasks.add(task399);

        Task task400 = new Task(400, "Nennt Planeten. Name1 beginnt.", false);
        tasks.add(task400);

        Task task401 = new Task(401, "Nennt Fische. Name1 beginnt.", false);
        tasks.add(task401);

        Task task402 = new Task(402, "Nennt Haltestellen der S-Bahnlinie 2 in Mannheim. Name1 beginnt.", false);
        tasks.add(task402);

        Task task403 = new Task(403, "Trinke 2 Schlucke, wenn du während des Spiels, trotz Handyverbots, dein Handy rausgeholt hast.", false);
        tasks.add(task403);

        Task task404 = new Task(404, "Alle die schon mal einen Autounfall hatten trinken 3 Schlucke.", false);
        tasks.add(task404);

        Task task405 = new Task(405, "Alle die schon mal etwas geklaut haben trinken.", false);
        tasks.add(task405);

        Task task406 = new Task(406, "Alle die schon mal die 10 Gebote gebrochen haben, trinken pro gebrochenes Gebot 1 Schluck.", false);
        tasks.add(task406);

        Task task407 = new Task(407, "Nennt Parteien im Niedersächsischen Landtag. Name1 beginnt.", false);
        tasks.add(task407);

        Task task408 = new Task(408, "Alle die schon mal etwas abgeflext haben verteilen 2 Schlucke.", false);
        tasks.add(task408);

        Task task409 = new Task(409, "Nennt Haltestellen der Stadtbahnlinie 6 in Hannover. Name1 beginnt.", false);
        tasks.add(task409);

        Task task410 = new Task(410, "Name1: Sei kreativ! Wer muss wie viel wann wofür trinken?", false);
        tasks.add(task410);

        Task task411 = new Task(411, "Name1: Sei kreativ! Wer muss wie viel wann wofür trinken?", false);
        tasks.add(task411);

        Task task412 = new Task(412, "Name1: Sei kreativ! Wer muss wie viel wann wofür trinken?", false);
        tasks.add(task412);

        Task task413 = new Task(413, "Name1: Sei kreativ! Wer muss wie viel wann wofür trinken?", false);
        tasks.add(task413);

        Task task414 = new Task(414, "Name1: Verteile so viele Schlucke, wie du weiße Kleidungsstücke trägst. (Jede Socke zählt)", false);
        tasks.add(task414);

        Task task415 = new Task(415, "REGEL \n Trinkbuddys! Name1 sucht sich einen Trinkbuddy aus.", true);
        tasks.add(task415);

        Task task416 = new Task(416, "Wer kann am besten wie ein Pferd wiehern? Wiehert und stimmt ab! Die gewählte Person darf 7 Schlucke verteilen.", false);
        tasks.add(task416);

        Task task417 = new Task(417, "Wer ist der/die Lustigste? Die gewählte Person darf 8 Schlucke verteilen.", false);
        tasks.add(task417);

        Task task418 = new Task(418, "Nennt die Farben der Französischen Flagge. Name1 beginnt.", false);
        tasks.add(task418);

        Task task419 = new Task(419, "Nennt die Farben der Japanischen Flagge. Name1 beginnt.", false);
        tasks.add(task419);

        Task task420 = new Task(420, "Nennt die Farben der Schweizer Flagge. Name1 beginnt.", false);
        tasks.add(task420);

        Task task421 = new Task(421, "Alle, die schonmal auf einem Sofa gesessen haben trinken.", false);
        tasks.add(task421);

        Task task422 = new Task(422, "Alle, die an den Fingernägeln kauen, oder gekaut haben, trinken 2 Schlucke.", false);
        tasks.add(task422);

        Task task423 = new Task(423, "Alle Raucher trinken 5 Schlucke.", false);
        tasks.add(task423);

        Task task424 = new Task(424, "Alle, die auf einem Stuhl sitzen trinken.", false);
        tasks.add(task424);

        Task task425 = new Task(425, "Name1 und Nam2 lehnt euch mit dem Rücken an die Wand, Knie 90 Grad. Wer länger durchhält darf 5 Schlucke verteilen.", false);
        tasks.add(task425);

        Task task426 = new Task(426, "Nennt Länder, die mindestens 1 Mal Fußballweltmeister waren. Name1 beginnt.", false);
        tasks.add(task426);

        Task task427 = new Task(427, "Alle mit Tattoo trinken.", false);
        tasks.add(task427);

        Task task428 = new Task(428, "Alle ohne Tattoo trinken 6 Schlucke, oder lassen sich von ihrem rechten Sitznachbarn „Spaien“ auf den Arm schreiben! ", false);
        tasks.add(task428);

        Task task429 = new Task(429, "ARMDRÜCKEN! Name1 gegen Name2. Gewinner verteilt 8 Schlucke. Wird nicht gespielt, trinken beide 5 Schlucke.", false);
        tasks.add(task429);

        Task task430 = new Task(430, "Name1 und Name2: Füllt jeweils eine 1L Flasche mit Leitungswasser, Wer sie als erstes ausgetrunken hat darf 6 Schlucke verteilen.", false);
        tasks.add(task430);

        Task task431 = new Task(431, "Nennt Kinderserien aus eurer Kindheit. Name1 beginnt.", false);
        tasks.add(task431);

        Task task432 = new Task(432, "Name1: Verteile so viele Schlucke, wie du schwarze Kleidungsstücke trägst. (Jede Socke zählt)", false);
        tasks.add(task432);

        Task task433 = new Task(433, "Stimmt ab: Wer hat die schönsten Haare? Der Gewinner verteilt 5 Schlucke.", false);
        tasks.add(task433);

        Task task434 = new Task(434, "Nennt Buchstaben des Alphabets. Name1 beginnt.", false);
        tasks.add(task434);

        Task task435 = new Task(435, "Alle, die schonmal geritten sind trinken 2 Schlucke.", false);
        tasks.add(task435);

        Task task436 = new Task(436, "Name1: Zieh dein Oberteil aus, oder trinke 5 Schlucke.", false);
        tasks.add(task436);

        Task task437 = new Task(437, "Alle trinken.", false);
        tasks.add(task437);

        Task task438 = new Task(438, "Wer hat das schönste Passbild? Stimmt ab. Der Gewinner darf 8 Schlucke verteilen. Wer den Ausweis nicht zeigt trinkt 3 Schlucke.", false);
        tasks.add(task438);

        Task task439 = new Task(439, "Alle, die mehr als einen Zwischennamen haben verteilen 5 Schlucke.", false);
        tasks.add(task439);

        Task task440 = new Task(440, "Alle mit `D´ im Nachnamen verteilen 3 Schlucke.", false);
        tasks.add(task440);

        Task task441 = new Task(441, "Stimmt ab! Wen im Raum würdet ihr gerade am ehesten bitten zu gehen? Die gewählte Person trinkt 5 Schlucke.", false);
        tasks.add(task441);

        Task task442 = new Task(442, "Nennt die Zahl 8 in verschiedenen Sprachen. Name1 beginnt.", false);
        tasks.add(task442);

        Task task443 = new Task(443, "Name1 mischt Name2 ein Getränkt mit welchem Name2 weiterspielen muss.", false);
        tasks.add(task443);

        Task task444 = new Task(444, "Die Damen trinken ihre Körbchengröße in Schlücken (A=2, B=3, etc.)", false);
        tasks.add(task444);

        Task task445 = new Task(445, "Alle, deren Haare länger als schulterlang sind, trinken 3 Schlucke, oder lassen sie jetzt von Name1 abschneiden.", false);
        tasks.add(task445);

        Task task446 = new Task(446, "Name1: trinke so viele Schlucke wie du Exfreunde/innen hast.", false);
        tasks.add(task446);

        Task task447 = new Task(447, "Die letzte Person die aufsteht muss 5 Schlucke trinken.", false);
        tasks.add(task447);

        Task task448 = new Task(448, "Stimmt ab: Wer ist der beste Tänzer im Raum? Die gewählte Person trinkt tanzend 4 und verteilt 6  Schlucke.", false);
        tasks.add(task448);

        Task task449 = new Task(449, "Name1: spielt Name2 richtig mit, oder sollte er/sie mal fix mit dir einen trinken?", false);
        tasks.add(task449);

        Task task450 = new Task(450, "Name1: wer bekommt alles einen Shot?", false);
        tasks.add(task450);

        Task task451 = new Task(451, "Nennt Olympische Sportarten (Sommerspiele). Name1 beginnt.", false);
        tasks.add(task451);

        Task task452 = new Task(452, "Nennt Olympische Sportarten (Winterspiele). Name1 beginnt.", false);
        tasks.add(task452);

        Task task453 = new Task(453, "Wer kann am besten wie ein Vogel zwitschern? Zwitschert und stimmt ab! Die gewählte Person darf 7 Schlucke verteilen.", false);
        tasks.add(task453);

        Task task454 = new Task(454, "WETTSTARREN! Name1 und Name2 gucken sich in die Augen. Wer zuerst blinzelt trinkt 3 Schlucke.", false);
        tasks.add(task454);

        Task task455 = new Task(455, "Nennt Hauptbahnhöfe in Hannover. Name1 beginnt.", false);
        tasks.add(task455);

        Task task456 = new Task(456, "Nennt Hauptbahnhöfe in Mannheim. Name1 beginnt.", false);
        tasks.add(task456);

        Task task457 = new Task(457, "Name1, verteile 3 Schlucke an den/die MitspielerIn, mit welchem du am ehesten schlafen würdest, oder küsse Name2.", false);
        tasks.add(task457);

        Task task458 = new Task(458, "Jede, die jetzt hier ihren BH auszieht und Name1 gibt, darf 15 Schlucke verteilen.", false);
        tasks.add(task458);

        Task task459 = new Task(459, "Name1: trinke 10 Schlucke oder wasche dir jetzt die Hände.", false);
        tasks.add(task459);

        Task task460 = new Task(460, "REGEL \n Name1 muss alles was Name2 sagt parallel dazu in englisch übersetzen.", true);
        tasks.add(task460);

        Task task461 = new Task(461, "Name1 und Name2 tauschen Plätze.", false);
        tasks.add(task461);

        Task task462 = new Task(462, "Name1: Schneide dir einen Finger ab, oder trinke 4 Schlucke.", false);
        tasks.add(task462);

        Task task463 = new Task(463, "Name1: Schließe für 2 Minuten deine Augen, oder trinke 6 Schlucke.", false);
        tasks.add(task463);

        Task task464 = new Task(464, "Name1, exe ein Glas Milch, oder trinke 5 Schlucke.", false);
        tasks.add(task464);

        Task task465 = new Task(465, "Name1, trinke einen Schluck für jede Person im Raum.", false);
        tasks.add(task465);

        Task task466 = new Task(466, "Wer ist der/die perfekte Schwiegersohn/tochter? Stimmt ab! Die gewählte Person darf 8 Schlucke verteilen.", false);
        tasks.add(task466);

        Task task467 = new Task(467, "Name1: Beschreibe Name2 mit 10 Adjektiven (Wie-Wörtern). Pro nicht passendem Wort einen Schluck.", false);
        tasks.add(task467);

        Task task468 = new Task(468, "Alle, die kurze Socken tragen trinken 2 Schlucke.", false);
        tasks.add(task468);

        Task task469 = new Task(469, "Name1 und Name2 tauschen Plätze.", false);
        tasks.add(task469);

        Task task470 = new Task(470, "Name1: Suche dir eine Person aus, welche dir jetzt verrät wie viel du nun trinken darfst.", false);
        tasks.add(task470);

        Task task471 = new Task(471, "Hähnchen oder Pute? Stimmt ab! Die Minderheit trinkt.", false);
        tasks.add(task471);

        Task task472 = new Task(472, "Wer würde am längsten in der Wildnis überleben? Stimmt ab! Die gewählte Person darf 3 Shots verteilen.", false);
        tasks.add(task472);

        Task task473 = new Task(473, "Nennt Treckermarken. Name1 beginnt.", false);
        tasks.add(task473);

        Task task474 = new Task(474, "Name1 und Name2 tauschen Plätze.", false);
        tasks.add(task474);

        Task task475 = new Task(475, "Jeder schätzt die morgige Regenwahrscheinlichkeit auf Wetter.com (+/-5%). Name1 guckt nach. Wer falsch liegt trinkt.", false);
        tasks.add(task475);

        Task task476 = new Task(476, "Alle, die auf Zehenspitzen, ohne zu springen, die Zimmerdecke berühren können verteilen 3 Schlucke.", false);
        tasks.add(task476);

        Task task477 = new Task(477, "Name1, für jeden Euro den du jetzt Name2 überweist (PayPal o.ä.) darfst du 1 Schluck verteilen.", false);
        tasks.add(task477);

        Task task478 = new Task(478, "Nennt Städte in Polen. Name1 beginnt.", false);
        tasks.add(task478);

        Task task479 = new Task(479, "Alle, die heute Nacht nicht alleine schlafen trinken 2 Schlucke.", false);
        tasks.add(task479);

        Task task480 = new Task(480, "Name1: Wer zickt heute am meisten rum? Diese Person trinkt 4 Schlucke.", false);
        tasks.add(task480);

        Task task481 = new Task(481, "Attraktivitätsskala 1-10! Name1, wie würdest du Name2 einschätzen? Name2 darf die genannte Zahl an Schlucke verteilen.", false);
        tasks.add(task481);

        Task task482 = new Task(482, "Name1, für jeden Euro den du jetzt Name2 überweist (PayPal o.ä.) muss Name2 1 Schluck trinken.", false);
        tasks.add(task482);

        Task task483 = new Task(483, "Wem traut ihr die meisten Geschlechtskrankheiten zu? Stimmt ab! Die gewählte Person darf 4 Schlucke trinken und sich Kondome kaufen. ", false);
        tasks.add(task483);

        Task task484 = new Task(484, "Name1! Glaub an dich! Du packst das! Trinke 2 Schlucke!", false);
        tasks.add(task484);

        Task task485 = new Task(485, "Name1 und Name2: Schlagt euch gegenseitig hart auf die Schulter, oder trinkt beide 7 Schlucke.", false);
        tasks.add(task485);

        Task task486 = new Task(486, "Name1: Wau bist du schön! Das darf nicht so bleiben. Trink 3 Schlucke.", false);
        tasks.add(task486);

        Task task487 = new Task(487, "Nennt Kreisligasprüche. Name1 beginnt.", false);
        tasks.add(task487);

        Task task488 = new Task(488, "Name1: Exe dein Glas! Ne Spaß, verteile 5 Schlucke.", false);
        tasks.add(task488);

        Task task489 = new Task(489, "Nennt Kriegsjahre des zweiten Weltkriegs. Name1 beginnt.", false);
        tasks.add(task489);

        Task task490 = new Task(490, "Alle trinken so viel, wie sie Ohren haben.", false);
        tasks.add(task490);

        Task task491 = new Task(491, "Alle trinken so viel, wie sie Augenbrauen haben.", false);
        tasks.add(task491);

        Task task492 = new Task(492, "Name1 muss so viele Schlucke trinken, wie er/sie in 60 Sekunden blinzelt.", false);
        tasks.add(task492);

        Task task493 = new Task(493, "Alle die heute ein warmes Mittagessen hatten, trinken 2 Schlucke.", false);
        tasks.add(task493);

        Task task494 = new Task(494, "Nennt Tiere mit Hörnern. Name1 beginnt.", false);
        tasks.add(task494);

        Task task495 = new Task(495, "Nennt Nudelsorten. Name1 beginnt.", false);
        tasks.add(task495);

        Task task496 = new Task(496, "Nennt Haltestellen des RE1 von Norddeich-Mole nach Hannover. Name1 beginnt.", false);
        tasks.add(task496);

        Task task497 = new Task(497, "Name1: Verteile 4 Schlucke an jemanden, der heute weniger getrunken hat als du.", false);
        tasks.add(task497);

        Task task498 = new Task(498, "Name1 und Name2. Spielt Schere-Stein-Papier (Best of Three). Der Gewinner darf 7 verteilen.", false);
        tasks.add(task498);

        Task task499 = new Task(499, "Alle, die schonmal ein Kabel abisoliert haben verteilen 3 Schlucke.", false);
        tasks.add(task499);

        Task task500 = new Task(500, "Name1: Wirf Name2 5 Mal einen Snack in den Mund. Pro gefangenem Snack darf jeder von euch einen Schluck verteilen.", false);
        tasks.add(task500);

        Task task501 = new Task(501, "Die Person, welche jetzt am am meisten Prozent Akku hat, darf 4 Schlucke verteilen. (Handyverbot beachten)", false);
        tasks.add(task501);

        Task task502 = new Task(502, "Die Person, die am längsten single ist verteilt 5 Schlucke.", false);
        tasks.add(task502);

        Task task503 = new Task(503, "Alle, die jünger als Name1 sind trinken.", false);
        tasks.add(task503);

        Task task504 = new Task(504, "Name1, Kopf oder Zahl? Name2 wirft eine Münze. Richig: 4 verteilen. Falsch: 4 trinken.", false);
        tasks.add(task504);

        Task task505 = new Task(505, "Alle, die schonmal eine Person des gleichen Geschlechts geküsst haben trinken.", false);
        tasks.add(task505);

        Task task506 = new Task(506, "Name1: Stelle eine Frage. Wer sie zuerst beantwortet darf 4 Schlucke verteilen.", false);
        tasks.add(task506);

        Task task507 = new Task(507, "Alle mit blauen Augen trinken.", false);
        tasks.add(task507);

        Task task508 = new Task(508, "Alle mit braunen Augen trinken.", false);
        tasks.add(task508);

        Task task509 = new Task(509, "Alle mit grünen Augen trinken.", false);
        tasks.add(task509);

        Task task510 = new Task(510, "REGEL \n Jeder heißt ab jetzt wie sein rechter Sitznachbar!", true);
        tasks.add(task510);

        Task task511 = new Task(511, "Nennt Gemeinsamkeiten von Name1 und Name2. Name3 beginnt.", false);
        tasks.add(task511);

        Task task512 = new Task(512, "Name1, für jeden Finger, den du dir jetzt hier in den po steckst, darfst du 10 Schlucke verteilen.", false);
        tasks.add(task512);

        Task task513 = new Task(513, "Name1, für jeden Finger, welchen du dir jetzt in Körperöffnungen steckst, darfst du pro belegter Körperöffnung 2 Schlucke verteilen.", false);
        tasks.add(task513);

        Task task514 = new Task(514, "Name1, Name2 und Name3 trinken.", false);
        tasks.add(task514);

        Task task515 = new Task(515, "REGEL \n Keine Beleidigungen mehr!", true);
        tasks.add(task515);

        Task task516 = new Task(516, "Nennt Sachen in der Handtasche einer Dame. Name1 beginnt.", false);
        tasks.add(task516);

        Task task517 = new Task(517, "Jede darf so viele Schlucke verteilen wie er/sie Vokale im Vornamen hat.", false);
        tasks.add(task517);

        Task task518 = new Task(518, "Name1, trinke 2 Schlucke ohne Hände oder Arme zu benutzen.", false);
        tasks.add(task518);

        Task task519 = new Task(519, "Alle die ihren Kaffee schwarz trinken verteilen 3 Schlucke.", false);
        tasks.add(task519);

        Task task520 = new Task(520, "Geld oder Zeit? Stimmt ab! Die Minderheit trinkt.", false);
        tasks.add(task520);

        Task task521 = new Task(521, "Name1 und Name2: Tauscht eure Gläser bis beide leer sind.", false);
        tasks.add(task521);

        Task task522 = new Task(522, "Name1: Mache einen Spagat oder trinke 5 Schlucke.", false);
        tasks.add(task522);

        Task task523 = new Task(523, "Name1: Trinke 5 Schlucke während Name2 dir ins Ohr flüstert.", false);
        tasks.add(task523);

        Task task524 = new Task(524, "Jede darf so viele Schlucke verteilen, wie er/sie Vokale im Nachnamen hat.", false);
        tasks.add(task524);

        Task task525 = new Task(525, "Alle, die schon mal in einem Krankenwagen mitgefahren sind trinken.", false);
        tasks.add(task525);

        Task task526 = new Task(526, "Nennt Festivals in Deutschland. Name1 beginnt.", false);
        tasks.add(task526);

        Task task527 = new Task(527, "Alle ohne Fahrerlaubnis trinken 3 Schlucke.", false);
        tasks.add(task527);

        Task task528 = new Task(528, "REGEL \n Name1 wird komplett ignoriert.", true);
        tasks.add(task528);

        Task task529 = new Task(529, "Nennt Reime auf ein Wort, welches Name1 aussucht. Name2 beginnt.", false);
        tasks.add(task529);

        Task task530 = new Task(530, "REGEL \n Name1 darf nur noch das Gegenteil von dem sagen, was er/sie denkt.", true);
        tasks.add(task530);

        Task task531 = new Task(531, "Alle die diese Woche mehr als 100€ ausgegeben habe trinken.", false);
        tasks.add(task531);

        Task task532 = new Task(532, "Name1: Nenne in 20 Sekunden so viele Sachen wie möglich, die an Name2 scheiße sind. Für jede Sache muss Name2 einen trinken.", false);
        tasks.add(task532);

        Task task533 = new Task(533, "Alle die es nicht schaffen den oberen Rand ihres Glases in den Mund zu nehmen trinken 4 Schlucke.", false);
        tasks.add(task533);

        Task task534 = new Task(534, "REGEL \n Name1 und Name2 dürfen nur noch singend kommunizieren.", true);
        tasks.add(task534);

        Task task535 = new Task(535, "Name1, Name2, Name3: Alle die mal was geklaut haben trinken. Die Person mit dem wertvollsten Diebesgut darf 5 Schlucke verteilen.", false);
        tasks.add(task535);

        Task task536 = new Task(536, "Name1 und Name2: Wer war dieses Jahr in mehr Museen? Diese Person darf 4 Schlucke verteilen.", false);
        tasks.add(task536);

        Task task537 = new Task(537, "REGEL \n Name1 muss nach jedem Schluck das Geräusch eines Tieres machen, welches Name2 aussucht.", true);
        tasks.add(task537);

        Task task538 = new Task(538, "Trinke 5 Schlucke, wenn du SPAIEN noch nicht auf deinem Handy hast.", false);
        tasks.add(task538);

        Task task539 = new Task(539, "Nennt Naturkatastrophen. Name1 beginnt.", false);
        tasks.add(task539);

        Task task540 = new Task(540, "Name1 und Name2, wer hat größere Hände? Die Person darf 5 Schlucke verteilen.", false);
        tasks.add(task540);

        Task task541 = new Task(541, "Alle Linkshänder trinken.", false);
        tasks.add(task541);

        Task task542 = new Task(542, "Alle Rechtshänder trinken.", false);
        tasks.add(task542);

        Task task543 = new Task(543, "Die Person links von Name1 trinkt 3 Schlucke.", false);
        tasks.add(task543);

        Task task544 = new Task(544, "Alle deren Geburtstag an einem geraden Datum ist trinken.", false);
        tasks.add(task544);

        Task task545 = new Task(545, "Alle die gerade Spitze tragen trinken.", false);
        tasks.add(task545);

        Task task546 = new Task(546, "Nennt Exfreundinnen/freunde von Name1. Name2 beginnt.", false);
        tasks.add(task546);

        Task task547 = new Task(547, "Nennt Menschen, mit denen Name1 geschlafen hat. Name2 beginnt.", false);
        tasks.add(task547);

        Task task548 = new Task(548, "Alle die Gürtel tragen trinken 2 Schlucke.", false);
        tasks.add(task548);

        Task task549 = new Task(549, "Die Damen wählen eine Person aus welche 4 Schlucke trinkt.", false);
        tasks.add(task549);

        Task task550 = new Task(550, "Name1: Trinke so viele Schlucke wie du willst. Name2 muss das Doppelte trinken.", false);
        tasks.add(task550);

        Task task551 = new Task(551, "Name1: Verteile so viele Schlucke wie es Singles am Tisch gibt.", false);
        tasks.add(task551);

        Task task552 = new Task(552, "Name1: Sei kreativ und denk dir eine Kategorie aus!", false);
        tasks.add(task552);

        Task task553 = new Task(553, "Name1: Sei kreativ und denk dir eine Kategorie aus!", false);
        tasks.add(task553);

        Task task554 = new Task(554, "Name1: Sei kreativ und denk dir eine Kategorie aus!", false);
        tasks.add(task554);

        Task task555 = new Task(555, "Name1: Sei kreativ und denk dir eine Kategorie aus!", false);
        tasks.add(task555);

        Task task556 = new Task(556, "Nennt Notrufnummern. Name1 beginnt.", false);
        tasks.add(task556);

        Task task557 = new Task(557, "Nennt Buchhandlungen. Name1 beginnt.", false);
        tasks.add(task557);

        Task task558 = new Task(558, "Nennt Wahrzeichen europäischer Städte inkl. der Stadt. Name1 beginnt.", false);
        tasks.add(task558);

        Task task559 = new Task(559, "Nennt Sportartikelhersteller. Name1 beginnt.", false);
        tasks.add(task559);

        Task task560 = new Task(560, "Nennt Möbelhäuser. Name1 beginnt.", false);
        tasks.add(task560);

        Task task561 = new Task(561, "Nennt Menschen in diesem Raum. Name1 beginnt.", false);
        tasks.add(task561);

        Task task562 = new Task(562, "Nennt Dörfer und Städte mit „Moor“ im Namen. Name1 beginnt. ", false);
        tasks.add(task562);

        Task task563 = new Task(563, "Name1, bekommst du deine komplette Hand in den Mund? Vorführen! Ja: 8 verteilen. Nein: 4 selbst trinken.", false);
        tasks.add(task563);

        Task task564 = new Task(564, "Name1 muss die Handfläche von Name2 ablecken, oder 5 Schlucke trinken.", false);
        tasks.add(task564);

        Task task565 = new Task(565, "Name1: Trinke ein rohes Ei oder 6 Schlucke.", false);
        tasks.add(task565);

        Task task566 = new Task(566, "Alle die gerade eine Kette tragen trinken.", false);
        tasks.add(task566);

        Task task567 = new Task(567, "Stimmt ab! Wer wird als letztes Vater/Mutter? Die Gewählte Person trinkt 4 Schlucke.", false);
        tasks.add(task567);

        Task task568 = new Task(568, "Nennt Alstern in Hamburg. Name1 beginnt.", false);
        tasks.add(task568);

        Task task569 = new Task(569, "Nennt Studienabbrecher im Raum. Name1 beginnt.", false);
        tasks.add(task569);

        Task task570 = new Task(570, "Wer als erstes sein Oberteil auszieht, es auf links dreht und dann wieder anzieht, darf 2 Leute bestimmen die exen müssen.", false);
        tasks.add(task570);

        Task task571 = new Task(571, "Nennt Chipssorten. Name1 beginnt.", false);
        tasks.add(task571);

        Task task572 = new Task(572, "Name1 und Name2: Wer war dieses Jahr auf mehr Konzerten? Diese Person darf 5 Schlucke verteilen.", false);
        tasks.add(task572);

        Task task573 = new Task(573, "Wer hat den längsten Snapchat streak? Die Person verteilt 6 Schlucke.", false);
        tasks.add(task573);

        Task task574 = new Task(574, "Name1: Zünde deine Kopfhaare an oder trinke 2 Schlucke.", false);
        tasks.add(task574);

        Task task575 = new Task(575, "Wer hat diese Woche am meisten Sport gemacht? Diese Person trinkt 4 Schlucke.", false);
        tasks.add(task575);

        Task task576 = new Task(576, "Alle Vegetarier/Veganer trinken einen Shot!", false);
        tasks.add(task576);

        Task task577 = new Task(577, "Wer als erstes sein Glas ext, darf jemanden bestimmen der sein Glas exen muss.", false);
        tasks.add(task577);

        Task task578 = new Task(578, "Nennt Inseln in Europa. Name1 beginnt.", false);
        tasks.add(task578);

        Task task579 = new Task(579, "Nennt Farben von Bananen. Name1 beginnt.", false);
        tasks.add(task579);

        Task task580 = new Task(580, "Wer ist heute am frühesten aufgestanden? Diese Person verteilt 7 Schlucke.", false);
        tasks.add(task580);

        Task task581 = new Task(581, "Wer ist heute am spätesten aufgestanden? Diese Person trinkt 3 Schlucke.", false);
        tasks.add(task581);

        Task task582 = new Task(582, "Nennt Ziffern der Zahl Pi. Name1 beginnt.", false);
        tasks.add(task582);

        Task task583 = new Task(583, "Die Person die am schnellsten der Raum verlässt verteilt 7 Schlucke.", false);
        tasks.add(task583);

        Task task584 = new Task(584, "Wer ist cooler? Name1 oder Name2? Stimmt ab! Die gewählte Person verteilt 4 Schlucke.", false);
        tasks.add(task584);

        Task task585 = new Task(585, "Wer ist heißer? Name1 oder Name2? Stimmt ab! Die gewählte Person verteilt 4 Schlucke.", false);
        tasks.add(task585);

        Task task586 = new Task(586, "Wer ist gewaltbereiter? Name1 oder Name2? Stimmt ab! Die gewählte Person verteilt 4 Schlucke.", false);
        tasks.add(task586);

        Task task587 = new Task(587, "Wer ist gemeiner? Name1 oder Name2? Stimmt ab! Die gewählte Person trinkt 3 Schlucke.", false);
        tasks.add(task587);

        Task task588 = new Task(588, "Wer ist der größere Moralapostel? Name1 oder Name2? Stimmt ab! Die gewählte Person trinkt 3 Schlucke.", false);
        tasks.add(task588);

        Task task589 = new Task(589, "Name1 und Name2: Wer war dieses Jahr häufiger in Sportstadien? Diese Person darf 4 Schlucke verteilen.", false);
        tasks.add(task589);

        Task task590 = new Task(590, "Alle, die schonmal eine Kartoffel gegessen haben trinken.", false);
        tasks.add(task590);

        Task task591 = new Task(591, "Wer als erstes sein Glas ext, darf jemanden bestimmen der sein Glas exen muss.", false);
        tasks.add(task591);

        Task task592 = new Task(592, "Wer als erstes sein Glas ext, darf jemanden bestimmen der sein Glas exen muss..", false);
        tasks.add(task592);

        Task task593 = new Task(593, "Name1 versucht 4 Mal einen Snack im hohen Bogen mit dem Mund zu fangen. Pro gefangenem Snack darf er/sie 2 Schlucke verteilen.", false);
        tasks.add(task593);

        Task task594 = new Task(594, "Pro Katze im Raum darf Name1 4 Schlucke verteilen.", false);
        tasks.add(task594);

        Task task595 = new Task(595, "REGEL \n Name1 muss beim trinken Name2 anfassen.", true);
        tasks.add(task595);

        Task task596 = new Task(596, "Nennt Kartoffelgerichte. Name1 beginnt.", false);
        tasks.add(task596);

        Task task597 = new Task(597, "Alle die heute nicht Geburtstag haben trinken.", false);
        tasks.add(task597);

        Task task598 = new Task(598, "Name1 muss einen Shot aus dem Buchnabel von Name2 trinken oder exen!", false);
        tasks.add(task598);

        Task task599 = new Task(599, "Name1 muss einen Shot aus dem Bauchnabel von Name2 trinken oder exen!", false);
        tasks.add(task599);

        Task task600 = new Task(600, "Name1 muss einen Shot aus dem Bauchnabel von Name2 trinken oder exen!", false);
        tasks.add(task600);

        Task task601 = new Task(601, "Alle trinken so viel wie sie Hoden haben.", false);
        tasks.add(task601);

        Task task602 = new Task(602, "Alle trinken so viel wie sie Eierstöcke haben.", false);
        tasks.add(task602);

        Task task603 = new Task(603, "Nennt Zaubersprüche bei Harry Potter. Name1 beginnt.", false);
        tasks.add(task603);

        Task task604 = new Task(604, "Steht Wasser auf dem Tisch? Wenn ja trinkt Name1 4 Schlucke.", false);
        tasks.add(task604);

        Task task605 = new Task(605, "Name1: Lass dir von Name2 einen Unterarm oder einen Unterschenkel rasieren, oder trinke 6 Schlucke.", false);
        tasks.add(task605);

        Task task606 = new Task(606, "Stimmt ab: Wer wäre der bessere Partner für Name1? Name2 oder Name3? Die gewählte Person küsst Name1 oder verteilt 7 Schlucke.", false);
        tasks.add(task606);

        Task task607 = new Task(607, "Nennt Baumarkte. Name1 beginnt.", false);
        tasks.add(task607);

        Task task608 = new Task(608, "Die nächste Person die Name1 in die Augen sieht muss 4 Schlucke trinken.", false);
        tasks.add(task608);

        Task task609 = new Task(609, "Alle deren Handy auf dem Tisch liegt trinken.", false);
        tasks.add(task609);

        Task task610 = new Task(610, "Name1: Verteile so viele Schlucke wie du Geschwister hast.", false);
        tasks.add(task610);

        Task task611 = new Task(611, "Alle Herren trinken 2 Schlucke.", false);
        tasks.add(task611);

        Task task612 = new Task(612, "Alle Damen trinken 2 Schlucke.", false);
        tasks.add(task612);

        Task task613 = new Task(613, "Nennt Dinge die man in Name1s Nachttisch findet. Name2 beginnt.", false);
        tasks.add(task613);

        Task task614 = new Task(614, "Der letzte der den Tisch berührt muss 3 Schlucke trinken.", false);
        tasks.add(task614);

        Task task615 = new Task(615, "Name1, tritt durch den Tisch, oder trinke 4 Schlucke.", false);
        tasks.add(task615);

        Task task616 = new Task(616, "Die Person die heute als letztes dazu gestoßen ist trinkt 5 Schlucke.", false);
        tasks.add(task616);

        Task task617 = new Task(617, "REGEL \n Name1 darf nur sprechen, wenn Name2 es erlaubt", true);
        tasks.add(task617);

        Task task618 = new Task(618, "Name1, verteile 5 Schlucke an eine Person die intelligenter ist als du, oder trinke selbst 5 Schlucke.", false);
        tasks.add(task618);

        Task task619 = new Task(619, "Wer ist nüchterner? Name1 oder Name2? Die gewählte Person trinkt 5 Schlucke.", false);
        tasks.add(task619);

        Task task620 = new Task(620, "Alle, die schonmal in der Zeitung erwähnt wurden trinken.", false);
        tasks.add(task620);

        Task task621 = new Task(621, "Wenn die Socken von Name1 schwarz sind, muss Name2 trinken.", false);
        tasks.add(task621);

        Task task622 = new Task(622, "Die Person, die als letzte ihre Füße vom Boden hebt trinkt 3 Schlucke.", false);
        tasks.add(task622);

        Task task623 = new Task(623, "Die Person, die als erstes mit dem Bauch auf dem Boden liegt verteilt 8 Schlucke.", false);
        tasks.add(task623);

        Task task624 = new Task(624, "Name1 und Name2: Wer hat diese Woche häufiger einen Staubsauger bedient? Diese Person darf 5 Schlucke verteilen.", false);
        tasks.add(task624);

        Task task625 = new Task(625, "Die Person, der das SPAIEN-Handy gehört verteilt 8 Schlucke.", false);
        tasks.add(task625);

        Task task626 = new Task(626, "Nennt Zutaten für einen Fanta-Korn. Name1 beginnt.", false);
        tasks.add(task626);

        Task task627 = new Task(627, "Wer war als letztes Schwimmen? Diese Person verteilt 4 Schlucke.", false);
        tasks.add(task627);

        Task task628 = new Task(628, "Alle die SPAIEN einem Freund weiterempfehlen würden verteilen 1 Schluck.", false);
        tasks.add(task628);

        Task task629 = new Task(629, "Name1 darf 5 Schlucke verteilen.", false);
        tasks.add(task629);

        Task task630 = new Task(630, "Name1 darf 3 Schlucke verteilen.", false);
        tasks.add(task630);

        Task task631 = new Task(631, "Name1 darf 5 Schlucke verteilen.", false);
        tasks.add(task631);

        Task task632 = new Task(632, "Name1 darf 8 Schlucke verteilen.", false);
        tasks.add(task632);

        Task task633 = new Task(633, "Name1 darf 3 Schlucke verteilen.", false);
        tasks.add(task633);

        Task task634 = new Task(634, "Name1 muss 2 Schlucke trinken.", false);
        tasks.add(task634);

        Task task635 = new Task(635, "Name1 muss 3 Schlucke trinken.", false);
        tasks.add(task635);

        Task task636 = new Task(636, "Name1 muss 4 Schlucke trinken.", false);
        tasks.add(task636);

        Task task637 = new Task(637, "Name1 muss 3 Schlucke trinken.", false);
        tasks.add(task637);

        Task task638 = new Task(638, "Name1 muss 2 Schlucke trinken.", false);
        tasks.add(task638);

        Task task639 = new Task(639, "Name1: Lass dir einen Zahn ziehen oder trinke 4 Schlucke.", false);
        tasks.add(task639);

        Task task640 = new Task(640, "Name1: Zieh dein Oberteil aus oder trinke 5 Schlucke.", false);
        tasks.add(task640);

        Task task641 = new Task(641, "Name1: Zieh dein Oberteil aus oder trinke 5 Schlucke.", false);
        tasks.add(task641);

        Task task642 = new Task(642, "Name1: Zieh dein Oberteil aus oder trinke 5 Schlucke.", false);
        tasks.add(task642);

        Task task643 = new Task(643, "Name1: Massiere Name2 2 Minuten den Nacken, oder trinke 3 Schlucke.", false);
        tasks.add(task643);

        Task task644 = new Task(644, "Name1 und Name2 trinken pro Leuchte im Raum 1 Schluck.", false);
        tasks.add(task644);

        Task task645 = new Task(645, "Der letzte der den Kopf auf den Tisch haut muss 4 Schlucke trinken.", false);
        tasks.add(task645);

        Task task646 = new Task(646, "REGEL \n Es darf nur noch getrunken werden, wenn beim trinken ein Sitznachbar angefasst wird.", true);
        tasks.add(task646);

        Task task647 = new Task(647, "Stimmt ab: Wer wäre der bessere Partner für Name1? Name2 oder Name3? Die gewählte Person küsst Name1 oder trinkt 6 Schlucke.", false);
        tasks.add(task647);

        Task task648 = new Task(648, "Die Person mit den meisten Haaren am Körper trinkt 5 Schlucke.", false);
        tasks.add(task648);

        Task task649 = new Task(649, "Alle die gerade Ohrring tragen trinken die Anzahl an Ohrringen die sie tragen.", false);
        tasks.add(task649);

        Task task650 = new Task(650, "Name1: Wenn du beschnitten bist verteile 4 Schlucke. Wenn nicht, lasse dich von Name2 beschneiden oder trinke 4 Schlucke.", false);
        tasks.add(task650);

        Task task651 = new Task(651, "Name1, verteile 4 Schlucke an eine Person die mehr wiegt als du.", false);
        tasks.add(task651);

        Task task652 = new Task(652, "Name1, trink 3 Schlucke aus dem Glas von Name2.", false);
        tasks.add(task652);

        Task task653 = new Task(653, "Nennt Länder in denen Name1 schonmal war. Name2 beginnt.", false);
        tasks.add(task653);

        Task task654 = new Task(654, "Alle die heute noch in einen Club gehen trinken 2 Schlucke.", false);
        tasks.add(task654);

        Task task655 = new Task(655, "Name1: Wem würdest du eher dein Kind anvertrauen, Name2 oder Name3? Die gewählte Person darf 6 Schlucke verteilen.", false);
        tasks.add(task655);

        Task task656 = new Task(656, "Wen würdet ihr eher mit auf eine einsame Insel mitnehmen? Name1 oder Name2? Stimmt ab! Die gewählte Person darf 5 Schlucke verteilen.", false);
        tasks.add(task656);

        Task task657 = new Task(657, "Alle die ein Instrument spielen trinken.", false);
        tasks.add(task657);

        Task task658 = new Task(658, "Nennt Lieder von Helene Fischer. Name1 beginnt.", false);
        tasks.add(task658);

        Task task659 = new Task(659, "Wer war als letztes beim Zahnarzt? Diese Person darf 5 Schlucke verteilen.", false);
        tasks.add(task659);

        Task task660 = new Task(660, "Name1 und Name2: Wer sitzt als erstes auf dem Schoß von Name3? Die Person darf 6 Schlucke verteilen.", false);
        tasks.add(task660);

        Task task661 = new Task(661, "Alle, die sich gerade weiter als 100km von ihrem Wohnsitz befinden, verteilen 8 Schlucke.", false);
        tasks.add(task661);

        Task task662 = new Task(662, "Mit wem würdet ihr eher in den Krieg ziehen? Name1 oder Name2? Die gewählte Person darf 5 Schlucke verteilen.", false);
        tasks.add(task662);

        Task task663 = new Task(663, "Wer wäre der bessere Bestatter? Name1 oder Name2? Die gewählte Person darf 5 Schlucke verteilen.", false);
        tasks.add(task663);

        Task task664 = new Task(664, "Wer hatte als letztes einen Sparschäler in der Hand? Diese Person darf 3 Schlucke verteilen.", false);
        tasks.add(task664);

        Task task665 = new Task(665, "Nennt Ozeane. Name1 beginnt.", false);
        tasks.add(task665);

        Task task666 = new Task(666, "Name1 muss zwei volle Gläaser Wasser exen.", false);
        tasks.add(task666);

        Task task667 = new Task(667, "Nennt Städte in Brandenburg. Name1 beginnt.", false);
        tasks.add(task667);

        Task task668 = new Task(668, "Nennt Fortbewegungsmittel mit Propeller. Name1 beginnt.", false);
        tasks.add(task668);

        Task task669 = new Task(669, "Nennt Möbel mit Scharnier. Name1 beginnt.", false);
        tasks.add(task669);

        Task task670 = new Task(670, "Nennt berühmte Brücken. Name1 beginnt.", false);
        tasks.add(task670);

        Task task671 = new Task(671, "SHOTS!", false);
        tasks.add(task671);

        Task task672 = new Task(672, "SHOTS!", false);
        tasks.add(task672);

        Task task673 = new Task(673, "SHOTS!", false);
        tasks.add(task673);

        Task task674 = new Task(674, "SHOTS!", false);
        tasks.add(task674);

        Task task675 = new Task(675, "SHOTS!", false);
        tasks.add(task675);

        Task task676 = new Task(676, "Alle außer Name1 trinken.", false);
        tasks.add(task676);

        Task task677 = new Task(677, "Die Person, die am nähesten zur Tür sitzt, trinkt 4 Schlucke.", false);
        tasks.add(task677);

        Task task678 = new Task(678, "Die Person, die als erstes einer ihrer Socken auf dem Kopf hat, verteilt 7 Schlucke.", false);
        tasks.add(task678);

        Task task679 = new Task(679, "Der/Die Erste der/die ab jetzt lacht trinkt 4 Schlucke.", false);
        tasks.add(task679);

        Task task680 = new Task(680, "Die Person, die als erstes mit einem Bein auf dem Stuhl steht, verteilt 8 Schlucke.", false);
        tasks.add(task680);

        Task task681 = new Task(681, "Die Person rechts von Name1 verteilt 5 Schlucke.", false);
        tasks.add(task681);

        Task task682 = new Task(682, "Wer führt gerade am meisten Bargeld mit sich? Diese Person verteilt 5 Schlucke und gibt Einen aus!", false);
        tasks.add(task682);

        Task task683 = new Task(683, "Nennt Städte in Polen. Name1 beginnt.", false);
        tasks.add(task683);

        Task task684 = new Task(684, "Die Person links von Name1 verteilt 6 Schlucke.", false);
        tasks.add(task684);

        Task task685 = new Task(685, "Nennt Hauptcharaktere bei How I Met Your Mother. Name1 beginnt.", false);
        tasks.add(task685);

        Task task686 = new Task(686, "Nennt Hauptcharaktere bei Friends. Name1 beginnt.", false);
        tasks.add(task686);

        Task task687 = new Task(687, "Nennt Bahnhöfe in Ostfriesland. Name1 beginnt.", false);
        tasks.add(task687);

        Task task688 = new Task(688, "Name1: Verteile 2 Shots.", false);
        tasks.add(task688);

        Task task689 = new Task(689, "Nennt Griechische Buchstaben. Name1 beginnt.", false);
        tasks.add(task689);

        Task task690 = new Task(690, "Name1: Spiele ohne Worte eine Filmszene nach. Wer den Film in 60 Sekunden errät darf mit dir 8 Schlucke verteilen.", false);
        tasks.add(task690);

        Task task691 = new Task(691, "Die Person rechts von Name1 trinkt 5 Schlucke.", false);
        tasks.add(task691);

        Task task692 = new Task(692, "Name1: Stecke einen Nagel mit bloßer Hand in die Steckdose oder trinke 3 Schlucke. ", false);
        tasks.add(task692);

        Task task693 = new Task(693, "Nennt Wildkatzen. Name1 beginnt.", false);
        tasks.add(task693);

        Task task694 = new Task(694, "Nennt Länder in Großbritannien. Name1 beginnt.", false);
        tasks.add(task694);

        Task task695 = new Task(695, "Nennt ausgestorbene Tiere. Name1 beginnt.", false);
        tasks.add(task695);

        Task task696 = new Task(696, "Die Person links von Name1 trinkt 4 Schlucke.", false);
        tasks.add(task696);

        Task task697 = new Task(697, "REGEL \n Jeder heißt ab jetzt wie sein linker Sitznachbar.", true);
        tasks.add(task697);

        Task task698 = new Task(698, "Name1, Name2, Name3 und Name4 befüllen ein Todesglas. Der Name, der als nächstes bei SPAIEN genannt wird, darf entscheiden wer es trinken muss.", false);
        tasks.add(task698);

        Task task699 = new Task(699, "Name1, Name2, Name3 und Name4 befüllen ein Todesglas. Der Name, der als nächstes bei SPAIEN genannt wird, darf entscheiden wer es trinken muss.", false);
        tasks.add(task699);

        Task task700 = new Task(700, "Alle, die schonmal einen Wildunfall hatten trinken.", false);
        tasks.add(task700);

        Task task701 = new Task(701, "Alle, die schonmal selbst ein Möbelstück gebaut haben trinken.", false);
        tasks.add(task701);

        Task task702 = new Task(702, "Nennt Sachen, die Name1 im Portemonnaie hat. Name2 beginnt.", false);
        tasks.add(task702);

        Task task703 = new Task(703, "Nennt Sponsoren auf Trikots von Vereinen der 1. Bundesliga. Name1 beginnt.", false);
        tasks.add(task703);

        Task task704 = new Task(704, "Wenn Name1 es schafft, eine volle Flasche 30 Sekunden auf seinem/ihrem Kopf zu balancieren, darf er/sie 5 Schlucke verteilen.", false);
        tasks.add(task704);

        Task task705 = new Task(705, "REGEL \n Name1 ist Fragenmeister. Wer auf seine/ihre Frage antwortet muss trinken.", true);
        tasks.add(task705);

        Task task706 = new Task(706, "Nennt Künstler (Maler). Name1 beginnt.", false);
        tasks.add(task706);

        Task task707 = new Task(707, "Name1, Name2, Name3 und Name4 befüllen ein Todesglas. Der Name, der als nächstes bei SPAIEN genannt wird, darf entscheiden wer es trinken muss.", false);
        tasks.add(task707);

        Task task708 = new Task(708, "Name1, lass dir von Name2 Deo in die Augen sprühen, oder trinke 2 Schlucke.", false);
        tasks.add(task708);

        Task task709 = new Task(709, "Welche/r Mitspieler/in hat die dunkelste Hautfarbe? Stimmt ab! Diese Person darf 5 Schlucke verteilen.", false);
        tasks.add(task709);

        Task task710 = new Task(710, "Lieber den Oberkörper von Name1, oder den Charakter von Name2 haben? Stimmt ab! Die gewählte Person darf 5 Schlucke verteilen.", false);
        tasks.add(task710);

        Task task711 = new Task(711, "Lieber das Gesicht von Name1, oder den Kontostand von Name2 haben? Stimmt ab! Die gewählte Person darf 5 Schlucke verteilen.", false);
        tasks.add(task711);

        Task task712 = new Task(712, "Lieber mit Name1, oder mit Name2 schlafen? Stimmt ab! Die gewählte Person darf 5 Schlucke verteilen.", false);
        tasks.add(task712);

        Task task713 = new Task(713, "Nennt Superhelden. Name1 beginnt.", false);
        tasks.add(task713);

        Task task714 = new Task(714, "Name1: Trinke Nagellack, oder 3 Schlucke.", false);
        tasks.add(task714);

        Task task715 = new Task(715, "Wer war als letztes beim Frisör? Diese Person verteilt 3 Schlucke.", false);
        tasks.add(task715);

        Task task716 = new Task(716, "Alle Veganer/Vegetarier trinken 5 Schlucke.", false);
        tasks.add(task716);

        Task task717 = new Task(717, "Für jedes Bild im Raum darf Name1 1 Schluck verteilen (Max. 8)", false);
        tasks.add(task717);

        Task task718 = new Task(718, "Alle Leute im Raum, welche sich ein Spotify Familienaccount teilen, trinken pro Mitglied 1 Schluck.", false);
        tasks.add(task718);

        Task task719 = new Task(719, "Name1, lass dir von Name2 ein Ohrloch stechen, oder trinke 4 Schlucke.", false);
        tasks.add(task719);

        Task task720 = new Task(720, "Name1, rasiere dir eine Augenbraue ab, oder trinke 3 Schlucke.", false);
        tasks.add(task720);

        Task task721 = new Task(721, "Alle die T-Shirt tragen trinken.", false);
        tasks.add(task721);

        Task task722 = new Task(722, "Alle die Löcher in ihrer Hose haben trinken 4 Schlucke.", false);
        tasks.add(task722);

        Task task723 = new Task(723, "Nennt Mittelnamen von Mitspielern. Name1 beginnt.", false);
        tasks.add(task723);

        Task task724 = new Task(724, "Nennt Blutgruppen. Name1 beginnt.", false);
        tasks.add(task724);

        Task task725 = new Task(725, "Nennt aktuelle Ministerpräsidenten inkl. ihrer Bundesländer. Name1 beginnt.", false);
        tasks.add(task725);

        Task task726 = new Task(726, "SHOTS!", false);
        tasks.add(task726);

        Task task727 = new Task(727, "SHOTS!", false);
        tasks.add(task727);

        Task task728 = new Task(728, "SHOTS!", false);
        tasks.add(task728);

        Task task729 = new Task(729, "SHOTS!", false);
        tasks.add(task729);

        Task task730 = new Task(730, "SHOTS!", false);
        tasks.add(task730);

        Task task731 = new Task(731, "Nennt skandinavische Länder. Name1 beginnt.", false);
        tasks.add(task731);

        Task task732 = new Task(732, "Name1: Wähle jemanden aus, der mit dir einen shot trinkt.", false);
        tasks.add(task732);

        Task task733 = new Task(733, "Name1: Wähle jemanden aus, der mit dir einen shot trinkt.", false);
        tasks.add(task733);

        Task task734 = new Task(734, "Alle iPhone Besitzer trinken 4 Schlucke.", false);
        tasks.add(task734);

        Task task735 = new Task(735, "Name1 muss in 90 Sekunden „Leuchtenfachhandel“ rückwärts buchstabieren. Geschafft: 8 verteilen. Nicht: 4 trinken.", false);
        tasks.add(task735);

        Task task736 = new Task(736, "Name1 und Name2 spielen Müllabfuhr! Entfernt den rumliegenden Müll und bringt ihn an einen dafür vorgesehenen Ort.", false);
        tasks.add(task736);

        Task task737 = new Task(737, "Nennt Bären. Name1 beginnt.", false);
        tasks.add(task737);

        Task task738 = new Task(738, "Name1 startet einen Wasserfall.", false);
        tasks.add(task738);

        Task task739 = new Task(739, "Die Person rechts von Name1 trinkt 2 Schlucke.", false);
        tasks.add(task739);

        Task task740 = new Task(740, "Alle dürfen für jeden Tampon, den man dabei hat, einen Schluck verteilen.", false);
        tasks.add(task740);

        Task task741 = new Task(741, "SHOTS!", false);
        tasks.add(task741);

        Task task742 = new Task(742, "Nennt Südamerikanische Hauptstädte. Name1 beginnt.", false);
        tasks.add(task742);

        Task task743 = new Task(743, "SHOTS!", false);
        tasks.add(task743);

        Task task744 = new Task(744, "Name1: Mache 15 Liegestütze. Trinke für jede die du nicht schaffst einen Schluck.", false);
        tasks.add(task744);

        Task task745 = new Task(745, "Das Team von SPAIEN freut sich immer über Feedback! Alle trinken!", false);
        tasks.add(task745);

        Task task746 = new Task(746, "Nennt Bundeskanzler. Name1 beginnt.", false);
        tasks.add(task746);

        Task task747 = new Task(747, "Nennt US Präsidenten. Name1 beginnt.", false);
        tasks.add(task747);

        Task task748 = new Task(748, "Nennt Bundespräsidenten. Name1 beginnt.", false);
        tasks.add(task748);

        Task task749 = new Task(749, "Alle, die in den letzten 6 Monaten geflogen sind trinken 4 Schlucke.", false);
        tasks.add(task749);

        Task task750 = new Task(750, "Alle, die in den letzten 2 Monaten das Land verlassen haben trinken 2 Schlucke.", false);
        tasks.add(task750);

        Task task751 = new Task(751, "Nennt christliche Feiertage. Name1 beginnt.", false);
        tasks.add(task751);

        Task task752 = new Task(752, "Nennt jüdische Feiertage. Name1 beginnt.", false);
        tasks.add(task752);

        Task task753 = new Task(753, "Nennt muslimische Feiertage. Name1 beginnt.", false);
        tasks.add(task753);

        Task task754 = new Task(754, "Name1 startet einen Wasserfall.", false);
        tasks.add(task754);

        Task task755 = new Task(755, "Alle Personen, die sich schon Mal über langsames Internet aufgeregt haben, trinken 2 Schlucke.", false);
        tasks.add(task755);

        Task task756 = new Task(756, "Alle außer Name1 und Name2 trinken 2 Schlucke.", false);
        tasks.add(task756);

        Task task757 = new Task(757, "Mit wem würdet ihr am ehesten eine Woche im Bett verbringen wollen? Stimmt ab! Die gewählte Person trinkt 4 Schlucke.", false);
        tasks.add(task757);

        Task task758 = new Task(758, "Name1: Wen würdest du lieber würgen? Name2, oder Name3? Die gewählte Person trinkt 4 Schlucke.", false);
        tasks.add(task758);

        Task task759 = new Task(759, "Name1: Wen würdest du lieber würgen? Name2, oder Name3? Die gewählte Person verteilt 4 Schlucke.", false);
        tasks.add(task759);

        Task task760 = new Task(760, "Nennt Stilmittel. Name1 beginnt.", false);
        tasks.add(task760);

        Task task761 = new Task(761, "Nennt Experten bei „Bares für Rares“. Name1 beginnt.", false);
        tasks.add(task761);

        Task task762 = new Task(762, "Für jede 10 Sekunden, die Name1 Name2 hoch hebt, ohne, dass er/sie hilft, darf Name1 einen Schluck verteilen (Max. 8)", false);
        tasks.add(task762);

        Task task763 = new Task(763, "Name1 lässt sich jetzt von Name2 den Arm auskugeln, oder trinkt 3 Schlucke", false);
        tasks.add(task763);

        Task task764 = new Task(764, "REGEL \n Name1 hat ab jetzt einen sächsischen Dialekt", true);
        tasks.add(task764);

        Task task765 = new Task(765, "REGEL \n Name1 hat ab jetzt einen französischen Akzent", true);
        tasks.add(task765);

        Task task766 = new Task(766, "SHOTS!", false);
        tasks.add(task766);

        Task task767 = new Task(767, "Alle trinken für jede Person im Raum, welche nicht mitspielt, einen Schluck.", false);
        tasks.add(task767);

        Task task768 = new Task(768, "Name1: Mache 6 Kniebeugen und trinke nach jeder einen Schluck.", false);
        tasks.add(task768);

        Task task769 = new Task(769, "Nennt Moderatorinnen (W). Name1 beginnt.", false);
        tasks.add(task769);

        Task task770 = new Task(770, "Nennt Wissenschaftlerinnen (W). Name1 beginnt.", false);
        tasks.add(task770);

        Task task771 = new Task(771, "Name1: Nenne einen Gegenstand im Raum. Die Person, welche diesen als erstes berührt, darf 7 Schlucke verteilen.", false);
        tasks.add(task771);

        Task task772 = new Task(772, "Name1 trinkt für jedes Haustier, welches er/sie hat, 2 Schlucke. (Max. 8 Schlucke)", false);
        tasks.add(task772);

        Task task773 = new Task(773, "Name1: Halte einen Handstand für 3 Sekunden! Geschafft: 6 verteilen. Nicht: 4 selbst.", false);
        tasks.add(task773);

        Task task774 = new Task(774, "Name1: Baue aus vier Flaschen vom Tisch einen Turm, welcher mindestens 8 Sekunden stehen muss. Geschafft: 8 verteilen. Nicht: 3 selbst", false);
        tasks.add(task774);

        Task task775 = new Task(775, "Exe dein Glas, wen es ein YouTube Video mit dir gibt, welches mehr als 20K Aufrufe hat.", false);
        tasks.add(task775);

        Task task776 = new Task(776, "Alle, die diesen Monat Geburtstag haben, verteilen 6 Schlucke. ", false);
        tasks.add(task776);

        Task task777 = new Task(777, "Name1 singt ein Lied mit vollem Mund (Getränk oder Essen). Die erste Person, die das Lied erkennt verteilt 5 Schlucke.", false);
        tasks.add(task777);

        Task task778 = new Task(778, "Die Person mit dem vollsten Glas verteilt 5 schlucke.", false);
        tasks.add(task778);

        Task task779 = new Task(779, "Name1: Nenne Exfreunde/innen von Name2. Für jede/n genannten darfst du einen Schluck verteilen.", false);
        tasks.add(task779);

        Task task780 = new Task(780, "Name1 muss 6 Folien lang stellvertretend alle Schlucke trinken, welche eigentlich Name2 trinken müsste. ", false);
        tasks.add(task780);

        Task task781 = new Task(781, "Name1: Spiele fuck/marry/kill mit Name2, Name3 und Name4! Ausgewählte Personen: fuck: 7 verteilen; marry: 4 trinken; kill: 8 verteilen.", false);
        tasks.add(task781);

        Task task782 = new Task(782, "Name1: Spiele fuck/marry/kill mit Name2, Name3 und Name4! Ausgewählte Personen: fuck: 4 trinken; marry: 6 verteilen; kill: 3 trinken.", false);
        tasks.add(task782);

        Task task783 = new Task(783, "Name1: Spiele fuck/marry/kill mit Name2, Name3 und Name4! Ausgewählte Personen: fuck: 4 verteilen; marry: 10 verteilen; kill: 8 verteilen.", false);
        tasks.add(task783);

        Task task784 = new Task(784, "Name1: Spiele fuck/marry/kill mit Name2, Name3 und Name4! Ausgewählte Personen: fuck: 7 verteilen; marry: 7 trinken; kill: 5 trinken.", false);
        tasks.add(task784);

        Task task785 = new Task(785, "Name1 muss 6 Folien lang stellvertretend alle Schlucke trinken, welche eigentlich Name2 trinken müsste.", false);
        tasks.add(task785);

        Task task786 = new Task(786, "Name1, verteile so viele Schlucke, wie leere Gläser auf dem Tisch stehen.", false);
        tasks.add(task786);

        Task task787 = new Task(787, "Name1: Stelle ein Bild deines Glases in deine Story mit der Überschrift „SPAIEN“, oder exe dein Glas.", false);
        tasks.add(task787);

        Task task788 = new Task(788, "Name1: Stelle ein Bild deines Glases in deine Story mit der Überschrift „SPAIEN“, oder exe dein Glas.", false);
        tasks.add(task788);

        Task task789 = new Task(789, "Name1: Bestimme wer 4 Schlucke aus deinem Glas trinken darf.", false);
        tasks.add(task789);

        Task task790 = new Task(790, "Name1: Geh durch die Tür aus dem Raum und klettere durchs Fenster wieder rein, oder trinke 8 Schlucke.", false);
        tasks.add(task790);

        Task task791 = new Task(791, "Name1: Klettere aus dem Fenster und komme durch die Tür wieder in den Raum, oder trinke 6 Schlucke.", false);
        tasks.add(task791);

        Task task792 = new Task(792, "Name1 muss 6 Folien lang stellvertretend alle Schlucke trinken, welche eigentlich Name2 trinken müsste.", true);
        tasks.add(task792);

        Task task793 = new Task(793, "Name1: Ex!", false);
        tasks.add(task793);

        Task task794 = new Task(794, "Name1 muss 6 Folien lang stellvertretend alle Schlucke trinken, welche eigentlich Name2 trinken müsste.", false);
        tasks.add(task794);

        Task task795 = new Task(795, "Alle die Nagellack tragen, trinken 4 Schlucke.", false);
        tasks.add(task795);

        Task task796 = new Task(796, "Alle Mitspielenden, welche ihr Handy in der Hand, oder auf dem Tisch haben, trinken 5 Schlucke.", false);
        tasks.add(task796);

        Task task797 = new Task(797, "Alle Mitspielenden, welche ihr Handy in der Hand, oder auf dem Tisch haben, trinken 5 Schlucke.", false);
        tasks.add(task797);

        Task task798 = new Task(798, "Name1: Wirf einen Deckel aus 3-5m in dein Glas. 3 Versuche. Geschafft: 8 verteilen. Nicht: 4 trinken.", false);
        tasks.add(task798);

        Task task799 = new Task(799, "Nennt Farben eines klassischen Schachbretts. Name1 beginnt.", false);
        tasks.add(task799);

        Task task800 = new Task(800, "Name1: Löse alle Schrauben des Tisches oder trinke 5 Schlucke.", false);
        tasks.add(task800);

        Task task801 = new Task(801, "Wer ist der schlechteste Verlierer? Stimmt ab! Die gewählte Person trinkt 5 Schlucke.", false);
        tasks.add(task801);

        Task task802 = new Task(802, "Wer hat das älteste Personalausweisbiild? Zeigen! Diese Person verteilt 7 Schlucke.", false);
        tasks.add(task802);

        Task task803 = new Task(803, "Name1: Verpflichte dich jetzt für 15 Jahre bei der Bundeswehr oder trinke 1,5 Schlucke.", false);
        tasks.add(task803);

        Task task804 = new Task(804, "Name1: Staubsauge das Zimmer oder trinke 4 Schlucke.", false);
        tasks.add(task804);

        Task task805 = new Task(805, "Name1: Putze alle Fenster im Zimmer, oder trinke 5 Schlucke.", false);
        tasks.add(task805);

        Task task806 = new Task(806, "Name1 und Name2: Wer als erstes von euch Name3 auf die Schulter haut, darf 7 Schlucke verteilen.", false);
        tasks.add(task806);

        Task task807 = new Task(807, "Name1 und Name2: Wer als erstes von euch Name3 auf den Oberschenkel haut, darf 7 Schlucke verteilen.", false);
        tasks.add(task807);

        Task task808 = new Task(808, "Name1 und Name2: Wer als erstes von euch Name3 auf den Mund küsst, darf 7 Schlucke verteilen.", false);
        tasks.add(task808);

        Task task809 = new Task(809, "Name1 und Name2: Wer als erstes von euch Name3 auf den Mund küsst, darf 7 Schlucke verteilen.", false);
        tasks.add(task809);

        Task task810 = new Task(810, "Name1: Ruf beim Tierarzt an und frage bis wieviel Kg sie einschläfern, oder trinke 4 Schlucke", false);
        tasks.add(task810);

        Task task811 = new Task(811, "Name1: Zieh ein Kleidungsstück aus, oder trinke 6 Schlucke.", false);
        tasks.add(task811);

        Task task812 = new Task(812, "Name1: Zieh ein Kleidungsstück aus, oder trinke 6 Schlucke.", false);
        tasks.add(task812);

        Task task813 = new Task(813, "Name1: Zieh ein Kleidungsstück aus, oder trinke 6 Schlucke.", false);
        tasks.add(task813);

        Task task814 = new Task(814, "Der/Die Erste die lacht trinkt 5 Schlucke.", false);
        tasks.add(task814);

        Task task815 = new Task(815, "Für jedes Apple Produkt im Raum trinkt Name1 einen Schluck.", false);
        tasks.add(task815);

        Task task816 = new Task(816, "Für jedes Samsung Produkt im Raum trinkt Name1 einen Schluck.", false);
        tasks.add(task816);

        Task task817 = new Task(817, "Die Person, die als letztes steht, muss 8 Schlucke trinken.", false);
        tasks.add(task817);

        Task task818 = new Task(818, "Die drei ältesten Mitspielenden verteilen je 3 Schlucke.", false);
        tasks.add(task818);

        Task task819 = new Task(819, "Die drei jüngsten Mitspielenden trinken 4 Schlucke.", false);
        tasks.add(task819);

        Task task820 = new Task(820, "Name1: Exe dein Glas, oder poste eine instagram Story mit @spaienapp.", false);
        tasks.add(task820);

        Task task821 = new Task(821, "Alle die gerade weite Boxershorts tragen trinken.", false);
        tasks.add(task821);

        Task task822 = new Task(822, "Alle die gerade enge Boxershorts tragen trinken.", false);
        tasks.add(task822);

        Task task823 = new Task(823, "Handyturm! Alle legen ihr Handy mit Internet und voller Lautstärke auf den Tisch. Die Person, die als erstes eine Benachrichtigung erhält muss 5 Schlucke trinken.", false);
        tasks.add(task823);

        Task task824 = new Task(824, "Name1 muss so viele Shots trinken, wie er/sie innerhalb von 25 Sekunden blinzelt.", false);
        tasks.add(task824);

        Task task825 = new Task(825, "Name1: Küsse Name2 auf die nackte Pobacke oder trinke 3 Schlucke.", false);
        tasks.add(task825);

        Task task826 = new Task(826, "Spielt: Ich sehe was, was du nicht siehst. Name1 bestimmt das Objekt. Wer es als erstes errät verteilt 5 Schlucke.", false);
        tasks.add(task826);

        Task task827 = new Task(827, "Spielt: Ich sehe was, was du nicht siehst. Name1 bestimmt das Objekt. Wer es als erstes errät verteilt 5 Schlucke.", false);
        tasks.add(task827);

        Task task828 = new Task(828, "Spielt: Montagsmaler! Name1 malt. Wer es als erstes errät verteit 5 Schlucke.", false);
        tasks.add(task828);

        Task task829 = new Task(829, "Spielt: Montagsmaler! Name1 malt. Wer es als erstes errät verteit 5 Schlucke.", false);
        tasks.add(task829);

        Task task830 = new Task(830, "Bei wem ist die letzte Dusche am längsten her? Diese Person verteilt 4 Schlucke.", false);
        tasks.add(task830);

        Task task831 = new Task(831, "Bei wem ist die letzte Dusche am längsten her? Diese Person trinkt 3 Schlucke.", false);
        tasks.add(task831);

        Task task832 = new Task(832, "Wer hat als letztes Blut gespendet? Die Person darf 8 Schlucke verteilen.", false);
        tasks.add(task832);

        Task task833 = new Task(833, "Nennt Tages-/Wochenzeitungen. Name1 beginnt.", false);
        tasks.add(task833);

        Task task834 = new Task(834, "Kopf oder Zahl! KOPF: Name1 trinkt 4, Name2 verteilt 3; ZAHL: Name3 trinkt 4, Name4 verteilt 7. ", false);
        tasks.add(task834);

        Task task835 = new Task(835, "Kopf oder Zahl! KOPF: Name1 trinkt 3, Name2 verteilt 5; ZAHL: Name3 trinkt 2, Name4 verteilt 6.", false);
        tasks.add(task835);

        Task task836 = new Task(836, "Kopf oder Zahl! KOPF: Name1 trinkt 5, Name2 verteilt 4; ZAHL: Name3 trinkt 4, Name4 verteilt 5.", false);
        tasks.add(task836);

        Task task837 = new Task(837, "Kopf oder Zahl! KOPF: Name1 trinkt 4, Name2 verteilt 6; ZAHL: Name3 trinkt 3, Name4 verteilt 4.", false);
        tasks.add(task837);

        Task task838 = new Task(838, "Name1: Wie oft warst du dieses Jahr schon erkältet? So viele Schlucke trinkt du.", false);
        tasks.add(task838);

        Task task839 = new Task(839, "Name1: Wie oft warst du in diesem Jahr schon erkältet? So viele Schlucke verteilst du.", false);
        tasks.add(task839);

        Task task840 = new Task(840, "Die beiden Mitspielenden, welche die leersten Gläser haben exen jetzt!", false);
        tasks.add(task840);

        Task task841 = new Task(841, "Die beiden Mitspielenden, welche die leersten Gläser haben exen jetzt!", false);
        tasks.add(task841);

        Task task842 = new Task(842, "Die beiden Mitspielenden, welche die leersten Gläser haben exen jetzt!", false);
        tasks.add(task842);

        Task task843 = new Task(843, "Name1: Für jeden sauber ausgeführten Sit-Up, welchen du in 20 Sekunden schaffst, darfst du 0,5 Schlucke verteilen.Wenn du nichts machst trinke 4 Schlucke.", false);
        tasks.add(task843);

        Task task844 = new Task(844, "Wählt den/die Hygienischte/n unter euch. Die gewählte Person verteilt 5 Schlucke.", false);
        tasks.add(task844);

        Task task845 = new Task(845, "Name1: Wie warm wird es morgen maximal? Name2 guckt nach. Pro Grad Unterschied trinkt Name1 1 Schluck. Richtig: 7 Verteilen.", false);
        tasks.add(task845);

        Task task846 = new Task(846, "Wer hat die höchste Bildschirmzeit (Handy)? Diese Person trinkt 4 Schlucke. Wer sie nicht einsehen kann trinkt 2 Schlucke.", false);
        tasks.add(task846);

        Task task847 = new Task(847, "Wer hat die niedrigste Bildschirmzeit (Handy)? Diese Person trinkt 4 Schlucke. Wer sie nicht einsehen kann trinkt 2 Schlucke.", false);
        tasks.add(task847);

        Task task848 = new Task(848, "Wer hat die niedrigste Bildschirmzeit (Handy)? Diese Person verteilt 5 Schlucke. Wer sie nicht einsehen kann trinkt 2 Schlucke.", false);
        tasks.add(task848);

        Task task849 = new Task(849, "Pro 10%, die das Oberteil von Name1 aus Baumwolle besteht, darf er/sie 1 Schluck verteilen.", false);
        tasks.add(task849);

        Task task850 = new Task(850, "Pro 10%, die das Oberteil von Name1 aus Polyester besteht, darf er/sie 1 Schluck verteilen.", false);
        tasks.add(task850);

        Task task851 = new Task(851, "Pro 10%, die das Oberteil von Name1 aus Baumwolle besteht, trinkt er/sie 1 Schluck", false);
        tasks.add(task851);

        Task task852 = new Task(852, "Pro 10%, die das Oberteil von Name1 aus Polyester besteht, trinkt er/sie 1 Schluck.", false);
        tasks.add(task852);

        Task task853 = new Task(853, "Name1: Wie viele Praktika hast du in deinem Leben schon gemacht? So viele Schlucke darfst du verteilen (max 8)", false);
        tasks.add(task853);

        Task task854 = new Task(854, "Name1: Wie viele Praktika hast du in deinem Leben schon gemacht? So viele Schlucke trinkt du (max 8)", false);
        tasks.add(task854);

        Task task855 = new Task(855, "Alle die in den letzten sechs Monaten umgezogen sind trinken 4 Schlucke und machen jetzt einen Termin beim Einwohnermeldeamt", false);
        tasks.add(task855);

        Task task856 = new Task(856, "Nennt Städte in Sachsen. Name1 beginnt.", false);
        tasks.add(task856);

        Task task857 = new Task(857, "Nennt Städte in Thüringen. Name1 beginnt.", false);
        tasks.add(task857);

        Task task858 = new Task(858, "Nennt Städte in Sachsen-Anhalt. Name1 beginnt.", false);
        tasks.add(task858);

        Task task859 = new Task(859, "Nennt Sportstadien. Name1 beginnt.", false);
        tasks.add(task859);

        Task task860 = new Task(860, "Nennt Flüsse in Frankreich. Name1 beginnt.", false);
        tasks.add(task860);

        Task task861 = new Task(861, "Name1: Pro Teil, welches du jetzt aus dem Gefrierschrank unverpackt in dein Getränk packst, darfst du 1 Schluck verteilen. (Max 8)", false);
        tasks.add(task861);

        Task task862 = new Task(862, "Alle die BMW fahren trinken.", false);
        tasks.add(task862);

        Task task863 = new Task(863, "Alle die AUDI fahren trinken.", false);
        tasks.add(task863);

        Task task864 = new Task(864, "Alle die Skoda fahren trinken.", false);
        tasks.add(task864);

        Task task865 = new Task(865, "Alle die eine Bahncard haben trinken 3 Schlucke.", false);
        tasks.add(task865);

        Task task866 = new Task(866, "Alle die eine Bahncard haben verteilen 5 Schlucke.", false);
        tasks.add(task866);

        Task task867 = new Task(867, "Name1 und Name2 verteilen jeweils so viele Schlucke, wie sie diese Woche in einer Gastronomie gegessen, oder Essen bestellt haben", false);
        tasks.add(task867);

        Task task868 = new Task(868, "Name1: Bei wem wärst du weniger böse, wenn er/sie mit deiner/m Schwester/Bruder schlafen würde: Name2 oder Name3? Die gewählte Person verteilt 6 Schlucke.", false);
        tasks.add(task868);

        Task task869 = new Task(869, "Name1: Bei wem wärst du weniger böse, wenn er/sie mit deiner/m Schwester/Bruder schlafen würde: Name2 oder Name3? Die gewählte Person verteilt 6 Schlucke.", false);
        tasks.add(task869);

        Task task870 = new Task(870, "Name1 muss so viele Schlucke trinken, wei Name2 sich jetzt auf den nackten Arsch haut. (max 8)", false);
        tasks.add(task870);

        Task task871 = new Task(871, "Nennt Kategorien auf Pornoseiten. Name1 beginnt.", false);
        tasks.add(task871);

        Task task872 = new Task(872, "Name1: Buchstabiere den Namen von Name2. Für jeden richtigen Buchstaben musst du 1 Schluck trinken.", false);
        tasks.add(task872);

        Task task873 = new Task(873, "Name1: Buchstabiere den Namen von Name2. Für jeden richtigen Buchstaben darfst du 1 Schluck verteilen.", false);
        tasks.add(task873);

        Task task874 = new Task(874, "Der letzte der die Schulter von Name1 berührt muss 6 Schlucke trinken.", false);
        tasks.add(task874);

        Task task875 = new Task(875, "Der letzte der im Schneidersitz sitzt, muss 5 Schlucke trinken.", false);
        tasks.add(task875);

        Task task876 = new Task(876, "Der Letzte der steht muss exen", false);
        tasks.add(task876);

        Task task877 = new Task(877, "Der Letzte im Raum muss exen", false);
        tasks.add(task877);

        Task task878 = new Task(878, "Name1: Im Restaurant: bei 30€ Rechnung und gutem Service, wie viel Trinkgeld würdest du geben? Pro Euro 1 trinken (max 10)", false);
        tasks.add(task878);

        Task task879 = new Task(879, "Name1: Im Restaurant: bei 40€ Rechnung und gutem Service, wie viel Trinkgeld würdest du geben? Pro Euro 1 trinken (max 10)", false);
        tasks.add(task879);

        Task task880 = new Task(880, "Name1: Im Restaurant: bei 50€ Rechnung und gutem Service, wie viel Trinkgeld würdest du geben? Pro Euro 1 trinken (max 10)", false);
        tasks.add(task880);

        //Task task880 = new Task(880, "Name1: Im Restaurant: bei 40€ Rechnung und gutem Service, wie viel Trinkgeld würdest du geben? Pro Euro 1 verteilen (max 10)", false);
        //tasks.add(task880);

        Task task881 = new Task(881, "Name1: Im Restaurant: bei 50€ Rechnung und gutem Service, wie viel Trinkgeld würdest du geben? Pro Euro 1 verteilen (max 10)", false);
        tasks.add(task881);

        Task task882 = new Task(882, "Name1: Im Restaurant: bei 60€ Rechnung und gutem Service, wie viel Trinkgeld würdest du geben? Pro Euro 1 verteilen (max 10)", false);
        tasks.add(task882);

        Task task883 = new Task(883, "Stimmt ab! Wer gibt im Restaurant am meisten Trinkgeld? Die gewählte Person darf 7 Schlucke verteilen.", false);
        tasks.add(task883);

        Task task884 = new Task(884, "Nennt Dinge die man in der Küche und im Bett sagen kann. Name1 beginnt.", false);
        tasks.add(task884);

        Task task885 = new Task(885, "Nennt Dinge die man auf dem Friedhof und beim Frisör sagen kann. Name1 beginnt.", false);
        tasks.add(task885);

        Task task886 = new Task(886, "Nennt Dinge die man im Freibad und im Bett sagen kann. Name1 beginnt.", false);
        tasks.add(task886);

        Task task887 = new Task(887, "Nennt Dinge die man auf dem Fußballplatz und bei der AFD sagen kann. Name1 beginnt.", false);
        tasks.add(task887);

        Task task888 = new Task(888, "Nennt Dinge die man auf der Baustelle und im Bett sagen kann. Name1 beginnt.", false);
        tasks.add(task888);

        Task task889 = new Task(889, "Nennt Dinge, die man im Fitnessstudio und im Bett sagen kann. Name1 beginnt.", false);
        tasks.add(task889);

        Task task890 = new Task(890, "Nennt Dinge die man beim Sport und beim putzen sagen kann. Name1 beginnt.", false);
        tasks.add(task890);

        Task task891 = new Task(891, "Nennt Dinge die man beim Autofahren und im Bett sagen kann. Name1 beginnt.", false);
        tasks.add(task891);

        Task task892 = new Task(892, "Nennt Dinge die man beim Arzt und beim Frisör sagen kann. Name1 beginnt.", false);
        tasks.add(task892);

        Task task893 = new Task(893, "Nennt Dinge die man beim Arzt und in der Werkstatt sagen kann. Name1 beginnt.", false);
        tasks.add(task893);

        Task task894 = new Task(894, "Nennt Dinge die man beim shoppen und im Bett sagen kann.", false);
        tasks.add(task894);

        Task task895 = new Task(895, "Name1: Nenne die Geheimzahl deines Kontos, oder trinke 4 Schlucke.", false);
        tasks.add(task895);

        Task task896 = new Task(896, "Name1: Für jeden WhatsApp Kontakt dem du jetzt schreibst, dass er/sie sich SPAIEN downloaden soll, darfst du 2 Schlucke verteilen (max 4 Leute)", false);
        tasks.add(task896);

        Task task897 = new Task(897, "Name1: Für jeden WhatsApp Kontakt dem du jetzt schreibst, dass er/sie sich SPAIEN downloaden soll, darfst du 2 Schlucke verteilen (max 4 Leute)", false);
        tasks.add(task897);

        Task task898 = new Task(898, "Name1: Für jeden WhatsApp Kontakt dem du jetzt schreibst, dass er/sie sich SPAIEN downloaden soll, darfst du 2 Schlucke verteilen (max 4 Leute)", false);
        tasks.add(task898);

        Task task899 = new Task(899, "Name1: Sage einen Buchstaben. Name2: Gib diesen Buchstaben bei WhatsApp ein. Ruf die erste Person die erscheint an und erzähl ihr von SPAIEN, oder trinke 8 Schlucke. Gemacht: 10 verteilen.", false);
        tasks.add(task899);

        Task task900 = new Task(900, "Name1: Sage einen Buchstaben. Name2: Gib diesen Buchstaben bei WhatsApp ein. Ruf die erste Person die erscheint an und erzähl ihr von SPAIEN, oder trinke 8 Schlucke. Gemacht: 10 verteilen.", false);
        tasks.add(task900);

        Task task901 = new Task(901, "Name1: Sage einen Buchstaben. Name2: Gib diesen Buchstaben bei WhatsApp ein. Ruf die erste Person die erscheint an und erzähl ihr von SPAIEN, oder trinke 8 Schlucke. Gemacht: 10 verteilen.", false);
        tasks.add(task901);

        Task task902 = new Task(902, "Alle die diesen Monat ein verschreibungspflichtiges Medikament genommen haben verteilen 3 Schlucke.", false);
        tasks.add(task902);

        Task task903 = new Task(903, "Stimmt ab! Wer ist der/die Sexistischte unter euch? Die gewählte Person schämt sich und trinkt 7 Schlucke.", false);
        tasks.add(task903);

        Task task904 = new Task(904, "Name1: Wie viele Kondome hast du dabei? Für jedes 1 Schluck trinken. Keins? 4 Schlucke trinken!", false);
        tasks.add(task904);

        Task task905 = new Task(905, "Name1: Pro Stern, den du SPAIEN jetzt im Appstore gibst, darfst du 1 Schluck verteilen. Schon bewertet: 5 verteilen.", false);
        tasks.add(task905);

        Task task906 = new Task(906, "Name1: Pro Stern, den du SPAIEN jetzt im Appstore gibst, darfst du 1 Schluck verteilen. Schon bewertet: 5 verteilen.", false);
        tasks.add(task906);

        Task task907 = new Task(907, "Name1: Pro Stern, den du SPAIEN jetzt im Appstore gibst, darfst du 1 Schluck verteilen. Schon bewertet: 5 verteilen.", false);
        tasks.add(task907);

        Task task908 = new Task(908, "Name1: Pro Stern, den du SPAIEN jetzt im Appstore gibst, darfst du 1 Schluck verteilen. Schon bewertet: 5 verteilen.", false);
        tasks.add(task908);

        Task task909 = new Task(909, "Name1 und Name2 dürfen so viele Schlucke verteilen wie sie Geschwister haben.", false);
        tasks.add(task909);

        Task task910 = new Task(910, "Name1: Pro Finger, den du dir jetzt komplett in den Mund steckst, darfst du 1 Schluck verteilen.", false);
        tasks.add(task910);

        Task task911 = new Task(911, "Name1: Pro Finger, den du dir jetzt komplett in den Mund steckst, darfst du 1 Schluck verteilen.", false);
        tasks.add(task911);

        Task task912 = new Task(912, "Name1: Pro Finger, den du dir jetzt komplett in den Mund steckst, darfst du 1 Schluck verteilen.", false);
        tasks.add(task912);

        Task task913 = new Task(913, "Name1: Halte die Luft an! Name2 stoppt die Zeit. Pro 10 Sekunden darf Name1 1 Schluck verteilen. (Max. 10)", false);
        tasks.add(task913);

        Task task914 = new Task(914, "Name1: Halte die Luft an! Name2 stoppt die Zeit. Pro 10 Sekunden darf Name1 1 Schluck verteilen. (Max. 10)", false);
        tasks.add(task914);

        Task task915 = new Task(915, "Name1 und Name2: Wer kann länger die Luft anhalten? Der/Die Gewinnende verteilt 6 Schlucke.", false);
        tasks.add(task915);

        Task task916 = new Task(916, "Name1 und Name2: Wer kann länger die Luft anhalten? Der/Die Gewinnende verteilt 6 Schlucke.", false);
        tasks.add(task916);

        Task task917 = new Task(917, "Name1 und Name2: Wer kann länger die Luft anhalten? Der/Die Gewinnende verteilt 6 Schlucke.", false);
        tasks.add(task917);

        Task task918 = new Task(918, "Wer wäre das beste husband/wife material? Stimmt ab! Die Gewählte Person verteilt 6 Schlucke.", false);
        tasks.add(task918);

        Task task919 = new Task(919, "Wer wäre das beste husband/wife material? Stimmt ab! Die Gewählte Person trinkt für jede erhaltene Stimme 1 Schluck.", false);
        tasks.add(task919);

        Task task920 = new Task(920, "Name1 und Name2: Wie oft habt ihr diese Woche Sport gemacht? So viele Schlucke dürft ihr je verteilen.", false);
        tasks.add(task920);

        Task task921 = new Task(921, "Name1 und Name2: Wer hat diese Woche häufiger Sport gemacht? Diese Person darf 5 Schlucke verteilen.", false);
        tasks.add(task921);

        Task task922 = new Task(922, "Nennt demokratisch gewählte Staatsoberhäupter inkl. ihrer Staaten. Name1 beginnt.", false);
        tasks.add(task922);

        Task task923 = new Task(923, "Alle die gerade einen Mundschutz dabei haben verteilen 4 Schlucke.", false);
        tasks.add(task923);

        Task task924 = new Task(924, "Alle die gerade keinen Mundschutz dabei haben trinken 3 Schlucke.", false);
        tasks.add(task924);

        Task task925 = new Task(925, "Jeder führt eine Art sich zu dehnen vor. Die Person die keine mehr kennt trinkt 3 Schlucke. Name1 beginnt.", false);
        tasks.add(task925);

        Task task926 = new Task(926, "Nennt Möglichkeiten weniger Plastik zu benutzen. Name1 beginnt.", false);
        tasks.add(task926);

        Task task927 = new Task(927, "Nennt Möglichkeiten weniger Wasser zu verbrauchen. Name1 beginnt.", false);
        tasks.add(task927);

        Task task928 = new Task(928, "Nennt Möglichkeiten weniger CO2 zu produzieren. Name1 beginnt.", false);
        tasks.add(task928);

        Task task929 = new Task(929, "Nennt Mögchkeiten Energie zu sparen. Name1 beginnt.", false);
        tasks.add(task929);

        Task task930 = new Task(930, "Name1 und Name2: Wer war dieses Jahr häufiger im Museum? Diese Person verteilt 5 Schlucke.", false);
        tasks.add(task930);

        Task task931 = new Task(931, "Name1 und Name2: Wer war dieses Jahr häufiger in der Kirche? Diese Person verteilt 4 Schlucke.", false);
        tasks.add(task931);

        Task task932 = new Task(932, "Die Person mit dem besten Abi Schnitt verteilt 5 Schlucke.", false);
        tasks.add(task932);

        Task task933 = new Task(933, "Die Person mit dem schlechtesten Abi Schnitt verteilt 5 Schlucke.", false);
        tasks.add(task933);

        Task task934 = new Task(934, "Stimmt ab! Wer ist der klicheehaft männlichste unter euch? Diese Person ext.", false);
        tasks.add(task934);

        Task task935 = new Task(935, "Name1 und Name2: Wer hat heute mehr gegessen? Diese Person verteilt 4 Schlucke.", false);
        tasks.add(task935);

        Task task936 = new Task(936, "Name1 und Name2: Wer hat heute weniger gegessen? Diese Person trinkt 4 Schlucke.", false);
        tasks.add(task936);

        Task task937 = new Task(937, "Name1 und Name2: Wer hat heute mehr nichtalkoholische Getränke getrunken? Diese Person verteilt 6 Schlucke.", false);
        tasks.add(task937);

        Task task938 = new Task(938, "Alle, die sich gerade weiter als 200km von ihrem Heimatort befinden trinken 3 Schlucke.", false);
        tasks.add(task938);

        Task task939 = new Task(939, "Nennt Drogerien. Name1 beginnt.", false);
        tasks.add(task939);

        Task task940 = new Task(940, "Nennt Beeren. Name1 beginnt.", false);
        tasks.add(task940);

        Task task941 = new Task(941, "Nennt Nüsse. Name1 beginnt.", false);
        tasks.add(task941);

        Task task942 = new Task(942, "Name1 setzt 5 Folien lang aus!", false);
        tasks.add(task942);

        Task task943 = new Task(943, "Name1 setzt 5 Folien lang aus!", false);
        tasks.add(task943);

        Task task944 = new Task(944, "Nennt Sprichwörter. Name1 beginnt.", false);
        tasks.add(task944);

        Task task945 = new Task(945, "default", false);
        tasks.add(task945);

        Task task946 = new Task(946, "default", false);
        tasks.add(task946);

        Task task947 = new Task(947, "default", false);
        tasks.add(task947);

        Task task948 = new Task(948, "default", false);
        tasks.add(task948);

        Task task949 = new Task(949, "default", false);
        tasks.add(task949);

        Task task950 = new Task(950, "default", false);
        tasks.add(task950);

        Task task951 = new Task(951, "default", false);
        tasks.add(task951);

        Task task952 = new Task(952, "default", false);
        tasks.add(task952);

        Task task953 = new Task(953, "default", false);
        tasks.add(task953);

        Task task954 = new Task(954, "default", false);
        tasks.add(task954);

        Task task955 = new Task(955, "default", false);
        tasks.add(task955);

        Task task956 = new Task(956, "default", false);
        tasks.add(task956);

        Task task957 = new Task(957, "default", false);
        tasks.add(task957);

        Task task958 = new Task(958, "default", false);
        tasks.add(task958);

        Task task959 = new Task(959, "default", false);
        tasks.add(task959);

        Task task960 = new Task(960, "default", false);
        tasks.add(task960);

        Task task961 = new Task(961, "default", false);
        tasks.add(task961);

        Task task962 = new Task(962, "default", false);
        tasks.add(task962);

        Task task963 = new Task(963, "default", false);
        tasks.add(task963);

        Task task964 = new Task(964, "default", false);
        tasks.add(task964);

        Task task965 = new Task(965, "default", false);
        tasks.add(task965);

        Task task966 = new Task(966, "default", false);
        tasks.add(task966);

        Task task967 = new Task(967, "default", false);
        tasks.add(task967);

        Task task968 = new Task(968, "default", false);
        tasks.add(task968);

        Task task969 = new Task(969, "default", false);
        tasks.add(task969);

        Task task970 = new Task(970, "default", false);
        tasks.add(task970);

        Task task971 = new Task(971, "default", false);
        tasks.add(task971);

        Task task972 = new Task(972, "default", false);
        tasks.add(task972);

        Task task973 = new Task(973, "default", false);
        tasks.add(task973);

        Task task974 = new Task(974, "default", false);
        tasks.add(task974);

        Task task975 = new Task(975, "default", false);
        tasks.add(task975);

        Task task976 = new Task(976, "default", false);
        tasks.add(task976);

        Task task977 = new Task(977, "default", false);
        tasks.add(task977);

        Task task978 = new Task(978, "default", false);
        tasks.add(task978);

        Task task979 = new Task(979, "default", false);
        tasks.add(task979);

        Task task980 = new Task(980, "default", false);
        tasks.add(task980);

        //Task task980 = new Task(980, "default", false);
        //tasks.add(task980);

        Task task981 = new Task(981, "default", false);
        tasks.add(task981);

        Task task982 = new Task(982, "default", false);
        tasks.add(task982);

        Task task983 = new Task(983, "default", false);
        tasks.add(task983);

        Task task984 = new Task(984, "default", false);
        tasks.add(task984);

        Task task985 = new Task(985, "default", false);
        tasks.add(task985);

        Task task986 = new Task(986, "default", false);
        tasks.add(task986);

        Task task987 = new Task(987, "default", false);
        tasks.add(task987);

        Task task988 = new Task(988, "default", false);
        tasks.add(task988);

        Task task989 = new Task(989, "default", false);
        tasks.add(task989);

        Task task990 = new Task(990, "default", false);
        tasks.add(task990);

        Task task991 = new Task(991, "default", false);
        tasks.add(task991);

        Task task992 = new Task(992, "default", false);
        tasks.add(task992);

        Task task993 = new Task(993, "default", false);
        tasks.add(task993);

        Task task994 = new Task(994, "default", false);
        tasks.add(task994);

        Task task995 = new Task(995, "default", false);
        tasks.add(task995);

        Task task996 = new Task(996, "default", false);
        tasks.add(task996);

        Task task997 = new Task(997, "default", false);
        tasks.add(task997);

        Task task998 = new Task(998, "default", false);
        tasks.add(task998);

        /**f
         * Tasks for deactivate a current active rule
         */
        Task task10008 = new Task(10008, "REGELAUFLÖSUNG \n Es darf wieder auf andere Leute gezeigt werden.", false);
        tasks.add(task10008) ;

        Task task10009 = new Task(10009, "REGELAUFLÖSUNG \n Der Assi darf wieder normal sprechen.", false);
        tasks.add(task10009) ;

        Task task10030 = new Task(10030, "REGELAUFLÖSUNG \n Der English-Speaker darf auch wieder auf sein deutsches Vokabular zurückgreifen.", false);
        tasks.add(task10030) ;

        Task task10031 = new Task(10031, "REGELAUFLÖSUNG \n Es dürfen alle wieder reden und niemand wird gezwungen die Klappe zu halten.", false);
        tasks.add(task10031) ;

        Task task10032 = new Task(10032, "REGELAUFLÖSUNG \n Der Norddeutsche darf auch wieder auf hochdeutsch reden.", false);
        tasks.add(task10032) ;

        Task task10055 = new Task(10055, "REGELAUFLÖSUNG \n Gegenüber muss nicht mehr mittrinken.", false);
        tasks.add(task10055) ;

        Task task10056 = new Task(10056, "REGELAUFLÖSUNG \n Rechts muss nicht mehr mittrinken.", false);
        tasks.add(task10056) ;

        Task task10057 = new Task(10057, "REGELAUFLÖSUNG \n Links muss nicht mehr mittrinken.", false);
        tasks.add(task10057) ;

        Task task10059 = new Task(10059, "REGELAUFLÖSUNG \n Die Hände dürfen vom Kopf genommen werden.", false);
        tasks.add(task10059) ;

        Task task10097 = new Task(10097, "REGELAUFLÖSUNG \n Man darf sich wieder duzen.", false);
        tasks.add(task10097) ;

        Task task10098 = new Task(10098, "REGELAUFLÖSUNG \n Man darf wieder mit Händen trinken", false);
        tasks.add(task10098) ;

        Task task10143 = new Task(10143, "REGELAUFLÖSUNG \n Es darf wieder der Buchstabe `N´ benutzt werden", false);
        tasks.add(task10143) ;

        Task task10284 = new Task(10284, "REGELAUFLÖSUNG \n Die nüchternsten Person hat jetzt ja sicher aufgeholt und muss nicht mehr immer +1 trinken.", false);
        tasks.add(task10284) ;

        Task task10415 = new Task(10415, "REGELAUFLÖSUNG \n Die Trinkbuddies sind wieder auf sich allein gestellt.", false);
        tasks.add(task10415);

        Task task10460 = new Task(10460, "REGELAUFLÖSUNG \n Der Übersetzer kann aufhören.", false);
        tasks.add(task10460);

        Task task10510 = new Task(10510, "REGELAUFLÖSUNG \n Jeder hat wieder seinen eigenen Namen.", false);
        tasks.add(task10510);

        Task task10515 = new Task(10515, "REGELAUFLÖSUNG \n Man darf sich wieder beleidigen.", false);
        tasks.add(task10515);

        Task task10528 = new Task(10528, "REGELAUFLÖSUNG \n Niemand wird mehr ignoriert.", false);
        tasks.add(task10528);

        Task task10530 = new Task(10530, "REGELAUFLÖSUNG \n Es wird wieder gesagt, was gedacht wird.", false);
        tasks.add(task10530);

        Task task10534 = new Task(10534, "REGELAUFLÖSUNG \n Stoppt das Singen!", false);
        tasks.add(task10534);

        Task task10537 = new Task(10537, "REGELAUFLÖSUNG \n Die Tiergeräusche sind beendet.", false);
        tasks.add(task10537);

        Task task10595 = new Task(10595, "REGELAUFLÖSUNG \n Hört auf euch beim trinken anzufassen.", false);
        tasks.add(task10595);

        Task task10617 = new Task(10617, "REGELAUFLÖSUNG \n Jeder darf wieder sprechen wann er will.", false);
        tasks.add(task10617);

        Task task10646 = new Task(10646, "REGELAUFLÖSUNG \n Hört auf euch beim trinken anzufassen.", false);
        tasks.add(task10646);

        Task task10705 = new Task(10705, "REGELAUFLÖSUNG \n Jeder darf wieder auf alle Fragen antworten.", false);
        tasks.add(task10705);

        Task task10764 = new Task(10764, "REGELAUFLÖSUNG \n der Sachse darf wieder normal sprechen.", false);
        tasks.add(task10764);

        Task task10765 = new Task(10765, "REGELAUFLÖSUNG \n Der Franzose darf wieder normal sprechen", false);
        tasks.add(task10765);


    }

    public ArrayList<Task> getTasks() {

        return tasks;
    }
}
