package bf;

import af.g;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.helpers.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f25507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f25508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f25510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f25513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Throwable f25515i;

    public void a(g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.f25508b == null) {
            this.f25508b = new ArrayList(2);
        }
        this.f25508b.add(gVar);
    }

    public b b() {
        return this.f25507a;
    }

    public m c() {
        return this.f25510d;
    }

    public void d(Object[] objArr) {
        this.f25513g = objArr;
    }

    public void e(b bVar) {
        this.f25507a = bVar;
    }

    public void f(m mVar) {
        this.f25510d = mVar;
    }

    public void g(String str) {
        this.f25509c = str;
    }

    public void h(String str) {
        this.f25512f = str;
    }

    public void i(String str) {
        this.f25511e = str;
    }

    public void j(Throwable th) {
        this.f25515i = th;
    }

    public void k(long j10) {
        this.f25514h = j10;
    }
}
