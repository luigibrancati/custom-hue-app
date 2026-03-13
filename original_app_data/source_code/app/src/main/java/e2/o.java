package e2;

import G1.AbstractC0853a;
import G1.M;
import I1.j;
import I1.w;
import a2.C2638y;
import android.net.Uri;
import e2.m;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o implements m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I1.j f33653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f33655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f33656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f33657f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        Object a(Uri uri, InputStream inputStream);
    }

    public o(I1.f fVar, Uri uri, int i10, a aVar) {
        this(fVar, new j.b().i(uri).b(1).a(), i10, aVar);
    }

    public long a() {
        return this.f33655d.l();
    }

    public Map c() {
        return this.f33655d.u();
    }

    public final Object d() {
        return this.f33657f;
    }

    public Uri e() {
        return this.f33655d.t();
    }

    @Override // e2.m.e
    public final void load() {
        this.f33655d.v();
        I1.h hVar = new I1.h(this.f33655d, this.f33653b);
        try {
            hVar.b();
            this.f33657f = this.f33656e.a((Uri) AbstractC0853a.e(this.f33655d.getUri()), hVar);
        } finally {
            M.m(hVar);
        }
    }

    public o(I1.f fVar, I1.j jVar, int i10, a aVar) {
        this.f33655d = new w(fVar);
        this.f33653b = jVar;
        this.f33654c = i10;
        this.f33656e = aVar;
        this.f33652a = C2638y.a();
    }

    @Override // e2.m.e
    public final void b() {
    }
}
