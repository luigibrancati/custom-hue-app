package W1;

import W1.f;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeSet f17726a = new TreeSet(new Comparator() { // from class: W1.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return f.c(((f.a) obj).f17730a.f17713g, ((f.a) obj2).f17730a.f17713g);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17729d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f17730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17731b;

        public a(d dVar, long j10) {
            this.f17730a = dVar;
            this.f17731b = j10;
        }
    }

    public f() {
        f();
    }

    public static int c(int i10, int i11) {
        int iMin;
        int i12 = i10 - i11;
        return (Math.abs(i12) <= 1000 || (iMin = (Math.min(i10, i11) - Math.max(i10, i11)) + 65535) >= 1000) ? i12 : i10 < i11 ? iMin : -iMin;
    }

    public final synchronized void b(a aVar) {
        this.f17727b = aVar.f17730a.f17713g;
        this.f17726a.add(aVar);
    }

    public synchronized boolean d(d dVar, long j10) {
        if (this.f17726a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i10 = dVar.f17713g;
        if (!this.f17729d) {
            f();
            this.f17728c = d.c(i10);
            this.f17729d = true;
            b(new a(dVar, j10));
            return true;
        }
        if (Math.abs(c(i10, d.b(this.f17727b))) < 1000) {
            if (c(i10, this.f17728c) <= 0) {
                return false;
            }
            b(new a(dVar, j10));
            return true;
        }
        this.f17728c = d.c(i10);
        this.f17726a.clear();
        b(new a(dVar, j10));
        return true;
    }

    public synchronized d e(long j10) {
        if (this.f17726a.isEmpty()) {
            return null;
        }
        a aVar = (a) this.f17726a.first();
        int i10 = aVar.f17730a.f17713g;
        if (i10 != d.b(this.f17728c) && j10 < aVar.f17731b) {
            return null;
        }
        this.f17726a.pollFirst();
        this.f17728c = i10;
        return aVar.f17730a;
    }

    public synchronized void f() {
        this.f17726a.clear();
        this.f17729d = false;
        this.f17728c = -1;
        this.f17727b = -1;
    }
}
