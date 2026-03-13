package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import r.C5522b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class u extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5522b f23489a = new C5522b();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2763t f23490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f23491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23492c = -1;

        public a(AbstractC2763t abstractC2763t, x xVar) {
            this.f23490a = abstractC2763t;
            this.f23491b = xVar;
        }

        public void a() {
            this.f23490a.observeForever(this);
        }

        @Override // androidx.lifecycle.x
        public void b(Object obj) {
            if (this.f23492c != this.f23490a.getVersion()) {
                this.f23492c = this.f23490a.getVersion();
                this.f23491b.b(obj);
            }
        }

        public void c() {
            this.f23490a.removeObserver(this);
        }
    }

    public void b(AbstractC2763t abstractC2763t, x xVar) {
        if (abstractC2763t == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar = new a(abstractC2763t, xVar);
        a aVar2 = (a) this.f23489a.k(abstractC2763t, aVar);
        if (aVar2 != null && aVar2.f23491b != xVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar2 == null && hasActiveObservers()) {
            aVar.a();
        }
    }

    public void c(AbstractC2763t abstractC2763t) {
        a aVar = (a) this.f23489a.l(abstractC2763t);
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // androidx.lifecycle.AbstractC2763t
    public void onActive() {
        Iterator it = this.f23489a.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).a();
        }
    }

    @Override // androidx.lifecycle.AbstractC2763t
    public void onInactive() {
        Iterator it = this.f23489a.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).c();
        }
    }
}
