package ka;

import android.content.Context;
import ka.InterfaceC4817a;

/* JADX INFO: renamed from: ka.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4833q implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39503a;

    public C4833q(X3.a aVar) {
        this.f39503a = aVar;
    }

    public static C4833q a(X3.a aVar) {
        return new C4833q(aVar);
    }

    public static boolean c(Context context) {
        return InterfaceC4817a.c.p(context);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c((Context) this.f39503a.get()));
    }
}
