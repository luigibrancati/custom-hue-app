package ka;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class F implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39440a;

    public F(X3.a aVar) {
        this.f39440a = aVar;
    }

    public static F a(X3.a aVar) {
        return new F(aVar);
    }

    public static E c(Context context) {
        return new E(context);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public E get() {
        return c((Context) this.f39440a.get());
    }
}
