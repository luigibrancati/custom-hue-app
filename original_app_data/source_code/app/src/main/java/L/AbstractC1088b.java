package L;

import E.C0813t;
import L.P0;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: L.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1088b implements P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f8007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f8008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8009e;

    /* JADX INFO: renamed from: L.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f8010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final P0.a f8011b;

        public a(Executor executor, P0.a aVar) {
            this.f8010a = executor;
            this.f8011b = aVar;
        }
    }

    public AbstractC1088b() {
        this(Collections.EMPTY_LIST);
    }

    public static /* synthetic */ void d(Throwable th, a aVar, List list) {
        if (th != null) {
            aVar.f8011b.onError(th);
        } else {
            aVar.f8011b.a(list);
        }
    }

    @Override // L.P0
    public void a(P0.a aVar) {
        a aVar2;
        X0.h.g(aVar);
        Iterator it = this.f8006b.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            } else {
                aVar2 = (a) it.next();
                if (aVar2.f8011b.equals(aVar)) {
                    break;
                }
            }
        }
        if (aVar2 != null) {
            this.f8006b.remove(aVar2);
        }
        synchronized (this.f8005a) {
            try {
                if (this.f8009e && this.f8006b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                    this.f8009e = false;
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L.P0
    public void c(Executor executor, P0.a aVar) {
        List listUnmodifiableList;
        Throwable th;
        X0.h.g(executor);
        X0.h.g(aVar);
        this.f8006b.add(new a(executor, aVar));
        synchronized (this.f8005a) {
            try {
                if (!this.f8009e && !this.f8006b.isEmpty()) {
                    Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                    this.f8009e = true;
                    f();
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f8007c);
                th = this.f8008d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(new a(executor, aVar), listUnmodifiableList, th);
    }

    public final void e(final a aVar, final List list, final Throwable th) {
        aVar.f8010a.execute(new Runnable() { // from class: L.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1088b.d(th, aVar, list);
            }
        });
    }

    public abstract void f();

    public abstract void g();

    public void h(List list) {
        j(list, null);
    }

    public void i(Throwable th) {
        j(null, th);
    }

    public final void j(List list, Throwable th) {
        boolean z10;
        List listUnmodifiableList;
        Throwable th2;
        synchronized (this.f8005a) {
            try {
                if (th != null) {
                    z10 = this.f8008d == null || !this.f8007c.isEmpty();
                    this.f8008d = th;
                    this.f8007c = Collections.EMPTY_LIST;
                } else {
                    X0.h.g(list);
                    boolean z11 = (this.f8008d == null && this.f8007c.equals(list)) ? false : true;
                    this.f8008d = null;
                    this.f8007c = list;
                    z10 = z11;
                }
                listUnmodifiableList = Collections.unmodifiableList(this.f8007c);
                th2 = this.f8008d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Data changed. Notifying ");
            sb2.append(this.f8006b.size());
            sb2.append(" observers. Error: ");
            sb2.append(th2 != null);
            Log.d("CameraPresenceSrc", sb2.toString());
            Iterator it = this.f8006b.iterator();
            while (it.hasNext()) {
                e((a) it.next(), listUnmodifiableList, th2);
            }
        }
    }

    public AbstractC1088b(List list) {
        this.f8005a = new Object();
        this.f8006b = new CopyOnWriteArrayList();
        this.f8008d = null;
        this.f8009e = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C0813t.a((String) it.next()));
        }
        this.f8007c = arrayList;
    }
}
