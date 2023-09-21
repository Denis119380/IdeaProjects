package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;

public class AbsMinus implements BinaryFunc {

  // возвратить имя данной функции
  public String getName() {
    return "absMinus";
  }
  
  // реализовать функцию absMinus()
  public int func(int a, int b) {
    return Math.abs(a) - Math.abs(b);
  }
}