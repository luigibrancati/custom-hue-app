package m8;

import java.util.HashSet;
import java.util.Set;
import l8.InterfaceC4964a;

/* JADX INFO: renamed from: m8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5029d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f40209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4964a.b f40210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W6.a f40211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5028c f40212d;

    public C5029d(W6.a aVar, InterfaceC4964a.b bVar) {
        this.f40210b = bVar;
        this.f40211c = aVar;
        C5028c c5028c = new C5028c(this);
        this.f40212d = c5028c;
        aVar.f(c5028c);
        this.f40209a = new HashSet();
    }

    public final /* synthetic */ InterfaceC4964a.b a() {
        return this.f40210b;
    }
}
