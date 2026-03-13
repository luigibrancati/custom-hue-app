package xe;

import Fe.C0846h;
import Fe.InterfaceC0844f;
import Fe.InterfaceC0845g;
import com.google.api.Endpoint;
import gc.C4202o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f48295c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f48293a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f48294b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, Endpoint.TARGET_FIELD_NUMBER, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48296d = new a();

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f48295c = bArr;
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            f48293a.a(i10, f48294b[i10], f48295c[i10]);
        }
    }

    public final void a(int i10, int i11, int i12) {
        a aVar = new a(i10, i12);
        a aVar2 = f48296d;
        while (i12 > 8) {
            i12 -= 8;
            int i13 = (i11 >>> i12) & 255;
            a[] aVarArrA = aVar2.a();
            AbstractC4862t.b(aVarArrA);
            a aVar3 = aVarArrA[i13];
            if (aVar3 == null) {
                aVar3 = new a();
                aVarArrA[i13] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i14 = 8 - i12;
        int i15 = (i11 << i14) & 255;
        a[] aVarArrA2 = aVar2.a();
        AbstractC4862t.b(aVarArrA2);
        C4202o.x(aVarArrA2, aVar, i15, (1 << i14) + i15);
    }

    public final void b(InterfaceC0845g source, long j10, InterfaceC0844f sink) {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(sink, "sink");
        a aVar = f48296d;
        int iB = 0;
        int iC = 0;
        for (long j11 = 0; j11 < j10; j11++) {
            iB = (iB << 8) | qe.m.b(source.readByte(), 255);
            iC += 8;
            while (iC >= 8) {
                a[] aVarArrA = aVar.a();
                AbstractC4862t.b(aVarArrA);
                aVar = aVarArrA[(iB >>> (iC - 8)) & 255];
                AbstractC4862t.b(aVar);
                if (aVar.a() == null) {
                    sink.writeByte(aVar.b());
                    iC -= aVar.c();
                    aVar = f48296d;
                } else {
                    iC -= 8;
                }
            }
        }
        while (iC > 0) {
            a[] aVarArrA2 = aVar.a();
            AbstractC4862t.b(aVarArrA2);
            a aVar2 = aVarArrA2[(iB << (8 - iC)) & 255];
            AbstractC4862t.b(aVar2);
            if (aVar2.a() != null || aVar2.c() > iC) {
                return;
            }
            sink.writeByte(aVar2.b());
            iC -= aVar2.c();
            aVar = f48296d;
        }
    }

    public final void c(C0846h source, InterfaceC0844f sink) {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(sink, "sink");
        int size = source.size();
        long j10 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int iB = qe.m.b(source.q(i11), 255);
            int i12 = f48294b[iB];
            byte b10 = f48295c[iB];
            j10 = (j10 << b10) | ((long) i12);
            i10 += b10;
            while (i10 >= 8) {
                i10 -= 8;
                sink.writeByte((int) (j10 >> i10));
            }
        }
        if (i10 > 0) {
            sink.writeByte((int) ((j10 << (8 - i10)) | (255 >>> i10)));
        }
    }

    public final int d(C0846h bytes) {
        AbstractC4862t.e(bytes, "bytes");
        int size = bytes.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 += (long) f48295c[qe.m.b(bytes.q(i10), 255)];
        }
        return (int) ((j10 + ((long) 7)) >> 3);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a[] f48297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48299c;

        public a() {
            this.f48297a = new a[256];
            this.f48298b = 0;
            this.f48299c = 0;
        }

        public final a[] a() {
            return this.f48297a;
        }

        public final int b() {
            return this.f48298b;
        }

        public final int c() {
            return this.f48299c;
        }

        public a(int i10, int i11) {
            this.f48297a = null;
            this.f48298b = i10;
            int i12 = i11 & 7;
            this.f48299c = i12 == 0 ? 8 : i12;
        }
    }
}
