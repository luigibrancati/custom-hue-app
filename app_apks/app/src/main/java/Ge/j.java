package Ge;

import Fe.A;
import Fe.InterfaceC0845g;
import Od.C;
import Od.C1821a;
import Od.F;
import fc.AbstractC4040w;
import fc.C4015H;
import gc.C4179C;
import gc.Q;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jc.C4757a;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C4757a.a(((i) obj).b(), ((i) obj2).b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I f4766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f4767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ K f4768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0845g f4769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ K f4770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ K f4771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ L f4772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ L f4773h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ L f4774i;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ L f4775a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0845g f4776b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ L f4777c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ L f4778d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(L l10, InterfaceC0845g interfaceC0845g, L l11, L l12) {
                super(2);
                this.f4775a = l10;
                this.f4776b = interfaceC0845g;
                this.f4777c = l11;
                this.f4778d = l12;
            }

            public final void a(int i10, long j10) throws IOException {
                if (i10 == 1) {
                    L l10 = this.f4775a;
                    if (l10.f39776a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (j10 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    l10.f39776a = Long.valueOf(this.f4776b.e0());
                    this.f4777c.f39776a = Long.valueOf(this.f4776b.e0());
                    this.f4778d.f39776a = Long.valueOf(this.f4776b.e0());
                }
            }

            @Override // vc.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
                a(((Number) obj).intValue(), ((Number) obj2).longValue());
                return C4015H.f34254a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(I i10, long j10, K k10, InterfaceC0845g interfaceC0845g, K k11, K k12, L l10, L l11, L l12) {
            super(2);
            this.f4766a = i10;
            this.f4767b = j10;
            this.f4768c = k10;
            this.f4769d = interfaceC0845g;
            this.f4770e = k11;
            this.f4771f = k12;
            this.f4772g = l10;
            this.f4773h = l11;
            this.f4774i = l12;
        }

        public final void a(int i10, long j10) throws IOException {
            if (i10 != 1) {
                if (i10 != 10) {
                    return;
                }
                if (j10 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                this.f4769d.skip(4L);
                InterfaceC0845g interfaceC0845g = this.f4769d;
                j.i(interfaceC0845g, (int) (j10 - 4), new a(this.f4772g, interfaceC0845g, this.f4773h, this.f4774i));
                return;
            }
            I i11 = this.f4766a;
            if (i11.f39773a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            i11.f39773a = true;
            if (j10 < this.f4767b) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            K k10 = this.f4768c;
            long jE0 = k10.f39775a;
            if (jE0 == KeyboardMap.kValueMask) {
                jE0 = this.f4769d.e0();
            }
            k10.f39775a = jE0;
            K k11 = this.f4770e;
            k11.f39775a = k11.f39775a == KeyboardMap.kValueMask ? this.f4769d.e0() : 0L;
            K k12 = this.f4771f;
            k12.f39775a = k12.f39775a == KeyboardMap.kValueMask ? this.f4769d.e0() : 0L;
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0845g f4779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L f4780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L f4781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L f4782d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0845g interfaceC0845g, L l10, L l11, L l12) {
            super(2);
            this.f4779a = interfaceC0845g;
            this.f4780b = l10;
            this.f4781c = l11;
            this.f4782d = l12;
        }

        public final void a(int i10, long j10) throws IOException {
            if (i10 == 21589) {
                if (j10 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b10 = this.f4779a.readByte();
                boolean z10 = (b10 & 1) == 1;
                boolean z11 = (b10 & 2) == 2;
                boolean z12 = (b10 & 4) == 4;
                InterfaceC0845g interfaceC0845g = this.f4779a;
                long j11 = z10 ? 5L : 1L;
                if (z11) {
                    j11 += 4;
                }
                if (z12) {
                    j11 += 4;
                }
                if (j10 < j11) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z10) {
                    this.f4780b.f39776a = Integer.valueOf(interfaceC0845g.P0());
                }
                if (z11) {
                    this.f4781c.f39776a = Integer.valueOf(this.f4779a.P0());
                }
                if (z12) {
                    this.f4782d.f39776a = Integer.valueOf(this.f4779a.P0());
                }
            }
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C4015H.f34254a;
        }
    }

    public static final Map b(List list) {
        A aE = A.a.e(A.f4048b, "/", false, 1, null);
        Map mapM = Q.m(AbstractC4040w.a(aE, new i(aE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (i iVar : C4179C.J0(list, new a())) {
            if (((i) mapM.put(iVar.b(), iVar)) == null) {
                while (true) {
                    A aU = iVar.b().u();
                    if (aU != null) {
                        i iVar2 = (i) mapM.get(aU);
                        if (iVar2 != null) {
                            iVar2.c().add(iVar.b());
                            break;
                        }
                        i iVar3 = new i(aU, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        mapM.put(aU, iVar3);
                        iVar3.c().add(iVar.b());
                        iVar = iVar3;
                    }
                }
            }
        }
        return mapM;
    }

    public static final Long c(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(k.a(((i10 >> 9) & 127) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    public static final long d(long j10) {
        return (j10 / ((long) 10000)) - 11644473600000L;
    }

    public static final String e(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, C1821a.a(16));
        AbstractC4862t.d(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #12 {all -> 0x00dd, blocks: (B:13:0x0062, B:15:0x006b, B:18:0x007c, B:43:0x00dc, B:46:0x00e0, B:47:0x00e7, B:48:0x00e8), top: B:138:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107 A[Catch: all -> 0x00ff, TryCatch #13 {all -> 0x00ff, blocks: (B:3:0x0019, B:5:0x0027, B:6:0x0030, B:10:0x004e, B:12:0x005a, B:65:0x0107, B:59:0x00fb, B:66:0x0108, B:93:0x0168, B:97:0x0177, B:90:0x0162, B:100:0x017a, B:103:0x0186, B:104:0x018d, B:105:0x018e, B:106:0x0191, B:107:0x0192, B:108:0x01ac, B:87:0x015d, B:67:0x0119, B:70:0x0121, B:72:0x0131, B:74:0x013d, B:77:0x0144, B:78:0x0148, B:79:0x014f, B:80:0x0150, B:7:0x0038, B:9:0x0041, B:56:0x00f6), top: B:139:0x0019, inners: #0, #1, #8, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Fe.M f(Fe.A r18, Fe.AbstractC0849k r19, vc.l r20) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ge.j.f(Fe.A, Fe.k, vc.l):Fe.M");
    }

    public static final i g(InterfaceC0845g interfaceC0845g) throws IOException {
        AbstractC4862t.e(interfaceC0845g, "<this>");
        int iP0 = interfaceC0845g.P0();
        if (iP0 != 33639248) {
            throw new IOException("bad zip: expected " + e(33639248) + " but was " + e(iP0));
        }
        interfaceC0845g.skip(4L);
        short sD0 = interfaceC0845g.d0();
        int i10 = sD0 & 65535;
        if ((sD0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + e(i10));
        }
        int iD0 = interfaceC0845g.d0() & 65535;
        int iD02 = interfaceC0845g.d0() & 65535;
        int iD03 = interfaceC0845g.d0() & 65535;
        long jP0 = ((long) interfaceC0845g.P0()) & KeyboardMap.kValueMask;
        K k10 = new K();
        k10.f39775a = ((long) interfaceC0845g.P0()) & KeyboardMap.kValueMask;
        K k11 = new K();
        k11.f39775a = ((long) interfaceC0845g.P0()) & KeyboardMap.kValueMask;
        int iD04 = interfaceC0845g.d0() & 65535;
        int iD05 = interfaceC0845g.d0() & 65535;
        int iD06 = interfaceC0845g.d0() & 65535;
        interfaceC0845g.skip(8L);
        K k12 = new K();
        k12.f39775a = ((long) interfaceC0845g.P0()) & KeyboardMap.kValueMask;
        String strO0 = interfaceC0845g.o0(iD04);
        if (F.U(strO0, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = k11.f39775a == KeyboardMap.kValueMask ? 8 : 0L;
        if (k10.f39775a == KeyboardMap.kValueMask) {
            j10 += (long) 8;
        }
        if (k12.f39775a == KeyboardMap.kValueMask) {
            j10 += (long) 8;
        }
        long j11 = j10;
        L l10 = new L();
        L l11 = new L();
        L l12 = new L();
        I i11 = new I();
        i(interfaceC0845g, iD05, new b(i11, j11, k11, interfaceC0845g, k10, k12, l10, l11, l12));
        if (j11 <= 0 || i11.f39773a) {
            return new i(A.a.e(A.f4048b, "/", false, 1, null).x(strO0), C.D(strO0, "/", false, 2, null), interfaceC0845g.o0(iD06), jP0, k10.f39775a, k11.f39775a, iD0, k12.f39775a, iD03, iD02, (Long) l10.f39776a, (Long) l11.f39776a, (Long) l12.f39776a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    public static final f h(InterfaceC0845g interfaceC0845g) throws IOException {
        int iD0 = interfaceC0845g.d0() & 65535;
        int iD02 = interfaceC0845g.d0() & 65535;
        long jD0 = interfaceC0845g.d0() & 65535;
        if (jD0 != (interfaceC0845g.d0() & 65535) || iD0 != 0 || iD02 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC0845g.skip(4L);
        return new f(jD0, KeyboardMap.kValueMask & ((long) interfaceC0845g.P0()), interfaceC0845g.d0() & 65535);
    }

    public static final void i(InterfaceC0845g interfaceC0845g, int i10, p pVar) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iD0 = interfaceC0845g.d0() & 65535;
            long jD0 = ((long) interfaceC0845g.d0()) & 65535;
            long j11 = j10 - ((long) 4);
            if (j11 < jD0) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            interfaceC0845g.j0(jD0);
            long size = interfaceC0845g.e().size();
            pVar.invoke(Integer.valueOf(iD0), Long.valueOf(jD0));
            long size2 = (interfaceC0845g.e().size() + jD0) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iD0);
            }
            if (size2 > 0) {
                interfaceC0845g.e().skip(size2);
            }
            j10 = j11 - jD0;
        }
    }

    public static final i j(InterfaceC0845g interfaceC0845g, i centralDirectoryZipEntry) throws IOException {
        AbstractC4862t.e(interfaceC0845g, "<this>");
        AbstractC4862t.e(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        i iVarK = k(interfaceC0845g, centralDirectoryZipEntry);
        AbstractC4862t.b(iVarK);
        return iVarK;
    }

    public static final i k(InterfaceC0845g interfaceC0845g, i iVar) throws IOException {
        int iP0 = interfaceC0845g.P0();
        if (iP0 != 67324752) {
            throw new IOException("bad zip: expected " + e(67324752) + " but was " + e(iP0));
        }
        interfaceC0845g.skip(2L);
        short sD0 = interfaceC0845g.d0();
        int i10 = sD0 & 65535;
        if ((sD0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + e(i10));
        }
        interfaceC0845g.skip(18L);
        long jD0 = ((long) interfaceC0845g.d0()) & 65535;
        int iD0 = interfaceC0845g.d0() & 65535;
        interfaceC0845g.skip(jD0);
        if (iVar == null) {
            interfaceC0845g.skip(iD0);
            return null;
        }
        L l10 = new L();
        L l11 = new L();
        L l12 = new L();
        i(interfaceC0845g, iD0, new c(interfaceC0845g, l10, l11, l12));
        return iVar.a((Integer) l10.f39776a, (Integer) l11.f39776a, (Integer) l12.f39776a);
    }

    public static final f l(InterfaceC0845g interfaceC0845g, f fVar) throws IOException {
        interfaceC0845g.skip(12L);
        int iP0 = interfaceC0845g.P0();
        int iP02 = interfaceC0845g.P0();
        long jE0 = interfaceC0845g.e0();
        if (jE0 != interfaceC0845g.e0() || iP0 != 0 || iP02 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC0845g.skip(8L);
        return new f(jE0, interfaceC0845g.e0(), fVar.b());
    }

    public static final void m(InterfaceC0845g interfaceC0845g) {
        AbstractC4862t.e(interfaceC0845g, "<this>");
        k(interfaceC0845g, null);
    }
}
