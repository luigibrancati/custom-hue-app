package g4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import k4.InterfaceC4797c;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4797c f35451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.c f35452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y3.b f35453c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f35454j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f35455k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f35456l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f35458n;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f35456l = obj;
            this.f35458n |= Integer.MIN_VALUE;
            return k.this.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f35459j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f35460k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f35461l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f35463n;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f35461l = obj;
            this.f35463n |= Integer.MIN_VALUE;
            return k.this.f(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC4797c target, a4.c referenceCounter, Y3.b eventListener, n4.l lVar) {
        super(null);
        AbstractC4862t.e(target, "target");
        AbstractC4862t.e(referenceCounter, "referenceCounter");
        AbstractC4862t.e(eventListener, "eventListener");
        this.f35451a = target;
        this.f35452b = referenceCounter;
        this.f35453c = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // g4.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(i4.f r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof g4.k.a
            if (r0 == 0) goto L13
            r0 = r7
            g4.k$a r0 = (g4.k.a) r0
            int r1 = r0.f35458n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35458n = r1
            goto L18
        L13:
            g4.k$a r0 = new g4.k$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f35456l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f35458n
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f35455k
            Y3.b r5 = (Y3.b) r5
            java.lang.Object r6 = r0.f35454j
            i4.f r6 = (i4.f) r6
            fc.AbstractC4036s.b(r7)
            goto L83
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            fc.AbstractC4036s.b(r7)
            k4.c r7 = r5.d()
            Y3.b r5 = r5.f35453c
            i4.i r2 = r6.b()
            m4.b r2 = r2.K()
            m4.b r4 = m4.InterfaceC5021b.f40197b
            if (r2 != r4) goto L56
            android.graphics.drawable.Drawable r5 = r6.a()
            r7.onError(r5)
            goto L8a
        L56:
            boolean r4 = r7 instanceof m4.InterfaceC5022c
            if (r4 != 0) goto L6d
            i4.i r5 = r6.b()
            i4.d r5 = r5.p()
            r5.l()
            android.graphics.drawable.Drawable r5 = r6.a()
            r7.onError(r5)
            goto L8a
        L6d:
            i4.i r4 = r6.b()
            r5.l(r4)
            m4.c r7 = (m4.InterfaceC5022c) r7
            r0.f35454j = r6
            r0.f35455k = r5
            r0.f35458n = r3
            java.lang.Object r7 = r2.a(r7, r6, r0)
            if (r7 != r1) goto L83
            return r1
        L83:
            i4.i r6 = r6.b()
            r5.i(r6)
        L8a:
            fc.H r5 = fc.C4015H.f34254a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.k.b(i4.f, lc.e):java.lang.Object");
    }

    @Override // g4.u
    public InterfaceC4797c d() {
        return this.f35451a;
    }

    @Override // g4.u
    public void e(Drawable drawable, Bitmap bitmap) {
        a4.c cVar = this.f35452b;
        if (bitmap != null) {
            cVar.a(bitmap, false);
        }
        d().onStart(drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // g4.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(i4.n r7, lc.InterfaceC4988e r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof g4.k.b
            if (r0 == 0) goto L13
            r0 = r8
            g4.k$b r0 = (g4.k.b) r0
            int r1 = r0.f35463n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35463n = r1
            goto L18
        L13:
            g4.k$b r0 = new g4.k$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f35461l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f35463n
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f35460k
            Y3.b r6 = (Y3.b) r6
            java.lang.Object r7 = r0.f35459j
            i4.n r7 = (i4.n) r7
            fc.AbstractC4036s.b(r8)
            goto La0
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            fc.AbstractC4036s.b(r8)
            a4.c r8 = r6.f35452b
            android.graphics.drawable.Drawable r2 = r7.a()
            boolean r4 = r2 instanceof android.graphics.drawable.BitmapDrawable
            r5 = 0
            if (r4 == 0) goto L4b
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            goto L4c
        L4b:
            r2 = r5
        L4c:
            if (r2 != 0) goto L4f
            goto L53
        L4f:
            android.graphics.Bitmap r5 = r2.getBitmap()
        L53:
            if (r5 == 0) goto L59
            r2 = 0
            r8.a(r5, r2)
        L59:
            k4.c r8 = r6.d()
            Y3.b r6 = r6.f35453c
            i4.i r2 = r7.b()
            m4.b r2 = r2.K()
            m4.b r4 = m4.InterfaceC5021b.f40197b
            if (r2 != r4) goto L73
            android.graphics.drawable.Drawable r6 = r7.a()
            r8.onSuccess(r6)
            goto La7
        L73:
            boolean r4 = r8 instanceof m4.InterfaceC5022c
            if (r4 != 0) goto L8a
            i4.i r6 = r7.b()
            i4.d r6 = r6.p()
            r6.l()
            android.graphics.drawable.Drawable r6 = r7.a()
            r8.onSuccess(r6)
            goto La7
        L8a:
            i4.i r4 = r7.b()
            r6.l(r4)
            m4.c r8 = (m4.InterfaceC5022c) r8
            r0.f35459j = r7
            r0.f35460k = r6
            r0.f35463n = r3
            java.lang.Object r8 = r2.a(r8, r7, r0)
            if (r8 != r1) goto La0
            return r1
        La0:
            i4.i r7 = r7.b()
            r6.i(r7)
        La7:
            fc.H r6 = fc.C4015H.f34254a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.k.f(i4.n, lc.e):java.lang.Object");
    }
}
