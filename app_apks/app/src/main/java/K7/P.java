package K7;

import K7.AbstractC1083x;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P extends AbstractC1083x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC1083x f7596h = new P(null, new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object f7597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f7598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f7599g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC1085z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient AbstractC1083x f7600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient Object[] f7601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient int f7602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final transient int f7603f;

        /* JADX INFO: renamed from: K7.P$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0117a extends AbstractC1081v {
            public C0117a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i10) {
                J7.n.h(i10, a.this.f7603f);
                int i11 = i10 * 2;
                Object obj = a.this.f7601d[a.this.f7602e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f7601d[i11 + (a.this.f7602e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // K7.AbstractC1079t
            public boolean k() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f7603f;
            }
        }

        public a(AbstractC1083x abstractC1083x, Object[] objArr, int i10, int i11) {
            this.f7600c = abstractC1083x;
            this.f7601d = objArr;
            this.f7602e = i10;
            this.f7603f = i11;
        }

        @Override // K7.AbstractC1079t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f7600c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // K7.AbstractC1079t
        public int d(Object[] objArr, int i10) {
            return c().d(objArr, i10);
        }

        @Override // K7.AbstractC1079t
        public boolean k() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: l */
        public Y iterator() {
            return c().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7603f;
        }

        @Override // K7.AbstractC1085z
        public AbstractC1081v w() {
            return new C0117a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC1085z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient AbstractC1083x f7605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient AbstractC1081v f7606d;

        public b(AbstractC1083x abstractC1083x, AbstractC1081v abstractC1081v) {
            this.f7605c = abstractC1083x;
            this.f7606d = abstractC1081v;
        }

        @Override // K7.AbstractC1085z, K7.AbstractC1079t
        public AbstractC1081v c() {
            return this.f7606d;
        }

        @Override // K7.AbstractC1079t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f7605c.get(obj) != null;
        }

        @Override // K7.AbstractC1079t
        public int d(Object[] objArr, int i10) {
            return c().d(objArr, i10);
        }

        @Override // K7.AbstractC1079t
        public boolean k() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: l */
        public Y iterator() {
            return c().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7605c.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC1081v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient Object[] f7607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient int f7608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient int f7609e;

        public c(Object[] objArr, int i10, int i11) {
            this.f7607c = objArr;
            this.f7608d = i10;
            this.f7609e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            J7.n.h(i10, this.f7609e);
            Object obj = this.f7607c[(i10 * 2) + this.f7608d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // K7.AbstractC1079t
        public boolean k() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7609e;
        }
    }

    public P(Object obj, Object[] objArr, int i10) {
        this.f7597e = obj;
        this.f7598f = objArr;
        this.f7599g = i10;
    }

    public static P p(int i10, Object[] objArr) {
        return q(i10, objArr, null);
    }

    public static P q(int i10, Object[] objArr, AbstractC1083x.a aVar) {
        if (i10 == 0) {
            return (P) f7596h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC1069i.a(obj, obj2);
            return new P(null, objArr, 1);
        }
        J7.n.l(i10, objArr.length >> 1);
        Object objR = r(objArr, i10, AbstractC1085z.r(i10), 0);
        if (objR instanceof Object[]) {
            Object[] objArr2 = (Object[]) objR;
            AbstractC1083x.a.C0120a c0120a = (AbstractC1083x.a.C0120a) objArr2[2];
            if (aVar == null) {
                throw c0120a.a();
            }
            aVar.f7728e = c0120a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objR = obj3;
            i10 = iIntValue;
        }
        return new P(objR, objArr, i10);
    }

    public static Object r(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        AbstractC1083x.a.C0120a c0120a = null;
        int i14 = 1;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC1069i.a(obj, obj2);
            return null;
        }
        int i15 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = (i17 * 2) + i12;
                int i19 = (i16 * 2) + i12;
                Object obj3 = objArr[i18];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC1069i.a(obj3, obj4);
                int iB = AbstractC1078s.b(obj3.hashCode());
                while (true) {
                    int i20 = iB & i15;
                    int i21 = bArr[i20] & ForkServer.ERROR;
                    if (i21 == 255) {
                        bArr[i20] = (byte) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj3;
                            objArr[i19 ^ 1] = obj4;
                        }
                        i16++;
                    } else {
                        if (obj3.equals(objArr[i21])) {
                            int i22 = i21 ^ 1;
                            Object obj5 = objArr[i22];
                            Objects.requireNonNull(obj5);
                            c0120a = new AbstractC1083x.a.C0120a(obj3, obj4, obj5);
                            objArr[i22] = obj4;
                            break;
                        }
                        iB = i20 + 1;
                    }
                }
            }
            return i16 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i16), c0120a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = (i24 * 2) + i12;
                int i26 = (i23 * 2) + i12;
                Object obj6 = objArr[i25];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i25 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC1069i.a(obj6, obj7);
                int iB2 = AbstractC1078s.b(obj6.hashCode());
                while (true) {
                    int i27 = iB2 & i15;
                    int i28 = sArr[i27] & 65535;
                    if (i28 == 65535) {
                        sArr[i27] = (short) i26;
                        if (i23 < i24) {
                            objArr[i26] = obj6;
                            objArr[i26 ^ 1] = obj7;
                        }
                        i23++;
                    } else {
                        if (obj6.equals(objArr[i28])) {
                            int i29 = i28 ^ 1;
                            Object obj8 = objArr[i29];
                            Objects.requireNonNull(obj8);
                            c0120a = new AbstractC1083x.a.C0120a(obj6, obj7, obj8);
                            objArr[i29] = obj7;
                            break;
                        }
                        iB2 = i27 + 1;
                    }
                }
            }
            return i23 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i23), c0120a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i30 = 0;
        int i31 = 0;
        while (i30 < i10) {
            int i32 = (i30 * 2) + i12;
            int i33 = (i31 * 2) + i12;
            Object obj9 = objArr[i32];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i32 ^ i14];
            Objects.requireNonNull(obj10);
            AbstractC1069i.a(obj9, obj10);
            int iB3 = AbstractC1078s.b(obj9.hashCode());
            while (true) {
                int i34 = iB3 & i15;
                int i35 = iArr[i34];
                if (i35 == -1) {
                    iArr[i34] = i33;
                    if (i31 < i30) {
                        objArr[i33] = obj9;
                        objArr[i33 ^ 1] = obj10;
                    }
                    i31++;
                    i13 = i14;
                } else {
                    i13 = i14;
                    if (obj9.equals(objArr[i35])) {
                        int i36 = i35 ^ 1;
                        Object obj11 = objArr[i36];
                        Objects.requireNonNull(obj11);
                        c0120a = new AbstractC1083x.a.C0120a(obj9, obj10, obj11);
                        objArr[i36] = obj10;
                        break;
                    }
                    iB3 = i34 + 1;
                    i14 = i13;
                }
            }
            i30++;
            i14 = i13;
        }
        int i37 = i14;
        if (i31 == i10) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i37] = Integer.valueOf(i31);
        objArr2[2] = c0120a;
        return objArr2;
    }

    public static Object s(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = AbstractC1078s.b(obj2.hashCode());
            while (true) {
                int i12 = iB & length;
                int i13 = bArr[i12] & ForkServer.ERROR;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iB = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = AbstractC1078s.b(obj2.hashCode());
            while (true) {
                int i14 = iB2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iB2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = AbstractC1078s.b(obj2.hashCode());
            while (true) {
                int i16 = iB3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iB3 = i16 + 1;
            }
        }
    }

    @Override // K7.AbstractC1083x
    public AbstractC1085z d() {
        return new a(this, this.f7598f, 0, this.f7599g);
    }

    @Override // K7.AbstractC1083x
    public AbstractC1085z e() {
        return new b(this, new c(this.f7598f, 0, this.f7599g));
    }

    @Override // K7.AbstractC1083x
    public AbstractC1079t f() {
        return new c(this.f7598f, 1, this.f7599g);
    }

    @Override // K7.AbstractC1083x, java.util.Map
    public Object get(Object obj) {
        Object objS = s(this.f7597e, this.f7598f, this.f7599g, 0, obj);
        if (objS == null) {
            return null;
        }
        return objS;
    }

    @Override // K7.AbstractC1083x
    public boolean h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f7599g;
    }
}
