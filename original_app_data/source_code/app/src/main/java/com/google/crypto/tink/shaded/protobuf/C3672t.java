package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3678z;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3672t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3672t f31565d = new C3672t(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f31566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31568c;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.t$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f31570b;

        static {
            int[] iArr = new int[r0.b.values().length];
            f31570b = iArr;
            try {
                iArr[r0.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31570b[r0.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31570b[r0.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31570b[r0.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31570b[r0.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31570b[r0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31570b[r0.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31570b[r0.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31570b[r0.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31570b[r0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31570b[r0.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f31570b[r0.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f31570b[r0.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f31570b[r0.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f31570b[r0.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f31570b[r0.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f31570b[r0.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f31570b[r0.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            f31569a = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f31569a[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f31569a[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f31569a[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f31569a[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f31569a[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f31569a[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f31569a[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f31569a[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.t$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends Comparable {
        boolean f();

        r0.b g();

        int getNumber();

        boolean h();
    }

    public C3672t() {
        this.f31566a = i0.r();
    }

    public static int b(r0.b bVar, int i10, Object obj) {
        int iN = AbstractC3664k.N(i10);
        if (bVar == r0.b.GROUP) {
            iN *= 2;
        }
        return iN + c(bVar, obj);
    }

    public static int c(r0.b bVar, Object obj) {
        switch (a.f31570b[bVar.ordinal()]) {
            case 1:
                return AbstractC3664k.j(((Double) obj).doubleValue());
            case 2:
                return AbstractC3664k.r(((Float) obj).floatValue());
            case 3:
                return AbstractC3664k.x(((Long) obj).longValue());
            case 4:
                return AbstractC3664k.R(((Long) obj).longValue());
            case 5:
                return AbstractC3664k.v(((Integer) obj).intValue());
            case 6:
                return AbstractC3664k.p(((Long) obj).longValue());
            case 7:
                return AbstractC3664k.n(((Integer) obj).intValue());
            case 8:
                return AbstractC3664k.e(((Boolean) obj).booleanValue());
            case 9:
                return ((Q) obj).getSerializedSize();
            case 10:
                return AbstractC3664k.B((Q) obj);
            case 11:
                return obj instanceof AbstractC3661h ? AbstractC3664k.h((AbstractC3661h) obj) : AbstractC3664k.M((String) obj);
            case 12:
                return obj instanceof AbstractC3661h ? AbstractC3664k.h((AbstractC3661h) obj) : AbstractC3664k.f((byte[]) obj);
            case 13:
                return AbstractC3664k.P(((Integer) obj).intValue());
            case 14:
                return AbstractC3664k.E(((Integer) obj).intValue());
            case 15:
                return AbstractC3664k.G(((Long) obj).longValue());
            case 16:
                return AbstractC3664k.I(((Integer) obj).intValue());
            case 17:
                return AbstractC3664k.K(((Long) obj).longValue());
            case 18:
                return obj instanceof AbstractC3678z.a ? AbstractC3664k.l(((AbstractC3678z.a) obj).getNumber()) : AbstractC3664k.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        r0.b bVarG = bVar.g();
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
        return AbstractC3664k.N(number) + iC + AbstractC3664k.P(iC);
    }

    public static C3672t f() {
        return f31565d;
    }

    public static boolean m(Map.Entry entry) {
        android.support.v4.media.session.a.a(entry.getKey());
        throw null;
    }

    public static boolean n(r0.b bVar, Object obj) {
        AbstractC3678z.a(obj);
        switch (a.f31569a[bVar.b().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC3661h) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof AbstractC3678z.a)) {
                }
                break;
            case 9:
                if (!(obj instanceof Q)) {
                }
                break;
        }
        return false;
    }

    public static C3672t s() {
        return new C3672t();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3672t clone() {
        C3672t c3672tS = s();
        int iL = this.f31566a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry entryK = this.f31566a.k(i10);
            android.support.v4.media.session.a.a(entryK.getKey());
            c3672tS.t(null, entryK.getValue());
        }
        for (Map.Entry entry : this.f31566a.n()) {
            android.support.v4.media.session.a.a(entry.getKey());
            c3672tS.t(null, entry.getValue());
        }
        c3672tS.f31568c = this.f31568c;
        return c3672tS;
    }

    public Iterator e() {
        return j() ? Collections.emptyIterator() : this.f31568c ? new C(this.f31566a.i().iterator()) : this.f31566a.i().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3672t) {
            return this.f31566a.equals(((C3672t) obj).f31566a);
        }
        return false;
    }

    public int g() {
        int iL = this.f31566a.l();
        int iH = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iH += h(this.f31566a.k(i10));
        }
        Iterator it = this.f31566a.n().iterator();
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
        return this.f31566a.hashCode();
    }

    public int i() {
        int iL = this.f31566a.l();
        int iD = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry entryK = this.f31566a.k(i10);
            android.support.v4.media.session.a.a(entryK.getKey());
            iD += d(null, entryK.getValue());
        }
        for (Map.Entry entry : this.f31566a.n()) {
            android.support.v4.media.session.a.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public boolean j() {
        return this.f31566a.isEmpty();
    }

    public boolean k() {
        return this.f31567b;
    }

    public boolean l() {
        int iL = this.f31566a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            if (!m(this.f31566a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f31566a.n().iterator();
        while (it.hasNext()) {
            if (!m((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator o() {
        return j() ? Collections.emptyIterator() : this.f31568c ? new C(this.f31566a.entrySet().iterator()) : this.f31566a.entrySet().iterator();
    }

    public void p() {
        if (this.f31567b) {
            return;
        }
        int iL = this.f31566a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Object value = this.f31566a.k(i10).getValue();
            if (value instanceof AbstractC3676x) {
                ((AbstractC3676x) value).z();
            }
        }
        Iterator it = this.f31566a.n().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC3676x) {
                ((AbstractC3676x) value2).z();
            }
        }
        this.f31566a.q();
        this.f31567b = true;
    }

    public void q(C3672t c3672t) {
        int iL = c3672t.f31566a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            r(c3672t.f31566a.k(i10));
        }
        Iterator it = c3672t.f31566a.n().iterator();
        while (it.hasNext()) {
            r((Map.Entry) it.next());
        }
    }

    public final void r(Map.Entry entry) {
        android.support.v4.media.session.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public void t(b bVar, Object obj) {
        if (!bVar.f()) {
            u(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                u(bVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f31566a.s(bVar, obj);
    }

    public final void u(b bVar, Object obj) {
        if (!n(bVar.g(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.getNumber()), bVar.g().b(), obj.getClass().getName()));
        }
    }

    public C3672t(boolean z10) {
        this(i0.r());
        p();
    }

    public C3672t(i0 i0Var) {
        this.f31566a = i0Var;
        p();
    }
}
