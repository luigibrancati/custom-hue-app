package I1;

import G1.AbstractC0853a;
import G1.M;
import I1.f;
import I1.l;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5459b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f5460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f5461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f5462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f5463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f5464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f5465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f5466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f5467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f5468k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f5469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f.a f5470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public x f5471c;

        public a(Context context) {
            this(context, new l.b());
        }

        @Override // I1.f.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a() {
            k kVar = new k(this.f5469a, this.f5470b.a());
            x xVar = this.f5471c;
            if (xVar != null) {
                kVar.h(xVar);
            }
            return kVar;
        }

        public a(Context context, f.a aVar) {
            this.f5469a = context.getApplicationContext();
            this.f5470b = (f.a) AbstractC0853a.e(aVar);
        }
    }

    public k(Context context, f fVar) {
        this.f5458a = context.getApplicationContext();
        this.f5460c = (f) AbstractC0853a.e(fVar);
    }

    public final void A(f fVar, x xVar) {
        if (fVar != null) {
            fVar.h(xVar);
        }
    }

    @Override // I1.f
    public void close() {
        f fVar = this.f5468k;
        if (fVar != null) {
            try {
                fVar.close();
            } finally {
                this.f5468k = null;
            }
        }
    }

    @Override // I1.f
    public long f(j jVar) {
        AbstractC0853a.g(this.f5468k == null);
        String scheme = jVar.f5437a.getScheme();
        if (M.G0(jVar.f5437a)) {
            String path = jVar.f5437a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f5468k = w();
            } else {
                this.f5468k = t();
            }
        } else if ("asset".equals(scheme)) {
            this.f5468k = t();
        } else if ("content".equals(scheme)) {
            this.f5468k = u();
        } else if ("rtmp".equals(scheme)) {
            this.f5468k = y();
        } else if ("udp".equals(scheme)) {
            this.f5468k = z();
        } else if ("data".equals(scheme)) {
            this.f5468k = v();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f5468k = x();
        } else {
            this.f5468k = this.f5460c;
        }
        return this.f5468k.f(jVar);
    }

    @Override // I1.f
    public Map g() {
        f fVar = this.f5468k;
        return fVar == null ? Collections.EMPTY_MAP : fVar.g();
    }

    @Override // I1.f
    public Uri getUri() {
        f fVar = this.f5468k;
        if (fVar == null) {
            return null;
        }
        return fVar.getUri();
    }

    @Override // I1.f
    public void h(x xVar) {
        AbstractC0853a.e(xVar);
        this.f5460c.h(xVar);
        this.f5459b.add(xVar);
        A(this.f5461d, xVar);
        A(this.f5462e, xVar);
        A(this.f5463f, xVar);
        A(this.f5464g, xVar);
        A(this.f5465h, xVar);
        A(this.f5466i, xVar);
        A(this.f5467j, xVar);
    }

    public final void l(f fVar) {
        for (int i10 = 0; i10 < this.f5459b.size(); i10++) {
            fVar.h((x) this.f5459b.get(i10));
        }
    }

    @Override // D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) {
        return ((f) AbstractC0853a.e(this.f5468k)).read(bArr, i10, i11);
    }

    public final f t() {
        if (this.f5462e == null) {
            I1.a aVar = new I1.a(this.f5458a);
            this.f5462e = aVar;
            l(aVar);
        }
        return this.f5462e;
    }

    public final f u() {
        if (this.f5463f == null) {
            d dVar = new d(this.f5458a);
            this.f5463f = dVar;
            l(dVar);
        }
        return this.f5463f;
    }

    public final f v() {
        if (this.f5466i == null) {
            e eVar = new e();
            this.f5466i = eVar;
            l(eVar);
        }
        return this.f5466i;
    }

    public final f w() {
        if (this.f5461d == null) {
            o oVar = new o();
            this.f5461d = oVar;
            l(oVar);
        }
        return this.f5461d;
    }

    public final f x() {
        if (this.f5467j == null) {
            v vVar = new v(this.f5458a);
            this.f5467j = vVar;
            l(vVar);
        }
        return this.f5467j;
    }

    public final f y() {
        if (this.f5464g == null) {
            try {
                f fVar = (f) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f5464g = fVar;
                l(fVar);
            } catch (ClassNotFoundException unused) {
                G1.t.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f5464g == null) {
                this.f5464g = this.f5460c;
            }
        }
        return this.f5464g;
    }

    public final f z() {
        if (this.f5465h == null) {
            y yVar = new y();
            this.f5465h = yVar;
            l(yVar);
        }
        return this.f5465h;
    }
}
