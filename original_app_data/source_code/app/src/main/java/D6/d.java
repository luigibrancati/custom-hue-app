package D6;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f2277b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f2278a = null;

    public static c a(Context context) {
        return f2277b.b(context);
    }

    public final synchronized c b(Context context) {
        try {
            if (this.f2278a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f2278a = new c(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2278a;
    }
}
