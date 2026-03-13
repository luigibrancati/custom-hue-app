package ka;

import android.content.Context;
import ua.C6013d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        BLUETOOTH_NOT_AVAILABLE,
        LOCATION_PERMISSION_NOT_GRANTED,
        BLUETOOTH_NOT_ENABLED,
        LOCATION_SERVICES_NOT_ENABLED,
        READY
    }

    public static G a(Context context) {
        return AbstractC4815A.a().a(context.getApplicationContext()).build().a();
    }

    public static void f(C c10) {
        ma.q.o(c10);
    }

    public abstract P b(String str);

    public abstract a c();

    public abstract Eb.k d();

    public abstract Eb.k e(ua.g gVar, C6013d... c6013dArr);
}
