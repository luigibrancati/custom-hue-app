package A7;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B implements InterfaceC0677a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B7.J f162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B7.J f163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B7.J f164c;

    public B(B7.J j10, B7.J j11, B7.J j12) {
        this.f162a = j10;
        this.f163b = j11;
        this.f164c = j12;
    }

    @Override // A7.InterfaceC0677a
    public final void a(InterfaceC0680d interfaceC0680d) {
        d().a(interfaceC0680d);
    }

    @Override // A7.InterfaceC0677a
    public final Set b() {
        return d().b();
    }

    @Override // A7.InterfaceC0677a
    public final void c(InterfaceC0680d interfaceC0680d) {
        d().c(interfaceC0680d);
    }

    public final InterfaceC0677a d() {
        return this.f164c.zza() != null ? (InterfaceC0677a) this.f163b.zza() : (InterfaceC0677a) this.f162a.zza();
    }
}
