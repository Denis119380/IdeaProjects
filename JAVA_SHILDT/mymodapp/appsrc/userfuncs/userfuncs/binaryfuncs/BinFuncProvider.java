package userfuncs.binaryfuncs;
import userfuncs.binaryfuncs.BinaryFunc;

public interface BinFuncProvider {
  // получить экземпляр типа BinaryFunc
  public BinaryFunc get();
}