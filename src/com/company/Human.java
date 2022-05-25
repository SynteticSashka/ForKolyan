package com.company;

import com.company.furniture.Sofa;

public class Human {
  String name;
  int age;

  public void moveTo(Sofa s) {
    System.out.println(this.name + " подошёл к " + s.getName());
  }

  public void sitOn(Sofa s) {
    System.out.println(this.name + " сел на " + s.getName());
  }
}
