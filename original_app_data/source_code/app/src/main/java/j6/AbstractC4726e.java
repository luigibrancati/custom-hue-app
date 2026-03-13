package j6;

import io.sentry.SentryReplayEvent;
import j6.C4722a;

/* JADX INFO: renamed from: j6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4726e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC4726e f39064a = a().f(SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE).d(200).b(10000).c(604800000).e(81920).a();

    /* JADX INFO: renamed from: j6.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public abstract AbstractC4726e a();

        public abstract a b(int i10);

        public abstract a c(long j10);

        public abstract a d(int i10);

        public abstract a e(int i10);

        public abstract a f(long j10);
    }

    public static a a() {
        return new C4722a.b();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();
}
