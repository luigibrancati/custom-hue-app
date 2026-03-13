package p3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s3.AbstractC5712a;

/* JADX INFO: renamed from: p3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5386a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C5386a f42177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f42178e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f42181c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f42180b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f42179a = new HashMap();

    public C5386a(Context context) {
        this.f42181c = context.getApplicationContext();
    }

    public static C5386a e(Context context) {
        if (f42177d == null) {
            synchronized (f42178e) {
                try {
                    if (f42177d == null) {
                        f42177d = new C5386a(context);
                    }
                } finally {
                }
            }
        }
        return f42177d;
    }

    public void a(Bundle bundle) {
        String string = this.f42181c.getString(c.f42182a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f42180b.add(cls);
                        }
                    }
                }
                Iterator it = this.f42180b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new d(e10);
            }
        }
    }

    public void b(Class cls) {
        try {
            try {
                AbstractC5712a.b("Startup");
                a(this.f42181c.getPackageManager().getProviderInfo(new ComponentName(this.f42181c, (Class<?>) cls), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new d(e10);
            }
        } finally {
            AbstractC5712a.d();
        }
    }

    public Object c(Class cls) {
        Object objD;
        synchronized (f42178e) {
            try {
                objD = this.f42179a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public final Object d(Class cls, Set set) {
        Object objB;
        if (AbstractC5712a.e()) {
            try {
                AbstractC5712a.b(cls.getSimpleName());
            } finally {
                AbstractC5712a.d();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f42179a.containsKey(cls)) {
            objB = this.f42179a.get(cls);
        } else {
            set.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f42179a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objB = bVar.b(this.f42181c);
                set.remove(cls);
                this.f42179a.put(cls, objB);
            } catch (Throwable th) {
                throw new d(th);
            }
        }
        return objB;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f42180b.contains(cls);
    }
}
