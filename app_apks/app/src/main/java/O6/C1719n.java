package O6;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: O6.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1719n implements I8.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H8.e f11751d = new H8.e() { // from class: O6.m
        @Override // H8.b
        public final void a(Object obj, Object obj2) {
            H8.e eVar = C1719n.f11751d;
            throw new H8.c("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f11752a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f11753b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H8.e f11754c = f11751d;

    @Override // I8.b
    public final /* bridge */ /* synthetic */ I8.b a(Class cls, H8.e eVar) {
        this.f11752a.put(cls, eVar);
        this.f11753b.remove(cls);
        return this;
    }

    public final C1726o b() {
        return new C1726o(new HashMap(this.f11752a), new HashMap(this.f11753b), this.f11754c);
    }
}
