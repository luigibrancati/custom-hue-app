package androidx.media3.exoplayer.dash;

import D1.InterfaceC0749g;
import D1.o;
import D1.u;
import D1.w;
import G1.C;
import G1.M;
import K1.C0;
import a2.b0;
import android.os.Handler;
import android.os.Message;
import b2.AbstractC2795e;
import i2.O;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import t2.C5828a;
import t2.C5829b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2.b f23647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f23648b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public O1.c f23652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23656j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TreeMap f23651e = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f23650d = M.A(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5829b f23649c = new C5829b();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f23657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f23658b;

        public a(long j10, long j11) {
            this.f23657a = j10;
            this.f23658b = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(long j10);

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c implements O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f23659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0 f23660b = new C0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r2.b f23661c = new r2.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f23662d = -9223372036854775807L;

        public c(e2.b bVar) {
            this.f23659a = b0.m(bVar);
        }

        @Override // i2.O
        public int c(InterfaceC0749g interfaceC0749g, int i10, boolean z10, int i11) {
            return this.f23659a.a(interfaceC0749g, i10, z10);
        }

        @Override // i2.O
        public void d(long j10, int i10, int i11, int i12, O.a aVar) {
            this.f23659a.d(j10, i10, i11, i12, aVar);
            m();
        }

        @Override // i2.O
        public void e(o oVar) {
            this.f23659a.e(oVar);
        }

        @Override // i2.O
        public void g(C c10, int i10, int i11) {
            this.f23659a.b(c10, i10);
        }

        public final r2.b h() {
            this.f23661c.s();
            if (this.f23659a.U(this.f23660b, this.f23661c, 0, false) != -4) {
                return null;
            }
            this.f23661c.E();
            return this.f23661c;
        }

        public boolean i(long j10) {
            return d.this.j(j10);
        }

        public void j(AbstractC2795e abstractC2795e) {
            long j10 = this.f23662d;
            if (j10 == -9223372036854775807L || abstractC2795e.f25001h > j10) {
                this.f23662d = abstractC2795e.f25001h;
            }
            d.this.m(abstractC2795e);
        }

        public boolean k(AbstractC2795e abstractC2795e) {
            long j10 = this.f23662d;
            return d.this.n(j10 != -9223372036854775807L && j10 < abstractC2795e.f25000g);
        }

        public final void l(long j10, long j11) {
            d.this.f23650d.sendMessage(d.this.f23650d.obtainMessage(1, new a(j10, j11)));
        }

        public final void m() {
            while (this.f23659a.N(false)) {
                r2.b bVarH = h();
                if (bVarH != null) {
                    long j10 = bVarH.f5880f;
                    u uVarA = d.this.f23649c.a(bVarH);
                    if (uVarA != null) {
                        C5828a c5828a = (C5828a) uVarA.d(0);
                        if (d.h(c5828a.f44557a, c5828a.f44558b)) {
                            n(j10, c5828a);
                        }
                    }
                }
            }
            this.f23659a.t();
        }

        public final void n(long j10, C5828a c5828a) {
            long jF = d.f(c5828a);
            if (jF == -9223372036854775807L) {
                return;
            }
            l(j10, jF);
        }

        public void o() {
            this.f23659a.V();
        }
    }

    public d(O1.c cVar, b bVar, e2.b bVar2) {
        this.f23652f = cVar;
        this.f23648b = bVar;
        this.f23647a = bVar2;
    }

    public static long f(C5828a c5828a) {
        try {
            return M.U0(M.H(c5828a.f44561e));
        } catch (w unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean h(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    public final Map.Entry e(long j10) {
        return this.f23651e.ceilingEntry(Long.valueOf(j10));
    }

    public final void g(long j10, long j11) {
        Long l10 = (Long) this.f23651e.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f23651e.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f23651e.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f23656j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f23657a, aVar.f23658b);
        return true;
    }

    public final void i() {
        if (this.f23654h) {
            this.f23655i = true;
            this.f23654h = false;
            this.f23648b.b();
        }
    }

    public boolean j(long j10) {
        O1.c cVar = this.f23652f;
        boolean z10 = false;
        if (!cVar.f10769d) {
            return false;
        }
        if (this.f23655i) {
            return true;
        }
        Map.Entry entryE = e(cVar.f10773h);
        if (entryE != null && ((Long) entryE.getValue()).longValue() < j10) {
            this.f23653g = ((Long) entryE.getKey()).longValue();
            l();
            z10 = true;
        }
        if (z10) {
            i();
        }
        return z10;
    }

    public c k() {
        return new c(this.f23647a);
    }

    public final void l() {
        this.f23648b.a(this.f23653g);
    }

    public void m(AbstractC2795e abstractC2795e) {
        this.f23654h = true;
    }

    public boolean n(boolean z10) {
        if (!this.f23652f.f10769d) {
            return false;
        }
        if (this.f23655i) {
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f23656j = true;
        this.f23650d.removeCallbacksAndMessages(null);
    }

    public final void p() {
        Iterator it = this.f23651e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f23652f.f10773h) {
                it.remove();
            }
        }
    }

    public void q(O1.c cVar) {
        this.f23655i = false;
        this.f23653g = -9223372036854775807L;
        this.f23652f = cVar;
        p();
    }
}
