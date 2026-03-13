package ta;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f44872a;

    public o(X3.a aVar) {
        this.f44872a = aVar;
    }

    public static o a(X3.a aVar) {
        return new o(aVar);
    }

    public static n c(Context context) {
        return new n(context);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c((Context) this.f44872a.get());
    }
}
