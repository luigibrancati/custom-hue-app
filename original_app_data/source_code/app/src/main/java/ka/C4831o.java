package ka;

import android.content.Context;
import ka.InterfaceC4817a;

/* JADX INFO: renamed from: ka.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4831o implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f39499b;

    public C4831o(X3.a aVar, X3.a aVar2) {
        this.f39498a = aVar;
        this.f39499b = aVar2;
    }

    public static C4831o a(X3.a aVar, X3.a aVar2) {
        return new C4831o(aVar, aVar2);
    }

    public static boolean c(Context context, int i10) {
        return InterfaceC4817a.c.n(context, i10);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c((Context) this.f39498a.get(), ((Integer) this.f39499b.get()).intValue()));
    }
}
