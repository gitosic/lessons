package ru.curs.methods;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class Verifications {



    public void checkOne(String text, String check){
//        List<String> list = new LinkedList<String>();
//        list.add("London is the capital of Great Britain");
//        String text = "London is the capital of Great Britain";
//        assertThat(text, containsString("Apppium"));
        assertThat(text, containsString(check));
    }
}
