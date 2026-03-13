package i6;

import android.app.job.JobInfo;
import i6.C4361c;
import io.sentry.TransactionOptions;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import l6.InterfaceC4957a;

/* JADX INFO: renamed from: i6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4364f {

    /* JADX INFO: renamed from: i6.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC4957a f37255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f37256b = new HashMap();

        public a a(Y5.f fVar, b bVar) {
            this.f37256b.put(fVar, bVar);
            return this;
        }

        public AbstractC4364f b() {
            if (this.f37255a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f37256b.keySet().size() < Y5.f.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f37256b;
            this.f37256b = new HashMap();
            return AbstractC4364f.d(this.f37255a, map);
        }

        public a c(InterfaceC4957a interfaceC4957a) {
            this.f37255a = interfaceC4957a;
            return this;
        }
    }

    /* JADX INFO: renamed from: i6.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {

        /* JADX INFO: renamed from: i6.f$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new C4361c.b().c(Collections.EMPTY_SET);
        }

        public abstract long b();

        public abstract Set c();

        public abstract long d();
    }

    /* JADX INFO: renamed from: i6.f$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static AbstractC4364f d(InterfaceC4957a interfaceC4957a, Map map) {
        return new C4360b(interfaceC4957a, map);
    }

    public static AbstractC4364f f(InterfaceC4957a interfaceC4957a) {
        return b().a(Y5.f.DEFAULT, b.a().b(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION).d(86400000L).a()).a(Y5.f.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(Y5.f.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(interfaceC4957a).b();
    }

    public static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public final long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) r7))));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, Y5.f fVar, long j10, int i10) {
        builder.setMinimumLatency(g(fVar, j10, i10));
        j(builder, ((b) h().get(fVar)).c());
        return builder;
    }

    public abstract InterfaceC4957a e();

    public long g(Y5.f fVar, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = (b) h().get(fVar);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    public abstract Map h();

    public final void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
