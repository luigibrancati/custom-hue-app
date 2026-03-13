package T;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f15874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15875c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f15876d;

    public a(int i10, c cVar) {
        this.f15873a = i10;
        this.f15874b = new ArrayDeque(i10);
        this.f15876d = cVar;
    }

    public Object a() {
        Object objRemoveLast;
        synchronized (this.f15875c) {
            objRemoveLast = this.f15874b.removeLast();
        }
        return objRemoveLast;
    }

    public void b(Object obj) {
        Object objA;
        synchronized (this.f15875c) {
            try {
                objA = this.f15874b.size() >= this.f15873a ? a() : null;
                this.f15874b.addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = this.f15876d;
        if (cVar == null || objA == null) {
            return;
        }
        cVar.a(objA);
    }

    public boolean c() {
        boolean zIsEmpty;
        synchronized (this.f15875c) {
            zIsEmpty = this.f15874b.isEmpty();
        }
        return zIsEmpty;
    }
}
