package M3;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9229a = new a();

        public a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: M3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0138b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9230a;

        public C0138b(int i10) {
            super(null);
            this.f9230a = i10;
        }

        public final int a() {
            return this.f9230a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0138b) && this.f9230a == ((C0138b) obj).f9230a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f9230a);
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.f9230a + ')';
        }
    }

    public /* synthetic */ b(AbstractC4854k abstractC4854k) {
        this();
    }

    public b() {
    }
}
