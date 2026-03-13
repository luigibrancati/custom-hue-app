package U;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: U.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2272u implements X0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X0.a f16554a;

    public void a(X0.a aVar) {
        this.f16554a = aVar;
    }

    @Override // X0.a
    public void accept(Object obj) {
        AbstractC4862t.c(this.f16554a, "Listener is not set.");
        this.f16554a.accept(obj);
    }
}
