package androidx.media3.exoplayer.rtsp;

import D1.InterfaceC0749g;
import G1.AbstractC0853a;
import G1.M;
import W1.n;
import android.os.Handler;
import androidx.media3.exoplayer.rtsp.a;
import e2.m;
import i2.C4330j;
import i2.I;
import i2.InterfaceC4337q;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f23713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f23714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f23715d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a.InterfaceC0301a f23717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.media3.exoplayer.rtsp.a f23718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public W1.c f23719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C4330j f23720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f23721j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile long f23723l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f23716e = M.z();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile long f23722k = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(String str, androidx.media3.exoplayer.rtsp.a aVar);
    }

    public b(int i10, n nVar, a aVar, r rVar, a.InterfaceC0301a interfaceC0301a) {
        this.f23712a = i10;
        this.f23713b = nVar;
        this.f23714c = aVar;
        this.f23715d = rVar;
        this.f23717f = interfaceC0301a;
    }

    @Override // e2.m.e
    public void b() {
        this.f23721j = true;
    }

    public void c() {
        ((W1.c) AbstractC0853a.e(this.f23719h)).e();
    }

    public void d(long j10, long j11) {
        this.f23722k = j10;
        this.f23723l = j11;
    }

    public void e(int i10) {
        if (((W1.c) AbstractC0853a.e(this.f23719h)).d()) {
            return;
        }
        this.f23719h.g(i10);
    }

    public void f(long j10) {
        if (j10 == -9223372036854775807L || ((W1.c) AbstractC0853a.e(this.f23719h)).d()) {
            return;
        }
        this.f23719h.h(j10);
    }

    @Override // e2.m.e
    public void load() {
        if (this.f23721j) {
            this.f23721j = false;
        }
        try {
            if (this.f23718g == null) {
                androidx.media3.exoplayer.rtsp.a aVarA = this.f23717f.a(this.f23712a);
                this.f23718g = aVarA;
                final String strB = aVarA.b();
                final androidx.media3.exoplayer.rtsp.a aVar = this.f23718g;
                this.f23716e.post(new Runnable() { // from class: W1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17690a.f23714c.a(strB, aVar);
                    }
                });
                this.f23720i = new C4330j((InterfaceC0749g) AbstractC0853a.e(this.f23718g), 0L, -1L);
                W1.c cVar = new W1.c(this.f23713b.f17745a, this.f23712a);
                this.f23719h = cVar;
                cVar.c(this.f23715d);
            }
            while (!this.f23721j) {
                if (this.f23722k != -9223372036854775807L) {
                    ((W1.c) AbstractC0853a.e(this.f23719h)).a(this.f23723l, this.f23722k);
                    this.f23722k = -9223372036854775807L;
                }
                if (((W1.c) AbstractC0853a.e(this.f23719h)).i((InterfaceC4337q) AbstractC0853a.e(this.f23720i), new I()) == -1) {
                    break;
                }
            }
            this.f23721j = false;
            if (((androidx.media3.exoplayer.rtsp.a) AbstractC0853a.e(this.f23718g)).k()) {
                I1.i.a(this.f23718g);
                this.f23718g = null;
            }
        } catch (Throwable th) {
            if (((androidx.media3.exoplayer.rtsp.a) AbstractC0853a.e(this.f23718g)).k()) {
                I1.i.a(this.f23718g);
                this.f23718g = null;
            }
            throw th;
        }
    }
}
