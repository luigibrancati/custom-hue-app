package Wd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Wd.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C2336p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17941a = AtomicReferenceFieldUpdater.newUpdater(C2336p.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17942b = AtomicReferenceFieldUpdater.newUpdater(C2336p.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17943c = AtomicReferenceFieldUpdater.newUpdater(C2336p.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean d(C2336p c2336p, int i10) {
        C2336p c2336pM;
        do {
            c2336pM = m();
            if (c2336pM instanceof C2334n) {
                return (((C2334n) c2336pM).f17940d & i10) == 0 && c2336pM.d(c2336p, i10);
            }
        } while (!c2336pM.e(c2336p, this));
        return true;
    }

    public final boolean e(C2336p c2336p, C2336p c2336p2) {
        f17942b.set(c2336p, this);
        f17941a.set(c2336p, c2336p2);
        if (!B0.b.a(f17941a, this, c2336p2, c2336p)) {
            return false;
        }
        c2336p.j(c2336p2);
        return true;
    }

    public final boolean f(C2336p c2336p) {
        f17942b.set(c2336p, this);
        f17941a.set(c2336p, this);
        while (k() == this) {
            if (B0.b.a(f17941a, this, this, c2336p)) {
                c2336p.j(this);
                return true;
            }
        }
        return false;
    }

    public final void g(int i10) {
        d(new C2334n(i10), i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (B0.b.a(Wd.C2336p.f17941a, r3, r2, ((Wd.y) r4).f17959a) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Wd.C2336p h() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o()
            java.lang.Object r0 = r0.get(r7)
            Wd.p r0 = (Wd.C2336p) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = n()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            goto L25
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o()
            boolean r0 = B0.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.q()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof Wd.y
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = n()
            Wd.y r4 = (Wd.y) r4
            Wd.p r4 = r4.f17959a
            boolean r2 = B0.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o()
            java.lang.Object r2 = r4.get(r2)
            Wd.p r2 = (Wd.C2336p) r2
            goto Ld
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.AbstractC4862t.c(r4, r3)
            r3 = r4
            Wd.p r3 = (Wd.C2336p) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Wd.C2336p.h():Wd.p");
    }

    public final C2336p i(C2336p c2336p) {
        while (c2336p.q()) {
            c2336p = (C2336p) f17942b.get(c2336p);
        }
        return c2336p;
    }

    public final void j(C2336p c2336p) {
        C2336p c2336p2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17942b;
        do {
            c2336p2 = (C2336p) atomicReferenceFieldUpdater.get(c2336p);
            if (k() != c2336p) {
                return;
            }
        } while (!B0.b.a(f17942b, c2336p, c2336p2, this));
        if (q()) {
            c2336p.h();
        }
    }

    public final Object k() {
        return f17941a.get(this);
    }

    public final C2336p l() {
        C2336p c2336p;
        Object objK = k();
        y yVar = objK instanceof y ? (y) objK : null;
        if (yVar != null && (c2336p = yVar.f17959a) != null) {
            return c2336p;
        }
        AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C2336p) objK;
    }

    public final C2336p m() {
        C2336p c2336pH = h();
        return c2336pH == null ? i((C2336p) f17942b.get(this)) : c2336pH;
    }

    public boolean q() {
        return k() instanceof y;
    }

    public boolean r() {
        return s() == null;
    }

    public final C2336p s() {
        Object objK;
        C2336p c2336p;
        do {
            objK = k();
            if (objK instanceof y) {
                return ((y) objK).f17959a;
            }
            if (objK == this) {
                return (C2336p) objK;
            }
            AbstractC4862t.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c2336p = (C2336p) objK;
        } while (!B0.b.a(f17941a, this, objK, c2336p.t()));
        c2336p.h();
        return null;
    }

    public final y t() {
        y yVar = (y) f17943c.get(this);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this);
        f17943c.set(this, yVar2);
        return yVar2;
    }

    public String toString() {
        return new kotlin.jvm.internal.C(this) { // from class: Wd.p.a
            @Override // Cc.m
            public Object get() {
                return Rd.Q.a(this.receiver);
            }
        } + '@' + Rd.Q.b(this);
    }
}
