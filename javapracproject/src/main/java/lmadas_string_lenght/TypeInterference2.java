package lmadas_string_lenght;

public class TypeInterference2 {
    public static void main(String[] args) {
        getlebth(s -> s.length());
    }

    public static void getlebth(StringLenghtLamda l) {
        System.out.println(l.getStringLenght("Aswinikumar"));
    }

    public interface StringLenghtLamda {
        int getStringLenght(String s);
    }
}
