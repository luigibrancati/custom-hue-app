package z7;

import A7.E;
import A7.H;
import A7.I;
import A7.N;
import B7.AbstractC0703k;
import B7.C0696d;
import B7.C0699g;
import B7.C0701i;
import B7.C0714w;
import B7.InterfaceC0702j;
import B7.c0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: z7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6529a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference f48799e = new AtomicReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6535g f48800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A7.t f48801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f48802c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C6531c f48803d;

    public C6529a(Context context) {
        try {
            C6535g c6535g = new C6535g(context);
            this.f48800a = c6535g;
            this.f48803d = new C6531c(c6535g);
            this.f48801b = new A7.t(context);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new C0714w("Failed to initialize FileStorage", e10);
        }
    }

    public static boolean a(Context context) {
        return j(context, false);
    }

    public static boolean e(Context context) {
        return j(context, true);
    }

    public static boolean f() {
        return f48799e.get() != null;
    }

    public static boolean j(Context context, boolean z10) {
        boolean z11;
        final Context context2;
        if (k()) {
            return false;
        }
        AtomicReference atomicReference = f48799e;
        C6529a c6529a = new C6529a(context);
        while (true) {
            if (T1.e.a(atomicReference, null, c6529a)) {
                z11 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z11 = false;
                break;
            }
        }
        C6529a c6529a2 = (C6529a) f48799e.get();
        if (z11) {
            context2 = context;
            E.INSTANCE.a(new C0699g(context2, AbstractC6534f.a(), new C0701i(context, c6529a2.f48800a, new C0696d()), c6529a2.f48800a, new C6549u()));
            H.b(new C6546r(c6529a2));
            AbstractC6534f.a().execute(new Runnable() { // from class: z7.q
                @Override // java.lang.Runnable
                public final void run() {
                    Context context3 = context2;
                    AtomicReference atomicReference2 = C6529a.f48799e;
                    try {
                        N.h(context3).c(true);
                    } catch (SecurityException unused) {
                        Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    }
                }
            });
        } else {
            context2 = context;
        }
        try {
            c6529a2.i(context2, z10);
            return true;
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error installing additional splits", e10);
            return false;
        }
    }

    public static boolean k() {
        return false;
    }

    public final Set g() {
        HashSet hashSet;
        synchronized (this.f48802c) {
            hashSet = new HashSet(this.f48802c);
        }
        return hashSet;
    }

    public final void h(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C6535g.l(this.f48800a.g((String) it.next()));
        }
        this.f48801b.b();
    }

    public final synchronized void i(Context context, boolean z10) {
        ZipFile zipFile;
        try {
            if (z10) {
                this.f48800a.k();
            } else {
                AbstractC6534f.a().execute(new RunnableC6547s(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                Set<AbstractC6550v> setJ = this.f48800a.j();
                Set setA = this.f48801b.a();
                HashSet hashSet = new HashSet();
                Iterator it = setJ.iterator();
                while (it.hasNext()) {
                    String strB = ((AbstractC6550v) it.next()).b();
                    if (arrayList.contains(strB) || setA.contains(I.a(strB))) {
                        hashSet.add(strB);
                        it.remove();
                    }
                }
                if (z10) {
                    h(hashSet);
                } else if (!hashSet.isEmpty()) {
                    AbstractC6534f.a().execute(new RunnableC6548t(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = setJ.iterator();
                while (it2.hasNext()) {
                    String strB2 = ((AbstractC6550v) it2.next()).b();
                    if (!I.c(strB2)) {
                        hashSet2.add(strB2);
                    }
                }
                for (String str : arrayList) {
                    if (!I.c(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<AbstractC6550v> hashSet3 = new HashSet(setJ.size());
                for (AbstractC6550v abstractC6550v : setJ) {
                    String strB3 = abstractC6550v.b();
                    c0 c0Var = I.f169c;
                    if (strB3.startsWith("config.") || hashSet2.contains(I.a(abstractC6550v.b()))) {
                        hashSet3.add(abstractC6550v);
                    }
                }
                C6544p c6544p = new C6544p(this.f48800a);
                InterfaceC0702j interfaceC0702jA = AbstractC0703k.a();
                ClassLoader classLoader = context.getClassLoader();
                if (z10) {
                    interfaceC0702jA.b(classLoader, c6544p.c());
                } else {
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        Set setB = c6544p.b((AbstractC6550v) it3.next());
                        if (setB == null) {
                            it3.remove();
                        } else {
                            interfaceC0702jA.b(classLoader, setB);
                        }
                    }
                }
                HashSet hashSet4 = new HashSet();
                for (AbstractC6550v abstractC6550v2 : hashSet3) {
                    try {
                        zipFile = new ZipFile(abstractC6550v2.a());
                        try {
                            ZipEntry entry = zipFile.getEntry("classes.dex");
                            zipFile.close();
                            if (entry == null || interfaceC0702jA.a(classLoader, this.f48800a.a(abstractC6550v2.b()), abstractC6550v2.a(), z10)) {
                                hashSet4.add(abstractC6550v2.a());
                            } else {
                                Log.w("SplitCompat", "split was not installed ".concat(abstractC6550v2.a().toString()));
                            }
                        } catch (IOException e10) {
                            e = e10;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e11) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e11);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw e;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        zipFile = null;
                    }
                }
                this.f48803d.a(context, hashSet4);
                HashSet hashSet5 = new HashSet();
                for (AbstractC6550v abstractC6550v3 : hashSet3) {
                    if (hashSet4.contains(abstractC6550v3.a())) {
                        Log.d("SplitCompat", "Split '" + abstractC6550v3.b() + "' installation emulated");
                        hashSet5.add(abstractC6550v3.b());
                    } else {
                        Log.d("SplitCompat", "Split '" + abstractC6550v3.b() + "' installation not emulated.");
                    }
                }
                synchronized (this.f48802c) {
                    this.f48802c.addAll(hashSet5);
                }
            } catch (PackageManager.NameNotFoundException e13) {
                throw new IOException(String.format("Cannot load data for application '%s'", packageName), e13);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
