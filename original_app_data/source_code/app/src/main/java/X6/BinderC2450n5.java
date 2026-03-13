package X6;

import com.google.android.gms.measurement.internal.zzgg;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X6.n5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2450n5 extends zzgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f19131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U5 f19132b;

    public BinderC2450n5(U5 u52, AtomicReference atomicReference) {
        this.f19131a = atomicReference;
        Objects.requireNonNull(u52);
        this.f19132b = u52;
    }

    @Override // X6.InterfaceC2439m2
    public final void B1(A6 a62) {
        AtomicReference atomicReference = this.f19131a;
        synchronized (atomicReference) {
            this.f19132b.f18400a.a().w().b("[sgtm] Got upload batches from service. count", Integer.valueOf(a62.f18156a.size()));
            atomicReference.set(a62);
            atomicReference.notifyAll();
        }
    }
}
