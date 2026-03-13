package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2714u;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.m0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.flutter.Build;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.tika.pipes.PipesConfigBase;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class N implements Z {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f22730r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Unsafe f22731s = j0.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f22732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f22733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K f22736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final U f22739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f22741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f22742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f22743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final P f22744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC2719z f22745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g0 f22746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC2708n f22747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final F f22748q;

    public N(int[] iArr, Object[] objArr, int i10, int i11, K k10, U u10, boolean z10, int[] iArr2, int i12, int i13, P p10, InterfaceC2719z interfaceC2719z, g0 g0Var, AbstractC2708n abstractC2708n, F f10) {
        this.f22732a = iArr;
        this.f22733b = objArr;
        this.f22734c = i10;
        this.f22735d = i11;
        this.f22738g = k10 instanceof AbstractC2713t;
        this.f22739h = u10;
        this.f22737f = abstractC2708n != null && abstractC2708n.e(k10);
        this.f22740i = z10;
        this.f22741j = iArr2;
        this.f22742k = i12;
        this.f22743l = i13;
        this.f22744m = p10;
        this.f22745n = interfaceC2719z;
        this.f22746o = g0Var;
        this.f22747p = abstractC2708n;
        this.f22736e = k10;
        this.f22748q = f10;
    }

    public static boolean A(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2713t) {
            return ((AbstractC2713t) obj).z();
        }
        return true;
    }

    public static boolean D(int i10) {
        return (i10 & 268435456) != 0;
    }

    public static long E(Object obj, long j10) {
        return j0.x(obj, j10);
    }

    public static N M(Class cls, I i10, P p10, InterfaceC2719z interfaceC2719z, g0 g0Var, AbstractC2708n abstractC2708n, F f10) {
        if (i10 instanceof X) {
            return O((X) i10, p10, interfaceC2719z, g0Var, abstractC2708n, f10);
        }
        android.support.v4.media.session.a.a(i10);
        return N(null, p10, interfaceC2719z, g0Var, abstractC2708n, f10);
    }

    public static N N(d0 d0Var, P p10, InterfaceC2719z interfaceC2719z, g0 g0Var, AbstractC2708n abstractC2708n, F f10) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.N O(androidx.datastore.preferences.protobuf.X r33, androidx.datastore.preferences.protobuf.P r34, androidx.datastore.preferences.protobuf.InterfaceC2719z r35, androidx.datastore.preferences.protobuf.g0 r36, androidx.datastore.preferences.protobuf.AbstractC2708n r37, androidx.datastore.preferences.protobuf.F r38) {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.O(androidx.datastore.preferences.protobuf.X, androidx.datastore.preferences.protobuf.P, androidx.datastore.preferences.protobuf.z, androidx.datastore.preferences.protobuf.g0, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.F):androidx.datastore.preferences.protobuf.N");
    }

    public static long Q(int i10) {
        return i10 & 1048575;
    }

    public static boolean R(Object obj, long j10) {
        return ((Boolean) j0.z(obj, j10)).booleanValue();
    }

    public static double S(Object obj, long j10) {
        return ((Double) j0.z(obj, j10)).doubleValue();
    }

    public static float T(Object obj, long j10) {
        return ((Float) j0.z(obj, j10)).floatValue();
    }

    public static int U(Object obj, long j10) {
        return ((Integer) j0.z(obj, j10)).intValue();
    }

    public static long V(Object obj, long j10) {
        return ((Long) j0.z(obj, j10)).longValue();
    }

    public static Field c0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int i0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static boolean j(Object obj, long j10) {
        return j0.p(obj, j10);
    }

    public static void k(Object obj) {
        if (A(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static double l(Object obj, long j10) {
        return j0.u(obj, j10);
    }

    public static float o(Object obj, long j10) {
        return j0.v(obj, j10);
    }

    public static int t(Object obj, long j10) {
        return j0.w(obj, j10);
    }

    public static boolean u(int i10) {
        return (i10 & 536870912) != 0;
    }

    public static boolean x(Object obj, int i10, Z z10) {
        return z10.c(j0.z(obj, Q(i10)));
    }

    public final boolean B(Object obj, Object obj2, int i10) {
        long jX = X(i10) & 1048575;
        return j0.w(obj, jX) == j0.w(obj2, jX);
    }

    public final boolean C(Object obj, int i10, int i11) {
        return j0.w(obj, (long) (X(i11) & 1048575)) == i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:327:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a6, code lost:
    
        r0 = r10.f22742k;
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        if (r0 >= r10.f22743l) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        r4 = r10.n(r2, r10.f22741j[r0], r4, r5, r20);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        if (r4 == null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bf, code lost:
    
        r5.o(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06cf A[Catch: all -> 0x06f0, TRY_LEAVE, TryCatch #8 {all -> 0x06f0, blocks: (B:226:0x06c9, B:228:0x06cf, B:239:0x06f4, B:240:0x06f9), top: B:269:0x06c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x072a A[LOOP:4: B:253:0x0726->B:255:0x072a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x073d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(androidx.datastore.preferences.protobuf.g0 r18, androidx.datastore.preferences.protobuf.AbstractC2708n r19, java.lang.Object r20, androidx.datastore.preferences.protobuf.Y r21, androidx.datastore.preferences.protobuf.C2707m r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.F(androidx.datastore.preferences.protobuf.g0, androidx.datastore.preferences.protobuf.n, java.lang.Object, androidx.datastore.preferences.protobuf.Y, androidx.datastore.preferences.protobuf.m):void");
    }

    public final void G(Object obj, int i10, Object obj2, C2707m c2707m, Y y10) {
        long jQ = Q(j0(i10));
        Object objZ = j0.z(obj, jQ);
        if (objZ == null) {
            objZ = this.f22748q.d(obj2);
            j0.O(obj, jQ, objZ);
        } else if (this.f22748q.h(objZ)) {
            Object objD = this.f22748q.d(obj2);
            this.f22748q.a(objD, objZ);
            j0.O(obj, jQ, objD);
            objZ = objD;
        }
        y10.K(this.f22748q.c(objZ), this.f22748q.b(obj2), c2707m);
    }

    public final void H(Object obj, Object obj2, int i10) {
        if (v(obj2, i10)) {
            long jQ = Q(j0(i10));
            Unsafe unsafe = f22731s;
            Object object = unsafe.getObject(obj2, jQ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + P(i10) + " is present but null: " + obj2);
            }
            Z zR = r(i10);
            if (!v(obj, i10)) {
                if (A(object)) {
                    Object objNewInstance = zR.newInstance();
                    zR.a(objNewInstance, object);
                    unsafe.putObject(obj, jQ, objNewInstance);
                } else {
                    unsafe.putObject(obj, jQ, object);
                }
                d0(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jQ);
            if (!A(object2)) {
                Object objNewInstance2 = zR.newInstance();
                zR.a(objNewInstance2, object2);
                unsafe.putObject(obj, jQ, objNewInstance2);
                object2 = objNewInstance2;
            }
            zR.a(object2, object);
        }
    }

    public final void I(Object obj, Object obj2, int i10) {
        int iP = P(i10);
        if (C(obj2, iP, i10)) {
            long jQ = Q(j0(i10));
            Unsafe unsafe = f22731s;
            Object object = unsafe.getObject(obj2, jQ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + P(i10) + " is present but null: " + obj2);
            }
            Z zR = r(i10);
            if (!C(obj, iP, i10)) {
                if (A(object)) {
                    Object objNewInstance = zR.newInstance();
                    zR.a(objNewInstance, object);
                    unsafe.putObject(obj, jQ, objNewInstance);
                } else {
                    unsafe.putObject(obj, jQ, object);
                }
                e0(obj, iP, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jQ);
            if (!A(object2)) {
                Object objNewInstance2 = zR.newInstance();
                zR.a(objNewInstance2, object2);
                unsafe.putObject(obj, jQ, objNewInstance2);
                object2 = objNewInstance2;
            }
            zR.a(object2, object);
        }
    }

    public final void J(Object obj, Object obj2, int i10) {
        int iJ0 = j0(i10);
        long jQ = Q(iJ0);
        int iP = P(i10);
        switch (i0(iJ0)) {
            case 0:
                if (v(obj2, i10)) {
                    j0.K(obj, jQ, j0.u(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 1:
                if (v(obj2, i10)) {
                    j0.L(obj, jQ, j0.v(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 2:
                if (v(obj2, i10)) {
                    j0.N(obj, jQ, j0.x(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 3:
                if (v(obj2, i10)) {
                    j0.N(obj, jQ, j0.x(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 4:
                if (v(obj2, i10)) {
                    j0.M(obj, jQ, j0.w(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 5:
                if (v(obj2, i10)) {
                    j0.N(obj, jQ, j0.x(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 6:
                if (v(obj2, i10)) {
                    j0.M(obj, jQ, j0.w(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 7:
                if (v(obj2, i10)) {
                    j0.E(obj, jQ, j0.p(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 8:
                if (v(obj2, i10)) {
                    j0.O(obj, jQ, j0.z(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 9:
                H(obj, obj2, i10);
                break;
            case 10:
                if (v(obj2, i10)) {
                    j0.O(obj, jQ, j0.z(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 11:
                if (v(obj2, i10)) {
                    j0.M(obj, jQ, j0.w(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 12:
                if (v(obj2, i10)) {
                    j0.M(obj, jQ, j0.w(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 13:
                if (v(obj2, i10)) {
                    j0.M(obj, jQ, j0.w(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 14:
                if (v(obj2, i10)) {
                    j0.N(obj, jQ, j0.x(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 15:
                if (v(obj2, i10)) {
                    j0.M(obj, jQ, j0.w(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 16:
                if (v(obj2, i10)) {
                    j0.N(obj, jQ, j0.x(obj2, jQ));
                    d0(obj, i10);
                }
                break;
            case 17:
                H(obj, obj2, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Build.API_LEVELS.API_30 /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f22745n.b(obj, obj2, jQ);
                break;
            case 50:
                b0.E(this.f22748q, obj, obj2, jQ);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (C(obj2, iP, i10)) {
                    j0.O(obj, jQ, j0.z(obj2, jQ));
                    e0(obj, iP, i10);
                }
                break;
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                I(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (C(obj2, iP, i10)) {
                    j0.O(obj, jQ, j0.z(obj2, jQ));
                    e0(obj, iP, i10);
                }
                break;
            case 68:
                I(obj, obj2, i10);
                break;
        }
    }

    public final Object K(Object obj, int i10) {
        Z zR = r(i10);
        long jQ = Q(j0(i10));
        if (!v(obj, i10)) {
            return zR.newInstance();
        }
        Object object = f22731s.getObject(obj, jQ);
        if (A(object)) {
            return object;
        }
        Object objNewInstance = zR.newInstance();
        if (object != null) {
            zR.a(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final Object L(Object obj, int i10, int i11) {
        Z zR = r(i11);
        if (!C(obj, i10, i11)) {
            return zR.newInstance();
        }
        Object object = f22731s.getObject(obj, Q(j0(i11)));
        if (A(object)) {
            return object;
        }
        Object objNewInstance = zR.newInstance();
        if (object != null) {
            zR.a(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final int P(int i10) {
        return this.f22732a[i10];
    }

    public final int W(int i10) {
        if (i10 < this.f22734c || i10 > this.f22735d) {
            return -1;
        }
        return f0(i10, 0);
    }

    public final int X(int i10) {
        return this.f22732a[i10 + 2];
    }

    public final void Y(Object obj, long j10, Y y10, Z z10, C2707m c2707m) {
        y10.M(this.f22745n.c(obj, j10), z10, c2707m);
    }

    public final void Z(Object obj, int i10, Y y10, Z z10, C2707m c2707m) {
        y10.J(this.f22745n.c(obj, Q(i10)), z10, c2707m);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void a(Object obj, Object obj2) {
        k(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f22732a.length; i10 += 3) {
            J(obj, obj2, i10);
        }
        b0.F(this.f22746o, obj, obj2);
        if (this.f22737f) {
            b0.D(this.f22747p, obj, obj2);
        }
    }

    public final void a0(Object obj, int i10, Y y10) {
        if (u(i10)) {
            j0.O(obj, Q(i10), y10.H());
        } else if (this.f22738g) {
            j0.O(obj, Q(i10), y10.y());
        } else {
            j0.O(obj, Q(i10), y10.n());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // androidx.datastore.preferences.protobuf.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.b(java.lang.Object):void");
    }

    public final void b0(Object obj, int i10, Y y10) {
        if (u(i10)) {
            y10.m(this.f22745n.c(obj, Q(i10)));
        } else {
            y10.A(this.f22745n.c(obj, Q(i10)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // androidx.datastore.preferences.protobuf.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r3 = r0
            r2 = r1
            r4 = r2
        L7:
            int r5 = r14.f22742k
            r6 = 1
            if (r2 >= r5) goto L9c
            int[] r5 = r14.f22741j
            r9 = r5[r2]
            int r5 = r14.P(r9)
            int r13 = r14.j0(r9)
            int[] r7 = r14.f22732a
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = androidx.datastore.preferences.protobuf.N.f22731s
            long r6 = (long) r8
            int r4 = r3.getInt(r15, r6)
        L2f:
            r11 = r4
            r10 = r8
            goto L34
        L32:
            r10 = r3
            r11 = r4
        L34:
            boolean r3 = D(r13)
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r14 = r7.w(r8, r9, r10, r11, r12)
            if (r14 != 0) goto L43
            return r1
        L43:
            int r14 = i0(r13)
            r15 = 9
            if (r14 == r15) goto L83
            r15 = 17
            if (r14 == r15) goto L83
            r15 = 27
            if (r14 == r15) goto L7c
            r15 = 60
            if (r14 == r15) goto L6b
            r15 = 68
            if (r14 == r15) goto L6b
            r15 = 49
            if (r14 == r15) goto L7c
            r15 = 50
            if (r14 == r15) goto L64
            goto L94
        L64:
            boolean r14 = r7.z(r8, r13, r9)
            if (r14 != 0) goto L94
            return r1
        L6b:
            boolean r14 = r7.C(r8, r5, r9)
            if (r14 == 0) goto L94
            androidx.datastore.preferences.protobuf.Z r14 = r7.r(r9)
            boolean r14 = x(r8, r13, r14)
            if (r14 != 0) goto L94
            return r1
        L7c:
            boolean r14 = r7.y(r8, r13, r9)
            if (r14 != 0) goto L94
            return r1
        L83:
            boolean r14 = r7.w(r8, r9, r10, r11, r12)
            if (r14 == 0) goto L94
            androidx.datastore.preferences.protobuf.Z r14 = r7.r(r9)
            boolean r14 = x(r8, r13, r14)
            if (r14 != 0) goto L94
            return r1
        L94:
            int r2 = r2 + 1
            r14 = r7
            r15 = r8
            r3 = r10
            r4 = r11
            goto L7
        L9c:
            r7 = r14
            r8 = r15
            boolean r14 = r7.f22737f
            if (r14 == 0) goto Laf
            androidx.datastore.preferences.protobuf.n r14 = r7.f22747p
            androidx.datastore.preferences.protobuf.q r14 = r14.c(r8)
            boolean r14 = r14.m()
            if (r14 != 0) goto Laf
            return r1
        Laf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.c(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.Z
    public int d(Object obj) {
        int i10;
        int i11;
        int iQ;
        int iX;
        int i12;
        int iR;
        int iT;
        N n10 = this;
        Object obj2 = obj;
        Unsafe unsafe = f22731s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i14 < n10.f22732a.length) {
            int iJ0 = n10.j0(i14);
            int iI0 = i0(iJ0);
            int iP = n10.P(i14);
            int i18 = n10.f22732a[i14 + 2];
            int i19 = i18 & i13;
            if (iI0 <= 17) {
                if (i19 != i17) {
                    i15 = i19 == i13 ? 0 : unsafe.getInt(obj2, i19);
                    i17 = i19;
                }
                i10 = 1 << (i18 >>> 20);
            } else {
                i10 = 0;
            }
            int i20 = i16;
            long jQ = Q(iJ0);
            if (iI0 < r.DOUBLE_LIST_PACKED.a() || iI0 > r.SINT64_LIST_PACKED.a()) {
                i19 = 0;
            }
            switch (iI0) {
                case 0:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        i11 = AbstractC2703i.i(iP, 0.0d);
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 1:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iQ = AbstractC2703i.q(iP, 0.0f);
                        i16 = i20 + iQ;
                        n10 = this;
                        obj2 = obj;
                    }
                    n10 = this;
                    obj2 = obj;
                    i16 = i20;
                    break;
                case 2:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iX = AbstractC2703i.x(iP, unsafe.getLong(obj2, jQ));
                        i16 = i20 + iX;
                        n10 = this;
                    }
                    n10 = this;
                    i16 = i20;
                    break;
                case 3:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iX = AbstractC2703i.U(iP, unsafe.getLong(obj2, jQ));
                        i16 = i20 + iX;
                        n10 = this;
                    }
                    n10 = this;
                    i16 = i20;
                    break;
                case 4:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iX = AbstractC2703i.v(iP, unsafe.getInt(obj2, jQ));
                        i16 = i20 + iX;
                        n10 = this;
                    }
                    n10 = this;
                    i16 = i20;
                    break;
                case 5:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iQ = AbstractC2703i.o(iP, 0L);
                        i16 = i20 + iQ;
                        n10 = this;
                        obj2 = obj;
                    }
                    n10 = this;
                    obj2 = obj;
                    i16 = i20;
                    break;
                case 6:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iQ = AbstractC2703i.m(iP, 0);
                        i16 = i20 + iQ;
                        n10 = this;
                        obj2 = obj;
                    }
                    n10 = this;
                    obj2 = obj;
                    i16 = i20;
                    break;
                case 7:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iQ = AbstractC2703i.d(iP, true);
                        i16 = i20 + iQ;
                        n10 = this;
                        obj2 = obj;
                    }
                    n10 = this;
                    obj2 = obj;
                    i16 = i20;
                    break;
                case 8:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        Object object = unsafe.getObject(obj2, jQ);
                        iX = object instanceof AbstractC2700f ? AbstractC2703i.g(iP, (AbstractC2700f) object) : AbstractC2703i.P(iP, (String) object);
                        i16 = i20 + iX;
                        n10 = this;
                    }
                    n10 = this;
                    i16 = i20;
                    break;
                case 9:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        i11 = b0.o(iP, unsafe.getObject(obj2, jQ), n10.r(i14));
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 10:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iX = AbstractC2703i.g(iP, (AbstractC2700f) unsafe.getObject(obj2, jQ));
                        i16 = i20 + iX;
                        n10 = this;
                    }
                    n10 = this;
                    i16 = i20;
                    break;
                case 11:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iX = AbstractC2703i.S(iP, unsafe.getInt(obj2, jQ));
                        i16 = i20 + iX;
                        n10 = this;
                    }
                    n10 = this;
                    i16 = i20;
                    break;
                case 12:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iX = AbstractC2703i.k(iP, unsafe.getInt(obj2, jQ));
                        i16 = i20 + iX;
                        n10 = this;
                    }
                    n10 = this;
                    i16 = i20;
                    break;
                case 13:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iQ = AbstractC2703i.H(iP, 0);
                        i16 = i20 + iQ;
                        n10 = this;
                        obj2 = obj;
                    }
                    n10 = this;
                    obj2 = obj;
                    i16 = i20;
                    break;
                case 14:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iQ = AbstractC2703i.J(iP, 0L);
                        i16 = i20 + iQ;
                        n10 = this;
                        obj2 = obj;
                    }
                    n10 = this;
                    obj2 = obj;
                    i16 = i20;
                    break;
                case 15:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iX = AbstractC2703i.L(iP, unsafe.getInt(obj2, jQ));
                        i16 = i20 + iX;
                        n10 = this;
                    }
                    n10 = this;
                    i16 = i20;
                    break;
                case 16:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        iX = AbstractC2703i.N(iP, unsafe.getLong(obj2, jQ));
                        i16 = i20 + iX;
                        n10 = this;
                    }
                    n10 = this;
                    i16 = i20;
                    break;
                case 17:
                    if (n10.w(obj2, i14, i17, i15, i10)) {
                        i11 = AbstractC2703i.s(iP, (K) unsafe.getObject(obj2, jQ), n10.r(i14));
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 18:
                    i11 = b0.h(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 19:
                    i11 = b0.f(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 20:
                    i11 = b0.m(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 21:
                    i11 = b0.x(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 22:
                    i11 = b0.k(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 23:
                    i11 = b0.h(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 24:
                    i11 = b0.f(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 25:
                    i11 = b0.a(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 26:
                    i11 = b0.u(iP, (List) unsafe.getObject(obj2, jQ));
                    i16 = i20 + i11;
                    break;
                case 27:
                    i11 = b0.p(iP, (List) unsafe.getObject(obj2, jQ), n10.r(i14));
                    i16 = i20 + i11;
                    break;
                case 28:
                    i11 = b0.c(iP, (List) unsafe.getObject(obj2, jQ));
                    i16 = i20 + i11;
                    break;
                case 29:
                    i11 = b0.v(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case Build.API_LEVELS.API_30 /* 30 */:
                    i11 = b0.d(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 31:
                    i11 = b0.f(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 32:
                    i11 = b0.h(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 33:
                    i11 = b0.q(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 34:
                    i11 = b0.s(iP, (List) unsafe.getObject(obj2, jQ), false);
                    i16 = i20 + i11;
                    break;
                case 35:
                    i12 = b0.i((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case 36:
                    i12 = b0.g((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case 37:
                    i12 = b0.n((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case 38:
                    i12 = b0.y((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    i12 = b0.l((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    i12 = b0.i((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    i12 = b0.g((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    i12 = b0.b((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case 43:
                    i12 = b0.w((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    i12 = b0.e((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    i12 = b0.g((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case 46:
                    i12 = b0.i((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case 47:
                    i12 = b0.r((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case 48:
                    i12 = b0.t((List) unsafe.getObject(obj2, jQ));
                    if (i12 > 0) {
                        if (n10.f22740i) {
                            unsafe.putInt(obj2, i19, i12);
                        }
                        iR = AbstractC2703i.R(iP);
                        iT = AbstractC2703i.T(i12);
                        i16 = i20 + iR + iT + i12;
                    }
                    i16 = i20;
                    break;
                case 49:
                    i11 = b0.j(iP, (List) unsafe.getObject(obj2, jQ), n10.r(i14));
                    i16 = i20 + i11;
                    break;
                case 50:
                    i11 = n10.f22748q.g(iP, unsafe.getObject(obj2, jQ), n10.q(i14));
                    i16 = i20 + i11;
                    break;
                case 51:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.i(iP, 0.0d);
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 52:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.q(iP, 0.0f);
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 53:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.x(iP, V(obj2, jQ));
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 54:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.U(iP, V(obj2, jQ));
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 55:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.v(iP, U(obj2, jQ));
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 56:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.o(iP, 0L);
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 57:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.m(iP, 0);
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 58:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.d(iP, true);
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 59:
                    if (n10.C(obj2, iP, i14)) {
                        Object object2 = unsafe.getObject(obj2, jQ);
                        i11 = object2 instanceof AbstractC2700f ? AbstractC2703i.g(iP, (AbstractC2700f) object2) : AbstractC2703i.P(iP, (String) object2);
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = b0.o(iP, unsafe.getObject(obj2, jQ), n10.r(i14));
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 61:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.g(iP, (AbstractC2700f) unsafe.getObject(obj2, jQ));
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 62:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.S(iP, U(obj2, jQ));
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 63:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.k(iP, U(obj2, jQ));
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 64:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.H(iP, 0);
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 65:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.J(iP, 0L);
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 66:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.L(iP, U(obj2, jQ));
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 67:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.N(iP, V(obj2, jQ));
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                case 68:
                    if (n10.C(obj2, iP, i14)) {
                        i11 = AbstractC2703i.s(iP, (K) unsafe.getObject(obj2, jQ), n10.r(i14));
                        i16 = i20 + i11;
                    }
                    i16 = i20;
                    break;
                default:
                    i16 = i20;
                    break;
            }
            i14 += 3;
            i13 = 1048575;
        }
        int iS = i16 + n10.s(n10.f22746o, obj2);
        return n10.f22737f ? iS + n10.f22747p.c(obj2).i() : iS;
    }

    public final void d0(Object obj, int i10) {
        int iX = X(i10);
        long j10 = 1048575 & iX;
        if (j10 == 1048575) {
            return;
        }
        j0.M(obj, j10, (1 << (iX >>> 20)) | j0.w(obj, j10));
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int e(Object obj) {
        int i10;
        int iF;
        int length = this.f22732a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iJ0 = j0(i12);
            int iP = P(i12);
            long jQ = Q(iJ0);
            int iHashCode = 37;
            switch (i0(iJ0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = AbstractC2714u.f(Double.doubleToLongBits(j0.u(obj, jQ)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(j0.v(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = AbstractC2714u.f(j0.x(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = AbstractC2714u.f(j0.x(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = j0.w(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = AbstractC2714u.f(j0.x(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = j0.w(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = AbstractC2714u.c(j0.p(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) j0.z(obj, jQ)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objZ = j0.z(obj, jQ);
                    if (objZ != null) {
                        iHashCode = objZ.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = j0.z(obj, jQ).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = j0.w(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iF = j0.w(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = j0.w(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = AbstractC2714u.f(j0.x(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = j0.w(obj, jQ);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = AbstractC2714u.f(j0.x(obj, jQ));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objZ2 = j0.z(obj, jQ);
                    if (objZ2 != null) {
                        iHashCode = objZ2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case Build.API_LEVELS.API_30 /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iF = j0.z(obj, jQ).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = j0.z(obj, jQ).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2714u.f(Double.doubleToLongBits(S(obj, jQ)));
                        i11 = i10 + iF;
                    }
                    break;
                case 52:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(T(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 53:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2714u.f(V(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 54:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2714u.f(V(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 55:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                    }
                    break;
                case 56:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2714u.f(V(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 57:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                    }
                    break;
                case 58:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2714u.c(R(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 59:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) j0.z(obj, jQ)).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = j0.z(obj, jQ).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 61:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = j0.z(obj, jQ).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 62:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                    }
                    break;
                case 63:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                    }
                    break;
                case 64:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                    }
                    break;
                case 65:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2714u.f(V(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 66:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = U(obj, jQ);
                        i11 = i10 + iF;
                    }
                    break;
                case 67:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC2714u.f(V(obj, jQ));
                        i11 = i10 + iF;
                    }
                    break;
                case 68:
                    if (C(obj, iP, i12)) {
                        i10 = i11 * 53;
                        iF = j0.z(obj, jQ).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f22746o.g(obj).hashCode();
        return this.f22737f ? (iHashCode2 * 53) + this.f22747p.c(obj).hashCode() : iHashCode2;
    }

    public final void e0(Object obj, int i10, int i11) {
        j0.M(obj, X(i11) & 1048575, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public boolean f(Object obj, Object obj2) {
        int length = this.f22732a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f22746o.g(obj).equals(this.f22746o.g(obj2))) {
            return false;
        }
        if (this.f22737f) {
            return this.f22747p.c(obj).equals(this.f22747p.c(obj2));
        }
        return true;
    }

    public final int f0(int i10, int i11) {
        int length = (this.f22732a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iP = P(i13);
            if (i10 == iP) {
                return i13;
            }
            if (i10 < iP) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void g(Object obj, Y y10, C2707m c2707m) throws Throwable {
        c2707m.getClass();
        k(obj);
        F(this.f22746o, this.f22747p, obj, y10, c2707m);
    }

    public final void g0(Object obj, int i10, Object obj2) {
        f22731s.putObject(obj, Q(j0(i10)), obj2);
        d0(obj, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void h(Object obj, m0 m0Var) {
        if (m0Var.t() == m0.a.DESCENDING) {
            l0(obj, m0Var);
        } else {
            k0(obj, m0Var);
        }
    }

    public final void h0(Object obj, int i10, int i11, Object obj2) {
        f22731s.putObject(obj, Q(j0(i11)), obj2);
        e0(obj, i10, i11);
    }

    public final boolean i(Object obj, Object obj2, int i10) {
        return v(obj, i10) == v(obj2, i10);
    }

    public final int j0(int i10) {
        return this.f22732a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(java.lang.Object r19, androidx.datastore.preferences.protobuf.m0 r20) {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.k0(java.lang.Object, androidx.datastore.preferences.protobuf.m0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l0(java.lang.Object r11, androidx.datastore.preferences.protobuf.m0 r12) {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.l0(java.lang.Object, androidx.datastore.preferences.protobuf.m0):void");
    }

    public final boolean m(Object obj, Object obj2, int i10) {
        int iJ0 = j0(i10);
        long jQ = Q(iJ0);
        switch (i0(iJ0)) {
            case 0:
                if (!i(obj, obj2, i10) || Double.doubleToLongBits(j0.u(obj, jQ)) != Double.doubleToLongBits(j0.u(obj2, jQ))) {
                }
                break;
            case 1:
                if (!i(obj, obj2, i10) || Float.floatToIntBits(j0.v(obj, jQ)) != Float.floatToIntBits(j0.v(obj2, jQ))) {
                }
                break;
            case 2:
                if (!i(obj, obj2, i10) || j0.x(obj, jQ) != j0.x(obj2, jQ)) {
                }
                break;
            case 3:
                if (!i(obj, obj2, i10) || j0.x(obj, jQ) != j0.x(obj2, jQ)) {
                }
                break;
            case 4:
                if (!i(obj, obj2, i10) || j0.w(obj, jQ) != j0.w(obj2, jQ)) {
                }
                break;
            case 5:
                if (!i(obj, obj2, i10) || j0.x(obj, jQ) != j0.x(obj2, jQ)) {
                }
                break;
            case 6:
                if (!i(obj, obj2, i10) || j0.w(obj, jQ) != j0.w(obj2, jQ)) {
                }
                break;
            case 7:
                if (!i(obj, obj2, i10) || j0.p(obj, jQ) != j0.p(obj2, jQ)) {
                }
                break;
            case 8:
                if (!i(obj, obj2, i10) || !b0.H(j0.z(obj, jQ), j0.z(obj2, jQ))) {
                }
                break;
            case 9:
                if (!i(obj, obj2, i10) || !b0.H(j0.z(obj, jQ), j0.z(obj2, jQ))) {
                }
                break;
            case 10:
                if (!i(obj, obj2, i10) || !b0.H(j0.z(obj, jQ), j0.z(obj2, jQ))) {
                }
                break;
            case 11:
                if (!i(obj, obj2, i10) || j0.w(obj, jQ) != j0.w(obj2, jQ)) {
                }
                break;
            case 12:
                if (!i(obj, obj2, i10) || j0.w(obj, jQ) != j0.w(obj2, jQ)) {
                }
                break;
            case 13:
                if (!i(obj, obj2, i10) || j0.w(obj, jQ) != j0.w(obj2, jQ)) {
                }
                break;
            case 14:
                if (!i(obj, obj2, i10) || j0.x(obj, jQ) != j0.x(obj2, jQ)) {
                }
                break;
            case 15:
                if (!i(obj, obj2, i10) || j0.w(obj, jQ) != j0.w(obj2, jQ)) {
                }
                break;
            case 16:
                if (!i(obj, obj2, i10) || j0.x(obj, jQ) != j0.x(obj2, jQ)) {
                }
                break;
            case 17:
                if (!i(obj, obj2, i10) || !b0.H(j0.z(obj, jQ), j0.z(obj2, jQ))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!B(obj, obj2, i10) || !b0.H(j0.z(obj, jQ), j0.z(obj2, jQ))) {
                }
                break;
        }
        return true;
    }

    public final void m0(m0 m0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            m0Var.M(i10, this.f22748q.b(q(i11)), this.f22748q.e(obj));
        }
    }

    public final Object n(Object obj, int i10, Object obj2, g0 g0Var, Object obj3) {
        P(i10);
        if (j0.z(obj, Q(j0(i10))) == null) {
            return obj2;
        }
        p(i10);
        return obj2;
    }

    public final void n0(int i10, Object obj, m0 m0Var) {
        if (obj instanceof String) {
            m0Var.e(i10, (String) obj);
        } else {
            m0Var.K(i10, (AbstractC2700f) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public Object newInstance() {
        return this.f22744m.a(this.f22736e);
    }

    public final void o0(g0 g0Var, Object obj, m0 m0Var) {
        g0Var.t(g0Var.g(obj), m0Var);
    }

    public final AbstractC2714u.a p(int i10) {
        android.support.v4.media.session.a.a(this.f22733b[((i10 / 3) * 2) + 1]);
        return null;
    }

    public final Object q(int i10) {
        return this.f22733b[(i10 / 3) * 2];
    }

    public final Z r(int i10) {
        int i11 = (i10 / 3) * 2;
        Z z10 = (Z) this.f22733b[i11];
        if (z10 != null) {
            return z10;
        }
        Z zC = V.a().c((Class) this.f22733b[i11 + 1]);
        this.f22733b[i11] = zC;
        return zC;
    }

    public final int s(g0 g0Var, Object obj) {
        return g0Var.h(g0Var.g(obj));
    }

    public final boolean v(Object obj, int i10) {
        boolean zEquals;
        int iX = X(i10);
        long j10 = 1048575 & iX;
        if (j10 != 1048575) {
            return ((1 << (iX >>> 20)) & j0.w(obj, j10)) != 0;
        }
        int iJ0 = j0(i10);
        long jQ = Q(iJ0);
        switch (i0(iJ0)) {
            case 0:
                return Double.doubleToRawLongBits(j0.u(obj, jQ)) != 0;
            case 1:
                return Float.floatToRawIntBits(j0.v(obj, jQ)) != 0;
            case 2:
                return j0.x(obj, jQ) != 0;
            case 3:
                return j0.x(obj, jQ) != 0;
            case 4:
                return j0.w(obj, jQ) != 0;
            case 5:
                return j0.x(obj, jQ) != 0;
            case 6:
                return j0.w(obj, jQ) != 0;
            case 7:
                return j0.p(obj, jQ);
            case 8:
                Object objZ = j0.z(obj, jQ);
                if (objZ instanceof String) {
                    zEquals = ((String) objZ).isEmpty();
                } else {
                    if (!(objZ instanceof AbstractC2700f)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = AbstractC2700f.f22793b.equals(objZ);
                }
                break;
            case 9:
                return j0.z(obj, jQ) != null;
            case 10:
                zEquals = AbstractC2700f.f22793b.equals(j0.z(obj, jQ));
                break;
            case 11:
                return j0.w(obj, jQ) != 0;
            case 12:
                return j0.w(obj, jQ) != 0;
            case 13:
                return j0.w(obj, jQ) != 0;
            case 14:
                return j0.x(obj, jQ) != 0;
            case 15:
                return j0.w(obj, jQ) != 0;
            case 16:
                return j0.x(obj, jQ) != 0;
            case 17:
                return j0.z(obj, jQ) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    public final boolean w(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? v(obj, i10) : (i12 & i13) != 0;
    }

    public final boolean y(Object obj, int i10, int i11) {
        List list = (List) j0.z(obj, Q(i10));
        if (list.isEmpty()) {
            return true;
        }
        Z zR = r(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!zR.c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public final boolean z(Object obj, int i10, int i11) {
        Map mapE = this.f22748q.e(j0.z(obj, Q(i10)));
        if (mapE.isEmpty()) {
            return true;
        }
        if (this.f22748q.b(q(i11)).f22723c.a() != l0.c.MESSAGE) {
            return true;
        }
        Z zC = null;
        for (Object obj2 : mapE.values()) {
            if (zC == null) {
                zC = V.a().c(obj2.getClass());
            }
            if (!zC.c(obj2)) {
                return false;
            }
        }
        return true;
    }
}
