package C3;

import C3.c;
import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1109d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3.b f1110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.b f1112c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final void a(z3.b bounds) {
            AbstractC4862t.e(bounds, "bounds");
            if (bounds.d() == 0 && bounds.a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bounds.b() != 0 && bounds.c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f1113b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f1114c = new b("FOLD");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f1115d = new b("HINGE");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1116a;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public /* synthetic */ a(AbstractC4854k abstractC4854k) {
                this();
            }

            public final b a() {
                return b.f1114c;
            }

            public final b b() {
                return b.f1115d;
            }

            public a() {
            }
        }

        public b(String str) {
            this.f1116a = str;
        }

        public String toString() {
            return this.f1116a;
        }
    }

    public d(z3.b featureBounds, b type, c.b state) {
        AbstractC4862t.e(featureBounds, "featureBounds");
        AbstractC4862t.e(type, "type");
        AbstractC4862t.e(state, "state");
        this.f1110a = featureBounds;
        this.f1111b = type;
        this.f1112c = state;
        f1109d.a(featureBounds);
    }

    @Override // C3.c
    public c.a a() {
        return (this.f1110a.d() == 0 || this.f1110a.a() == 0) ? c.a.f1102c : c.a.f1103d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC4862t.a(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC4862t.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        d dVar = (d) obj;
        return AbstractC4862t.a(this.f1110a, dVar.f1110a) && AbstractC4862t.a(this.f1111b, dVar.f1111b) && AbstractC4862t.a(getState(), dVar.getState());
    }

    @Override // C3.a
    public Rect getBounds() {
        return this.f1110a.f();
    }

    @Override // C3.c
    public c.b getState() {
        return this.f1112c;
    }

    public int hashCode() {
        return (((this.f1110a.hashCode() * 31) + this.f1111b.hashCode()) * 31) + getState().hashCode();
    }

    public String toString() {
        return d.class.getSimpleName() + " { " + this.f1110a + ", type=" + this.f1111b + ", state=" + getState() + " }";
    }
}
