//import java.io.InputStream;
//
//public class OneZeroStream extends InputStream {
//    private byte[] bytes = {'1', ' ', '0', ' '};
//    int i = 0;
//    public int read(){
//        if (i >= bytes.length)
//            i = 0;
//        return bytes[i++];
//
//    }
//} // ответ SkillFactory

import java.io.InputStream;

public class  OneZeroStream extends InputStream {
// наследуется класс InputStream, в котором метод read() абстрактный,
// поэтому он должен реализоваться
    private int i = 0;
    private boolean k = true;
    byte[] one = {'1'};
    byte[] zero = {'0'};
    byte[] space = {' '};

    public int read() {
        if (i == 0 && k) {
            i = 1;
            k = false;
            return one[0];
        }
        else if (i == 1) {
            i = 0;
            return space[0];
        }
        else
            i = 1;
            k = true;
            return zero[0];
    }
}