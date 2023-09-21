package userfuncs.binaryfuncs;

public interface BinaryFunc {
  // получить имя функции
  public String getName();
  
  // Выполняемая функция. Предоставляется
  // в конкретных реализациях.
  public int func(int a, int b);
}