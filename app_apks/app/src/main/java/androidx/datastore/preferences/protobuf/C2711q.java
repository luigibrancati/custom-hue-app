package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2711q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2711q f22893d = new C2711q(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f22894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22896c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f22898b;

        static {
            int[] iArr = new int[l0.b.values().length];
            f22898b = iArr;
            try {
                iArr[l0.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22898b[l0.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22898b[l0.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22898b[l0.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22898b[l0.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22898b[l0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22898b[l0.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22898b[l0.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22898b[l0.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22898b[l0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22898b[l0.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22898b[l0.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22898b[l0.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22898b[l0.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22898b[l0.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22898b[l0.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22898b[l0.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22898b[l0.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[l0.c.values().length];
            f22897a = iArr2;
            try {
                iArr2[l0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f22897a[l0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f22897a[l0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f22897a[l0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f22897a[l0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f22897a[l0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f22897a[l0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f22897a[l0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f22897a[l0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends Comparable {
        boolean f();

        l0.b g();

        int getNumber();

        boolean h();
    }

    public C2711q() {
        this.f22894a = c0.q();
    }

    public static int b(l0.b bVar, int i10, Object obj) {
        int iR = AbstractC2703i.R(i10);
        if (bVar == l0.b.GROUP) {
            iR *= 2;
        }
        return iR + c(bVar, obj);
    }

    public static int c(l0.b bVar, Object obj) {
        switch (a.f22898b[bVar.ordinal()]) {
            case 1:
                return AbstractC2703i.j(((Double) obj).doubleValue());
            case 2:
                return AbstractC2703i.r(((Float) obj).floatValue());
            case 3:
                return AbstractC2703i.y(((Long) obj).longValue());
            case 4:
                return AbstractC2703i.V(((Long) obj).longValue());
            case 5:
                return AbstractC2703i.w(((Integer) obj).intValue());
            case 6:
                return AbstractC2703i.p(((Long) obj).longValue());
            case 7:
                return AbstractC2703i.n(((Integer) obj).intValue());
            case 8:
                return AbstractC2703i.e(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC2703i.t((K) obj);
            case 10:
                return AbstractC2703i.D((K) obj);
            case 11:
                return obj instanceof AbstractC2700f ? AbstractC2703i.h((AbstractC2700f) obj) : AbstractC2703i.Q((String) obj);
            case 12:
                return obj instanceof AbstractC2700f ? AbstractC2703i.h((AbstractC2700f) obj) : AbstractC2703i.f((byte[]) obj);
            case 13:
                return AbstractC2703i.T(((Integer) obj).intValue());
            case 14:
                return AbstractC2703i.I(((Integer) obj).intValue());
            case 15:
                return AbstractC2703i.K(((Long) obj).longValue());
            case 16:
                return AbstractC2703i.M(((Integer) obj).intValue());
            case 17:
                return AbstractC2703i.O(((Long) obj).longValue());
            case 18:
                return AbstractC2703i.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        l0.b bVarG = bVar.g();
        int number = bVar.getNumber();
        if (!bVar.f()) {
            return b(bVarG, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.h()) {
            int iB = 0;
            while (i10 < size) {
                iB += b(bVarG, number, list.get(i10));
                i10++;
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iC = 0;
        while (i10 < size) {
            iC += c(bVarG, list.get(i10));
            i10++;
        }
        return AbstractC2703i.R(number) + iC + AbstractC2703i.T(iC);
    }

    public static C2711q f() {
        return f22893d;
    }

    public static int j(l0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    public static boolean n(Map.Entry entry) {
        android.support.v4.media.session.a.a(entry.getKey());
        throw null;
    }

    public static boolean o(l0.b bVar, Object obj) {
        AbstractC2714u.a(obj);
        switch (a.f22897a[bVar.a().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC2700f) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                }
                break;
            case 9:
                if (!(obj instanceof K)) {
                }
                break;
        }
        return false;
    }

    public static C2711q t() {
        return new C2711q();
    }

    public static void w(AbstractC2703i abstractC2703i, l0.b bVar, int i10, Object obj) {
        if (bVar == l0.b.GROUP) {
            abstractC2703i.w0(i10, (K) obj);
        } else {
            abstractC2703i.S0(i10, j(bVar, false));
            x(abstractC2703i, bVar, obj);
        }
    }

    public static void x(AbstractC2703i abstractC2703i, l0.b bVar, Object obj) {
        switch (a.f22898b[bVar.ordinal()]) {
            case 1:
                abstractC2703i.n0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC2703i.v0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC2703i.D0(((Long) obj).longValue());
                break;
            case 4:
                abstractC2703i.W0(((Long) obj).longValue());
                break;
            case 5:
                abstractC2703i.B0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC2703i.t0(((Long) obj).longValue());
                break;
            case 7:
                abstractC2703i.r0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC2703i.h0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC2703i.y0((K) obj);
                break;
            case 10:
                abstractC2703i.F0((K) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC2700f)) {
                    abstractC2703i.R0((String) obj);
                } else {
                    abstractC2703i.l0((AbstractC2700f) obj);
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC2700f)) {
                    abstractC2703i.i0((byte[]) obj);
                } else {
                    abstractC2703i.l0((AbstractC2700f) obj);
                }
                break;
            case 13:
                abstractC2703i.U0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC2703i.J0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC2703i.L0(((Long) obj).longValue());
                break;
            case 16:
                abstractC2703i.N0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC2703i.P0(((Long) obj).longValue());
                break;
            case 18:
                abstractC2703i.p0(((Integer) obj).intValue());
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2711q clone() {
        C2711q c2711qT = t();
        int iK = this.f22894a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            Map.Entry entryJ = this.f22894a.j(i10);
            android.support.v4.media.session.a.a(entryJ.getKey());
            c2711qT.u(null, entryJ.getValue());
        }
        for (Map.Entry entry : this.f22894a.m()) {
            android.support.v4.media.session.a.a(entry.getKey());
            c2711qT.u(null, entry.getValue());
        }
        c2711qT.f22896c = this.f22896c;
        return c2711qT;
    }

    public Iterator e() {
        return k() ? Collections.emptyIterator() : this.f22896c ? new C2717x(this.f22894a.h().iterator()) : this.f22894a.h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2711q) {
            return this.f22894a.equals(((C2711q) obj).f22894a);
        }
        return false;
    }

    public int g() {
        int iK = this.f22894a.k();
        int iH = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            iH += h(this.f22894a.j(i10));
        }
        Iterator it = this.f22894a.m().iterator();
        while (it.hasNext()) {
            iH += h((Map.Entry) it.next());
        }
        return iH;
    }

    public final int h(Map.Entry entry) {
        android.support.v4.media.session.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public int hashCode() {
        return this.f22894a.hashCode();
    }

    public int i() {
        int iK = this.f22894a.k();
        int iD = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            Map.Entry entryJ = this.f22894a.j(i10);
            android.support.v4.media.session.a.a(entryJ.getKey());
            iD += d(null, entryJ.getValue());
        }
        for (Map.Entry entry : this.f22894a.m()) {
            android.support.v4.media.session.a.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public boolean k() {
        return this.f22894a.isEmpty();
    }

    public boolean l() {
        return this.f22895b;
    }

    public boolean m() {
        int iK = this.f22894a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            if (!n(this.f22894a.j(i10))) {
                return false;
            }
        }
        Iterator it = this.f22894a.m().iterator();
        while (it.hasNext()) {
            if (!n((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator p() {
        return k() ? Collections.emptyIterator() : this.f22896c ? new C2717x(this.f22894a.entrySet().iterator()) : this.f22894a.entrySet().iterator();
    }

    public void q() {
        if (this.f22895b) {
            return;
        }
        int iK = this.f22894a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            Map.Entry entryJ = this.f22894a.j(i10);
            if (entryJ.getValue() instanceof AbstractC2713t) {
                ((AbstractC2713t) entryJ.getValue()).A();
            }
        }
        this.f22894a.p();
        this.f22895b = true;
    }

    public void r(C2711q c2711q) {
        int iK = c2711q.f22894a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            s(c2711q.f22894a.j(i10));
        }
        Iterator it = c2711q.f22894a.m().iterator();
        while (it.hasNext()) {
            s((Map.Entry) it.next());
        }
    }

    public final void s(Map.Entry entry) {
        android.support.v4.media.session.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public void u(b bVar, Object obj) {
        if (!bVar.f()) {
            v(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f22894a.r(bVar, obj);
    }

    public final void v(b bVar, Object obj) {
        if (!o(bVar.g(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.getNumber()), bVar.g().a(), obj.getClass().getName()));
        }
    }

    public C2711q(boolean z10) {
        this(c0.q());
        q();
    }

    public C2711q(c0 c0Var) {
        this.f22894a = c0Var;
        q();
    }
}
