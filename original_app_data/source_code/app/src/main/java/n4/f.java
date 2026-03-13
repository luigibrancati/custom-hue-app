package n4;

import Rd.InterfaceC2138l;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2758n;
import fc.C4015H;
import fc.C4035r;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f40556j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f40557k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f40558l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f40559m;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f40558l = obj;
            this.f40559m |= Integer.MIN_VALUE;
            return f.a(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2138l f40560a;

        public b(InterfaceC2138l interfaceC2138l) {
            this.f40560a = interfaceC2138l;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            this.f40560a.resumeWith(C4035r.b(C4015H.f34254a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.lifecycle.AbstractC2754j r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof n4.f.a
            if (r0 == 0) goto L13
            r0 = r7
            n4.f$a r0 = (n4.f.a) r0
            int r1 = r0.f40559m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40559m = r1
            goto L18
        L13:
            n4.f$a r0 = new n4.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f40558l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f40559m
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f40557k
            kotlin.jvm.internal.L r6 = (kotlin.jvm.internal.L) r6
            java.lang.Object r0 = r0.f40556j
            androidx.lifecycle.j r0 = (androidx.lifecycle.AbstractC2754j) r0
            fc.AbstractC4036s.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L7d
        L31:
            r7 = move-exception
            goto L8a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            fc.AbstractC4036s.b(r7)
            kotlin.jvm.internal.L r7 = new kotlin.jvm.internal.L
            r7.<init>()
            r0.f40556j = r6     // Catch: java.lang.Throwable -> L72
            r0.f40557k = r7     // Catch: java.lang.Throwable -> L72
            r0.f40559m = r3     // Catch: java.lang.Throwable -> L72
            Rd.n r2 = new Rd.n     // Catch: java.lang.Throwable -> L72
            lc.e r4 = mc.C5045b.c(r0)     // Catch: java.lang.Throwable -> L72
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L72
            r2.E()     // Catch: java.lang.Throwable -> L72
            n4.f$b r3 = new n4.f$b     // Catch: java.lang.Throwable -> L72
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L72
            r7.f39776a = r3     // Catch: java.lang.Throwable -> L72
            kotlin.jvm.internal.AbstractC4862t.b(r3)     // Catch: java.lang.Throwable -> L72
            androidx.lifecycle.m r3 = (androidx.lifecycle.InterfaceC2757m) r3     // Catch: java.lang.Throwable -> L72
            r6.a(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r2 = r2.w()     // Catch: java.lang.Throwable -> L72
            java.lang.Object r3 = mc.C5046c.f()     // Catch: java.lang.Throwable -> L72
            if (r2 != r3) goto L78
            nc.h.c(r0)     // Catch: java.lang.Throwable -> L72
            goto L78
        L72:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L8a
        L78:
            if (r2 != r1) goto L7b
            return r1
        L7b:
            r0 = r6
            r6 = r7
        L7d:
            java.lang.Object r6 = r6.f39776a
            androidx.lifecycle.m r6 = (androidx.lifecycle.InterfaceC2757m) r6
            if (r6 != 0) goto L84
            goto L87
        L84:
            r0.c(r6)
        L87:
            fc.H r6 = fc.C4015H.f34254a
            return r6
        L8a:
            java.lang.Object r6 = r6.f39776a
            androidx.lifecycle.m r6 = (androidx.lifecycle.InterfaceC2757m) r6
            if (r6 != 0) goto L91
            goto L94
        L91:
            r0.c(r6)
        L94:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.f.a(androidx.lifecycle.j, lc.e):java.lang.Object");
    }
}
