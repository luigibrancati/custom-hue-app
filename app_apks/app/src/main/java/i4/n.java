package i4;

import android.graphics.drawable.Drawable;
import i4.j;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f37188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f37189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.a f37190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Drawable drawable, i request, j.a metadata) {
        super(null);
        AbstractC4862t.e(drawable, "drawable");
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(metadata, "metadata");
        this.f37188a = drawable;
        this.f37189b = request;
        this.f37190c = metadata;
    }

    @Override // i4.j
    public Drawable a() {
        return this.f37188a;
    }

    @Override // i4.j
    public i b() {
        return this.f37189b;
    }

    public final j.a c() {
        return this.f37190c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC4862t.a(a(), nVar.a()) && AbstractC4862t.a(b(), nVar.b()) && AbstractC4862t.a(this.f37190c, nVar.f37190c);
    }

    public int hashCode() {
        return (((a().hashCode() * 31) + b().hashCode()) * 31) + this.f37190c.hashCode();
    }

    public String toString() {
        return "SuccessResult(drawable=" + a() + ", request=" + b() + ", metadata=" + this.f37190c + ')';
    }
}
