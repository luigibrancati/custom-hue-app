package Bc;

import gc.N;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f808d;

    public h(long j10, long j11, long j12) {
        this.f805a = j12;
        this.f806b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f807c = z10;
        this.f808d = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f807c;
    }

    @Override // gc.N
    public long nextLong() {
        long j10 = this.f808d;
        if (j10 != this.f806b) {
            this.f808d = this.f805a + j10;
            return j10;
        }
        if (!this.f807c) {
            throw new NoSuchElementException();
        }
        this.f807c = false;
        return j10;
    }
}
