package bf;

import af.g;
import java.util.Queue;
import org.slf4j.helpers.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class a extends org.slf4j.helpers.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f25505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Queue f25506d;

    public a(m mVar, Queue queue) {
        this.f25505c = mVar;
        this.f25504b = mVar.getName();
        this.f25506d = queue;
    }

    @Override // af.c
    public boolean d() {
        return true;
    }

    @Override // af.c
    public boolean f() {
        return true;
    }

    @Override // org.slf4j.helpers.a, af.c
    public String getName() {
        return this.f25504b;
    }

    @Override // af.c
    public boolean h() {
        return true;
    }

    @Override // af.c
    public boolean k() {
        return true;
    }

    @Override // af.c
    public boolean r() {
        return true;
    }

    @Override // org.slf4j.helpers.a
    public void z(b bVar, g gVar, String str, Object[] objArr, Throwable th) {
        d dVar = new d();
        dVar.k(System.currentTimeMillis());
        dVar.e(bVar);
        dVar.f(this.f25505c);
        dVar.g(this.f25504b);
        if (gVar != null) {
            dVar.a(gVar);
        }
        dVar.h(str);
        dVar.i(Thread.currentThread().getName());
        dVar.d(objArr);
        dVar.j(th);
        this.f25506d.add(dVar);
    }
}
