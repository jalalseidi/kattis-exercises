package com.jalalseidi.kattis.ex2;

import java.util.ArrayList;
import java.util.List;

public class RollCall {
  // Testing testing
  public static void main(String[] args) {
    List<String> firstNames = new ArrayList<>();
    firstNames.add("Will");
    firstNames.add("Agent");
    firstNames.add("Peter");
    firstNames.add("Micky");
    firstNames.add("Minnie");
    firstNames.add("Peter");
    List<String> lastNames = new ArrayList<>();
    lastNames.add("Smith");
    lastNames.add("Smith");
    lastNames.add("Pan");
    lastNames.add("Mouse");
    lastNames.add("Mouse");
    lastNames.add("Gunn");

    for (int i = 0; i < firstNames.size(); i++) {
      System.out.println(firstNames.get(i) + " " + lastNames.get(i));
    }
  }
}