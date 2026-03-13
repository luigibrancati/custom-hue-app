package Od;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class H extends G {
    public static String i1(String str, int i10) {
        AbstractC4862t.e(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(Bc.k.h(i10, str.length()));
            AbstractC4862t.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String j1(String str, int i10) {
        AbstractC4862t.e(str, "<this>");
        if (i10 >= 0) {
            return m1(str, Bc.k.e(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char k1(CharSequence charSequence) {
        AbstractC4862t.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(F.c0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char l1(CharSequence charSequence) {
        AbstractC4862t.e(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String m1(String str, int i10) {
        AbstractC4862t.e(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, Bc.k.h(i10, str.length()));
            AbstractC4862t.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
