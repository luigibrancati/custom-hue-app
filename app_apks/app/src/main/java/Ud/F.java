package Ud;

import Vd.AbstractC2320b;
import fc.C4015H;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class F extends AbstractC2320b implements w, InterfaceC2313e, Vd.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16992e = AtomicReferenceFieldUpdater.newUpdater(F.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16993d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f16994j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f16995k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f16996l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f16997m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f16998n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f16999o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f17001q;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f16999o = obj;
            this.f17001q |= Integer.MIN_VALUE;
            return F.this.collect(null, this);
        }
    }

    public F(Object obj) {
        this._state$volatile = obj;
    }

    @Override // Vd.q
    public InterfaceC2313e a(InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        return G.d(this, interfaceC4992i, i10, aVar);
    }

    @Override // Ud.w
    public boolean c(Object obj, Object obj2) {
        if (obj == null) {
            obj = Vd.t.f17583a;
        }
        if (obj2 == null) {
            obj2 = Vd.t.f17583a;
        }
        return n(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (kotlin.jvm.internal.AbstractC4862t.a(r9, r11) == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:32:0x0095, B:48:0x00cb], limit reached: 53 */
    /* JADX WARN: Path cross not found for [B:36:0x00a4, B:38:0x00aa], limit reached: 53 */
    /* JADX WARN: Path cross not found for [B:38:0x00aa, B:36:0x00a4], limit reached: 53 */
    /* JADX WARN: Path cross not found for [B:38:0x00aa, B:46:0x00c5], limit reached: 53 */
    /* JADX WARN: Path cross not found for [B:48:0x00cb, B:32:0x0095], limit reached: 53 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:32:0x0095, B:34:0x009f, B:36:0x00a4, B:46:0x00c5, B:48:0x00cb, B:38:0x00aa, B:42:0x00b1, B:22:0x005f), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:32:0x0095, B:34:0x009f, B:36:0x00a4, B:46:0x00c5, B:48:0x00cb, B:38:0x00aa, B:42:0x00b1, B:22:0x005f), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:32:0x0095, B:34:0x009f, B:36:0x00a4, B:46:0x00c5, B:48:0x00cb, B:38:0x00aa, B:42:0x00b1, B:22:0x005f), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [Vd.d] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [Ud.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [Ud.H] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Vd.b] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00c9 -> B:32:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00db -> B:32:0x0095). Please report as a decompilation issue!!! */
    @Override // Ud.A, Ud.InterfaceC2313e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(Ud.InterfaceC2314f r10, lc.InterfaceC4988e r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ud.F.collect(Ud.f, lc.e):java.lang.Object");
    }

    @Override // Ud.v, Ud.InterfaceC2314f
    public Object emit(Object obj, InterfaceC4988e interfaceC4988e) {
        setValue(obj);
        return C4015H.f34254a;
    }

    @Override // Ud.w, Ud.E
    public Object getValue() {
        Wd.E e10 = Vd.t.f17583a;
        Object obj = f16992e.get(this);
        if (obj == e10) {
            return null;
        }
        return obj;
    }

    @Override // Vd.AbstractC2320b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public H f() {
        return new H();
    }

    @Override // Vd.AbstractC2320b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public H[] g(int i10) {
        return new H[i10];
    }

    public final boolean n(Object obj, Object obj2) {
        int i10;
        Vd.d[] dVarArrJ;
        synchronized (this) {
            Object obj3 = f16992e.get(this);
            if (obj != null && !AbstractC4862t.a(obj3, obj)) {
                return false;
            }
            if (AbstractC4862t.a(obj3, obj2)) {
                return true;
            }
            f16992e.set(this, obj2);
            int i11 = this.f16993d;
            if ((i11 & 1) != 0) {
                this.f16993d = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f16993d = i12;
            Vd.d[] dVarArrJ2 = j();
            C4015H c4015h = C4015H.f34254a;
            while (true) {
                H[] hArr = (H[]) dVarArrJ2;
                if (hArr != null) {
                    for (H h10 : hArr) {
                        if (h10 != null) {
                            h10.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f16993d;
                    if (i10 == i12) {
                        this.f16993d = i12 + 1;
                        return true;
                    }
                    dVarArrJ = j();
                    C4015H c4015h2 = C4015H.f34254a;
                }
                dVarArrJ2 = dVarArrJ;
                i12 = i10;
            }
        }
    }

    @Override // Ud.w
    public void setValue(Object obj) {
        if (obj == null) {
            obj = Vd.t.f17583a;
        }
        n(null, obj);
    }
}
