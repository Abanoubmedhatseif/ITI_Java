package src;

import java.util.*;

public class CollectionsDictionary {
    Map<Character, Set<String>> mydictionary = new HashMap<>();


    public boolean addNewWords (Collection<String> words){
        for (String word : words){
            String newWord = word.toLowerCase().trim();
            char key = newWord.charAt(0);
            Set<String> value = mydictionary.get(key);
            if ( value == null ){
                value = new TreeSet<>();
                mydictionary.put(key,value);
            }
            value.add(newWord);
        }
        return true;
    }


    public void printAll (){
        if (!mydictionary.isEmpty()) {
            for (Map.Entry<Character, Set<String>> eachElement : mydictionary.entrySet()){
                char key = eachElement.getKey();
                Set<String> values = eachElement.getValue();
                System.out.println(key + ": ");

                for (String element : values) {
                    System.out.println(element);
                }
                System.out.println();
            }
        }else {
            System.out.println("Empty");
        }
    }


    public void printByChar (char c){
        char ch = c ;
        ch = Character.toLowerCase(ch);
        if (mydictionary.containsKey(ch)){
            System.out.println(mydictionary.get(ch));
        }
        else {
            System.out.println("Not found");
        }
    }


    public void removeWord (String word) {
        word = word.toLowerCase();
        char ch = word.charAt(0);
        if (mydictionary.containsKey(ch)) {
            Set<String> temp = mydictionary.get(ch);
            if (temp.contains(word)) {
                temp.remove(word);
                mydictionary.put(ch, temp);
                System.out.println(word + ": Removed");
            }
        }else {
            System.out.println("Word Not found");
        }
    }


    public boolean removeKey (char key){
        char newKey = key ;
        newKey = Character.toLowerCase(newKey);
        if (mydictionary.containsKey(newKey)) {
            mydictionary.remove(newKey);
            System.out.println("Key removed");
            return true;
        }else {
            System.out.println("Key Not found");
            return false;
        }
    }




    public void searchUsingRegex (String wordToSearch) {
        wordToSearch = wordToSearch.toLowerCase().trim();
        char ch = wordToSearch.charAt(0);
        Set<String> temp = mydictionary.get(ch);

        if (temp != null) {
            String regex = ".*" + wordToSearch + ".*";

            if (temp.stream().anyMatch(s -> s.matches(regex))) {
                System.out.println("Word Found !!!");
            } else {
                System.out.println("Word doesn't Exist");
            }
        }
    }

    public void searchUsingContains (String wordToSearch){
        wordToSearch = wordToSearch.toLowerCase();
        wordToSearch = wordToSearch.replace(" ", "");
        char ch = wordToSearch.charAt(0);
        if (mydictionary.containsKey(ch)) {
            Set<String> temp = mydictionary.get(ch);
            if (temp.contains(wordToSearch)) {
                System.out.println("Word Found !!!");
            }else {
                System.out.println("Word doesnt Exist ");
            }
        }
    }




}
