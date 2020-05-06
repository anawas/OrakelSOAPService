/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.abbts.sya.service;

import java.util.Random;

/**
 *
 * @author Andreas Wassmer (aw@andreas-wassmer.ch)
 */
public class Sayings {
  static String sayings[] = {
    "Nutze den Tag.",
    "Es ist Zeit, etwas Neues anzufangen.",
    "Heute ist dein Glückstag.",
    "Beginne den Tag mit einem Lächeln.",
    "Nimm es nicht zu schwer!",
    "Denk positiv!",
    "Wo Licht ist, ist auch Schatten.",
    "Kämpfe um das, was dich weiterbringt.",
    "Glaube an Wunder, Liebe und Glück!",
    "Am Ende wird alles gut"
  };
  
    public static String getSpell() {
        Random rand = new Random();
        int nr = rand.nextInt(sayings.length);
        return sayings[nr];
    }
}
