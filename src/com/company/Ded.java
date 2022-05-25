package com.company;

import com.company.furniture.Sofa;

public class Ded extends Human {
  @Override
  public void moveTo(Sofa s) {
    System.out.println(this.name + " доковылял до " + s.getName());
  }
}
