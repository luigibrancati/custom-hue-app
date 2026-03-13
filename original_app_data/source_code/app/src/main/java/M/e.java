package M;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static Context a(Context context, int i10) {
            return context.createDeviceContext(i10);
        }

        public static int b(Context context) {
            return context.getDeviceId();
        }
    }

    public static Context a(Context context) {
        int iB;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 34 && (iB = b.b(context)) != b.b(applicationContext)) {
            applicationContext = b.a(applicationContext, iB);
        }
        String strB = a.b(context);
        return !Objects.equals(strB, a.b(applicationContext)) ? a.a(applicationContext, strB) : applicationContext;
    }

    public static Application b(Context context) {
        for (Context contextA = a(context); contextA instanceof ContextWrapper; contextA = ((ContextWrapper) contextA).getBaseContext()) {
            if (contextA instanceof Application) {
                return (Application) contextA;
            }
        }
        return null;
    }
}
