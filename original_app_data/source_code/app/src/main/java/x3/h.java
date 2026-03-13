package x3;

import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return strGuessContentTypeFromName != null ? strGuessContentTypeFromName : b(str);
    }

    public static String b(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return null;
        }
        String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
        }
        return null;
    }
}
