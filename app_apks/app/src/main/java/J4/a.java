package J4;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements M4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D4.e f6102a;

    public a(D4.e state) {
        AbstractC4862t.e(state, "state");
        this.f6102a = state;
    }

    @Override // M4.h
    public void a(String str) {
        this.f6102a.d(str);
    }

    @Override // M4.h
    public void b(M4.e identity, M4.m updateType) {
        AbstractC4862t.e(identity, "identity");
        AbstractC4862t.e(updateType, "updateType");
        if (updateType == M4.m.Initialized) {
            this.f6102a.e(identity.b());
            this.f6102a.d(identity.a());
        }
    }

    @Override // M4.h
    public void c(String str) {
        this.f6102a.e(str);
    }
}
