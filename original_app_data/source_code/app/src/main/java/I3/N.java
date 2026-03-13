package I3;

import gc.C4179C;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5572d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f5573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q3.I f5574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f5575c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f5576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public UUID f5578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Q3.I f5579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Set f5580e;

        public a(Class workerClass) {
            AbstractC4862t.e(workerClass, "workerClass");
            this.f5576a = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC4862t.d(uuidRandomUUID, "randomUUID(...)");
            this.f5578c = uuidRandomUUID;
            String string = this.f5578c.toString();
            AbstractC4862t.d(string, "toString(...)");
            String name = workerClass.getName();
            AbstractC4862t.d(name, "getName(...)");
            this.f5579d = new Q3.I(string, name);
            String name2 = workerClass.getName();
            AbstractC4862t.d(name2, "getName(...)");
            this.f5580e = gc.U.f(name2);
        }

        public final a a(String tag) {
            AbstractC4862t.e(tag, "tag");
            this.f5580e.add(tag);
            return g();
        }

        public final N b() {
            N nC = c();
            C0874d c0874d = this.f5579d.f13597j;
            boolean z10 = c0874d.g() || c0874d.h() || c0874d.i() || c0874d.j();
            Q3.I i10 = this.f5579d;
            if (i10.f13604q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (i10.f13594g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            String strL = i10.l();
            if (strL == null) {
                Q3.I i11 = this.f5579d;
                i11.p(N.f5572d.b(i11.f13590c));
            } else if (strL.length() > 127) {
                this.f5579d.p(Od.H.m1(strL, 127));
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC4862t.d(uuidRandomUUID, "randomUUID(...)");
            k(uuidRandomUUID);
            return nC;
        }

        public abstract N c();

        public final boolean d() {
            return this.f5577b;
        }

        public final UUID e() {
            return this.f5578c;
        }

        public final Set f() {
            return this.f5580e;
        }

        public abstract a g();

        public final Q3.I h() {
            return this.f5579d;
        }

        public final a i(C0874d constraints) {
            AbstractC4862t.e(constraints, "constraints");
            this.f5579d.f13597j = constraints;
            return g();
        }

        public a j(D policy) {
            AbstractC4862t.e(policy, "policy");
            Q3.I i10 = this.f5579d;
            i10.f13604q = true;
            i10.f13605r = policy;
            return g();
        }

        public final a k(UUID id2) {
            AbstractC4862t.e(id2, "id");
            this.f5578c = id2;
            String string = id2.toString();
            AbstractC4862t.d(string, "toString(...)");
            this.f5579d = new Q3.I(string, this.f5579d);
            return g();
        }

        public a l(long j10, TimeUnit timeUnit) {
            AbstractC4862t.e(timeUnit, "timeUnit");
            this.f5579d.f13594g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f5579d.f13594g) {
                return g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final a m(androidx.work.b inputData) {
            AbstractC4862t.e(inputData, "inputData");
            this.f5579d.f13592e = inputData;
            return g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final String b(String str) {
            List listI0 = Od.F.I0(str, new String[]{"."}, false, 0, 6, null);
            String str2 = listI0.size() == 1 ? (String) listI0.get(0) : (String) C4179C.s0(listI0);
            return str2.length() <= 127 ? str2 : Od.H.m1(str2, 127);
        }

        public b() {
        }
    }

    public N(UUID id2, Q3.I workSpec, Set tags) {
        AbstractC4862t.e(id2, "id");
        AbstractC4862t.e(workSpec, "workSpec");
        AbstractC4862t.e(tags, "tags");
        this.f5573a = id2;
        this.f5574b = workSpec;
        this.f5575c = tags;
    }

    public UUID a() {
        return this.f5573a;
    }

    public final String b() {
        String string = a().toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public final Set c() {
        return this.f5575c;
    }

    public final Q3.I d() {
        return this.f5574b;
    }
}
