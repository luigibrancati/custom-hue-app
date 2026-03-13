package e4;

import Bc.k;
import Rd.M;
import a4.InterfaceC2641a;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c4.d;
import c4.f;
import d4.InterfaceC3824g;
import e4.InterfaceC3933b;
import fc.C4015H;
import fc.C4032o;
import g4.l;
import g4.m;
import g4.o;
import g4.s;
import g4.t;
import gc.C4206t;
import i4.i;
import j4.AbstractC4689h;
import j4.C4683b;
import j4.C4684c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import l4.InterfaceC4881a;
import lc.InterfaceC4988e;
import n4.AbstractC5085a;
import n4.h;
import nc.AbstractC5160d;
import vc.p;

/* JADX INFO: renamed from: e4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3932a implements InterfaceC3933b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0422a f33695i = new C0422a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y3.a f33696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2641a f33697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4.c f33698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f33700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f33701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n4.m f33702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f33703h;

    /* JADX INFO: renamed from: e4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0422a {
        public /* synthetic */ C0422a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0422a() {
        }
    }

    /* JADX INFO: renamed from: e4.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f33704j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f33705k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f33706l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f33708n;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f33706l = obj;
            this.f33708n |= Integer.MIN_VALUE;
            return C3932a.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: e4.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements p {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Y3.b f33709A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public final /* synthetic */ l f33710B;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f33711j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f33712k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f33713l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f33714m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f33715n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f33716o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f33717p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f33718q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f33719r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f33720s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ i f33722u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ o.a f33723v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Object f33724w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3824g f33725x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3933b.a f33726y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ AbstractC4689h f33727z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, o.a aVar, Object obj, InterfaceC3824g interfaceC3824g, InterfaceC3933b.a aVar2, AbstractC4689h abstractC4689h, Y3.b bVar, l lVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f33722u = iVar;
            this.f33723v = aVar;
            this.f33724w = obj;
            this.f33725x = interfaceC3824g;
            this.f33726y = aVar2;
            this.f33727z = abstractC4689h;
            this.f33709A = bVar;
            this.f33710B = lVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return C3932a.this.new c(this.f33722u, this.f33723v, this.f33724w, this.f33725x, this.f33726y, this.f33727z, this.f33709A, this.f33710B, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x025d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0269  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x02a8  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x02ac  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02d9  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x02e4  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x02e6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x025d -> B:72:0x025e). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 760
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e4.C3932a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3932a(Y3.a registry, InterfaceC2641a bitmapPool, a4.c referenceCounter, t strongMemoryCache, m memoryCacheService, s requestService, n4.m systemCallbacks, f drawableDecoder, n4.l lVar) {
        AbstractC4862t.e(registry, "registry");
        AbstractC4862t.e(bitmapPool, "bitmapPool");
        AbstractC4862t.e(referenceCounter, "referenceCounter");
        AbstractC4862t.e(strongMemoryCache, "strongMemoryCache");
        AbstractC4862t.e(memoryCacheService, "memoryCacheService");
        AbstractC4862t.e(requestService, "requestService");
        AbstractC4862t.e(systemCallbacks, "systemCallbacks");
        AbstractC4862t.e(drawableDecoder, "drawableDecoder");
        this.f33696a = registry;
        this.f33697b = bitmapPool;
        this.f33698c = referenceCounter;
        this.f33699d = strongMemoryCache;
        this.f33700e = memoryCacheService;
        this.f33701f = requestService;
        this.f33702g = systemCallbacks;
        this.f33703h = drawableDecoder;
    }

    public static final /* synthetic */ n4.l d(C3932a c3932a) {
        c3932a.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // e4.InterfaceC3933b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(e4.InterfaceC3933b.a r16, lc.InterfaceC4988e r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C3932a.a(e4.b$a, lc.e):java.lang.Object");
    }

    public final l l(i request, Object data, InterfaceC3824g fetcher, AbstractC4689h size) {
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(data, "data");
        AbstractC4862t.e(fetcher, "fetcher");
        AbstractC4862t.e(size, "size");
        String strB = fetcher.b(data);
        if (strB == null) {
            return null;
        }
        if (request.J().isEmpty()) {
            l.a aVar = l.f35464a;
            return new l.b(strB, C4206t.k(), null, request.B().d());
        }
        l.a aVar2 = l.f35464a;
        List listJ = request.J();
        i4.m mVarB = request.B();
        ArrayList arrayList = new ArrayList(listJ.size());
        int size2 = listJ.size() - 1;
        if (size2 >= 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(((InterfaceC4881a) listJ.get(i10)).key());
                if (i11 > size2) {
                    break;
                }
                i10 = i11;
            }
        }
        return new l.b(strB, arrayList, size, mVarB.d());
    }

    public final void m(Object obj) {
        if (!(obj instanceof BitmapDrawable)) {
            if (obj instanceof Bitmap) {
                this.f33698c.a((Bitmap) obj, false);
            }
        } else {
            a4.c cVar = this.f33698c;
            Bitmap bitmap = ((BitmapDrawable) obj).getBitmap();
            if (bitmap != null) {
                cVar.a(bitmap, false);
            }
        }
    }

    public final boolean n(l lVar, o.a cacheValue, i request, AbstractC4689h size) {
        AbstractC4862t.e(cacheValue, "cacheValue");
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(size, "size");
        return o(lVar, cacheValue, request, size) && this.f33701f.b(request, AbstractC5085a.c(cacheValue.getBitmap()));
    }

    public final boolean o(l lVar, o.a aVar, i iVar, AbstractC4689h abstractC4689h) {
        int height;
        int iD;
        if (abstractC4689h instanceof C4683b) {
            if (aVar.isSampled()) {
                return false;
            }
        } else if (abstractC4689h instanceof C4684c) {
            l.b bVar = lVar instanceof l.b ? (l.b) lVar : null;
            AbstractC4689h abstractC4689hA = bVar != null ? bVar.a() : null;
            if (abstractC4689hA instanceof C4684c) {
                C4684c c4684c = (C4684c) abstractC4689hA;
                iD = c4684c.d();
                height = c4684c.c();
            } else {
                if (!AbstractC4862t.a(abstractC4689hA, C4683b.f38976a) && abstractC4689hA != null) {
                    throw new C4032o();
                }
                Bitmap bitmap = aVar.getBitmap();
                int width = bitmap.getWidth();
                height = bitmap.getHeight();
                iD = width;
            }
            C4684c c4684c2 = (C4684c) abstractC4689h;
            double d10 = d.d(iD, height, c4684c2.d(), c4684c2.c(), iVar.G());
            boolean zB = h.b(iVar);
            if (zB) {
                double dG = k.g(d10, 1.0d);
                if (Math.abs(((double) c4684c2.d()) - (((double) iD) * dG)) <= 1.0d || Math.abs(((double) c4684c2.c()) - (dG * ((double) height))) <= 1.0d) {
                    return true;
                }
            } else if (Math.abs(c4684c2.d() - iD) <= 1 && Math.abs(c4684c2.c() - height) <= 1) {
                return true;
            }
            if (d10 != 1.0d && !zB) {
                return false;
            }
            if (d10 > 1.0d && aVar.isSampled()) {
                return false;
            }
        }
        return true;
    }

    public final void p(Drawable drawable) {
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (bitmap != null) {
            this.f33698c.a(bitmap, true);
            this.f33698c.c(bitmap);
        }
    }

    public final boolean q(i iVar, l lVar, Drawable drawable, boolean z10) {
        if (iVar.z().j() && lVar != null) {
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
            if (bitmap != null) {
                this.f33699d.c(lVar, bitmap, z10);
                return true;
            }
        }
        return false;
    }
}
