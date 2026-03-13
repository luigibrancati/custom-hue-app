package com.braze.lrucache;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f27821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f27823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f27825f;

    public g(String str, int i10, File file) {
        this.f27820a = str;
        this.f27824e = i10;
        this.f27825f = file;
        this.f27821b = new long[i10];
    }

    public final File a(int i10) {
        return new File(this.f27825f, this.f27820a + "." + i10 + ".tmp");
    }
}
