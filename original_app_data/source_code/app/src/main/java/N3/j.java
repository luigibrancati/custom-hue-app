package N3;

import Q3.I;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9608b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(O3.h tracker) {
        super(tracker);
        AbstractC4862t.e(tracker, "tracker");
        this.f9608b = 9;
    }

    @Override // N3.e
    public boolean a(I workSpec) {
        AbstractC4862t.e(workSpec, "workSpec");
        return workSpec.f13597j.k();
    }

    @Override // N3.b
    public int d() {
        return this.f9608b;
    }

    @Override // N3.b
    public /* bridge */ /* synthetic */ boolean e(Object obj) {
        return f(((Boolean) obj).booleanValue());
    }

    public boolean f(boolean z10) {
        return !z10;
    }
}
