package com.example.doun.learnjava;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
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
//        ArrayList<Gerbil> gerbilArrayList = new ArrayList<Gerbil>();
//        for (int i=0; i<10; i++){
//            gerbilArrayList.add(new Gerbil(i));
//        }
//        List<Gerbil> sub = gerbilArrayList.subList(3, 5);
//        List<Gerbil> copy = new ArrayList<Gerbil>(gerbilArrayList);
//        try{
//            copy.removeAll(sub);//ConcurrentModificationException
//        }catch (UnsupportedOperationException e){
//            //- 如果列表不支持 removeAll 操作
//            e.printStackTrace();
//        }catch (ClassCastException e){
//            e.printStackTrace();
////        ClassCastException - 如果此列表中的元素的类和指定的 collection 不兼容（可选）
//        }catch (NullPointerException e){
//            e.printStackTrace();
//        }
//
//        for (Gerbil g: copy)
//        {
//            msgtoshow+=g.hop();
//            msgtoshow+="\n";
//        }

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

        //practice11.9
//        Sequence9 sequence = new Sequence9();
//        for(int i = 0; i < 10; i++)
//            sequence.add(Integer.toString(i));
//        Iterator selector = sequence.selector();
//        while(selector.hasNext()) {
//            msgtoshow+=selector.next();
//        }

        //practice11.10 略

        //practice11.11
//        msgtoshow += "ArrayList---\n";
//        msgtoshow += printCollection(fill(new ArrayList<String>()));
//        msgtoshow += "LinkedList---\n";
//        msgtoshow += printCollection(fill(new LinkedList<String>()));
//        msgtoshow += "HashSet---\n";
//        msgtoshow += printCollection(fill(new HashSet<String>()));
//        msgtoshow += "TreeSet---\n";
//        msgtoshow += printCollection(fill(new TreeSet<String>()));
//        msgtoshow += "LinkedHashSet---\n";
//        msgtoshow += printCollection(fill(new LinkedHashSet<String>()));



        //practice11.12
//        List<Integer> iList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//        msgtoshow += iList.toString();
//        ListIterator<Integer> iit = iList.listIterator(iList.size());
//        List<Integer> iList2 = new ArrayList<Integer>();
//        while (iit.hasPrevious()){
//            iList2.add(iit.previous());
//        }
//        msgtoshow += "\n";
//        msgtoshow += iList2.toString();

        //practice11.13 略

        //practice11.14
//        LinkedList<Integer> linkedList = new LinkedList<Integer>();
//        for (int i=0; i<10; i++){
//            ListIterator<Integer> it = linkedList.listIterator(linkedList.size()/2);
//            it.add(i);
//        }
//        msgtoshow += linkedList.toString();

        //practice11.15
//        MyStack<Character> stack = new MyStack<Character>();
//        stack.push('U');
//        stack.push('n');
//        stack.push('c');
//        msgtoshow+=stack.pop();
//        msgtoshow+=stack.pop();
//        msgtoshow+=stack.pop();
//        stack.push('e');
//        stack.push('r');
//        stack.push('t');
//        msgtoshow+=stack.pop();
//        msgtoshow+=stack.pop();
//        msgtoshow+=stack.pop();
//        stack.push('a');
//        stack.push('i');
//        stack.push('n');
//        stack.push('t');
//        stack.push('y');
//        msgtoshow+=stack.pop();
//        msgtoshow+=stack.pop();
//        msgtoshow+=stack.pop();
//        stack.push(' ');
//        msgtoshow+=stack.pop();
//        stack.push('r');
//        stack.push('u');
//        msgtoshow+=stack.pop();
//        msgtoshow+=stack.pop();
//        stack.push('l');
//        stack.push('e');
//        stack.push('s');
//        msgtoshow+=stack.pop();
//        msgtoshow+=stack.pop();
//        msgtoshow+=stack.pop();

        //practice11.16
//        String strtest = "//: holding/UniqueWords.java\n" +
//                "import java.util.*;\n" +
//                "import net.mindview.util.*;\n" +
//                "\n" +
//                "public class UniqueWords {\n" +
//                "  public static void main(String[] args) {\n" +
//                "    Set<String> words = new TreeSet<String>(\n" +
//                "      new TextFile(\"SetOperations.java\", \"\\\\W+\"));\n" +
//                "    System.out.println(words);\n" +
//                "  }\n" +
//                "} /* Output:\n" +
//                "[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, holding, import, in, java, main, mindview, net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]\n" +
//                "*///:~\n";
//        char[] chars = strtest.toCharArray();
//        List<Character> charlist = new ArrayList<Character>();
//        for (char c: chars){
//            charlist.add(new Character(c));
//        }
//        Set<Character> yuanyin = new HashSet<Character>(Arrays.asList('a', 'e','i', 'o', 'u'));
//        int sum=0,yuanyinsum=0;
//        int asum=0, esum=0,isum=0,osum=0,usum=0;
//        for (Character ch: charlist){
//            sum++;
//            if (yuanyin.contains(ch)){
//                yuanyinsum++;
//                switch (ch){
//                    case 'a':
//                        asum++;
//                        break;
//                    case 'e':
//                        esum++;
//                        break;
//                    case 'i':
//                        isum++;
//                        break;
//                    case 'o':
//                        osum++;
//                        break;
//                    case 'u':
//                        usum++;
//                        break;
//                    default:
//                        break;
//                }
//            }
//        }
//        msgtoshow+=("sum:"+sum+"\n");
//        msgtoshow+=("yuanyinsum:"+yuanyinsum+"\n");
//        msgtoshow+=("asum:"+asum+"\n");
//        msgtoshow+=("esum:"+esum+"\n");
//        msgtoshow+=("isum:"+isum+"\n");
//        msgtoshow+=("osum:"+osum+"\n");
//        msgtoshow+=("usum:"+usum+"\n");

        //practice11.17
//        Map<String, Gerbil> gerbilMap = new HashMap<String, Gerbil>();
//        Collection<String> namecoll = fill(new ArrayList<String>());
//        int i=0;
//        for (String str:namecoll){
//            gerbilMap.put(str, new Gerbil(i++));
//        }
//        Set<String> kset = gerbilMap.keySet();
//        Iterator<String> it = kset.iterator();
//        while (it.hasNext()){
//            String name = it.next();
//            Gerbil gerbil = gerbilMap.get(name);
//            msgtoshow+=name;
//            msgtoshow+="\n";
//            msgtoshow+=gerbil.hop();
//            msgtoshow+="\n";
//        }


        //practice11.18
//        Map<Integer, Integer> intmap = new HashMap<Integer, Integer>();
//        for (int i=0; i<10; i++){
//            intmap.put(i, i);
//        }
//        for (int i:intmap.keySet()){
//            msgtoshow+=intmap.get(i);
//        }
//            msgtoshow+="\n";
//        Set<Integer> kset = intmap.keySet();
//        Integer[] intarray = kset.toArray(new Integer[0]);
//        Arrays.sort(intarray);
//        Map<Integer, Integer> sortintmap = new LinkedHashMap<Integer, Integer>();
//        for (int i=0; i<intarray.length; i++){
//            sortintmap.put(intarray[i], intmap.get(i));
//        }
//        for (int i:sortintmap.keySet()){
//            msgtoshow+=sortintmap.get(i);
//        }


        //practice11.19
//        Set<Integer> intSet = new HashSet<Integer>();
//        for (int i=0; i<10; i++){
//            intSet.add(i);
//        }
//        for (int i:intSet){
//            msgtoshow+=i;
//        }
//        msgtoshow+="\n";
//        msgtoshow+="\n";
//        Integer[] intarray = intSet.toArray(new Integer[0]);
//        Arrays.sort(intarray);
//        Set<Integer> sortintset = new LinkedHashSet<Integer>();
//        for (int i=0; i<intarray.length; i++){
//            sortintset.add(intarray[i]);
//        }
//        for (int i:sortintset){
//            msgtoshow+=i;
//        }

        //practice11.20
//        String strtest = "//: holding/UniqueWords.java\n" +
//                "import java.util.*;\n" +
//                "import net.mindview.util.*;\n" +
//                "\n" +
//                "public class UniqueWords {\n" +
//                "  public static void main(String[] args) {\n" +
//                "    Set<String> words = new TreeSet<String>(\n" +
//                "      new TextFile(\"SetOperations.java\", \"\\\\W+\"));\n" +
//                "    System.out.println(words);\n" +
//                "  }\n" +
//                "} /* Output:\n" +
//                "[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, holding, import, in, java, main, mindview, net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]\n" +
//                "*///:~\n";
//        char[] chars = strtest.toCharArray();
//        List<Character> charlist = new ArrayList<Character>();
//        for (char c: chars){
//            charlist.add(new Character(c));
//        }
//        Map<Character, Integer> yuanyinMap = new HashMap<Character, Integer>();
//        yuanyinMap.put('a', 0);
//        yuanyinMap.put('e', 0);
//        yuanyinMap.put('i', 0);
//        yuanyinMap.put('o', 0);
//        yuanyinMap.put('u', 0);
//        int sum=0,yuanyinsum=0;
//        for (Character ch: charlist){
//            sum++;
//            Integer integer = yuanyinMap.get(ch);
//            if (integer!=null){
//                yuanyinsum++;
//                yuanyinMap.put(ch, integer+1);
//            }
//        }
//        msgtoshow+=("sum:"+sum+"\n");
//        msgtoshow+=("yuanyinsum:"+yuanyinsum+"\n");
//        msgtoshow+=yuanyinMap;

        //practice11.21
        String strtest = "//: holding/UniqueWords.java\n" +
                "import java.util.*;\n" +
                "import net.mindview.util.*;\n" +
                "\n" +
                "public class UniqueWords {\n" +
                "  public static void main(String[] args) {\n" +
                "    Set<String> words = new TreeSet<String>(\n" +
                "      new TextFile(\"SetOperations.java\", \"\\\\W+\"));\n" +
                "    System.out.println(words);\n" +
                "  }\n" +
                "} /* Output:\n" +
                "[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations, String, X, Y, Z, " +
                "add, addAll, added, args, class, contains, containsAll, false, from, holding, import, in, java, main, mindview, net, new, " +
                "print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]\n" +
                "*///:~\n";
        ArrayList<String> strlist = new ArrayList<String>(Arrays.asList(strtest.split("\\W+")));
        if(strlist.get(0).equals(""))
            strlist.remove(0);
        Collections.sort(strlist, String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> countMap = new LinkedHashMap<String, Integer>();
        for (String str:strlist){
            Integer inte = countMap.get(str);
            countMap.put(str, inte==null?1:inte+1);
        }

        Set<String> words = new LinkedHashSet<String>(strlist);
        msgtoshow+=words;
        msgtoshow+="\n";
        msgtoshow+=strlist;
        msgtoshow+="\n";
        msgtoshow+=countMap;
        msgtextview.setText(msgtoshow);
    }









    //practice11.11
//    private String printCollection(Collection co){
//        Iterator it = co.iterator();
//        String str = "";
//        while (it.hasNext()){
//            str += it.next().toString();
//            str += "\n";
//        }
//        return str;
//    }
}
