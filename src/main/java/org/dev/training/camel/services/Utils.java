package org.dev.training.camel.services;

import java.util.Arrays;
import java.util.List;

public class Utils {
  public static String getName(Object body) {
  List<String> splittedBody = Arrays.asList(body.toString().split(","));
  return splittedBody.get(1);
  }

  public static boolean startsWithVowel(String word) {
    return "aeiouEAIOU".indexOf(word.charAt(0)) >=0;
  }
}
