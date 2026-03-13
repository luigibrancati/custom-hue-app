package U1;

import D1.o;
import D1.u;
import G1.AbstractC0853a;
import G1.M;
import K1.AbstractC1001i;
import K1.C0;
import K1.f1;
import a2.InterfaceC2611D;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import r2.InterfaceC5527a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC1001i implements Handler.Callback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f16581A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public u f16582B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f16583C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f16584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f16585t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Handler f16586u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r2.b f16587v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f16588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InterfaceC5527a f16589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16590y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f16591z;

    public c(b bVar, Looper looper) {
        this(bVar, looper, a.f16580a);
    }

    @Override // K1.f1
    public int a(o oVar) {
        if (this.f16584s.a(oVar)) {
            return f1.u(oVar.f1789P == 0 ? 4 : 2);
        }
        return f1.u(0);
    }

    @Override // K1.e1
    public boolean b() {
        return this.f16591z;
    }

    @Override // K1.AbstractC1001i
    public void d0() {
        this.f16582B = null;
        this.f16589x = null;
        this.f16583C = -9223372036854775807L;
    }

    @Override // K1.e1
    public void g(long j10, long j11) {
        boolean zV0 = true;
        while (zV0) {
            w0();
            zV0 = v0(j10);
        }
    }

    @Override // K1.AbstractC1001i
    public void g0(long j10, boolean z10) {
        this.f16582B = null;
        this.f16590y = false;
        this.f16591z = false;
    }

    @Override // K1.e1, K1.f1
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        u0((u) message.obj);
        return true;
    }

    @Override // K1.e1
    public boolean isReady() {
        return true;
    }

    @Override // K1.AbstractC1001i
    public void m0(o[] oVarArr, long j10, long j11, InterfaceC2611D.b bVar) {
        this.f16589x = this.f16584s.b(oVarArr[0]);
        u uVar = this.f16582B;
        if (uVar != null) {
            this.f16582B = uVar.c((uVar.f2100b + this.f16583C) - j11);
        }
        this.f16583C = j11;
    }

    public final void r0(u uVar, List list) {
        for (int i10 = 0; i10 < uVar.e(); i10++) {
            o oVarA = uVar.d(i10).a();
            if (oVarA == null || !this.f16584s.a(oVarA)) {
                list.add(uVar.d(i10));
            } else {
                InterfaceC5527a interfaceC5527aB = this.f16584s.b(oVarA);
                byte[] bArr = (byte[]) AbstractC0853a.e(uVar.d(i10).c());
                this.f16587v.s();
                this.f16587v.D(bArr.length);
                ((ByteBuffer) M.i(this.f16587v.f5878d)).put(bArr);
                this.f16587v.E();
                u uVarA = interfaceC5527aB.a(this.f16587v);
                if (uVarA != null) {
                    r0(uVarA, list);
                }
            }
        }
    }

    public final long s0(long j10) {
        AbstractC0853a.g(j10 != -9223372036854775807L);
        AbstractC0853a.g(this.f16583C != -9223372036854775807L);
        return j10 - this.f16583C;
    }

    public final void t0(u uVar) {
        Handler handler = this.f16586u;
        if (handler != null) {
            handler.obtainMessage(1, uVar).sendToTarget();
        } else {
            u0(uVar);
        }
    }

    public final void u0(u uVar) {
        this.f16585t.onMetadata(uVar);
    }

    public final boolean v0(long j10) {
        boolean z10;
        u uVar = this.f16582B;
        if (uVar == null || (!this.f16588w && uVar.f2100b > s0(j10))) {
            z10 = false;
        } else {
            t0(this.f16582B);
            this.f16582B = null;
            z10 = true;
        }
        if (this.f16590y && this.f16582B == null) {
            this.f16591z = true;
        }
        return z10;
    }

    public final void w0() {
        if (this.f16590y || this.f16582B != null) {
            return;
        }
        this.f16587v.s();
        C0 c0V = V();
        int iO0 = o0(c0V, this.f16587v, 0);
        if (iO0 != -4) {
            if (iO0 == -5) {
                this.f16581A = ((o) AbstractC0853a.e(c0V.f6835b)).f1810t;
                return;
            }
            return;
        }
        if (this.f16587v.w()) {
            this.f16590y = true;
            return;
        }
        if (this.f16587v.f5880f >= X()) {
            r2.b bVar = this.f16587v;
            bVar.f43514j = this.f16581A;
            bVar.E();
            u uVarA = ((InterfaceC5527a) M.i(this.f16589x)).a(this.f16587v);
            if (uVarA != null) {
                ArrayList arrayList = new ArrayList(uVarA.e());
                r0(uVarA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f16582B = new u(s0(this.f16587v.f5880f), arrayList);
            }
        }
    }

    public c(b bVar, Looper looper, a aVar) {
        this(bVar, looper, aVar, false);
    }

    public c(b bVar, Looper looper, a aVar, boolean z10) {
        super(5);
        this.f16585t = (b) AbstractC0853a.e(bVar);
        this.f16586u = looper == null ? null : M.y(looper, this);
        this.f16584s = (a) AbstractC0853a.e(aVar);
        this.f16588w = z10;
        this.f16587v = new r2.b();
        this.f16583C = -9223372036854775807L;
    }
}
