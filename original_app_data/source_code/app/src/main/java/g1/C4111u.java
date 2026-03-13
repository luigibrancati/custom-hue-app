package g1;

import fc.C4015H;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: g1.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4111u implements InterfaceC4085U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f35090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4087W f35091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f35092c;

    /* JADX INFO: renamed from: g1.u$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.l {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f35093j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f35094k;

        public a(InterfaceC4988e interfaceC4988e) {
            super(1, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(InterfaceC4988e interfaceC4988e) {
            return C4111u.this.new a(interfaceC4988e);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        
            if (r7 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Exception {
            /*
                r6 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r6.f35094k
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r6.f35093j
                java.io.Closeable r0 = (java.io.Closeable) r0
                fc.AbstractC4036s.b(r7)     // Catch: java.lang.Throwable -> L17
                goto L7f
            L17:
                r7 = move-exception
                goto L89
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L22:
                java.lang.Object r1 = r6.f35093j
                java.io.Closeable r1 = (java.io.Closeable) r1
                fc.AbstractC4036s.b(r7)     // Catch: java.lang.Throwable -> L2a
                goto L4b
            L2a:
                r7 = move-exception
                goto L4f
            L2c:
                fc.AbstractC4036s.b(r7)
                java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L55
                g1.u r7 = g1.C4111u.this     // Catch: java.io.FileNotFoundException -> L55
                java.io.File r7 = r7.g()     // Catch: java.io.FileNotFoundException -> L55
                r1.<init>(r7)     // Catch: java.io.FileNotFoundException -> L55
                g1.u r7 = g1.C4111u.this     // Catch: java.io.FileNotFoundException -> L55
                g1.W r7 = r7.h()     // Catch: java.lang.Throwable -> L2a
                r6.f35093j = r1     // Catch: java.lang.Throwable -> L2a
                r6.f35094k = r3     // Catch: java.lang.Throwable -> L2a
                java.lang.Object r7 = r7.a(r1, r6)     // Catch: java.lang.Throwable -> L2a
                if (r7 != r0) goto L4b
                goto L7c
            L4b:
                sc.c.a(r1, r4)     // Catch: java.io.FileNotFoundException -> L55
                return r7
            L4f:
                throw r7     // Catch: java.lang.Throwable -> L50
            L50:
                r3 = move-exception
                sc.c.a(r1, r7)     // Catch: java.io.FileNotFoundException -> L55
                throw r3     // Catch: java.io.FileNotFoundException -> L55
            L55:
                g1.u r7 = g1.C4111u.this
                java.io.File r7 = r7.g()
                boolean r7 = r7.exists()
                if (r7 == 0) goto La2
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L83
                g1.u r1 = g1.C4111u.this     // Catch: java.lang.Exception -> L83
                java.io.File r1 = r1.g()     // Catch: java.lang.Exception -> L83
                r7.<init>(r1)     // Catch: java.lang.Exception -> L83
                g1.u r1 = g1.C4111u.this     // Catch: java.lang.Exception -> L83
                g1.W r1 = r1.h()     // Catch: java.lang.Throwable -> L85
                r6.f35093j = r7     // Catch: java.lang.Throwable -> L85
                r6.f35094k = r2     // Catch: java.lang.Throwable -> L85
                java.lang.Object r1 = r1.a(r7, r6)     // Catch: java.lang.Throwable -> L85
                if (r1 != r0) goto L7d
            L7c:
                return r0
            L7d:
                r0 = r7
                r7 = r1
            L7f:
                sc.c.a(r0, r4)     // Catch: java.lang.Exception -> L83
                goto Lac
            L83:
                r7 = move-exception
                goto L8f
            L85:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L89:
                throw r7     // Catch: java.lang.Throwable -> L8a
            L8a:
                r1 = move-exception
                sc.c.a(r0, r7)     // Catch: java.lang.Exception -> L83
                throw r1     // Catch: java.lang.Exception -> L83
            L8f:
                boolean r0 = r7 instanceof java.io.FileNotFoundException
                if (r0 == 0) goto La1
                g1.u r6 = g1.C4111u.this
                java.io.File r6 = r6.g()
                java.lang.String r6 = r6.getParent()
                java.lang.Exception r7 = g1.AbstractC4107q.c(r6, r7)
            La1:
                throw r7
            La2:
                g1.u r6 = g1.C4111u.this
                g1.W r6 = r6.h()
                java.lang.Object r7 = r6.b()
            Lac:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: g1.C4111u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // vc.l
        public final Object invoke(InterfaceC4988e interfaceC4988e) {
            return ((a) create(interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }
    }

    public C4111u(File file, InterfaceC4087W serializer) {
        AbstractC4862t.e(file, "file");
        AbstractC4862t.e(serializer, "serializer");
        this.f35090a = file;
        this.f35091b = serializer;
        this.f35092c = new AtomicBoolean(false);
    }

    public static /* synthetic */ Object i(C4111u c4111u, InterfaceC4988e interfaceC4988e) {
        c4111u.f();
        return AbstractC4116z.b(c4111u.f35090a, c4111u.new a(null), interfaceC4988e);
    }

    @Override // g1.InterfaceC4093c
    public void close() {
        this.f35092c.set(true);
    }

    @Override // g1.InterfaceC4085U
    public Object e(InterfaceC4988e interfaceC4988e) {
        return i(this, interfaceC4988e);
    }

    public final void f() {
        if (this.f35092c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    public final File g() {
        return this.f35090a;
    }

    public final InterfaceC4087W h() {
        return this.f35091b;
    }
}
