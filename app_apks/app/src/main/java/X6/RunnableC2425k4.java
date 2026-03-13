package X6;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: X6.k4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2425k4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f19051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f19052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f19053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f19054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f19055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f19056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ R4 f19057i;

    public RunnableC2425k4(R4 r42, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f19049a = str;
        this.f19050b = str2;
        this.f19051c = j10;
        this.f19052d = bundle;
        this.f19053e = z10;
        this.f19054f = z11;
        this.f19055g = z12;
        this.f19056h = str3;
        Objects.requireNonNull(r42);
        this.f19057i = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19057i.v(this.f19049a, this.f19050b, this.f19051c, this.f19052d, this.f19053e, this.f19054f, this.f19055g, this.f19056h);
    }
}
