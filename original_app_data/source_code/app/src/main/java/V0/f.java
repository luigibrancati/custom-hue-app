package V0;

import V0.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import b0.J;
import b0.t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s3.AbstractC5712a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f17211a = new t(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f17212b = h.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f17213c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J f17214d = new J();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f17216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V0.e f17217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f17218d;

        public a(String str, Context context, V0.e eVar, int i10) {
            this.f17215a = str;
            this.f17216b = context;
            this.f17217c = eVar;
            this.f17218d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f17215a, this.f17216b, List.of(this.f17217c), this.f17218d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements X0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V0.a f17219a;

        public b(V0.a aVar) {
            this.f17219a = aVar;
        }

        @Override // X0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f17219a.b(eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f17221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f17222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f17223d;

        public c(String str, Context context, List list, int i10) {
            this.f17220a = str;
            this.f17221b = context;
            this.f17222c = list;
            this.f17223d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f17220a, this.f17221b, this.f17222c, this.f17223d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements X0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17224a;

        public d(String str) {
            this.f17224a = str;
        }

        @Override // X0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f17213c) {
                try {
                    J j10 = f.f17214d;
                    ArrayList arrayList = (ArrayList) j10.get(this.f17224a);
                    if (arrayList == null) {
                        return;
                    }
                    j10.remove(this.f17224a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((X0.a) arrayList.get(i10)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(List list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((V0.e) list.get(i11)).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        g.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i10 = 0;
            for (g.b bVar : bVarArrC) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    public static e c(String str, Context context, List list, int i10) {
        AbstractC5712a.b("getFontSync");
        try {
            t tVar = f17211a;
            Typeface typeface = (Typeface) tVar.d(str);
            if (typeface != null) {
                return new e(typeface);
            }
            g.a aVarE = V0.d.e(context, list, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceC = aVarE.f() ? O0.d.c(context, null, aVarE.d(), i10) : O0.d.b(context, null, aVarE.c(), i10);
            if (typefaceC == null) {
                return new e(-3);
            }
            tVar.f(str, typefaceC);
            return new e(typefaceC);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            AbstractC5712a.d();
        }
    }

    public static Typeface d(Context context, List list, int i10, Executor executor, V0.a aVar) {
        String strA = a(list, i10);
        Typeface typeface = (Typeface) f17211a.d(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f17213c) {
            try {
                J j10 = f17214d;
                ArrayList arrayList = (ArrayList) j10.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                j10.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = f17212b;
                }
                h.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, V0.e eVar, V0.a aVar, int i10, int i11) {
        String strA = a(List.of(eVar), i10);
        Typeface typeface = (Typeface) f17211a.d(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, List.of(eVar), i10);
            aVar.b(eVarC);
            return eVarC.f17225a;
        }
        try {
            e eVar2 = (e) h.d(f17212b, new a(strA, context, eVar, i10), i11);
            aVar.b(eVar2);
            return eVar2.f17225a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f17225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17226b;

        public e(int i10) {
            this.f17225a = null;
            this.f17226b = i10;
        }

        public boolean a() {
            return this.f17226b == 0;
        }

        public e(Typeface typeface) {
            this.f17225a = typeface;
            this.f17226b = 0;
        }
    }
}
