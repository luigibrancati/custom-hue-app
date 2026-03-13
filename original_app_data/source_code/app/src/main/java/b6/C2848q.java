package b6;

import java.util.Set;

/* JADX INFO: renamed from: b6.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2848q implements Y5.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f25365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2847p f25366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2851t f25367c;

    public C2848q(Set set, AbstractC2847p abstractC2847p, InterfaceC2851t interfaceC2851t) {
        this.f25365a = set;
        this.f25366b = abstractC2847p;
        this.f25367c = interfaceC2851t;
    }

    @Override // Y5.j
    public Y5.i a(String str, Class cls, Y5.c cVar, Y5.h hVar) {
        if (this.f25365a.contains(cVar)) {
            return new C2850s(this.f25366b, str, cVar, hVar, this.f25367c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f25365a));
    }
}
