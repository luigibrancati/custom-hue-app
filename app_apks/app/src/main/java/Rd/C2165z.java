package Rd;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Rd.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2165z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2136k f15214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc.q f15215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f15217e;

    public C2165z(Object obj, InterfaceC2136k interfaceC2136k, vc.q qVar, Object obj2, Throwable th) {
        this.f15213a = obj;
        this.f15214b = interfaceC2136k;
        this.f15215c = qVar;
        this.f15216d = obj2;
        this.f15217e = th;
    }

    public static /* synthetic */ C2165z b(C2165z c2165z, Object obj, InterfaceC2136k interfaceC2136k, vc.q qVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c2165z.f15213a;
        }
        if ((i10 & 2) != 0) {
            interfaceC2136k = c2165z.f15214b;
        }
        if ((i10 & 4) != 0) {
            qVar = c2165z.f15215c;
        }
        if ((i10 & 8) != 0) {
            obj2 = c2165z.f15216d;
        }
        if ((i10 & 16) != 0) {
            th = c2165z.f15217e;
        }
        Throwable th2 = th;
        vc.q qVar2 = qVar;
        return c2165z.a(obj, interfaceC2136k, qVar2, obj2, th2);
    }

    public final C2165z a(Object obj, InterfaceC2136k interfaceC2136k, vc.q qVar, Object obj2, Throwable th) {
        return new C2165z(obj, interfaceC2136k, qVar, obj2, th);
    }

    public final boolean c() {
        return this.f15217e != null;
    }

    public final void d(C2142n c2142n, Throwable th) {
        InterfaceC2136k interfaceC2136k = this.f15214b;
        if (interfaceC2136k != null) {
            c2142n.m(interfaceC2136k, th);
        }
        vc.q qVar = this.f15215c;
        if (qVar != null) {
            c2142n.n(qVar, th, this.f15213a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2165z)) {
            return false;
        }
        C2165z c2165z = (C2165z) obj;
        return AbstractC4862t.a(this.f15213a, c2165z.f15213a) && AbstractC4862t.a(this.f15214b, c2165z.f15214b) && AbstractC4862t.a(this.f15215c, c2165z.f15215c) && AbstractC4862t.a(this.f15216d, c2165z.f15216d) && AbstractC4862t.a(this.f15217e, c2165z.f15217e);
    }

    public int hashCode() {
        Object obj = this.f15213a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC2136k interfaceC2136k = this.f15214b;
        int iHashCode2 = (iHashCode + (interfaceC2136k == null ? 0 : interfaceC2136k.hashCode())) * 31;
        vc.q qVar = this.f15215c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f15216d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f15217e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f15213a + ", cancelHandler=" + this.f15214b + ", onCancellation=" + this.f15215c + ", idempotentResume=" + this.f15216d + ", cancelCause=" + this.f15217e + ')';
    }

    public /* synthetic */ C2165z(Object obj, InterfaceC2136k interfaceC2136k, vc.q qVar, Object obj2, Throwable th, int i10, AbstractC4854k abstractC4854k) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC2136k, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
