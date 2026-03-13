package E9;

import G9.o;
import H9.b;
import S6.C2197c;
import U6.r;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c implements C2197c.InterfaceC0186c, C2197c.l, C2197c.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H9.b f3361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.a f3362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b.a f3363c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G9.a f3365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2197c f3366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CameraPosition f3367g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f3370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f3371k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ReadWriteLock f3369i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F9.f f3364d = new F9.g(new F9.e(new F9.c()));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f3368h = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AsyncTask {
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set doInBackground(Float... fArr) {
            F9.b bVarE = c.this.e();
            bVarE.lock();
            try {
                return bVarE.e(fArr[0].floatValue());
            } finally {
                bVarE.unlock();
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Set set) {
            c.this.f3365e.onClustersChanged(set);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        boolean onClusterClick(E9.a aVar);
    }

    /* JADX INFO: renamed from: E9.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0049c {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        boolean onClusterItemClick(E9.b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface g {
    }

    public c(Context context, C2197c c2197c, H9.b bVar) {
        this.f3366f = c2197c;
        this.f3361a = bVar;
        this.f3363c = bVar.g();
        this.f3362b = bVar.g();
        this.f3365e = new o(context, c2197c, this);
        this.f3365e.onAdd();
    }

    public boolean b(E9.b bVar) {
        F9.b bVarE = e();
        bVarE.lock();
        try {
            return bVarE.f(bVar);
        } finally {
            bVarE.unlock();
        }
    }

    public void c() {
        F9.b bVarE = e();
        bVarE.lock();
        try {
            bVarE.c();
        } finally {
            bVarE.unlock();
        }
    }

    public void d() {
        this.f3369i.writeLock().lock();
        try {
            this.f3368h.cancel(true);
            a aVar = new a();
            this.f3368h = aVar;
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.f3366f.i().f30343b));
        } finally {
            this.f3369i.writeLock().unlock();
        }
    }

    public F9.b e() {
        return this.f3364d;
    }

    public b.a f() {
        return this.f3363c;
    }

    public b.a g() {
        return this.f3362b;
    }

    public H9.b h() {
        return this.f3361a;
    }

    public boolean i(E9.b bVar) {
        F9.b bVarE = e();
        bVarE.lock();
        try {
            return bVarE.b(bVar);
        } finally {
            bVarE.unlock();
        }
    }

    public void j(b bVar) {
        this.f3371k = bVar;
        this.f3365e.setOnClusterClickListener(bVar);
    }

    public void k(e eVar) {
        this.f3370j = eVar;
        this.f3365e.setOnClusterItemClickListener(eVar);
    }

    public void l(G9.a aVar) {
        this.f3365e.setOnClusterClickListener(null);
        this.f3365e.setOnClusterItemClickListener(null);
        this.f3363c.b();
        this.f3362b.b();
        this.f3365e.onRemove();
        this.f3365e = aVar;
        aVar.onAdd();
        this.f3365e.setOnClusterClickListener(this.f3371k);
        this.f3365e.setOnClusterInfoWindowClickListener(null);
        this.f3365e.setOnClusterInfoWindowLongClickListener(null);
        this.f3365e.setOnClusterItemClickListener(this.f3370j);
        this.f3365e.setOnClusterItemInfoWindowClickListener(null);
        this.f3365e.setOnClusterItemInfoWindowLongClickListener(null);
        d();
    }

    @Override // S6.C2197c.InterfaceC0186c
    public void onCameraIdle() {
        G9.a aVar = this.f3365e;
        if (aVar instanceof C2197c.InterfaceC0186c) {
            ((C2197c.InterfaceC0186c) aVar).onCameraIdle();
        }
        this.f3364d.a(this.f3366f.i());
        if (this.f3364d.d()) {
            d();
            return;
        }
        CameraPosition cameraPosition = this.f3367g;
        if (cameraPosition == null || cameraPosition.f30343b != this.f3366f.i().f30343b) {
            this.f3367g = this.f3366f.i();
            d();
        }
    }

    @Override // S6.C2197c.h
    public void onInfoWindowClick(r rVar) {
        h().onInfoWindowClick(rVar);
    }

    @Override // S6.C2197c.l
    public boolean onMarkerClick(r rVar) {
        return h().onMarkerClick(rVar);
    }
}
