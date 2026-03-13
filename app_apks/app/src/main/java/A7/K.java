package A7;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static F f173a;

    public static synchronized F a(Context context) {
        try {
            if (f173a == null) {
                v vVar = new v(null);
                vVar.a(new C0684h(B7.E.a(context)));
                f173a = vVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f173a;
    }
}
