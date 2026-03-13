package a9;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import h8.C4288f;

/* JADX INFO: renamed from: a9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2656a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4288f f21191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P8.h f21192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O8.b f21193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O8.b f21194d;

    public C2656a(C4288f c4288f, P8.h hVar, O8.b bVar, O8.b bVar2) {
        this.f21191a = c4288f;
        this.f21192b = hVar;
        this.f21193c = bVar;
        this.f21194d = bVar2;
    }

    public Y8.a a() {
        return Y8.a.g();
    }

    public C4288f b() {
        return this.f21191a;
    }

    public P8.h c() {
        return this.f21192b;
    }

    public O8.b d() {
        return this.f21193c;
    }

    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    public SessionManager f() {
        return SessionManager.getInstance();
    }

    public O8.b g() {
        return this.f21194d;
    }
}
