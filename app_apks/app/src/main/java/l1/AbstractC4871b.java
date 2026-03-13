package l1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import d.AbstractC3782A;

/* JADX INFO: renamed from: l1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4871b {
    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC3782A.a(autoCloseable);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean b(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
                return cursorQuery.getCount() > 0;
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
                a(cursorQuery);
                return false;
            }
        } finally {
            a(cursorQuery);
        }
    }

    public static String c(Context context, Uri uri) {
        return f(context, uri, "_display_name", null);
    }

    public static String d(Context context, Uri uri) {
        return f(context, uri, "mime_type", null);
    }

    public static boolean e(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(d(context, uri));
    }

    public static String f(Context context, Uri uri, String str, String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    a(cursorQuery);
                    return str2;
                }
                String string = cursorQuery.getString(0);
                a(cursorQuery);
                return string;
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
                a(cursorQuery);
                return str2;
            }
        } catch (Throwable th) {
            a(cursorQuery);
            throw th;
        }
    }
}
