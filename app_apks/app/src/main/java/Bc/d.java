package Bc;

import gc.M;
import kotlin.jvm.internal.AbstractC4854k;
import pc.AbstractC5459c;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class d implements Iterable, InterfaceC6184a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f791d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f794c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final d a(int i10, int i11, int i12) {
            return new d(i10, i11, i12);
        }

        public a() {
        }
    }

    public d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f792a = i10;
        this.f793b = AbstractC5459c.c(i10, i11, i12);
        this.f794c = i12;
    }

    public final int c() {
        return this.f792a;
    }

    public final int d() {
        return this.f793b;
    }

    public final int e() {
        return this.f794c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f792a == dVar.f792a && this.f793b == dVar.f793b && this.f794c == dVar.f794c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public M iterator() {
        return new e(this.f792a, this.f793b, this.f794c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f792a * 31) + this.f793b) * 31) + this.f794c;
    }

    public boolean isEmpty() {
        return this.f794c > 0 ? this.f792a > this.f793b : this.f792a < this.f793b;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f794c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f792a);
            sb2.append("..");
            sb2.append(this.f793b);
            sb2.append(" step ");
            i10 = this.f794c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f792a);
            sb2.append(" downTo ");
            sb2.append(this.f793b);
            sb2.append(" step ");
            i10 = -this.f794c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
