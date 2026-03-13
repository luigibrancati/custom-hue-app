package u6;

import b7.C2878l;
import s6.C5785d;
import t6.C5843a;
import u6.C5960i;

/* JADX INFO: renamed from: u6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5966l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5960i f45198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5785d[] f45199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45201d;

    public AbstractC5966l(C5960i c5960i, C5785d[] c5785dArr, boolean z10, int i10) {
        this.f45198a = c5960i;
        this.f45199b = c5785dArr;
        this.f45200c = z10;
        this.f45201d = i10;
    }

    public void a() {
        this.f45198a.a();
    }

    public C5960i.a b() {
        return this.f45198a.b();
    }

    public C5785d[] c() {
        return this.f45199b;
    }

    public abstract void d(C5843a.b bVar, C2878l c2878l);

    public final boolean e() {
        return this.f45200c;
    }

    public final int f() {
        return this.f45201d;
    }
}
