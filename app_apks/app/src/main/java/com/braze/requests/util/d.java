package com.braze.requests.util;

import android.net.Uri;
import java.net.URL;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f28348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f28349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f28350d;

    public d(Uri uri) {
        AbstractC4862t.e(uri, "uri");
        this.f28348b = uri;
        String string = uri.toString();
        this.f28347a = string;
        this.f28349c = new URL(string);
        this.f28350d = false;
    }

    public final String toString() {
        return this.f28347a;
    }

    public /* synthetic */ d(String str) {
        this(str, false);
    }

    public d(String urlString, boolean z10) {
        AbstractC4862t.e(urlString, "urlString");
        this.f28348b = Uri.parse(urlString);
        this.f28347a = urlString;
        this.f28349c = new URL(urlString);
        this.f28350d = z10;
    }
}
