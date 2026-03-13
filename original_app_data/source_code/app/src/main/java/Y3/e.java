package Y3;

import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.InterfaceC2166z0;
import Rd.J;
import Rd.M;
import Rd.N;
import Rd.U0;
import Y3.b;
import a4.InterfaceC2641a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c4.C2943a;
import d4.C3818a;
import d4.C3819b;
import d4.C3820c;
import d4.C3821d;
import d4.h;
import e4.C3932a;
import f4.C3990a;
import f4.C3992c;
import f4.C3993d;
import f4.C3994e;
import fc.AbstractC4036s;
import fc.C4015H;
import g4.C4140b;
import g4.m;
import g4.o;
import g4.s;
import gc.C4179C;
import i4.C4353a;
import i4.i;
import i4.j;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.InterfaceC4798d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.AbstractC4984a;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;
import n4.k;
import n4.l;
import nc.AbstractC5160d;
import pe.InterfaceC5469e;
import pe.v;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Y3.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f19735r = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4.c f19737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2641a f19738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f19739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC5469e.a f19740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b.d f19741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Y3.a f19742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f19743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M f19744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C4140b f19745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f19746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f19747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c4.f f19748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n4.m f19749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Y3.a f19750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f19751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f19752q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f19753j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f19755l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f19755l = iVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return e.this.new b(this.f19755l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f19753j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                e eVar = e.this;
                i iVar = this.f19755l;
                this.f19753j = 1;
                obj = eVar.d(iVar, 0, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            j jVar = (j) obj;
            if (jVar instanceof i4.f) {
                throw ((i4.f) jVar).c();
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f19756j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f19757k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f19758l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f19759m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f19760n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f19761o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f19762p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f19763q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f19764r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f19765s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19766t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f19767u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f19769w;

        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f19767u = obj;
            this.f19769w |= Integer.MIN_VALUE;
            return e.this.d(null, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC4984a implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f19770a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(J.a aVar, e eVar) {
            super(aVar);
            this.f19770a = eVar;
        }

        @Override // Rd.J
        public void handleException(InterfaceC4992i interfaceC4992i, Throwable th) {
            this.f19770a.h();
        }
    }

    public e(Context context, i4.c defaults, InterfaceC2641a bitmapPool, o memoryCache, InterfaceC5469e.a callFactory, b.d eventListenerFactory, Y3.a componentRegistry, k options, l lVar) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(defaults, "defaults");
        AbstractC4862t.e(bitmapPool, "bitmapPool");
        AbstractC4862t.e(memoryCache, "memoryCache");
        AbstractC4862t.e(callFactory, "callFactory");
        AbstractC4862t.e(eventListenerFactory, "eventListenerFactory");
        AbstractC4862t.e(componentRegistry, "componentRegistry");
        AbstractC4862t.e(options, "options");
        this.f19736a = context;
        this.f19737b = defaults;
        this.f19738c = bitmapPool;
        this.f19739d = memoryCache;
        this.f19740e = callFactory;
        this.f19741f = eventListenerFactory;
        this.f19742g = componentRegistry;
        this.f19743h = options;
        this.f19744i = N.a(U0.b(null, 1, null).plus(C2123d0.c().J0()).plus(new d(J.f15138L, this)));
        this.f19745j = new C4140b(this, i().b(), null);
        m mVar = new m(i().b(), i().c(), i().d());
        this.f19746k = mVar;
        s sVar = new s(null);
        this.f19747l = sVar;
        c4.f fVar = new c4.f(e());
        this.f19748m = fVar;
        n4.m mVar2 = new n4.m(this, context, options.c());
        this.f19749n = mVar2;
        Y3.a aVarD = componentRegistry.e().c(new C3994e(), String.class).c(new C3990a(), Uri.class).c(new C3993d(context), Uri.class).c(new C3992c(context), Integer.class).b(new d4.j(callFactory), Uri.class).b(new d4.k(callFactory), v.class).b(new h(options.a()), File.class).b(new C3818a(context), Uri.class).b(new C3820c(context), Uri.class).b(new d4.l(context, fVar), Uri.class).b(new C3821d(fVar), Drawable.class).b(new C3819b(), Bitmap.class).a(new C2943a(context)).d();
        this.f19750o = aVarD;
        this.f19751p = C4179C.D0(aVarD.c(), new C3932a(aVarD, e(), i().b(), i().c(), mVar, sVar, mVar2, fVar, null));
        this.f19752q = new AtomicBoolean(false);
    }

    @Override // Y3.d
    public i4.e a(i request) {
        AbstractC4862t.e(request, "request");
        InterfaceC2166z0 interfaceC2166z0D = AbstractC2132i.d(this.f19744i, null, null, new b(request, null), 3, null);
        return request.I() instanceof InterfaceC4798d ? new i4.o(n4.e.g(((InterfaceC4798d) request.I()).getView()).d(interfaceC2166z0D), (InterfaceC4798d) request.I()) : new C4353a(interfaceC2166z0D);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(12:(2:48|(1:50)(3:51|(0)|158))|185|61|(1:63)(1:64)|(1:66)|69|(1:71)(1:72)|73|(1:75)|78|(5:81|36|195|82|(9:84|(2:86|194)|87|88|183|94|(4:96|200|97|(9:100|101|(1:103)(1:104)|187|105|(1:112)|116|146|147))(4:133|(2:135|(5:138|198|139|(1:141)(1:142)|143))|146|147)|182|194)(1:91))|158)|54|189|57|(1:59)(1:60)) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0211, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0212, code lost:
    
        r15 = r7;
        r1 = r1;
        r2 = r2;
        r8 = r8;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0296, code lost:
    
        if (r0 == r4) goto L194;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00cc: MOVE (r1 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:205), block:B:31:0x00ca */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e8 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {all -> 0x00a4, blocks: (B:23:0x009f, B:101:0x02de, B:104:0x02e8), top: B:176:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0350 A[Catch: all -> 0x034b, TRY_ENTER, TryCatch #5 {all -> 0x034b, blocks: (B:94:0x029a, B:96:0x02a1, B:133:0x0350, B:135:0x0354), top: B:183:0x029a }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x038f A[Catch: all -> 0x039a, TRY_LEAVE, TryCatch #13 {all -> 0x039a, blocks: (B:139:0x0381, B:142:0x038f), top: B:198:0x0381 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b8 A[Catch: all -> 0x0405, TRY_LEAVE, TryCatch #2 {all -> 0x0405, blocks: (B:154:0x03b4, B:156:0x03b8, B:168:0x0408, B:169:0x040b), top: B:178:0x03b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f8 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #3 {all -> 0x0047, blocks: (B:13:0x0042, B:160:0x03ea, B:163:0x03f8), top: B:179:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0408 A[Catch: all -> 0x0405, TRY_ENTER, TryCatch #2 {all -> 0x0405, blocks: (B:154:0x03b4, B:156:0x03b8, B:168:0x0408, B:169:0x040b), top: B:178:0x03b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ca A[Catch: all -> 0x0211, TRY_LEAVE, TryCatch #8 {all -> 0x0211, blocks: (B:57:0x01bc, B:73:0x0203, B:75:0x020d, B:78:0x0215, B:148:0x03a0, B:150:0x03aa, B:151:0x03ad, B:60:0x01ca, B:61:0x01ce, B:66:0x01e9, B:69:0x01f1, B:72:0x01fe, B:64:0x01d5), top: B:189:0x01bc, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d5 A[Catch: all -> 0x01ee, TryCatch #6 {all -> 0x01ee, blocks: (B:61:0x01ce, B:66:0x01e9, B:69:0x01f1, B:72:0x01fe, B:64:0x01d5), top: B:185:0x01ce, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e9 A[Catch: all -> 0x01ee, TryCatch #6 {all -> 0x01ee, blocks: (B:61:0x01ce, B:66:0x01e9, B:69:0x01f1, B:72:0x01fe, B:64:0x01d5), top: B:185:0x01ce, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fe A[Catch: all -> 0x01ee, TRY_LEAVE, TryCatch #6 {all -> 0x01ee, blocks: (B:61:0x01ce, B:66:0x01e9, B:69:0x01f1, B:72:0x01fe, B:64:0x01d5), top: B:185:0x01ce, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020d A[Catch: all -> 0x0211, TryCatch #8 {all -> 0x0211, blocks: (B:57:0x01bc, B:73:0x0203, B:75:0x020d, B:78:0x0215, B:148:0x03a0, B:150:0x03aa, B:151:0x03ad, B:60:0x01ca, B:61:0x01ce, B:66:0x01e9, B:69:0x01f1, B:72:0x01fe, B:64:0x01d5), top: B:189:0x01bc, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0256 A[Catch: all -> 0x0275, TryCatch #11 {all -> 0x0275, blocks: (B:82:0x023b, B:84:0x0256, B:91:0x027a), top: B:195:0x023b }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027a A[Catch: all -> 0x0275, TRY_LEAVE, TryCatch #11 {all -> 0x0275, blocks: (B:82:0x023b, B:84:0x0256, B:91:0x027a), top: B:195:0x023b }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a1 A[Catch: all -> 0x034b, TRY_LEAVE, TryCatch #5 {all -> 0x034b, blocks: (B:94:0x029a, B:96:0x02a1, B:133:0x0350, B:135:0x0354), top: B:183:0x029a }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [i4.i] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v24, types: [g4.u] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [Y3.b] */
    /* JADX WARN: Type inference failed for: r11v21, types: [Y3.b] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9, types: [i4.i] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6, types: [Y3.e] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [Y3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [Y3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [Y3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [Y3.e] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v29, types: [Y3.e] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44, types: [g4.r] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [Y3.b] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [g4.r] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [g4.r] */
    /* JADX WARN: Type inference failed for: r4v7, types: [g4.r] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [g4.s] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r7v12, types: [e4.c] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v20, types: [Y3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27, types: [Y3.e] */
    /* JADX WARN: Type inference failed for: r7v29, types: [Y3.e] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r8v0, types: [g4.u] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [g4.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v7, types: [i4.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v31, types: [g4.r] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [Y3.b] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(i4.i r18, int r19, lc.InterfaceC4988e r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.e.d(i4.i, int, lc.e):java.lang.Object");
    }

    public InterfaceC2641a e() {
        return this.f19738c;
    }

    public i4.c f() {
        return this.f19737b;
    }

    public final b.d g() {
        return this.f19741f;
    }

    public final l h() {
        return null;
    }

    public o i() {
        return this.f19739d;
    }

    public final k j() {
        return this.f19743h;
    }

    public final void k(i iVar, Y3.b bVar) {
        bVar.c(iVar);
        i.b bVarX = iVar.x();
        if (bVarX == null) {
            return;
        }
        bVarX.c(iVar);
    }

    public final void l(int i10) {
        i().c().a(i10);
        i().d().a(i10);
        e().a(i10);
    }
}
