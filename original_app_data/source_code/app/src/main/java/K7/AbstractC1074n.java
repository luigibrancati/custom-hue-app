package K7;

import java.util.Comparator;

/* JADX INFO: renamed from: K7.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1074n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1074n f7703a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1074n f7704b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1074n f7705c = new b(1);

    /* JADX INFO: renamed from: K7.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC1074n {
        public a() {
            super(null);
        }

        @Override // K7.AbstractC1074n
        public AbstractC1074n d(int i10, int i11) {
            return k(Integer.compare(i10, i11));
        }

        @Override // K7.AbstractC1074n
        public AbstractC1074n e(long j10, long j11) {
            return k(Long.compare(j10, j11));
        }

        @Override // K7.AbstractC1074n
        public AbstractC1074n f(Object obj, Object obj2, Comparator comparator) {
            return k(comparator.compare(obj, obj2));
        }

        @Override // K7.AbstractC1074n
        public AbstractC1074n g(boolean z10, boolean z11) {
            return k(Boolean.compare(z10, z11));
        }

        @Override // K7.AbstractC1074n
        public AbstractC1074n h(boolean z10, boolean z11) {
            return k(Boolean.compare(z11, z10));
        }

        @Override // K7.AbstractC1074n
        public int i() {
            return 0;
        }

        public AbstractC1074n k(int i10) {
            return i10 < 0 ? AbstractC1074n.f7704b : i10 > 0 ? AbstractC1074n.f7705c : AbstractC1074n.f7703a;
        }
    }

    public /* synthetic */ AbstractC1074n(a aVar) {
        this();
    }

    public static AbstractC1074n j() {
        return f7703a;
    }

    public abstract AbstractC1074n d(int i10, int i11);

    public abstract AbstractC1074n e(long j10, long j11);

    public abstract AbstractC1074n f(Object obj, Object obj2, Comparator comparator);

    public abstract AbstractC1074n g(boolean z10, boolean z11);

    public abstract AbstractC1074n h(boolean z10, boolean z11);

    public abstract int i();

    public AbstractC1074n() {
    }

    /* JADX INFO: renamed from: K7.n$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC1074n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7706d;

        public b(int i10) {
            super(null);
            this.f7706d = i10;
        }

        @Override // K7.AbstractC1074n
        public int i() {
            return this.f7706d;
        }

        @Override // K7.AbstractC1074n
        public AbstractC1074n d(int i10, int i11) {
            return this;
        }

        @Override // K7.AbstractC1074n
        public AbstractC1074n e(long j10, long j11) {
            return this;
        }

        @Override // K7.AbstractC1074n
        public AbstractC1074n g(boolean z10, boolean z11) {
            return this;
        }

        @Override // K7.AbstractC1074n
        public AbstractC1074n h(boolean z10, boolean z11) {
            return this;
        }

        @Override // K7.AbstractC1074n
        public AbstractC1074n f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }
    }
}
