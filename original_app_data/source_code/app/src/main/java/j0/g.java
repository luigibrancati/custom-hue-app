package j0;

import b0.y;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f38879a;

    public g(long[] jArr) {
        y yVar;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            yVar = new y(jArrCopyOf.length);
            yVar.d(yVar.f24933b, jArrCopyOf);
        } else {
            yVar = new y(0, 1, null);
        }
        this.f38879a = yVar;
    }

    public final void a(long j10) {
        this.f38879a.c(j10);
    }

    public final long[] b() {
        y yVar = this.f38879a;
        int i10 = yVar.f24933b;
        if (i10 == 0) {
            return null;
        }
        long[] jArr = new long[i10];
        long[] jArr2 = yVar.f24932a;
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = jArr2[i11];
        }
        return jArr;
    }
}
