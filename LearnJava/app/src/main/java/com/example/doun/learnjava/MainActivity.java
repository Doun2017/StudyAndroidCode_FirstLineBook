package com.example.doun.learnjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
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


//        //practice11.4
//        msgtoshow+=(fill(new ArrayList<String>()))+"\n";
//        msgtoshow+=(fill(new LinkedList<String>()))+"\n";
//        msgtoshow+=(fill(new HashSet<String>()))+"\n";
//        msgtoshow+=(fill(new TreeSet<String>()))+"\n";
//        msgtoshow+=(fill(new LinkedHashSet<String>()))+"\n";

        //practice11.5
//        ListFeatures5 listFeatures5 = new ListFeatures5();
//        msgtoshow = listFeatures5.stringout();

        //practice11.6
//        ListFeatures6 listFeatures6 = new ListFeatures6();
//        msgtoshow = listFeatures6.stringout();

        //practice11.7
        ArrayList<Gerbil> gerbilArrayList = new ArrayList<Gerbil>();
        for (int i=0; i<10; i++){
            gerbilArrayList.add(new Gerbil(i));
        }
        List<Gerbil> sub = gerbilArrayList.subList(3, 5);
        List<Gerbil> copy = new ArrayList<Gerbil>(gerbilArrayList);
        try{
            copy.removeAll(sub);//ConcurrentModificationException
        }catch (UnsupportedOperationException e){
            //- 如果列表不支持 removeAll 操作
            e.printStackTrace();
        }catch (ClassCastException e){
            e.printStackTrace();
//        ClassCastException - 如果此列表中的元素的类和指定的 collection 不兼容（可选）
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        for (Gerbil g: copy)
        {
            msgtoshow+=g.hop();
            msgtoshow+="\n";
        }

        //practice11.8
//        ArrayList<Gerbil> gerbilArrayList = new ArrayList<Gerbil>();
//        for (int i=0; i<3; i++){
//            gerbilArrayList.add(new Gerbil(i));
//        }
//        Iterator<Gerbil> it = gerbilArrayList.iterator();
//        while (it.hasNext()){
//            int i=0;
//            msgtoshow += it.next().hop();
//            msgtoshow += "\r\n";
//        }




        msgtextview.setText(msgtoshow);
    }
}
