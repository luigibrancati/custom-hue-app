package d3;

import ae.InterfaceC2694h;
import b0.C2781e;
import fc.C4015H;
import gc.C4179C;
import gc.C4205s;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import k3.InterfaceC4792b;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC6082a f33048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f33049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l[] f33052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC2694h f33053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2781e f33054h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f33055j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f33056k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f33058m;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f33056k = obj;
            this.f33058m |= Integer.MIN_VALUE;
            return n.this.a(this);
        }
    }

    public n(int i10, InterfaceC6082a connectionFactory) {
        AbstractC4862t.e(connectionFactory, "connectionFactory");
        this.f33047a = i10;
        this.f33048b = connectionFactory;
        this.f33049c = new ReentrantLock();
        this.f33052f = new l[i10];
        this.f33053g = ae.l.b(i10, 0, 2, null);
        this.f33054h = new C2781e(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(lc.InterfaceC4988e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof d3.n.a
            if (r0 == 0) goto L13
            r0 = r5
            d3.n$a r0 = (d3.n.a) r0
            int r1 = r0.f33058m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33058m = r1
            goto L18
        L13:
            d3.n$a r0 = new d3.n$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f33056k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f33058m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f33055j
            d3.n r4 = (d3.n) r4
            fc.AbstractC4036s.b(r5)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            fc.AbstractC4036s.b(r5)
            ae.h r5 = r4.f33053g
            r0.f33055j = r4
            r0.f33058m = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.util.concurrent.locks.ReentrantLock r5 = r4.f33049c     // Catch: java.lang.Throwable -> L68
            r5.lock()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r4.f33051e     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L6a
            b0.e r0 = r4.f33054h     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r0.d()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L5c
            r4.e()     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r0 = move-exception
            goto L77
        L5c:
            b0.e r0 = r4.f33054h     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L5a
            d3.l r0 = (d3.l) r0     // Catch: java.lang.Throwable -> L5a
            r5.unlock()     // Catch: java.lang.Throwable -> L68
            return r0
        L68:
            r5 = move-exception
            goto L7b
        L6a:
            java.lang.String r0 = "Connection pool is closed"
            r1 = 21
            k3.AbstractC4791a.b(r1, r0)     // Catch: java.lang.Throwable -> L5a
            fc.h r0 = new fc.h     // Catch: java.lang.Throwable -> L5a
            r0.<init>()     // Catch: java.lang.Throwable -> L5a
            throw r0     // Catch: java.lang.Throwable -> L5a
        L77:
            r5.unlock()     // Catch: java.lang.Throwable -> L68
            throw r0     // Catch: java.lang.Throwable -> L68
        L7b:
            ae.h r4 = r4.f33053g
            r4.release()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.n.a(lc.e):java.lang.Object");
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f33049c;
        reentrantLock.lock();
        try {
            this.f33051e = true;
            for (l lVar : this.f33052f) {
                if (lVar != null) {
                    lVar.close();
                }
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c(StringBuilder builder) {
        AbstractC4862t.e(builder, "builder");
        ReentrantLock reentrantLock = this.f33049c;
        reentrantLock.lock();
        try {
            List listC = C4205s.c();
            int iF = this.f33054h.f();
            for (int i10 = 0; i10 < iF; i10++) {
                listC.add(this.f33054h.c(i10));
            }
            List listA = C4205s.a(listC);
            builder.append('\t' + super.toString() + " (");
            builder.append("capacity=" + this.f33047a + ", ");
            builder.append("permits=" + this.f33053g.b() + ", ");
            builder.append("queue=(size=" + listA.size() + ")[" + C4179C.q0(listA, null, null, null, 0, null, null, 63, null) + "], ");
            builder.append(")");
            builder.append('\n');
            l[] lVarArr = this.f33052f;
            int length = lVarArr.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                l lVar = lVarArr[i12];
                i11++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i11);
                sb2.append("] - ");
                sb2.append(lVar != null ? lVar.toString() : null);
                builder.append(sb2.toString());
                builder.append('\n');
                if (lVar != null) {
                    lVar.b(builder);
                }
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(l connection) {
        AbstractC4862t.e(connection, "connection");
        ReentrantLock reentrantLock = this.f33049c;
        reentrantLock.lock();
        try {
            this.f33054h.a(connection);
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
            this.f33053g.release();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e() {
        if (this.f33050d >= this.f33047a) {
            return;
        }
        l lVar = new l((InterfaceC4792b) this.f33048b.invoke(), null, 2, 0 == true ? 1 : 0);
        l[] lVarArr = this.f33052f;
        int i10 = this.f33050d;
        this.f33050d = i10 + 1;
        lVarArr[i10] = lVar;
        this.f33054h.a(lVar);
    }
}
