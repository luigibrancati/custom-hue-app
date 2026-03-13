package e6;

import b6.AbstractC2844m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: e6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3940a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3940a f33747e = new C0423a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3945f f33748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f33749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3941b f33750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f33751d;

    /* JADX INFO: renamed from: e6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0423a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C3945f f33752a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f33753b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C3941b f33754c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f33755d = "";

        public C0423a a(C3943d c3943d) {
            this.f33753b.add(c3943d);
            return this;
        }

        public C3940a b() {
            return new C3940a(this.f33752a, Collections.unmodifiableList(this.f33753b), this.f33754c, this.f33755d);
        }

        public C0423a c(String str) {
            this.f33755d = str;
            return this;
        }

        public C0423a d(C3941b c3941b) {
            this.f33754c = c3941b;
            return this;
        }

        public C0423a e(C3945f c3945f) {
            this.f33752a = c3945f;
            return this;
        }
    }

    public C3940a(C3945f c3945f, List list, C3941b c3941b, String str) {
        this.f33748a = c3945f;
        this.f33749b = list;
        this.f33750c = c3941b;
        this.f33751d = str;
    }

    public static C0423a e() {
        return new C0423a();
    }

    public String a() {
        return this.f33751d;
    }

    public C3941b b() {
        return this.f33750c;
    }

    public List c() {
        return this.f33749b;
    }

    public C3945f d() {
        return this.f33748a;
    }

    public byte[] f() {
        return AbstractC2844m.a(this);
    }
}
