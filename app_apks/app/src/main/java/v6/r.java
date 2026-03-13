package v6;

import android.os.Bundle;
import t6.C5843a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class r implements C5843a.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f45878c = a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45879b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f45880a;

        public /* synthetic */ a(byte[] bArr) {
        }

        public r a() {
            return new r(this.f45880a, null);
        }

        public a b(String str) {
            this.f45880a = str;
            return this;
        }
    }

    public /* synthetic */ r(String str, byte[] bArr) {
        this.f45879b = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f45879b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            return AbstractC6055j.a(this.f45879b, ((r) obj).f45879b);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC6055j.b(this.f45879b);
    }
}
