package D1;

import G1.M;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1432a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue f1433b = new PriorityQueue(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1434c = Integer.MIN_VALUE;

    public void a(int i10) {
        synchronized (this.f1432a) {
            this.f1433b.add(Integer.valueOf(i10));
            this.f1434c = Math.max(this.f1434c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f1432a) {
            this.f1433b.remove(Integer.valueOf(i10));
            this.f1434c = this.f1433b.isEmpty() ? Integer.MIN_VALUE : ((Integer) M.i((Integer) this.f1433b.peek())).intValue();
            this.f1432a.notifyAll();
        }
    }
}
