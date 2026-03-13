package K8;

import K8.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H8.e f7767c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements I8.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final H8.e f7768d = new H8.e() { // from class: K8.g
            @Override // H8.b
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (H8.f) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f7769a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f7770b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public H8.e f7771c = f7768d;

        public static /* synthetic */ void b(Object obj, H8.f fVar) {
            throw new H8.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f7769a), new HashMap(this.f7770b), this.f7771c);
        }

        public a d(I8.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // I8.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, H8.e eVar) {
            this.f7769a.put(cls, eVar);
            this.f7770b.remove(cls);
            return this;
        }
    }

    public h(Map map, Map map2, H8.e eVar) {
        this.f7765a = map;
        this.f7766b = map2;
        this.f7767c = eVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f7765a, this.f7766b, this.f7767c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
