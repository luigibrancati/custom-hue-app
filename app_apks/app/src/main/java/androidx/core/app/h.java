package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Configuration f22481b;

    public h(boolean z10) {
        this.f22480a = z10;
    }

    public final boolean a() {
        return this.f22480a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(boolean z10, Configuration newConfig) {
        this(z10);
        AbstractC4862t.e(newConfig, "newConfig");
        this.f22481b = newConfig;
    }
}
