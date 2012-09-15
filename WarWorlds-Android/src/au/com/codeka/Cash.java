package au.com.codeka;

import java.text.NumberFormat;
import java.util.Locale;

import android.util.FloatMath;

public class Cash {
    public static String format(float cash) {
        String s = NumberFormat.getInstance(new Locale("en_US")).format(
            (int) FloatMath.floor(cash));
        return "$"+s;
    }
}
