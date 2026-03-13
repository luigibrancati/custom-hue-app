package Sd;

import Bc.k;
import Rd.C0;
import Rd.C2123d0;
import Rd.InterfaceC2127f0;
import Rd.InterfaceC2138l;
import Rd.M0;
import Rd.W;
import android.os.Handler;
import android.os.Looper;
import fc.C4015H;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends g implements W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f15868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f15871e;

    public f(Handler handler, String str, boolean z10) {
        super(null);
        this.f15868b = handler;
        this.f15869c = str;
        this.f15870d = z10;
        this.f15871e = z10 ? this : new f(handler, str, true);
    }

    public static final void f1(f fVar, Runnable runnable) {
        fVar.f15868b.removeCallbacks(runnable);
    }

    public static final void g1(InterfaceC2138l interfaceC2138l, f fVar) {
        interfaceC2138l.e(fVar, C4015H.f34254a);
    }

    public static final C4015H h1(f fVar, Runnable runnable, Throwable th) {
        fVar.f15868b.removeCallbacks(runnable);
        return C4015H.f34254a;
    }

    @Override // Rd.W
    public void G(long j10, final InterfaceC2138l interfaceC2138l) {
        final Runnable runnable = new Runnable() { // from class: Sd.d
            @Override // java.lang.Runnable
            public final void run() {
                f.g1(interfaceC2138l, this);
            }
        };
        if (this.f15868b.postDelayed(runnable, k.i(j10, 4611686018427387903L))) {
            interfaceC2138l.b(new l() { // from class: Sd.e
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return f.h1(this.f15866a, runnable, (Throwable) obj);
                }
            });
        } else {
            d1(interfaceC2138l.getContext(), runnable);
        }
    }

    @Override // Rd.W
    public InterfaceC2127f0 H(long j10, final Runnable runnable, InterfaceC4992i interfaceC4992i) {
        if (this.f15868b.postDelayed(runnable, k.i(j10, 4611686018427387903L))) {
            return new InterfaceC2127f0() { // from class: Sd.c
                @Override // Rd.InterfaceC2127f0
                public final void dispose() {
                    f.f1(this.f15862a, runnable);
                }
            };
        }
        d1(interfaceC4992i, runnable);
        return M0.f15143a;
    }

    public final void d1(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        C0.c(interfaceC4992i, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C2123d0.b().k0(interfaceC4992i, runnable);
    }

    @Override // Rd.J0
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public f J0() {
        return this.f15871e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f15868b == this.f15868b && fVar.f15870d == this.f15870d;
    }

    public int hashCode() {
        return (this.f15870d ? 1231 : 1237) ^ System.identityHashCode(this.f15868b);
    }

    @Override // Rd.I
    public void k0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        if (this.f15868b.post(runnable)) {
            return;
        }
        d1(interfaceC4992i, runnable);
    }

    @Override // Rd.J0, Rd.I
    public String toString() {
        String strM0 = M0();
        if (strM0 == null) {
            strM0 = this.f15869c;
            if (strM0 == null) {
                strM0 = this.f15868b.toString();
            }
            if (this.f15870d) {
                return strM0 + ".immediate";
            }
        }
        return strM0;
    }

    @Override // Rd.I
    public boolean v0(InterfaceC4992i interfaceC4992i) {
        return (this.f15870d && AbstractC4862t.a(Looper.myLooper(), this.f15868b.getLooper())) ? false : true;
    }

    public /* synthetic */ f(Handler handler, String str, int i10, AbstractC4854k abstractC4854k) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public f(Handler handler, String str) {
        this(handler, str, false);
    }
}
