package com.example.doun.learnjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import static com.example.doun.learnjava.FilmnameBuilder.fill;

public class MainActivity extends AppCompatActivity {
    TextView msgtextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msgtextview = (TextView)findViewById(R.id.msgTextView);

        String msgtoshow = "";

        //practice11.1
//        ArrayList<Gerbil> gerbilArrayList = new ArrayList<Gerbil>();
//        for (int i=0; i<3; i++){
//            gerbilArrayList.add(new Gerbil(i));
//        }
//        for (int i=0; i<3; i++) {
//            msgtoshow += gerbilArrayList.get(i).hop();
//            msgtoshow += "\r\n";
//        }


//        //practice11.2
//        Set<Integer> integerSet = new HashSet<Integer>();
////        Set<Integer> integerSet = new TreeSet<Integer>();
//        for (int i=0; i<10; i++){
//            integerSet.add(i);
//        }
//        for (Integer i : integerSet)
//            msgtoshow += i;

//        //practice11.3
//        Sequence3 Sequence3 = new Sequence3();
//        for(int i = 0; i < 25; i++)
//            Sequence3.add(Integer.toString(i));
//        Selector selector = Sequence3.selector();
//        while(!selector.end()) {
//            msgtoshow += (selector.current() + " ");
//            selector.next();
//        }


        //practice11.4
        msgtoshow+=(fill(new ArrayList<String>()))+"\n";
        msgtoshow+=(fill(new LinkedList<String>()))+"\n";
        msgtoshow+=(fill(new HashSet<String>()))+"\n";
        msgtoshow+=(fill(new TreeSet<String>()))+"\n";
        msgtoshow+=(fill(new LinkedHashSet<String>()))+"\n";






        msgtextview.setText(msgtoshow);
    }
}
