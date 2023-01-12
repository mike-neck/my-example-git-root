package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
  public static void main(String... args) throws Exception {
    var loader = App.class.getClassLoader();
    try (var reader = new BufferedReader(new InputStreamReader(loader.getResourceAsStream("sub/test.txt")))) {
      var lines = reader.lines().toList();
      for(var line: lines) {
        System.out.println(line);
      }
    }
  }
}

