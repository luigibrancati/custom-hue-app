package p0;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: p0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5369c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f42070d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42073c;

    /* JADX INFO: renamed from: p0.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC5369c(String str, long j10, int i10, AbstractC4854k abstractC4854k) {
        this(str, j10, i10);
    }

    public final int a() {
        return AbstractC5368b.f(this.f42072b);
    }

    public final int b() {
        return this.f42073c;
    }

    public abstract float c(int i10);

    public abstract float d(int i10);

    public final long e() {
        return this.f42072b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC5369c abstractC5369c = (AbstractC5369c) obj;
        if (this.f42073c == abstractC5369c.f42073c && AbstractC4862t.a(this.f42071a, abstractC5369c.f42071a)) {
            return AbstractC5368b.e(this.f42072b, abstractC5369c.f42072b);
        }
        return false;
    }

    public final String f() {
        return this.f42071a;
    }

    public boolean g() {
        return false;
    }

    public abstract long h(float f10, float f11, float f12);

    public int hashCode() {
        return (((this.f42071a.hashCode() * 31) + AbstractC5368b.g(this.f42072b)) * 31) + this.f42073c;
    }

    public abstract float i(float f10, float f11, float f12);

    public abstract long j(float f10, float f11, float f12, float f13, AbstractC5369c abstractC5369c);

    public String toString() {
        return this.f42071a + " (id=" + this.f42073c + ", model=" + ((Object) AbstractC5368b.h(this.f42072b)) + ')';
    }

    public AbstractC5369c(String str, long j10, int i10) {
        this.f42071a = str;
        this.f42072b = j10;
        this.f42073c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
