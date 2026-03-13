package Ub;

import Mb.g;
import Yb.j;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends AtomicReferenceArray implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Integer f16818f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecognitionOptions.AZTEC);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f16820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f16822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16823e;

    public b(int i10) {
        super(j.a(i10));
        this.f16819a = length() - 1;
        this.f16820b = new AtomicLong();
        this.f16822d = new AtomicLong();
        this.f16823e = Math.min(i10 / 4, f16818f.intValue());
    }

    public int a(long j10) {
        return this.f16819a & ((int) j10);
    }

    public int b(long j10, int i10) {
        return ((int) j10) & i10;
    }

    public Object c(int i10) {
        return get(i10);
    }

    @Override // Mb.h
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public void d(long j10) {
        this.f16822d.lazySet(j10);
    }

    public void e(int i10, Object obj) {
        lazySet(i10, obj);
    }

    public void f(long j10) {
        this.f16820b.lazySet(j10);
    }

    @Override // Mb.h
    public boolean isEmpty() {
        return this.f16820b.get() == this.f16822d.get();
    }

    @Override // Mb.h
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.f16819a;
        long j10 = this.f16820b.get();
        int iB = b(j10, i10);
        if (j10 >= this.f16821c) {
            long j11 = ((long) this.f16823e) + j10;
            if (c(b(j11, i10)) == null) {
                this.f16821c = j11;
            } else if (c(iB) != null) {
                return false;
            }
        }
        e(iB, obj);
        f(j10 + 1);
        return true;
    }

    @Override // Mb.g, Mb.h
    public Object poll() {
        long j10 = this.f16822d.get();
        int iA = a(j10);
        Object objC = c(iA);
        if (objC == null) {
            return null;
        }
        d(j10 + 1);
        e(iA, null);
        return objC;
    }
}
