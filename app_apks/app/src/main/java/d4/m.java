package d4;

import Fe.InterfaceC0845g;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC3823f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0845g f33125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c4.b f33127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC0845g source, String str, c4.b dataSource) {
        super(null);
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(dataSource, "dataSource");
        this.f33125a = source;
        this.f33126b = str;
        this.f33127c = dataSource;
    }

    public final c4.b a() {
        return this.f33127c;
    }

    public final String b() {
        return this.f33126b;
    }

    public final InterfaceC0845g c() {
        return this.f33125a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC4862t.a(this.f33125a, mVar.f33125a) && AbstractC4862t.a(this.f33126b, mVar.f33126b) && this.f33127c == mVar.f33127c;
    }

    public int hashCode() {
        int iHashCode = this.f33125a.hashCode() * 31;
        String str = this.f33126b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f33127c.hashCode();
    }

    public String toString() {
        return "SourceResult(source=" + this.f33125a + ", mimeType=" + ((Object) this.f33126b) + ", dataSource=" + this.f33127c + ')';
    }
}
