package M4;

import java.io.File;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f9277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f9278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A4.a f9280g;

    public f(String instanceName, String str, String str2, l identityStorageProvider, File storageDirectory, String fileName, A4.a aVar) {
        AbstractC4862t.e(instanceName, "instanceName");
        AbstractC4862t.e(identityStorageProvider, "identityStorageProvider");
        AbstractC4862t.e(storageDirectory, "storageDirectory");
        AbstractC4862t.e(fileName, "fileName");
        this.f9274a = instanceName;
        this.f9275b = str;
        this.f9276c = str2;
        this.f9277d = identityStorageProvider;
        this.f9278e = storageDirectory;
        this.f9279f = fileName;
        this.f9280g = aVar;
    }

    public final String a() {
        return this.f9275b;
    }

    public final String b() {
        return this.f9276c;
    }

    public final String c() {
        return this.f9279f;
    }

    public final l d() {
        return this.f9277d;
    }

    public final String e() {
        return this.f9274a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC4862t.a(this.f9274a, fVar.f9274a) && AbstractC4862t.a(this.f9275b, fVar.f9275b) && AbstractC4862t.a(this.f9276c, fVar.f9276c) && AbstractC4862t.a(this.f9277d, fVar.f9277d) && AbstractC4862t.a(this.f9278e, fVar.f9278e) && AbstractC4862t.a(this.f9279f, fVar.f9279f) && AbstractC4862t.a(this.f9280g, fVar.f9280g);
    }

    public final A4.a f() {
        return this.f9280g;
    }

    public final File g() {
        return this.f9278e;
    }

    public int hashCode() {
        int iHashCode = this.f9274a.hashCode() * 31;
        String str = this.f9275b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9276c;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f9277d.hashCode()) * 31) + this.f9278e.hashCode()) * 31) + this.f9279f.hashCode()) * 31;
        A4.a aVar = this.f9280g;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "IdentityConfiguration(instanceName=" + this.f9274a + ", apiKey=" + this.f9275b + ", experimentApiKey=" + this.f9276c + ", identityStorageProvider=" + this.f9277d + ", storageDirectory=" + this.f9278e + ", fileName=" + this.f9279f + ", logger=" + this.f9280g + ')';
    }

    public /* synthetic */ f(String str, String str2, String str3, l lVar, File file, String str4, A4.a aVar, int i10, AbstractC4854k abstractC4854k) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, lVar, file, str4, (i10 & 64) != 0 ? null : aVar);
    }
}
