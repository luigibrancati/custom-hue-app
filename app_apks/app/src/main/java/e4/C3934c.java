package e4;

import android.graphics.Bitmap;
import e4.InterfaceC3933b;
import i4.i;
import i4.k;
import j4.AbstractC4689h;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: renamed from: e4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3934c implements InterfaceC3933b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f33728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f33730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f33732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC4689h f33733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap f33734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y3.b f33735h;

    /* JADX INFO: renamed from: e4.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f33736j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f33737k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f33738l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f33740n;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f33738l = obj;
            this.f33740n |= Integer.MIN_VALUE;
            return C3934c.this.i(null, this);
        }
    }

    public C3934c(i initialRequest, int i10, List interceptors, int i11, i request, AbstractC4689h size, Bitmap bitmap, Y3.b eventListener) {
        AbstractC4862t.e(initialRequest, "initialRequest");
        AbstractC4862t.e(interceptors, "interceptors");
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(size, "size");
        AbstractC4862t.e(eventListener, "eventListener");
        this.f33728a = initialRequest;
        this.f33729b = i10;
        this.f33730c = interceptors;
        this.f33731d = i11;
        this.f33732e = request;
        this.f33733f = size;
        this.f33734g = bitmap;
        this.f33735h = eventListener;
    }

    public static /* synthetic */ C3934c c(C3934c c3934c, int i10, i iVar, AbstractC4689h abstractC4689h, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c3934c.f33731d;
        }
        if ((i11 & 2) != 0) {
            iVar = c3934c.getRequest();
        }
        if ((i11 & 4) != 0) {
            abstractC4689h = c3934c.getSize();
        }
        return c3934c.b(i10, iVar, abstractC4689h);
    }

    public final void a(i iVar, InterfaceC3933b interfaceC3933b) {
        if (!(iVar.l() == this.f33728a.l())) {
            throw new IllegalStateException(("Interceptor '" + interfaceC3933b + "' cannot modify the request's context.").toString());
        }
        if (!(iVar.m() != k.f37183a)) {
            throw new IllegalStateException(("Interceptor '" + interfaceC3933b + "' cannot set the request's data to null.").toString());
        }
        if (!(iVar.I() == this.f33728a.I())) {
            throw new IllegalStateException(("Interceptor '" + interfaceC3933b + "' cannot modify the request's target.").toString());
        }
        if (!(iVar.w() == this.f33728a.w())) {
            throw new IllegalStateException(("Interceptor '" + interfaceC3933b + "' cannot modify the request's lifecycle.").toString());
        }
        if (iVar.H() == this.f33728a.H()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interfaceC3933b + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    public final C3934c b(int i10, i iVar, AbstractC4689h abstractC4689h) {
        return new C3934c(this.f33728a, this.f33729b, this.f33730c, i10, iVar, abstractC4689h, this.f33734g, this.f33735h);
    }

    public final Bitmap d() {
        return this.f33734g;
    }

    public final Y3.b e() {
        return this.f33735h;
    }

    public final int f() {
        return this.f33731d;
    }

    public final List g() {
        return this.f33730c;
    }

    @Override // e4.InterfaceC3933b.a
    public i getRequest() {
        return this.f33732e;
    }

    @Override // e4.InterfaceC3933b.a
    public AbstractC4689h getSize() {
        return this.f33733f;
    }

    public final int h() {
        return this.f33729b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(i4.i r12, lc.InterfaceC4988e r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof e4.C3934c.a
            if (r0 == 0) goto L13
            r0 = r13
            e4.c$a r0 = (e4.C3934c.a) r0
            int r1 = r0.f33740n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33740n = r1
            goto L18
        L13:
            e4.c$a r0 = new e4.c$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f33738l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f33740n
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r11 = r0.f33737k
            e4.b r11 = (e4.InterfaceC3933b) r11
            java.lang.Object r12 = r0.f33736j
            e4.c r12 = (e4.C3934c) r12
            fc.AbstractC4036s.b(r13)
            r10 = r13
            r13 = r11
            r11 = r12
            r12 = r10
            goto L84
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            fc.AbstractC4036s.b(r13)
            int r13 = r11.f()
            if (r13 <= 0) goto L58
            java.util.List r13 = r11.g()
            int r2 = r11.f()
            int r2 = r2 - r3
            java.lang.Object r13 = r13.get(r2)
            e4.b r13 = (e4.InterfaceC3933b) r13
            r11.a(r12, r13)
        L58:
            java.util.List r13 = r11.g()
            int r2 = r11.f()
            java.lang.Object r13 = r13.get(r2)
            e4.b r13 = (e4.InterfaceC3933b) r13
            int r2 = r11.f()
            int r5 = r2 + 1
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r11
            r6 = r12
            e4.c r11 = c(r4, r5, r6, r7, r8, r9)
            r0.f33736j = r4
            r0.f33737k = r13
            r0.f33740n = r3
            java.lang.Object r11 = r13.a(r11, r0)
            if (r11 != r1) goto L82
            return r1
        L82:
            r12 = r11
            r11 = r4
        L84:
            i4.j r12 = (i4.j) r12
            i4.i r0 = r12.b()
            r11.a(r0, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C3934c.i(i4.i, lc.e):java.lang.Object");
    }
}
