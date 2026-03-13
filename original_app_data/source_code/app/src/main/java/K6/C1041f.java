package K6;

import b7.C2878l;
import u6.C5960i;
import u6.InterfaceC5968n;

/* JADX INFO: renamed from: K6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1041f implements InterfaceC5968n, B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1040e f7543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5960i f7544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7545c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1042g f7546d;

    public C1041f(C1042g c1042g, C5960i c5960i, InterfaceC1040e interfaceC1040e) {
        this.f7546d = c1042g;
        this.f7544b = c5960i;
        this.f7543a = interfaceC1040e;
    }

    @Override // K6.B
    public final synchronized void a(C5960i c5960i) {
        C5960i c5960i2 = this.f7544b;
        if (c5960i2 != c5960i) {
            c5960i2.a();
            this.f7544b = c5960i;
        }
    }

    @Override // u6.InterfaceC5968n
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        C5960i.a aVarB;
        boolean z10;
        G g10 = (G) obj;
        C2878l c2878l = (C2878l) obj2;
        synchronized (this) {
            aVarB = this.f7544b.b();
            z10 = this.f7545c;
            this.f7544b.a();
        }
        if (aVarB == null) {
            c2878l.c(Boolean.FALSE);
        } else {
            this.f7543a.a(g10, aVarB, z10, c2878l);
        }
    }

    @Override // K6.B
    public final void b() {
        C5960i.a aVarB;
        synchronized (this) {
            this.f7545c = false;
            aVarB = this.f7544b.b();
        }
        if (aVarB != null) {
            this.f7546d.n(aVarB, 2441);
        }
    }

    @Override // K6.B
    public final synchronized C5960i zza() {
        return this.f7544b;
    }
}
