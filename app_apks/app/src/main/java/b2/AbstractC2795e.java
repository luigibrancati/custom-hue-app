package b2;

import G1.AbstractC0853a;
import I1.w;
import a2.C2638y;
import android.net.Uri;
import e2.m;
import java.util.Map;

/* JADX INFO: renamed from: b2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2795e implements m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24994a = C2638y.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I1.j f24995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D1.o f24997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f24999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f25000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f25001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f25002i;

    public AbstractC2795e(I1.f fVar, I1.j jVar, int i10, D1.o oVar, int i11, Object obj, long j10, long j11) {
        this.f25002i = new w(fVar);
        this.f24995b = (I1.j) AbstractC0853a.e(jVar);
        this.f24996c = i10;
        this.f24997d = oVar;
        this.f24998e = i11;
        this.f24999f = obj;
        this.f25000g = j10;
        this.f25001h = j11;
    }

    public final long a() {
        return this.f25002i.l();
    }

    public final long c() {
        return this.f25001h - this.f25000g;
    }

    public final Map d() {
        return this.f25002i.u();
    }

    public final Uri e() {
        return this.f25002i.t();
    }
}
