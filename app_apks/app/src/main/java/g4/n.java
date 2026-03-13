package g4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import k4.InterfaceC4796b;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4796b f35472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.c f35473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y3.b f35474c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f35475j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f35476k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f35477l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f35478m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f35480o;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f35478m = obj;
            this.f35480o |= Integer.MIN_VALUE;
            return n.this.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f35481j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f35482k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f35483l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f35484m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f35485n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f35487p;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f35485n = obj;
            this.f35487p |= Integer.MIN_VALUE;
            return n.this.f(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC4796b target, a4.c referenceCounter, Y3.b eventListener, n4.l lVar) {
        super(null);
        AbstractC4862t.e(target, "target");
        AbstractC4862t.e(referenceCounter, "referenceCounter");
        AbstractC4862t.e(eventListener, "eventListener");
        this.f35472a = target;
        this.f35473b = referenceCounter;
        this.f35474c = eventListener;
    }

    @Override // g4.u
    public void a() {
        if (this.f35473b instanceof a4.e) {
            d().a();
            return;
        }
        m(null);
        d().a();
        k(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (r2.a((m4.InterfaceC5022c) r9, r8, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // g4.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(i4.f r8, lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.n.b(i4.f, lc.e):java.lang.Object");
    }

    @Override // g4.u
    public void e(Drawable drawable, Bitmap bitmap) {
        if (this.f35473b instanceof a4.e) {
            d().onStart(drawable);
            return;
        }
        m(bitmap);
        d().onStart(drawable);
        k(bitmap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        if (r2.a((m4.InterfaceC5022c) r9, r8, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // g4.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(i4.n r8, lc.InterfaceC4988e r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.n.f(i4.n, lc.e):java.lang.Object");
    }

    public final void k(Bitmap bitmap) {
        Bitmap bitmapB = n4.e.g(d().getView()).b(this, bitmap);
        if (bitmapB == null) {
            return;
        }
        this.f35473b.b(bitmapB);
    }

    @Override // g4.u
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public InterfaceC4796b d() {
        return this.f35472a;
    }

    public final void m(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.f35473b.c(bitmap);
    }
}
