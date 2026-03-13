package N6;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U1 implements I8.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H8.e f10075d = new H8.e() { // from class: N6.T1
        @Override // H8.b
        public final void a(Object obj, Object obj2) {
            H8.e eVar = U1.f10075d;
            throw new H8.c("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10076a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10077b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H8.e f10078c = f10075d;

    @Override // I8.b
    public final /* bridge */ /* synthetic */ I8.b a(Class cls, H8.e eVar) {
        this.f10076a.put(cls, eVar);
        this.f10077b.remove(cls);
        return this;
    }

    public final V1 b() {
        return new V1(new HashMap(this.f10076a), new HashMap(this.f10077b), this.f10078c);
    }
}
