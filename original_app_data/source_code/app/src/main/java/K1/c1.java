package K1;

import G1.AbstractC0853a;
import G1.InterfaceC0860h;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f7017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0860h f7019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D1.D f7020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f7022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Looper f7023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7025i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7026j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7030n;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void d(c1 c1Var);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void w(int i10, Object obj);
    }

    public c1(a aVar, b bVar, D1.D d10, int i10, InterfaceC0860h interfaceC0860h, Looper looper) {
        this.f7018b = aVar;
        this.f7017a = bVar;
        this.f7020d = d10;
        this.f7023g = looper;
        this.f7019c = interfaceC0860h;
        this.f7024h = i10;
    }

    public boolean a() {
        return this.f7026j;
    }

    public Looper b() {
        return this.f7023g;
    }

    public int c() {
        return this.f7024h;
    }

    public Object d() {
        return this.f7022f;
    }

    public long e() {
        return this.f7025i;
    }

    public b f() {
        return this.f7017a;
    }

    public D1.D g() {
        return this.f7020d;
    }

    public int h() {
        return this.f7021e;
    }

    public synchronized boolean i() {
        return this.f7030n;
    }

    public synchronized void j(boolean z10) {
        this.f7028l = z10 | this.f7028l;
        this.f7029m = true;
        notifyAll();
    }

    public c1 k() {
        AbstractC0853a.g(!this.f7027k);
        if (this.f7025i == -9223372036854775807L) {
            AbstractC0853a.a(this.f7026j);
        }
        this.f7027k = true;
        this.f7018b.d(this);
        return this;
    }

    public c1 l(Object obj) {
        AbstractC0853a.g(!this.f7027k);
        this.f7022f = obj;
        return this;
    }

    public c1 m(int i10) {
        AbstractC0853a.g(!this.f7027k);
        this.f7021e = i10;
        return this;
    }
}
