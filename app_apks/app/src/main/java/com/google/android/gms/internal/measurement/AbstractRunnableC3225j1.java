package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC3225j1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3323u1 f29509d;

    public AbstractRunnableC3225j1(C3323u1 c3323u1, boolean z10) {
        Objects.requireNonNull(c3323u1);
        this.f29509d = c3323u1;
        this.f29506a = c3323u1.f29622b.a();
        this.f29507b = c3323u1.f29622b.c();
        this.f29508c = z10;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f29509d.m()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f29509d.k(e10, false, this.f29508c);
            b();
        }
    }

    public void b() {
    }
}
