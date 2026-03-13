package Cd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Cd.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0733p extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f1391c;

    public AbstractC0733p(l0 substitution) {
        AbstractC4862t.e(substitution, "substitution");
        this.f1391c = substitution;
    }

    @Override // Cd.l0
    public boolean a() {
        return this.f1391c.a();
    }

    @Override // Cd.l0
    public Mc.g d(Mc.g annotations) {
        AbstractC4862t.e(annotations, "annotations");
        return this.f1391c.d(annotations);
    }

    @Override // Cd.l0
    public i0 e(E key) {
        AbstractC4862t.e(key, "key");
        return this.f1391c.e(key);
    }

    @Override // Cd.l0
    public boolean f() {
        return this.f1391c.f();
    }

    @Override // Cd.l0
    public E g(E topLevelType, u0 position) {
        AbstractC4862t.e(topLevelType, "topLevelType");
        AbstractC4862t.e(position, "position");
        return this.f1391c.g(topLevelType, position);
    }
}
