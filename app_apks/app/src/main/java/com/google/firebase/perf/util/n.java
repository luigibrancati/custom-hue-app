package com.google.firebase.perf.util;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f31868a;

    public n(URL url) {
        this.f31868a = url;
    }

    public URLConnection a() {
        return this.f31868a.openConnection();
    }

    public String toString() {
        return this.f31868a.toString();
    }
}
