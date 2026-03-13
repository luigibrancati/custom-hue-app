package Vd;

import fc.C4015H;
import fc.C4035r;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: Vd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2320b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d[] f17517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17519c;

    public final d e() {
        d dVarF;
        synchronized (this) {
            try {
                d[] dVarArrG = this.f17517a;
                if (dVarArrG == null) {
                    dVarArrG = g(2);
                    this.f17517a = dVarArrG;
                } else if (this.f17518b >= dVarArrG.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrG, dVarArrG.length * 2);
                    AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
                    this.f17517a = (d[]) objArrCopyOf;
                    dVarArrG = (d[]) objArrCopyOf;
                }
                int i10 = this.f17519c;
                do {
                    dVarF = dVarArrG[i10];
                    if (dVarF == null) {
                        dVarF = f();
                        dVarArrG[i10] = dVarF;
                    }
                    i10++;
                    if (i10 >= dVarArrG.length) {
                        i10 = 0;
                    }
                    AbstractC4862t.c(dVarF, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarF.a(this));
                this.f17519c = i10;
                this.f17518b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarF;
    }

    public abstract d f();

    public abstract d[] g(int i10);

    public final void h(d dVar) {
        int i10;
        InterfaceC4988e[] interfaceC4988eArrB;
        synchronized (this) {
            try {
                int i11 = this.f17518b - 1;
                this.f17518b = i11;
                if (i11 == 0) {
                    this.f17519c = 0;
                }
                AbstractC4862t.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC4988eArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC4988e interfaceC4988e : interfaceC4988eArrB) {
            if (interfaceC4988e != null) {
                C4035r.a aVar = C4035r.f34274b;
                interfaceC4988e.resumeWith(C4035r.b(C4015H.f34254a));
            }
        }
    }

    public final int i() {
        return this.f17518b;
    }

    public final d[] j() {
        return this.f17517a;
    }
}
