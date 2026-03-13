package b3;

import fc.C4015H;
import gc.C4202o;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f25184a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f25185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f25186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25187d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NO_OP = new a("NO_OP", 0);
        public static final a ADD = new a("ADD", 1);
        public static final a REMOVE = new a("REMOVE", 2);

        static {
            a[] aVarArrA = a();
            $VALUES = aVarArrA;
            $ENTRIES = AbstractC5277b.a(aVarArrA);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{NO_OP, ADD, REMOVE};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public k(int i10) {
        this.f25185b = new long[i10];
        this.f25186c = new boolean[i10];
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f25184a;
        reentrantLock.lock();
        try {
            this.f25187d = true;
            C4015H c4015h = C4015H.f34254a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final a[] b() {
        a aVar;
        ReentrantLock reentrantLock = this.f25184a;
        reentrantLock.lock();
        try {
            if (!this.f25187d) {
                reentrantLock.unlock();
                return null;
            }
            this.f25187d = false;
            int length = this.f25185b.length;
            a[] aVarArr = new a[length];
            int i10 = 0;
            boolean z10 = false;
            while (i10 < length) {
                boolean z11 = true;
                boolean z12 = this.f25185b[i10] > 0;
                boolean[] zArr = this.f25186c;
                if (z12 != zArr[i10]) {
                    zArr[i10] = z12;
                    aVar = z12 ? a.ADD : a.REMOVE;
                } else {
                    z11 = z10;
                    aVar = a.NO_OP;
                }
                aVarArr[i10] = aVar;
                i10++;
                z10 = z11;
            }
            a[] aVarArr2 = z10 ? aVarArr : null;
            reentrantLock.unlock();
            return aVarArr2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c(int[] tableIds) {
        AbstractC4862t.e(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.f25184a;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.f25185b;
                long j10 = jArr[i10];
                jArr[i10] = 1 + j10;
                if (j10 == 0) {
                    z10 = true;
                    this.f25187d = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean d(int[] tableIds) {
        AbstractC4862t.e(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.f25184a;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.f25185b;
                long j10 = jArr[i10];
                jArr[i10] = j10 - 1;
                if (j10 == 1) {
                    z10 = true;
                    this.f25187d = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e() {
        ReentrantLock reentrantLock = this.f25184a;
        reentrantLock.lock();
        try {
            C4202o.B(this.f25186c, false, 0, 0, 6, null);
            this.f25187d = true;
            C4015H c4015h = C4015H.f34254a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
