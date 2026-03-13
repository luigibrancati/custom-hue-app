package c2;

import D1.o;
import D1.v;
import F2.k;
import F2.l;
import F2.m;
import F2.p;
import F2.q;
import G1.AbstractC0853a;
import G1.M;
import G1.t;
import K1.AbstractC1001i;
import K1.C0;
import K1.f1;
import K7.AbstractC1081v;
import a2.InterfaceC2611D;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: renamed from: c2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2938i extends AbstractC1001i implements Handler.Callback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public q f25560A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public q f25561B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f25562C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Handler f25563D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final InterfaceC2937h f25564E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0 f25565F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f25566G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f25567H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public o f25568I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f25569J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f25570P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f25571Q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final F2.b f25572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final J1.f f25573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC2930a f25574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC2936g f25575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f25576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f25577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l f25578y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p f25579z;

    public C2938i(InterfaceC2937h interfaceC2937h, Looper looper) {
        this(interfaceC2937h, looper, InterfaceC2936g.f25558a);
    }

    public static boolean A0(o oVar) {
        return Objects.equals(oVar.f1805o, "application/x-media3-cues");
    }

    private long v0(long j10) {
        AbstractC0853a.g(j10 != -9223372036854775807L);
        return j10 - a0();
    }

    public static boolean x0(k kVar, long j10) {
        return kVar != null && kVar.p() > 0 && kVar.j(kVar.p() - 1) > j10;
    }

    public final boolean B0(long j10) {
        if (this.f25566G || o0(this.f25565F, this.f25573t, 0) != -4) {
            return false;
        }
        if (this.f25573t.w()) {
            this.f25566G = true;
            return false;
        }
        this.f25573t.E();
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC0853a.e(this.f25573t.f5878d);
        F2.e eVarA = this.f25572s.a(this.f25573t.f5880f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f25573t.s();
        return this.f25574u.c(eVarA, j10);
    }

    public final void C0() {
        this.f25579z = null;
        this.f25562C = -1;
        q qVar = this.f25560A;
        if (qVar != null) {
            qVar.C();
            this.f25560A = null;
        }
        q qVar2 = this.f25561B;
        if (qVar2 != null) {
            qVar2.C();
            this.f25561B = null;
        }
    }

    public final void D0() {
        C0();
        ((l) AbstractC0853a.e(this.f25578y)).release();
        this.f25578y = null;
        this.f25577x = 0;
    }

    public final void E0(long j10) {
        boolean zB0 = B0(j10);
        long jD = this.f25574u.d(this.f25569J);
        if (jD == Long.MIN_VALUE && this.f25566G && !zB0) {
            this.f25567H = true;
        }
        if (jD != Long.MIN_VALUE && jD <= j10) {
            zB0 = true;
        }
        if (zB0) {
            AbstractC1081v abstractC1081vA = this.f25574u.a(j10);
            long jB = this.f25574u.b(j10);
            I0(new F1.c(abstractC1081vA, v0(jB)));
            this.f25574u.e(jB);
        }
        this.f25569J = j10;
    }

    public final void F0(long j10) {
        boolean z10;
        this.f25569J = j10;
        if (this.f25561B == null) {
            ((l) AbstractC0853a.e(this.f25578y)).b(j10);
            try {
                this.f25561B = (q) ((l) AbstractC0853a.e(this.f25578y)).a();
            } catch (m e10) {
                w0(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f25560A != null) {
            long jU0 = u0();
            z10 = false;
            while (jU0 <= j10) {
                this.f25562C++;
                jU0 = u0();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        q qVar = this.f25561B;
        if (qVar != null) {
            if (qVar.w()) {
                if (!z10 && u0() == Long.MAX_VALUE) {
                    if (this.f25577x == 2) {
                        G0();
                    } else {
                        C0();
                        this.f25567H = true;
                    }
                }
            } else if (qVar.f5886b <= j10) {
                q qVar2 = this.f25560A;
                if (qVar2 != null) {
                    qVar2.C();
                }
                this.f25562C = qVar.a(j10);
                this.f25560A = qVar;
                this.f25561B = null;
                z10 = true;
            }
        }
        if (z10) {
            AbstractC0853a.e(this.f25560A);
            I0(new F1.c(this.f25560A.b(j10), v0(t0(j10))));
        }
        if (this.f25577x == 2) {
            return;
        }
        while (!this.f25566G) {
            try {
                p pVar = this.f25579z;
                if (pVar == null) {
                    pVar = (p) ((l) AbstractC0853a.e(this.f25578y)).e();
                    if (pVar == null) {
                        return;
                    } else {
                        this.f25579z = pVar;
                    }
                }
                if (this.f25577x == 1) {
                    pVar.B(4);
                    ((l) AbstractC0853a.e(this.f25578y)).c(pVar);
                    this.f25579z = null;
                    this.f25577x = 2;
                    return;
                }
                int iO0 = o0(this.f25565F, pVar, 0);
                if (iO0 == -4) {
                    if (pVar.w()) {
                        this.f25566G = true;
                        this.f25576w = false;
                    } else {
                        o oVar = this.f25565F.f6835b;
                        if (oVar == null) {
                            return;
                        }
                        pVar.f3682j = oVar.f1810t;
                        pVar.E();
                        this.f25576w &= !pVar.y();
                    }
                    if (!this.f25576w) {
                        ((l) AbstractC0853a.e(this.f25578y)).c(pVar);
                        this.f25579z = null;
                    }
                } else if (iO0 == -3) {
                    return;
                }
            } catch (m e11) {
                w0(e11);
                return;
            }
        }
    }

    public final void G0() {
        D0();
        y0();
    }

    public void H0(long j10) {
        AbstractC0853a.g(B());
        this.f25570P = j10;
    }

    public final void I0(F1.c cVar) {
        Handler handler = this.f25563D;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            z0(cVar);
        }
    }

    @Override // K1.f1
    public int a(o oVar) {
        if (A0(oVar) || this.f25575v.a(oVar)) {
            return f1.u(oVar.f1789P == 0 ? 4 : 2);
        }
        return v.s(oVar.f1805o) ? f1.u(1) : f1.u(0);
    }

    @Override // K1.e1
    public boolean b() {
        return this.f25567H;
    }

    @Override // K1.AbstractC1001i
    public void d0() {
        this.f25568I = null;
        this.f25570P = -9223372036854775807L;
        s0();
        this.f25569J = -9223372036854775807L;
        if (this.f25578y != null) {
            D0();
        }
    }

    @Override // K1.e1
    public void g(long j10, long j11) {
        if (B()) {
            long j12 = this.f25570P;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                C0();
                this.f25567H = true;
            }
        }
        if (this.f25567H) {
            return;
        }
        if (A0((o) AbstractC0853a.e(this.f25568I))) {
            AbstractC0853a.e(this.f25574u);
            E0(j10);
        } else {
            r0();
            F0(j10);
        }
    }

    @Override // K1.AbstractC1001i
    public void g0(long j10, boolean z10) {
        this.f25569J = j10;
        InterfaceC2930a interfaceC2930a = this.f25574u;
        if (interfaceC2930a != null) {
            interfaceC2930a.clear();
        }
        s0();
        this.f25566G = false;
        this.f25567H = false;
        this.f25570P = -9223372036854775807L;
        o oVar = this.f25568I;
        if (oVar == null || A0(oVar)) {
            return;
        }
        if (this.f25577x != 0) {
            G0();
            return;
        }
        C0();
        l lVar = (l) AbstractC0853a.e(this.f25578y);
        lVar.flush();
        lVar.d(X());
    }

    @Override // K1.e1, K1.f1
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        z0((F1.c) message.obj);
        return true;
    }

    @Override // K1.e1
    public boolean isReady() {
        o oVar = this.f25568I;
        if (oVar == null) {
            return true;
        }
        if (!A0((o) AbstractC0853a.e(oVar))) {
            return !this.f25567H && (!this.f25566G || x0(this.f25560A, this.f25569J) || x0(this.f25561B, this.f25569J) || this.f25579z == null);
        }
        if (((InterfaceC2930a) AbstractC0853a.e(this.f25574u)).d(this.f25569J) != Long.MIN_VALUE) {
            return true;
        }
        try {
            y();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // K1.AbstractC1001i
    public void m0(o[] oVarArr, long j10, long j11, InterfaceC2611D.b bVar) {
        o oVar = oVarArr[0];
        this.f25568I = oVar;
        if (A0(oVar)) {
            this.f25574u = this.f25568I.f1786M == 1 ? new C2934e() : new C2935f();
            return;
        }
        r0();
        if (this.f25578y != null) {
            this.f25577x = 1;
        } else {
            y0();
        }
    }

    public final void r0() {
        AbstractC0853a.h(this.f25571Q || Objects.equals(this.f25568I.f1805o, "application/cea-608") || Objects.equals(this.f25568I.f1805o, "application/x-mp4-cea-608") || Objects.equals(this.f25568I.f1805o, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f25568I.f1805o + " samples (expected application/x-media3-cues).");
    }

    public final void s0() {
        I0(new F1.c(AbstractC1081v.z(), v0(this.f25569J)));
    }

    public final long t0(long j10) {
        int iA = this.f25560A.a(j10);
        if (iA == 0 || this.f25560A.p() == 0) {
            return this.f25560A.f5886b;
        }
        if (iA != -1) {
            return this.f25560A.j(iA - 1);
        }
        return this.f25560A.j(r1.p() - 1);
    }

    public final long u0() {
        if (this.f25562C == -1) {
            return Long.MAX_VALUE;
        }
        AbstractC0853a.e(this.f25560A);
        if (this.f25562C >= this.f25560A.p()) {
            return Long.MAX_VALUE;
        }
        return this.f25560A.j(this.f25562C);
    }

    public final void w0(m mVar) {
        t.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f25568I, mVar);
        s0();
        G0();
    }

    public final void y0() {
        this.f25576w = true;
        l lVarB = this.f25575v.b((o) AbstractC0853a.e(this.f25568I));
        this.f25578y = lVarB;
        lVarB.d(X());
    }

    public final void z0(F1.c cVar) {
        this.f25564E.onCues(cVar.f3640a);
        this.f25564E.onCues(cVar);
    }

    public C2938i(InterfaceC2937h interfaceC2937h, Looper looper, InterfaceC2936g interfaceC2936g) {
        super(3);
        this.f25564E = (InterfaceC2937h) AbstractC0853a.e(interfaceC2937h);
        this.f25563D = looper == null ? null : M.y(looper, this);
        this.f25575v = interfaceC2936g;
        this.f25572s = new F2.b();
        this.f25573t = new J1.f(1);
        this.f25565F = new C0();
        this.f25570P = -9223372036854775807L;
        this.f25569J = -9223372036854775807L;
        this.f25571Q = false;
    }
}
