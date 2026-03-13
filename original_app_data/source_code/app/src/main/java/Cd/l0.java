package Cd;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1381a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f1382b = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends l0 {
        @Override // Cd.l0
        public /* bridge */ /* synthetic */ i0 e(E e10) {
            return (i0) i(e10);
        }

        @Override // Cd.l0
        public boolean f() {
            return true;
        }

        public Void i(E key) {
            AbstractC4862t.e(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends l0 {
        public c() {
        }

        @Override // Cd.l0
        public boolean a() {
            return false;
        }

        @Override // Cd.l0
        public boolean b() {
            return false;
        }

        @Override // Cd.l0
        public Mc.g d(Mc.g annotations) {
            AbstractC4862t.e(annotations, "annotations");
            return l0.this.d(annotations);
        }

        @Override // Cd.l0
        public i0 e(E key) {
            AbstractC4862t.e(key, "key");
            return l0.this.e(key);
        }

        @Override // Cd.l0
        public boolean f() {
            return l0.this.f();
        }

        @Override // Cd.l0
        public E g(E topLevelType, u0 position) {
            AbstractC4862t.e(topLevelType, "topLevelType");
            AbstractC4862t.e(position, "position");
            return l0.this.g(topLevelType, position);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final n0 c() {
        n0 n0VarG = n0.g(this);
        AbstractC4862t.d(n0VarG, "create(this)");
        return n0VarG;
    }

    public Mc.g d(Mc.g annotations) {
        AbstractC4862t.e(annotations, "annotations");
        return annotations;
    }

    public abstract i0 e(E e10);

    public boolean f() {
        return false;
    }

    public E g(E topLevelType, u0 position) {
        AbstractC4862t.e(topLevelType, "topLevelType");
        AbstractC4862t.e(position, "position");
        return topLevelType;
    }

    public final l0 h() {
        return new c();
    }
}
