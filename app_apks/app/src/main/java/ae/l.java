package ae;

import Wd.E;
import Wd.H;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21251a = H.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f21252b = new E("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f21253c = new E("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f21254d = new E("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E f21255e = new E("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f21256f = H.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static final InterfaceC2694h a(int i10, int i11) {
        return new k(i10, i11);
    }

    public static /* synthetic */ InterfaceC2694h b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    public static final m j(long j10, m mVar) {
        return new m(j10, mVar, 0);
    }
}
