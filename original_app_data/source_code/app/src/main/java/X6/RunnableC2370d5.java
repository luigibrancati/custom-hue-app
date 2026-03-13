package X6;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: X6.d5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2370d5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f18781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2362c5 f18782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2362c5 f18783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f18784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2426k5 f18785e;

    public RunnableC2370d5(C2426k5 c2426k5, Bundle bundle, C2362c5 c2362c5, C2362c5 c2362c52, long j10) {
        this.f18781a = bundle;
        this.f18782b = c2362c5;
        this.f18783c = c2362c52;
        this.f18784d = j10;
        Objects.requireNonNull(c2426k5);
        this.f18785e = c2426k5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18785e.A(this.f18781a, this.f18782b, this.f18783c, this.f18784d);
    }
}
