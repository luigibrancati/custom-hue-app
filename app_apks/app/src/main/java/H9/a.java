package H9;

import S6.C2197c;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2197c f5332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5333b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f5334c = new HashMap();

    /* JADX INFO: renamed from: H9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class RunnableC0087a implements Runnable {
        public RunnableC0087a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f5336a = new LinkedHashSet();

        public b() {
        }

        public void a(Object obj) {
            this.f5336a.add(obj);
            a.this.f5334c.put(obj, this);
        }

        public void b() {
            for (Object obj : this.f5336a) {
                a.this.e(obj);
                a.this.f5334c.remove(obj);
            }
            this.f5336a.clear();
        }

        public boolean c(Object obj) {
            if (!this.f5336a.remove(obj)) {
                return false;
            }
            a.this.f5334c.remove(obj);
            a.this.e(obj);
            return true;
        }
    }

    public a(C2197c c2197c) {
        this.f5332a = c2197c;
        new Handler(Looper.getMainLooper()).post(new RunnableC0087a());
    }

    public boolean d(Object obj) {
        b bVar = (b) this.f5334c.get(obj);
        return bVar != null && bVar.c(obj);
    }

    public abstract void e(Object obj);

    public abstract void f();
}
