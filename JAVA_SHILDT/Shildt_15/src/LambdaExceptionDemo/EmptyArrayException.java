package LambdaExceptionDemo;

class EmptyArrayException extends Exception{
    EmptyArrayException() {
        super("Array is empty.");
    }
}
