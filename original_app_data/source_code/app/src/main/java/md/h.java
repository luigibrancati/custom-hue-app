package md;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import md.j;
import md.p;
import md.y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f40323d = new h(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40326c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f40324a = u.n(16);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f40328b;

        static {
            int[] iArr = new int[y.b.values().length];
            f40328b = iArr;
            try {
                iArr[y.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40328b[y.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40328b[y.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40328b[y.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40328b[y.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40328b[y.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40328b[y.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40328b[y.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40328b[y.b.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40328b[y.b.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40328b[y.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40328b[y.b.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40328b[y.b.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40328b[y.b.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f40328b[y.b.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f40328b[y.b.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f40328b[y.b.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f40328b[y.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[y.c.values().length];
            f40327a = iArr2;
            try {
                iArr2[y.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f40327a[y.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f40327a[y.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f40327a[y.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f40327a[y.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f40327a[y.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f40327a[y.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f40327a[y.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f40327a[y.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends Comparable {
        boolean f();

        y.b g();

        int getNumber();

        boolean h();

        y.c k();

        p.a o(p.a aVar, p pVar);
    }

    public h() {
    }

    public static int d(y.b bVar, int i10, Object obj) {
        int iC = C5052f.C(i10);
        if (bVar == y.b.GROUP) {
            iC *= 2;
        }
        return iC + e(bVar, obj);
    }

    public static int e(y.b bVar, Object obj) {
        switch (a.f40328b[bVar.ordinal()]) {
            case 1:
                return C5052f.g(((Double) obj).doubleValue());
            case 2:
                return C5052f.m(((Float) obj).floatValue());
            case 3:
                return C5052f.q(((Long) obj).longValue());
            case 4:
                return C5052f.E(((Long) obj).longValue());
            case 5:
                return C5052f.p(((Integer) obj).intValue());
            case 6:
                return C5052f.k(((Long) obj).longValue());
            case 7:
                return C5052f.j(((Integer) obj).intValue());
            case 8:
                return C5052f.b(((Boolean) obj).booleanValue());
            case 9:
                return C5052f.B((String) obj);
            case 10:
                return obj instanceof AbstractC5050d ? C5052f.e((AbstractC5050d) obj) : C5052f.c((byte[]) obj);
            case 11:
                return C5052f.D(((Integer) obj).intValue());
            case 12:
                return C5052f.w(((Integer) obj).intValue());
            case 13:
                return C5052f.x(((Long) obj).longValue());
            case 14:
                return C5052f.y(((Integer) obj).intValue());
            case 15:
                return C5052f.A(((Long) obj).longValue());
            case 16:
                return C5052f.n((p) obj);
            case 17:
                return C5052f.s((p) obj);
            case 18:
                return obj instanceof j.a ? C5052f.i(((j.a) obj).getNumber()) : C5052f.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b bVar, Object obj) {
        y.b bVarG = bVar.g();
        int number = bVar.getNumber();
        if (!bVar.f()) {
            return d(bVarG, number, obj);
        }
        int iD = 0;
        if (bVar.h()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iD += e(bVarG, it.next());
            }
            return C5052f.C(number) + iD + C5052f.u(iD);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += d(bVarG, number, it2.next());
        }
        return iD;
    }

    public static h g() {
        return f40323d;
    }

    public static int l(y.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    public static h t() {
        return new h();
    }

    public static Object u(C5051e c5051e, y.b bVar, boolean z10) {
        switch (a.f40328b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(c5051e.l());
            case 2:
                return Float.valueOf(c5051e.p());
            case 3:
                return Long.valueOf(c5051e.s());
            case 4:
                return Long.valueOf(c5051e.L());
            case 5:
                return Integer.valueOf(c5051e.r());
            case 6:
                return Long.valueOf(c5051e.o());
            case 7:
                return Integer.valueOf(c5051e.n());
            case 8:
                return Boolean.valueOf(c5051e.j());
            case 9:
                return z10 ? c5051e.I() : c5051e.H();
            case 10:
                return c5051e.k();
            case 11:
                return Integer.valueOf(c5051e.K());
            case 12:
                return Integer.valueOf(c5051e.D());
            case 13:
                return Long.valueOf(c5051e.E());
            case 14:
                return Integer.valueOf(c5051e.F());
            case 15:
                return Long.valueOf(c5051e.G());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void w(md.y.b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = md.h.a.f40327a
            md.y$c r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L2d;
                case 7: goto L24;
                case 8: goto L18;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L3e
        L15:
            boolean r1 = r3 instanceof md.p
            goto L3e
        L18:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof md.j.a
            if (r2 == 0) goto L21
            goto L22
        L21:
            r0 = r1
        L22:
            r1 = r0
            goto L3e
        L24:
            boolean r2 = r3 instanceof md.AbstractC5050d
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L21
            goto L22
        L2d:
            boolean r1 = r3 instanceof java.lang.String
            goto L3e
        L30:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r1 = r3 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r1 = r3 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r1 = r3 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r1 = r3 instanceof java.lang.Integer
        L3e:
            if (r1 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: md.h.w(md.y$b, java.lang.Object):void");
    }

    public static void x(C5052f c5052f, y.b bVar, int i10, Object obj) throws IOException {
        if (bVar == y.b.GROUP) {
            c5052f.X(i10, (p) obj);
        } else {
            c5052f.v0(i10, l(bVar, false));
            y(c5052f, bVar, obj);
        }
    }

    public static void y(C5052f c5052f, y.b bVar, Object obj) throws IOException {
        switch (a.f40328b[bVar.ordinal()]) {
            case 1:
                c5052f.Q(((Double) obj).doubleValue());
                break;
            case 2:
                c5052f.W(((Float) obj).floatValue());
                break;
            case 3:
                c5052f.b0(((Long) obj).longValue());
                break;
            case 4:
                c5052f.y0(((Long) obj).longValue());
                break;
            case 5:
                c5052f.a0(((Integer) obj).intValue());
                break;
            case 6:
                c5052f.U(((Long) obj).longValue());
                break;
            case 7:
                c5052f.T(((Integer) obj).intValue());
                break;
            case 8:
                c5052f.L(((Boolean) obj).booleanValue());
                break;
            case 9:
                c5052f.u0((String) obj);
                break;
            case 10:
                if (!(obj instanceof AbstractC5050d)) {
                    c5052f.M((byte[]) obj);
                } else {
                    c5052f.O((AbstractC5050d) obj);
                }
                break;
            case 11:
                c5052f.x0(((Integer) obj).intValue());
                break;
            case 12:
                c5052f.p0(((Integer) obj).intValue());
                break;
            case 13:
                c5052f.q0(((Long) obj).longValue());
                break;
            case 14:
                c5052f.r0(((Integer) obj).intValue());
                break;
            case 15:
                c5052f.t0(((Long) obj).longValue());
                break;
            case 16:
                c5052f.Y((p) obj);
                break;
            case 17:
                c5052f.d0((p) obj);
                break;
            case 18:
                if (!(obj instanceof j.a)) {
                    c5052f.S(((Integer) obj).intValue());
                } else {
                    c5052f.S(((j.a) obj).getNumber());
                }
                break;
        }
    }

    public static void z(b bVar, Object obj, C5052f c5052f) throws IOException {
        y.b bVarG = bVar.g();
        int number = bVar.getNumber();
        if (!bVar.f()) {
            x(c5052f, bVarG, number, obj);
            return;
        }
        List list = (List) obj;
        if (!bVar.h()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(c5052f, bVarG, number, it.next());
            }
            return;
        }
        c5052f.v0(number, 2);
        Iterator it2 = list.iterator();
        int iE = 0;
        while (it2.hasNext()) {
            iE += e(bVarG, it2.next());
        }
        c5052f.n0(iE);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(c5052f, bVarG, it3.next());
        }
    }

    public void a(b bVar, Object obj) {
        List arrayList;
        if (!bVar.f()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        w(bVar.g(), obj);
        Object objH = h(bVar);
        if (objH == null) {
            arrayList = new ArrayList();
            this.f40324a.o(bVar, arrayList);
        } else {
            arrayList = (List) objH;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h clone() {
        h hVarT = t();
        for (int i10 = 0; i10 < this.f40324a.i(); i10++) {
            Map.Entry entryH = this.f40324a.h(i10);
            hVarT.v((b) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f40324a.j()) {
            hVarT.v((b) entry.getKey(), entry.getValue());
        }
        hVarT.f40326c = this.f40326c;
        return hVarT;
    }

    public final Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public Object h(b bVar) {
        return this.f40324a.get(bVar);
    }

    public Object i(b bVar, int i10) {
        if (!bVar.f()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(bVar);
        if (objH != null) {
            return ((List) objH).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(b bVar) {
        if (!bVar.f()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(bVar);
        if (objH == null) {
            return 0;
        }
        return ((List) objH).size();
    }

    public int k() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f40324a.i(); i10++) {
            Map.Entry entryH = this.f40324a.h(i10);
            iF += f((b) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f40324a.j()) {
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean m(b bVar) {
        if (bVar.f()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f40324a.get(bVar) != null;
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f40324a.i(); i10++) {
            if (!o(this.f40324a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f40324a.j().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.k() != y.c.MESSAGE) {
            return true;
        }
        if (!bVar.f()) {
            Object value = entry.getValue();
            if (value instanceof p) {
                return ((p) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((p) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public Iterator p() {
        return this.f40326c ? new l(this.f40324a.entrySet().iterator()) : this.f40324a.entrySet().iterator();
    }

    public void q() {
        if (this.f40325b) {
            return;
        }
        this.f40324a.m();
        this.f40325b = true;
    }

    public void r(h hVar) {
        for (int i10 = 0; i10 < hVar.f40324a.i(); i10++) {
            s(hVar.f40324a.h(i10));
        }
        Iterator it = hVar.f40324a.j().iterator();
        while (it.hasNext()) {
            s((Map.Entry) it.next());
        }
    }

    public final void s(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.f()) {
            Object objH = h(bVar);
            if (objH == null) {
                objH = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objH).add(c(it.next()));
            }
            this.f40324a.o(bVar, objH);
            return;
        }
        if (bVar.k() != y.c.MESSAGE) {
            this.f40324a.o(bVar, c(value));
            return;
        }
        Object objH2 = h(bVar);
        if (objH2 == null) {
            this.f40324a.o(bVar, c(value));
        } else {
            this.f40324a.o(bVar, bVar.o(((p) objH2).toBuilder(), (p) value).build());
        }
    }

    public void v(b bVar, Object obj) {
        if (!bVar.f()) {
            w(bVar.g(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(bVar.g(), it.next());
            }
            obj = arrayList;
        }
        this.f40324a.o(bVar, obj);
    }

    public h(boolean z10) {
        q();
    }
}
