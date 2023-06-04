package CreatingYourOwnExceptionSubclasses;

class MyException extends Exception {
                      // определяется подкласса MyException
                      // производный от класса Exception
    private int detail;

    MyException(int detail) { // конструктор
        this.detail = detail;
    }
    public String toString() { // переопределённый метод toString(),
                        // для вывода описания исключения
        return "MyException[" + detail + "]";
    }
}
