package N3;

import I3.EnumC0891v;
import Q3.I;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9607b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(O3.h tracker) {
        super(tracker);
        AbstractC4862t.e(tracker, "tracker");
        this.f9607b = 7;
    }

    @Override // N3.e
    public boolean a(I workSpec) {
        AbstractC4862t.e(workSpec, "workSpec");
        EnumC0891v enumC0891vF = workSpec.f13597j.f();
        return enumC0891vF == EnumC0891v.UNMETERED || enumC0891vF == EnumC0891v.TEMPORARILY_UNMETERED;
    }

    @Override // N3.b
    public int d() {
        return this.f9607b;
    }

    @Override // N3.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean e(M3.f value) {
        AbstractC4862t.e(value, "value");
        return !value.a() || value.b();
    }
}
