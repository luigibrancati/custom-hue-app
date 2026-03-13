package g4;

import android.graphics.Bitmap;
import g4.o;
import gc.C4179C;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class q implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f35501c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f35502a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35503b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f35504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f35505b;

        public b(Bitmap bitmap, boolean z10) {
            AbstractC4862t.e(bitmap, "bitmap");
            this.f35504a = bitmap;
            this.f35505b = z10;
        }

        @Override // g4.o.a
        public Bitmap getBitmap() {
            return this.f35504a;
        }

        @Override // g4.o.a
        public boolean isSampled() {
            return this.f35505b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference f35507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f35508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f35509d;

        public c(int i10, WeakReference bitmap, boolean z10, int i11) {
            AbstractC4862t.e(bitmap, "bitmap");
            this.f35506a = i10;
            this.f35507b = bitmap;
            this.f35508c = z10;
            this.f35509d = i11;
        }

        public final WeakReference a() {
            return this.f35507b;
        }

        public final int b() {
            return this.f35506a;
        }

        public final int c() {
            return this.f35509d;
        }

        public final boolean d() {
            return this.f35508c;
        }
    }

    public q(n4.l lVar) {
    }

    @Override // g4.x
    public synchronized void a(int i10) {
        if (i10 >= 10 && i10 != 20) {
            e();
        }
    }

    @Override // g4.x
    public synchronized o.a b(l key) {
        try {
            AbstractC4862t.e(key, "key");
            ArrayList arrayList = (ArrayList) this.f35502a.get(key);
            b bVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size() - 1;
            if (size >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    c cVar = (c) arrayList.get(i10);
                    Bitmap bitmap = (Bitmap) cVar.a().get();
                    b bVar2 = bitmap == null ? null : new b(bitmap, cVar.d());
                    if (bVar2 != null) {
                        bVar = bVar2;
                        break;
                    }
                    if (i11 > size) {
                        break;
                    }
                    i10 = i11;
                }
            }
            f();
            return bVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g4.x
    public synchronized void c(l key, Bitmap bitmap, boolean z10, int i10) {
        try {
            AbstractC4862t.e(key, "key");
            AbstractC4862t.e(bitmap, "bitmap");
            HashMap map = this.f35502a;
            Object arrayList = map.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(key, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            c cVar = new c(iIdentityHashCode, new WeakReference(bitmap), z10, i10);
            int size = arrayList2.size() - 1;
            if (size >= 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    Object obj = arrayList2.get(i11);
                    AbstractC4862t.d(obj, "values[index]");
                    c cVar2 = (c) obj;
                    if (i10 >= cVar2.c()) {
                        if (cVar2.b() == iIdentityHashCode && cVar2.a().get() == bitmap) {
                            arrayList2.set(i11, cVar);
                        } else {
                            arrayList2.add(i11, cVar);
                        }
                    } else if (i12 > size) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            } else {
                arrayList2.add(cVar);
            }
            f();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g4.x
    public synchronized boolean d(Bitmap bitmap) {
        boolean z10;
        try {
            AbstractC4862t.e(bitmap, "bitmap");
            int iIdentityHashCode = System.identityHashCode(bitmap);
            Collection collectionValues = g().values();
            AbstractC4862t.d(collectionValues, "cache.values");
            Iterator it = collectionValues.iterator();
            loop0: while (true) {
                z10 = false;
                int i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                ArrayList arrayList = (ArrayList) it.next();
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        if (((c) arrayList.get(i10)).b() == iIdentityHashCode) {
                            arrayList.remove(i10);
                            z10 = true;
                            break loop0;
                        }
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            }
            f();
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    public final void e() {
        this.f35503b = 0;
        Iterator it = this.f35502a.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC4862t.d(next, "iterator.next()");
            ArrayList arrayList = (ArrayList) next;
            if (arrayList.size() <= 1) {
                c cVar = (c) C4179C.j0(arrayList);
                if ((cVar == null ? null : (Bitmap) cVar.a().get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        int i12 = i10 + 1;
                        int i13 = i10 - i11;
                        if (((c) arrayList.get(i13)).a().get() == null) {
                            arrayList.remove(i13);
                            i11++;
                        }
                        if (i12 > size) {
                            break;
                        } else {
                            i10 = i12;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public final void f() {
        int i10 = this.f35503b;
        this.f35503b = i10 + 1;
        if (i10 >= 10) {
            e();
        }
    }

    public final HashMap g() {
        return this.f35502a;
    }
}
