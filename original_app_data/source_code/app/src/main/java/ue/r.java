package ue;

import gc.C4199l;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C5465a;
import pe.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface r {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        l a();

        void cancel();

        a d();

        b f();

        a g();

        boolean isReady();
    }

    static /* synthetic */ boolean f(r rVar, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return rVar.a(lVar);
    }

    boolean a(l lVar);

    C4199l b();

    boolean c();

    b d();

    boolean e(v vVar);

    C5465a getAddress();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f45690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f45691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Throwable f45692c;

        public a(b plan, b bVar, Throwable th) {
            AbstractC4862t.e(plan, "plan");
            this.f45690a = plan;
            this.f45691b = bVar;
            this.f45692c = th;
        }

        public final b a() {
            return this.f45691b;
        }

        public final Throwable b() {
            return this.f45692c;
        }

        public final b c() {
            return this.f45691b;
        }

        public final b d() {
            return this.f45690a;
        }

        public final Throwable e() {
            return this.f45692c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC4862t.a(this.f45690a, aVar.f45690a) && AbstractC4862t.a(this.f45691b, aVar.f45691b) && AbstractC4862t.a(this.f45692c, aVar.f45692c);
        }

        public final boolean f() {
            return this.f45691b == null && this.f45692c == null;
        }

        public int hashCode() {
            int iHashCode = this.f45690a.hashCode() * 31;
            b bVar = this.f45691b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Throwable th = this.f45692c;
            return iHashCode2 + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "ConnectResult(plan=" + this.f45690a + ", nextPlan=" + this.f45691b + ", throwable=" + this.f45692c + ')';
        }

        public /* synthetic */ a(b bVar, b bVar2, Throwable th, int i10, AbstractC4854k abstractC4854k) {
            this(bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? null : th);
        }
    }
}
