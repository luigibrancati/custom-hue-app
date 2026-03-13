package x3;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.tika.mime.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static String a(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.endsWith("/")) {
            return canonicalPath;
        }
        return canonicalPath + "/";
    }

    public static File b(File file, String str) throws IOException {
        String strA = a(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(strA)) {
            return new File(canonicalPath);
        }
        return null;
    }

    public static File c(Context context) {
        return b.a(context);
    }

    public static String d(String str) {
        String strA = h.a(str);
        return strA == null ? MimeTypes.PLAIN_TEXT : strA;
    }

    public static InputStream e(String str, InputStream inputStream) {
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static InputStream f(File file) {
        return e(file.getPath(), new FileInputStream(file));
    }
}
