package u8;

import java.io.File;

/* JADX INFO: renamed from: u8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5985b extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8.F f45321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f45323c;

    public C5985b(x8.F f10, String str, File file) {
        if (f10 == null) {
            throw new NullPointerException("Null report");
        }
        this.f45321a = f10;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f45322b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f45323c = file;
    }

    @Override // u8.E
    public x8.F b() {
        return this.f45321a;
    }

    @Override // u8.E
    public File c() {
        return this.f45323c;
    }

    @Override // u8.E
    public String d() {
        return this.f45322b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof E) {
            E e10 = (E) obj;
            if (this.f45321a.equals(e10.b()) && this.f45322b.equals(e10.d()) && this.f45323c.equals(e10.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f45323c.hashCode() ^ ((((this.f45321a.hashCode() ^ 1000003) * 1000003) ^ this.f45322b.hashCode()) * 1000003);
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f45321a + ", sessionId=" + this.f45322b + ", reportFile=" + this.f45323c + "}";
    }
}
