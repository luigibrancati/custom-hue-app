package Jd;

import gc.AbstractC4190c;
import gc.C4204q;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6396c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f6397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6398b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC4190c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6399c = -1;

        public b() {
        }

        @Override // gc.AbstractC4190c
        public void a() {
            do {
                int i10 = this.f6399c + 1;
                this.f6399c = i10;
                if (i10 >= d.this.f6397a.length) {
                    break;
                }
            } while (d.this.f6397a[this.f6399c] == null);
            if (this.f6399c >= d.this.f6397a.length) {
                b();
                return;
            }
            Object obj = d.this.f6397a[this.f6399c];
            AbstractC4862t.c(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            c(obj);
        }
    }

    public d(Object[] objArr, int i10) {
        super(null);
        this.f6397a = objArr;
        this.f6398b = i10;
    }

    private final void f(int i10) {
        Object[] objArr = this.f6397a;
        if (objArr.length <= i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            AbstractC4862t.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f6397a = objArrCopyOf;
        }
    }

    @Override // Jd.c
    public int c() {
        return this.f6398b;
    }

    @Override // Jd.c
    public void d(int i10, Object value) {
        AbstractC4862t.e(value, "value");
        f(i10);
        if (this.f6397a[i10] == null) {
            this.f6398b = c() + 1;
        }
        this.f6397a[i10] = value;
    }

    @Override // Jd.c
    public Object get(int i10) {
        return C4204q.d0(this.f6397a, i10);
    }

    @Override // Jd.c, java.lang.Iterable
    public Iterator iterator() {
        return new b();
    }

    public d() {
        this(new Object[20], 0);
    }
}
