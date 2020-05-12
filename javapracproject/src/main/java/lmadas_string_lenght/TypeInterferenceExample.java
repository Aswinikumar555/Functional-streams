package lmadas_string_lenght;

public class TypeInterferenceExample {

    public static void main(String[] args) {

//        TypeInterferenceExample typeinetr = new TypeInterferenceExample();

        StringLenghtLamda lamda1 = (s) -> s.length();
        System.out.println(lamda1.getStringLenght("hellow"));

        StringLenghtLamda l1 = (s) -> s.length();
        System.out.println(l1.getStringLenght("aswini kumar"));
    }

    public interface StringLenghtLamda {
        int getStringLenght(String s);
    }
}

