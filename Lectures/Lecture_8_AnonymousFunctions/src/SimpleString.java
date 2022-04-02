import java.util.Locale;

public class SimpleString implements IStringFunctions {
    @Override
    public String upperCassAndConcat(String str1, String str2) {
        return str1.toUpperCase() + str2.toUpperCase();
    }
}
