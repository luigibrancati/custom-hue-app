package N3;

import I3.EnumC0891v;
import Q3.I;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9600b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(O3.h tracker) {
        super(tracker);
        AbstractC4862t.e(tracker, "tracker");
        this.f9600b = 7;
    }

    @Override // N3.e
    public boolean a(I workSpec) {
        AbstractC4862t.e(workSpec, "workSpec");
        return workSpec.f13597j.f() == EnumC0891v.CONNECTED;
    }

    @Override // N3.b
    public int d() {
        return this.f9600b;
    }

    @Override // N3.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean e(M3.f value) {
        AbstractC4862t.e(value, "value");
        return (value.a() && value.d()) ? false : true;
    }
}
