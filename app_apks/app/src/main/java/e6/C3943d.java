package e6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: e6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3943d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3943d f33764c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f33766b;

    /* JADX INFO: renamed from: e6.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f33767a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f33768b = new ArrayList();

        public C3943d a() {
            return new C3943d(this.f33767a, Collections.unmodifiableList(this.f33768b));
        }

        public a b(List list) {
            this.f33768b = list;
            return this;
        }

        public a c(String str) {
            this.f33767a = str;
            return this;
        }
    }

    public C3943d(String str, List list) {
        this.f33765a = str;
        this.f33766b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f33766b;
    }

    public String b() {
        return this.f33765a;
    }
}
