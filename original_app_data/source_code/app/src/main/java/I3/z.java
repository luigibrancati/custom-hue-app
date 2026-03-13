package I3;

import androidx.lifecycle.AbstractC2763t;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class z implements y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2763t f5646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O7.e f5647d;

    public z(AbstractC2763t state, O7.e future) {
        AbstractC4862t.e(state, "state");
        AbstractC4862t.e(future, "future");
        this.f5646c = state;
        this.f5647d = future;
    }

    @Override // I3.y
    public O7.e a() {
        return this.f5647d;
    }
}
