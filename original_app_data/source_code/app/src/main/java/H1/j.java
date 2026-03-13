package H1;

import G1.AbstractC0853a;
import G1.C;
import G1.M;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f5242b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f5243c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityQueue f5244d = new PriorityQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5245e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f5246f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f5248b = -9223372036854775807L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f5247a = new ArrayList();

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f5248b, aVar.f5248b);
        }

        public void b(long j10, C c10) {
            AbstractC0853a.a(j10 != -9223372036854775807L);
            AbstractC0853a.g(this.f5247a.isEmpty());
            this.f5248b = j10;
            this.f5247a.add(c10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(long j10, C c10);
    }

    public j(b bVar) {
        this.f5241a = bVar;
    }

    public void a(long j10, C c10) {
        int i10 = this.f5245e;
        if (i10 == 0 || (i10 != -1 && this.f5244d.size() >= this.f5245e && j10 < ((a) M.i((a) this.f5244d.peek())).f5248b)) {
            this.f5241a.a(j10, c10);
            return;
        }
        C c11 = c(c10);
        a aVar = this.f5246f;
        if (aVar != null && j10 == aVar.f5248b) {
            aVar.f5247a.add(c11);
            return;
        }
        a aVar2 = this.f5243c.isEmpty() ? new a() : (a) this.f5243c.pop();
        aVar2.b(j10, c11);
        this.f5244d.add(aVar2);
        this.f5246f = aVar2;
        int i11 = this.f5245e;
        if (i11 != -1) {
            e(i11);
        }
    }

    public void b() {
        this.f5244d.clear();
    }

    public final C c(C c10) {
        C c11 = this.f5242b.isEmpty() ? new C() : (C) this.f5242b.pop();
        c11.W(c10.a());
        System.arraycopy(c10.f(), c10.g(), c11.f(), 0, c11.a());
        return c11;
    }

    public void d() {
        e(0);
    }

    public final void e(int i10) {
        while (this.f5244d.size() > i10) {
            a aVar = (a) M.i((a) this.f5244d.poll());
            for (int i11 = 0; i11 < aVar.f5247a.size(); i11++) {
                this.f5241a.a(aVar.f5248b, (C) aVar.f5247a.get(i11));
                this.f5242b.push((C) aVar.f5247a.get(i11));
            }
            aVar.f5247a.clear();
            a aVar2 = this.f5246f;
            if (aVar2 != null && aVar2.f5248b == aVar.f5248b) {
                this.f5246f = null;
            }
            this.f5243c.push(aVar);
        }
    }

    public int f() {
        return this.f5245e;
    }

    public void g(int i10) {
        AbstractC0853a.g(i10 >= 0);
        this.f5245e = i10;
        e(i10);
    }
}
