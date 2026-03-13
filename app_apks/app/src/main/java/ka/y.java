package ka;

import android.content.Context;
import ka.InterfaceC4817a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39523a;

    public y(X3.a aVar) {
        this.f39523a = aVar;
    }

    public static y a(X3.a aVar) {
        return new y(aVar);
    }

    public static int c(Context context) {
        return InterfaceC4817a.c.x(context);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c((Context) this.f39523a.get()));
    }
}
