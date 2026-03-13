package org.apache.tika.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.exception.TikaException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ExceptionUtils {
    private static final Pattern MSG_PATTERN = Pattern.compile(":[^\r\n]+");

    public static String getFilteredStackTrace(Throwable th) {
        if (th.getClass().equals(TikaException.class) && th.getCause() != null) {
            th = th.getCause();
        }
        return getStackTrace(th);
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        try {
            printWriter.flush();
            stringWriter.flush();
            printWriter.close();
            stringWriter.close();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public static String trimMessage(String str) {
        Matcher matcher = MSG_PATTERN.matcher(str);
        return matcher.find() ? matcher.replaceFirst("") : str;
    }
}
