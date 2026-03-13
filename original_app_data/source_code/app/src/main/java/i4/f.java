package i4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f37104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f37105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f37106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Drawable drawable, i request, Throwable throwable) {
        super(null);
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(throwable, "throwable");
        this.f37104a = drawable;
        this.f37105b = request;
        this.f37106c = throwable;
    }

    @Override // i4.j
    public Drawable a() {
        return this.f37104a;
    }

    @Override // i4.j
    public i b() {
        return this.f37105b;
    }

    public final Throwable c() {
        return this.f37106c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC4862t.a(a(), fVar.a()) && AbstractC4862t.a(b(), fVar.b()) && AbstractC4862t.a(this.f37106c, fVar.f37106c);
    }

    public int hashCode() {
        return ((((a() == null ? 0 : a().hashCode()) * 31) + b().hashCode()) * 31) + this.f37106c.hashCode();
    }

    public String toString() {
        return "ErrorResult(drawable=" + a() + ", request=" + b() + ", throwable=" + this.f37106c + ')';
    }
}
