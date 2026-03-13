package X6;

import com.google.android.gms.measurement.internal.zzgd;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X6.m5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2442m5 extends zzgd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f19102a;

    public BinderC2442m5(U5 u52, AtomicReference atomicReference) {
        this.f19102a = atomicReference;
        Objects.requireNonNull(u52);
    }

    @Override // X6.InterfaceC2423k2
    public final void n3(List list) {
        AtomicReference atomicReference = this.f19102a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
