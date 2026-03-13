package a2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: a2.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2638y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicLong f20915h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I1.j f20917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f20918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f20919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20922g;

    public C2638y(long j10, I1.j jVar, long j11) {
        this(j10, jVar, jVar.f5437a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long a() {
        return f20915h.getAndIncrement();
    }

    public C2638y(long j10, I1.j jVar, Uri uri, Map map, long j11, long j12, long j13) {
        this.f20916a = j10;
        this.f20917b = jVar;
        this.f20918c = uri;
        this.f20919d = map;
        this.f20920e = j11;
        this.f20921f = j12;
        this.f20922g = j13;
    }
}
