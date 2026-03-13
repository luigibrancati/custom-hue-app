package z7;

import java.io.File;

/* JADX INFO: renamed from: z7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6532d extends AbstractC6550v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f48805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48806b;

    public C6532d(File file, String str) {
        if (file == null) {
            throw new NullPointerException("Null splitFile");
        }
        this.f48805a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f48806b = str;
    }

    @Override // z7.AbstractC6550v
    public final File a() {
        return this.f48805a;
    }

    @Override // z7.AbstractC6550v
    public final String b() {
        return this.f48806b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6550v) {
            AbstractC6550v abstractC6550v = (AbstractC6550v) obj;
            if (this.f48805a.equals(abstractC6550v.a()) && this.f48806b.equals(abstractC6550v.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f48806b.hashCode() ^ ((this.f48805a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SplitFileInfo{splitFile=" + this.f48805a.toString() + ", splitId=" + this.f48806b + "}";
    }
}
