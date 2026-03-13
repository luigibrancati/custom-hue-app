package J8;

import H8.g;
import H8.h;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements I8.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H8.e f6319e = new H8.e() { // from class: J8.a
        @Override // H8.b
        public final void a(Object obj, Object obj2) {
            d.c(obj, (H8.f) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f6320f = new g() { // from class: J8.b
        @Override // H8.b
        public final void a(Object obj, Object obj2) {
            ((h) obj2).f((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f6321g = new g() { // from class: J8.c
        @Override // H8.b
        public final void a(Object obj, Object obj2) {
            ((h) obj2).g(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f6322h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6323a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f6324b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H8.e f6325c = f6319e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6326d = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements H8.a {
        public a() {
        }

        @Override // H8.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f6323a, d.this.f6324b, d.this.f6325c, d.this.f6326d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // H8.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateFormat f6328a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f6328a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        @Override // H8.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, h hVar) {
            hVar.f(f6328a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f6320f);
        m(Boolean.class, f6321g);
        m(Date.class, f6322h);
    }

    public static /* synthetic */ void c(Object obj, H8.f fVar) {
        throw new H8.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public H8.a i() {
        return new a();
    }

    public d j(I8.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f6326d = z10;
        return this;
    }

    @Override // I8.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, H8.e eVar) {
        this.f6323a.put(cls, eVar);
        this.f6324b.remove(cls);
        return this;
    }

    public d m(Class cls, g gVar) {
        this.f6324b.put(cls, gVar);
        this.f6323a.remove(cls);
        return this;
    }
}
