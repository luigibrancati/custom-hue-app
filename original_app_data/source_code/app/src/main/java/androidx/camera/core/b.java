package androidx.camera.core;

import E.InterfaceC0787f0;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f21983b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21982a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f21984c = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(d dVar);
    }

    public b(d dVar) {
        this.f21983b = dVar;
    }

    @Override // androidx.camera.core.d
    public InterfaceC0787f0 L0() {
        return this.f21983b.L0();
    }

    @Override // androidx.camera.core.d
    public Image S0() {
        return this.f21983b.S0();
    }

    public void a(a aVar) {
        synchronized (this.f21982a) {
            this.f21984c.add(aVar);
        }
    }

    public void b() {
        HashSet hashSet;
        synchronized (this.f21982a) {
            hashSet = new HashSet(this.f21984c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this);
        }
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        this.f21983b.close();
        b();
    }

    @Override // androidx.camera.core.d
    public int getFormat() {
        return this.f21983b.getFormat();
    }

    @Override // androidx.camera.core.d
    public int getHeight() {
        return this.f21983b.getHeight();
    }

    @Override // androidx.camera.core.d
    public int getWidth() {
        return this.f21983b.getWidth();
    }

    @Override // androidx.camera.core.d
    public d.a[] n0() {
        return this.f21983b.n0();
    }

    @Override // androidx.camera.core.d
    public void setCropRect(Rect rect) {
        this.f21983b.setCropRect(rect);
    }
}
