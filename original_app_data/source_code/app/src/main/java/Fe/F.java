package Fe;

import com.google.ar.core.ImageMetadata;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f4072a = new F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4073b = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f4074c = new E(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference[] f4076e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4075d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f4076e = atomicReferenceArr;
    }

    public static final void b(E segment) {
        AbstractC4862t.e(segment, "segment");
        if (segment.f4070f != null || segment.f4071g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f4068d) {
            return;
        }
        AtomicReference atomicReferenceA = f4072a.a();
        E e10 = f4074c;
        E e11 = (E) atomicReferenceA.getAndSet(e10);
        if (e11 == e10) {
            return;
        }
        int i10 = e11 != null ? e11.f4067c : 0;
        if (i10 >= f4073b) {
            atomicReferenceA.set(e11);
            return;
        }
        segment.f4070f = e11;
        segment.f4066b = 0;
        segment.f4067c = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final E c() {
        AtomicReference atomicReferenceA = f4072a.a();
        E e10 = f4074c;
        E e11 = (E) atomicReferenceA.getAndSet(e10);
        if (e11 == e10) {
            return new E();
        }
        if (e11 == null) {
            atomicReferenceA.set(null);
            return new E();
        }
        atomicReferenceA.set(e11.f4070f);
        e11.f4070f = null;
        e11.f4067c = 0;
        return e11;
    }

    public final AtomicReference a() {
        return f4076e[(int) (Thread.currentThread().getId() & (((long) f4075d) - 1))];
    }
}
