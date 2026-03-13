package Rd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15105b = AtomicIntegerFieldUpdater.newUpdater(A.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f15106a;

    public A(Throwable th, boolean z10) {
        this.f15106a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f15105b.get(this) == 1;
    }

    public final boolean c() {
        return f15105b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return Q.a(this) + '[' + this.f15106a + ']';
    }

    public /* synthetic */ A(Throwable th, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
