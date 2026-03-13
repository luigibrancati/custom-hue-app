package ke;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {
    public static void a(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static String c(String str, Object obj) {
        e(str, obj);
        a(!TextUtils.isEmpty(str), obj);
        return str;
    }

    public static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object e(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static String f(String str, Object obj) {
        if (str != null) {
            c(str, obj);
        }
        return str;
    }
}
