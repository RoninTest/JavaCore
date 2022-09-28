package Interface;

public interface Inter1 {

    public static final int SAYI1=20; // gri çünkü Interface ben zaten onları oyl ekabul ediyorum diyor.
    static final int SAYI2=10;
    final int SAYI3=5;
    int SAYI4=0;

    void inter1a();
    abstract void inter1b();
    default void inter1c(){ //Interface bodysi olma gerekliliği default + static keyword.

    }
}
