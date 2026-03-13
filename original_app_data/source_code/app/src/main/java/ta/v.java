package ta;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f44900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f44901b;

    public v(X3.a aVar, X3.a aVar2) {
        this.f44900a = aVar;
        this.f44901b = aVar2;
    }

    public static v a(X3.a aVar, X3.a aVar2) {
        return new v(aVar, aVar2);
    }

    public static u c(Context context, w wVar) {
        return new u(context, wVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((Context) this.f44900a.get(), (w) this.f44901b.get());
    }
}
