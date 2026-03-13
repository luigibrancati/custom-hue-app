package Cd;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Cd.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0736t extends l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1398e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f1399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f1400d;

    /* JADX INFO: renamed from: Cd.t$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final l0 a(l0 first, l0 second) {
            AbstractC4862t.e(first, "first");
            AbstractC4862t.e(second, "second");
            return first.f() ? second : second.f() ? first : new C0736t(first, second, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C0736t(l0 l0Var, l0 l0Var2, AbstractC4854k abstractC4854k) {
        this(l0Var, l0Var2);
    }

    public static final l0 i(l0 l0Var, l0 l0Var2) {
        return f1398e.a(l0Var, l0Var2);
    }

    @Override // Cd.l0
    public boolean a() {
        return this.f1399c.a() || this.f1400d.a();
    }

    @Override // Cd.l0
    public boolean b() {
        return this.f1399c.b() || this.f1400d.b();
    }

    @Override // Cd.l0
    public Mc.g d(Mc.g annotations) {
        AbstractC4862t.e(annotations, "annotations");
        return this.f1400d.d(this.f1399c.d(annotations));
    }

    @Override // Cd.l0
    public i0 e(E key) {
        AbstractC4862t.e(key, "key");
        i0 i0VarE = this.f1399c.e(key);
        return i0VarE == null ? this.f1400d.e(key) : i0VarE;
    }

    @Override // Cd.l0
    public boolean f() {
        return false;
    }

    @Override // Cd.l0
    public E g(E topLevelType, u0 position) {
        AbstractC4862t.e(topLevelType, "topLevelType");
        AbstractC4862t.e(position, "position");
        return this.f1400d.g(this.f1399c.g(topLevelType, position), position);
    }

    public C0736t(l0 l0Var, l0 l0Var2) {
        this.f1399c = l0Var;
        this.f1400d = l0Var2;
    }
}
