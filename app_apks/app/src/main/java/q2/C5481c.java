package q2;

import java.util.List;
import x2.C6291a;

/* JADX INFO: renamed from: q2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5481c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f43093b;

    /* JADX INFO: renamed from: q2.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f43095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f43096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f43097d;

        public a(String str, String str2, long j10, long j11) {
            this.f43094a = str;
            this.f43095b = str2;
            this.f43096c = j10;
            this.f43097d = j11;
        }
    }

    public C5481c(long j10, List list) {
        this.f43092a = j10;
        this.f43093b = list;
    }

    public C6291a a(long j10) {
        long j11;
        if (this.f43093b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f43093b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f43093b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f43094a) | z10;
            if (size == 0) {
                j12 -= aVar.f43097d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f43096c;
            }
            long j17 = j11;
            long j18 = j12;
            j12 = j17;
            if (!zEquals || j12 == j18) {
                z10 = zEquals;
            } else {
                j16 = j18 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j18;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new C6291a(j13, j14, this.f43092a, j15, j16);
    }
}
