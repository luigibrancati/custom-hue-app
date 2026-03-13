package Fe;

import gc.AbstractC4191d;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC4854k;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends AbstractC4191d implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f4158d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0846h[] f4159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f4160c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ void b(a aVar, long j10, C0843e c0843e, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            aVar.a(j10, c0843e, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        public final void a(long j10, C0843e c0843e, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            long j11;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((C0846h) list.get(i17)).size() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C0846h c0846h = (C0846h) list.get(i11);
            C0846h c0846h2 = (C0846h) list.get(i12 - 1);
            if (i16 == c0846h.size()) {
                int iIntValue = ((Number) list2.get(i11)).intValue();
                int i18 = i11 + 1;
                C0846h c0846h3 = (C0846h) list.get(i18);
                i13 = i18;
                i14 = iIntValue;
                c0846h = c0846h3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (c0846h.q(i16) == c0846h2.q(i16)) {
                int iMin = Math.min(c0846h.size(), c0846h2.size());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && c0846h.q(i20) == c0846h2.q(i20); i20++) {
                    i19++;
                }
                long jC = j10 + c(c0843e) + ((long) 2) + ((long) i19) + 1;
                c0843e.writeInt(-i19);
                c0843e.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    c0843e.writeInt(c0846h.q(i16) & ForkServer.ERROR);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != ((C0846h) list.get(i13)).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c0843e.writeInt(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    C0843e c0843e2 = new C0843e();
                    c0843e.writeInt(((int) (c(c0843e2) + jC)) * (-1));
                    a(jC, c0843e2, i21, list, i13, i12, list2);
                    c0843e.f1(c0843e2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((C0846h) list.get(i23 - 1)).q(i16) != ((C0846h) list.get(i23)).q(i16)) {
                    i22++;
                }
            }
            long jC2 = j10 + c(c0843e) + ((long) 2) + ((long) (i22 * 2));
            c0843e.writeInt(i22);
            c0843e.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte bQ = ((C0846h) list.get(i24)).q(i16);
                if (i24 == i13 || bQ != ((C0846h) list.get(i24 - 1)).q(i16)) {
                    c0843e.writeInt(bQ & ForkServer.ERROR);
                }
            }
            C0843e c0843e3 = new C0843e();
            while (i13 < i12) {
                byte bQ2 = ((C0846h) list.get(i13)).q(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bQ2 != ((C0846h) list.get(i26)).q(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == ((C0846h) list.get(i13)).size()) {
                    c0843e.writeInt(((Number) list2.get(i13)).intValue());
                    j11 = jC2;
                } else {
                    c0843e.writeInt(((int) (c(c0843e3) + jC2)) * (-1));
                    j11 = jC2;
                    a(j11, c0843e3, i16 + 1, list, i13, i15, list2);
                }
                jC2 = j11;
                i13 = i15;
            }
            c0843e.f1(c0843e3);
        }

        public final long c(C0843e c0843e) {
            return c0843e.size() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final Fe.y d(Fe.C0846h... r17) {
            /*
                Method dump skipped, instruction units count: 262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Fe.y.a.d(Fe.h[]):Fe.y");
        }

        public a() {
        }
    }

    public /* synthetic */ y(C0846h[] c0846hArr, int[] iArr, AbstractC4854k abstractC4854k) {
        this(c0846hArr, iArr);
    }

    @Override // gc.AbstractC4189b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0846h) {
            return f((C0846h) obj);
        }
        return false;
    }

    @Override // gc.AbstractC4189b
    public int d() {
        return this.f4159b.length;
    }

    public /* bridge */ boolean f(C0846h c0846h) {
        return super.contains(c0846h);
    }

    @Override // gc.AbstractC4191d, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0846h get(int i10) {
        return this.f4159b[i10];
    }

    @Override // gc.AbstractC4191d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0846h) {
            return k((C0846h) obj);
        }
        return -1;
    }

    public /* bridge */ int k(C0846h c0846h) {
        return super.indexOf(c0846h);
    }

    public /* bridge */ int l(C0846h c0846h) {
        return super.lastIndexOf(c0846h);
    }

    @Override // gc.AbstractC4191d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0846h) {
            return l((C0846h) obj);
        }
        return -1;
    }

    public y(C0846h[] c0846hArr, int[] iArr) {
        this.f4159b = c0846hArr;
        this.f4160c = iArr;
    }
}
