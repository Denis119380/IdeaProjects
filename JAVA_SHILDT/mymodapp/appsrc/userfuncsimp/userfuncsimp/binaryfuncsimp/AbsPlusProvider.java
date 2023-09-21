// В этом классе реализуется поставщик
// двоичной функции сложения absPlus()

package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.*;

public class AbsPlusProvider implements BinFuncProvider {
  // предоставить объект типа AbsPlus
  public BinaryFunc get() {
    return new AbsPlus();
  }
}