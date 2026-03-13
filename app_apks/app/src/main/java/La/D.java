package La;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class D {
    public static List a(Cursor cursor, int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Object objB = b(cursor, i11);
            if (Ma.a.f9424c) {
                String strC = c(objB);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("column ");
                sb2.append(i11);
                sb2.append(StringUtils.SPACE);
                sb2.append(cursor.getType(i11));
                sb2.append(": ");
                sb2.append(objB);
                sb2.append(strC == null ? "" : " (" + strC + ")");
                Log.d("Sqflite", sb2.toString());
            }
            arrayList.add(objB);
        }
        return arrayList;
    }

    public static Object b(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i10);
    }

    public static String c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!obj.getClass().isArray()) {
            return obj.getClass().getName();
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("array(");
            Class<?> componentType = obj.getClass().getComponentType();
            Objects.requireNonNull(componentType);
            sb2.append(componentType.getName());
            sb2.append(")");
            return sb2.toString();
        } catch (Exception unused) {
            return "array";
        }
    }

    public static long d(Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }

    public static Locale e(String str) {
        return f(str);
    }

    public static Locale f(String str) {
        return Locale.forLanguageTag(str);
    }
}
