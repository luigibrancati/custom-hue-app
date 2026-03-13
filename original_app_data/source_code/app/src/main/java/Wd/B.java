package Wd;

import Rd.N0;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class B extends AbstractC2323c implements N0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17896d = AtomicIntegerFieldUpdater.newUpdater(B.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17897c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public B(long j10, B b10, int i10) {
        super(b10);
        this.f17897c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // Wd.AbstractC2323c
    public boolean k() {
        return f17896d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f17896d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th, InterfaceC4992i interfaceC4992i);

    public final void t() {
        if (f17896d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17896d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + i10));
        return true;
    }
}
