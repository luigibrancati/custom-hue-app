package com.google.protobuf;

import com.google.protobuf.InterfaceC3717g0;
import com.google.protobuf.N;
import com.google.protobuf.Q0;
import com.google.protobuf.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I f32104d = new I(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D0 f32105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32107c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f32109b;

        static {
            int[] iArr = new int[Q0.b.values().length];
            f32109b = iArr;
            try {
                iArr[Q0.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32109b[Q0.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32109b[Q0.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32109b[Q0.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32109b[Q0.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32109b[Q0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32109b[Q0.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32109b[Q0.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32109b[Q0.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32109b[Q0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32109b[Q0.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32109b[Q0.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32109b[Q0.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32109b[Q0.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32109b[Q0.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32109b[Q0.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f32109b[Q0.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f32109b[Q0.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[Q0.c.values().length];
            f32108a = iArr2;
            try {
                iArr2[Q0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f32108a[Q0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f32108a[Q0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f32108a[Q0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f32108a[Q0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f32108a[Q0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f32108a[Q0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f32108a[Q0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f32108a[Q0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends Comparable {
        boolean f();

        Q0.b g();

        int getNumber();

        boolean h();

        Q0.c k();

        InterfaceC3717g0.a n(InterfaceC3717g0.a aVar, InterfaceC3717g0 interfaceC3717g0);
    }

    public I() {
        this.f32105a = D0.q(16);
    }

    public static I A() {
        return new I();
    }

    public static Object B(AbstractC3724k abstractC3724k, Q0.b bVar, boolean z10) {
        return z10 ? Q0.d(abstractC3724k, bVar, Q0.d.STRICT) : Q0.d(abstractC3724k, bVar, Q0.d.LOOSE);
    }

    public static void E(AbstractC3728m abstractC3728m, Q0.b bVar, int i10, Object obj) {
        if (bVar == Q0.b.GROUP) {
            abstractC3728m.z0(i10, (InterfaceC3717g0) obj);
        } else {
            abstractC3728m.V0(i10, o(bVar, false));
            F(abstractC3728m, bVar, obj);
        }
    }

    public static void F(AbstractC3728m abstractC3728m, Q0.b bVar, Object obj) {
        switch (a.f32109b[bVar.ordinal()]) {
            case 1:
                abstractC3728m.q0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC3728m.y0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC3728m.G0(((Long) obj).longValue());
                break;
            case 4:
                abstractC3728m.Z0(((Long) obj).longValue());
                break;
            case 5:
                abstractC3728m.E0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC3728m.w0(((Long) obj).longValue());
                break;
            case 7:
                abstractC3728m.u0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC3728m.k0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC3728m.B0((InterfaceC3717g0) obj);
                break;
            case 10:
                abstractC3728m.I0((InterfaceC3717g0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC3722j)) {
                    abstractC3728m.U0((String) obj);
                } else {
                    abstractC3728m.o0((AbstractC3722j) obj);
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC3722j)) {
                    abstractC3728m.l0((byte[]) obj);
                } else {
                    abstractC3728m.o0((AbstractC3722j) obj);
                }
                break;
            case 13:
                abstractC3728m.X0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC3728m.M0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC3728m.O0(((Long) obj).longValue());
                break;
            case 16:
                abstractC3728m.Q0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC3728m.S0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof N.c)) {
                    abstractC3728m.s0(((Integer) obj).intValue());
                } else {
                    abstractC3728m.s0(((N.c) obj).getNumber());
                }
                break;
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int d(Q0.b bVar, int i10, Object obj) {
        int iU = AbstractC3728m.U(i10);
        if (bVar == Q0.b.GROUP) {
            iU *= 2;
        }
        return iU + e(bVar, obj);
    }

    public static int e(Q0.b bVar, Object obj) {
        switch (a.f32109b[bVar.ordinal()]) {
            case 1:
                return AbstractC3728m.k(((Double) obj).doubleValue());
            case 2:
                return AbstractC3728m.s(((Float) obj).floatValue());
            case 3:
                return AbstractC3728m.z(((Long) obj).longValue());
            case 4:
                return AbstractC3728m.Y(((Long) obj).longValue());
            case 5:
                return AbstractC3728m.x(((Integer) obj).intValue());
            case 6:
                return AbstractC3728m.q(((Long) obj).longValue());
            case 7:
                return AbstractC3728m.o(((Integer) obj).intValue());
            case 8:
                return AbstractC3728m.f(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC3728m.u((InterfaceC3717g0) obj);
            case 10:
                return AbstractC3728m.G((InterfaceC3717g0) obj);
            case 11:
                return obj instanceof AbstractC3722j ? AbstractC3728m.i((AbstractC3722j) obj) : AbstractC3728m.T((String) obj);
            case 12:
                return obj instanceof AbstractC3722j ? AbstractC3728m.i((AbstractC3722j) obj) : AbstractC3728m.g((byte[]) obj);
            case 13:
                return AbstractC3728m.W(((Integer) obj).intValue());
            case 14:
                return AbstractC3728m.L(((Integer) obj).intValue());
            case 15:
                return AbstractC3728m.N(((Long) obj).longValue());
            case 16:
                return AbstractC3728m.P(((Integer) obj).intValue());
            case 17:
                return AbstractC3728m.R(((Long) obj).longValue());
            case 18:
                return obj instanceof N.c ? AbstractC3728m.m(((N.c) obj).getNumber()) : AbstractC3728m.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b bVar, Object obj) {
        Q0.b bVarG = bVar.g();
        int number = bVar.getNumber();
        if (!bVar.f()) {
            return d(bVarG, number, obj);
        }
        List list = (List) obj;
        int iD = 0;
        if (!bVar.h()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iD += d(bVarG, number, it.next());
            }
            return iD;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iD += e(bVarG, it2.next());
        }
        return AbstractC3728m.U(number) + iD + AbstractC3728m.W(iD);
    }

    public static I h() {
        return f32104d;
    }

    public static int o(Q0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    public static boolean t(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.k() != Q0.c.MESSAGE) {
            return true;
        }
        if (!bVar.f()) {
            return u(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!u(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(Object obj) {
        if (obj instanceof InterfaceC3719h0) {
            return ((InterfaceC3719h0) obj).isInitialized();
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static boolean v(Q0.b bVar, Object obj) {
        N.a(obj);
        switch (a.f32108a[bVar.a().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC3722j) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof N.c)) {
                }
                break;
            case 9:
                if (!(obj instanceof InterfaceC3717g0)) {
                }
                break;
        }
        return false;
    }

    public void C(b bVar, Object obj) {
        if (!bVar.f()) {
            D(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                D(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f32105a.r(bVar, obj);
    }

    public final void D(b bVar, Object obj) {
        if (!v(bVar.g(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.getNumber()), bVar.g().a(), obj.getClass().getName()));
        }
    }

    public void a(b bVar, Object obj) {
        List arrayList;
        if (!bVar.f()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        D(bVar, obj);
        Object objI = i(bVar);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f32105a.r(bVar, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public I clone() {
        I iA = A();
        for (int i10 = 0; i10 < this.f32105a.k(); i10++) {
            Map.Entry entryJ = this.f32105a.j(i10);
            iA.C((b) entryJ.getKey(), entryJ.getValue());
        }
        for (Map.Entry entry : this.f32105a.m()) {
            iA.C((b) entry.getKey(), entry.getValue());
        }
        iA.f32107c = this.f32107c;
        return iA;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return this.f32105a.equals(((I) obj).f32105a);
        }
        return false;
    }

    public Iterator g() {
        return this.f32107c ? new S.b(this.f32105a.h().iterator()) : this.f32105a.h().iterator();
    }

    public int hashCode() {
        return this.f32105a.hashCode();
    }

    public Object i(b bVar) {
        return this.f32105a.get(bVar);
    }

    public int j() {
        int iK = 0;
        for (int i10 = 0; i10 < this.f32105a.k(); i10++) {
            iK += k(this.f32105a.j(i10));
        }
        Iterator it = this.f32105a.m().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public final int k(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        return (bVar.k() != Q0.c.MESSAGE || bVar.f() || bVar.h()) ? f(bVar, value) : AbstractC3728m.D(((b) entry.getKey()).getNumber(), (InterfaceC3717g0) value);
    }

    public Object l(b bVar, int i10) {
        if (!bVar.f()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objI = i(bVar);
        if (objI != null) {
            return ((List) objI).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int m(b bVar) {
        if (!bVar.f()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objI = i(bVar);
        if (objI == null) {
            return 0;
        }
        return ((List) objI).size();
    }

    public int n() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f32105a.k(); i10++) {
            Map.Entry entryJ = this.f32105a.j(i10);
            iF += f((b) entryJ.getKey(), entryJ.getValue());
        }
        for (Map.Entry entry : this.f32105a.m()) {
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean p(b bVar) {
        if (bVar.f()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f32105a.get(bVar) != null;
    }

    public boolean q() {
        return this.f32105a.isEmpty();
    }

    public boolean r() {
        return this.f32106b;
    }

    public boolean s() {
        for (int i10 = 0; i10 < this.f32105a.k(); i10++) {
            if (!t(this.f32105a.j(i10))) {
                return false;
            }
        }
        Iterator it = this.f32105a.m().iterator();
        while (it.hasNext()) {
            if (!t((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator w() {
        return this.f32107c ? new S.b(this.f32105a.entrySet().iterator()) : this.f32105a.entrySet().iterator();
    }

    public void x() {
        if (this.f32106b) {
            return;
        }
        for (int i10 = 0; i10 < this.f32105a.k(); i10++) {
            Map.Entry entryJ = this.f32105a.j(i10);
            if (entryJ.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryJ.getValue()).makeImmutable();
            }
        }
        this.f32105a.p();
        this.f32106b = true;
    }

    public void y(I i10) {
        for (int i11 = 0; i11 < i10.f32105a.k(); i11++) {
            z(i10.f32105a.j(i11));
        }
        Iterator it = i10.f32105a.m().iterator();
        while (it.hasNext()) {
            z((Map.Entry) it.next());
        }
    }

    public final void z(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.f()) {
            Object objI = i(bVar);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f32105a.r(bVar, objI);
            return;
        }
        if (bVar.k() != Q0.c.MESSAGE) {
            this.f32105a.r(bVar, c(value));
            return;
        }
        Object objI2 = i(bVar);
        if (objI2 == null) {
            this.f32105a.r(bVar, c(value));
        } else {
            this.f32105a.r(bVar, bVar.n(((InterfaceC3717g0) objI2).toBuilder(), (InterfaceC3717g0) value).build());
        }
    }

    public I(boolean z10) {
        this(D0.q(0));
        x();
    }

    public I(D0 d02) {
        this.f32105a = d02;
        x();
    }
}
