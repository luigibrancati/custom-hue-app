package Ge;

import Fe.A;
import Fe.AbstractC0847i;
import Fe.AbstractC0849k;
import Fe.C0848j;
import Fe.H;
import Fe.J;
import Od.C;
import Od.F;
import com.fasterxml.jackson.core.JsonPointer;
import fc.AbstractC4040w;
import fc.C4029l;
import fc.C4034q;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4207u;
import gc.y;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractC0849k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f4742h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final A f4743i = A.a.e(A.f4048b, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ClassLoader f4744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0849k f4745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC4028k f4746g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final A b() {
            return h.f4743i;
        }

        public final boolean c(A a10) {
            return !C.C(a10.q(), ".class", true);
        }

        public final A d(A a10, A base) {
            AbstractC4862t.e(a10, "<this>");
            AbstractC4862t.e(base, "base");
            return b().x(C.K(F.B0(a10.toString(), base.toString()), '\\', JsonPointer.SEPARATOR, false, 4, null));
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            h hVar = h.this;
            return hVar.x(hVar.f4744e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f4748a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i entry) {
            AbstractC4862t.e(entry, "entry");
            return Boolean.valueOf(h.f4742h.c(entry.b()));
        }
    }

    public /* synthetic */ h(ClassLoader classLoader, boolean z10, AbstractC0849k abstractC0849k, int i10, AbstractC4854k abstractC4854k) {
        this(classLoader, z10, (i10 & 4) != 0 ? AbstractC0849k.f4138b : abstractC0849k);
    }

    private final A v(A a10) {
        return f4743i.w(a10, true);
    }

    public final String A(A a10) {
        return v(a10).v(f4743i).toString();
    }

    @Override // Fe.AbstractC0849k
    public H b(A file, boolean z10) throws IOException {
        AbstractC4862t.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // Fe.AbstractC0849k
    public void c(A source, A target) throws IOException {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // Fe.AbstractC0849k
    public void g(A dir, boolean z10) throws IOException {
        AbstractC4862t.e(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // Fe.AbstractC0849k
    public void i(A path, boolean z10) throws IOException {
        AbstractC4862t.e(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // Fe.AbstractC0849k
    public List k(A dir) throws FileNotFoundException {
        AbstractC4862t.e(dir, "dir");
        String strA = A(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (C4034q c4034q : w()) {
            AbstractC0849k abstractC0849k = (AbstractC0849k) c4034q.a();
            A a10 = (A) c4034q.b();
            try {
                List listK = abstractC0849k.k(a10.x(strA));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listK) {
                    if (f4742h.c((A) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f4742h.d((A) it.next(), a10));
                }
                y.C(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return C4179C.V0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // Fe.AbstractC0849k
    public C0848j m(A path) {
        AbstractC4862t.e(path, "path");
        if (!f4742h.c(path)) {
            return null;
        }
        String strA = A(path);
        for (C4034q c4034q : w()) {
            C0848j c0848jM = ((AbstractC0849k) c4034q.a()).m(((A) c4034q.b()).x(strA));
            if (c0848jM != null) {
                return c0848jM;
            }
        }
        return null;
    }

    @Override // Fe.AbstractC0849k
    public AbstractC0847i n(A file) throws FileNotFoundException {
        AbstractC4862t.e(file, "file");
        if (!f4742h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strA = A(file);
        Iterator it = w().iterator();
        while (it.hasNext()) {
            C4034q c4034q = (C4034q) it.next();
            try {
                return ((AbstractC0849k) c4034q.a()).n(((A) c4034q.b()).x(strA));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // Fe.AbstractC0849k
    public H p(A file, boolean z10) throws IOException {
        AbstractC4862t.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // Fe.AbstractC0849k
    public J q(A file) throws IOException {
        AbstractC4862t.e(file, "file");
        if (!f4742h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        A a10 = f4743i;
        URL resource = this.f4744e.getResource(A.y(a10, file, false, 2, null).v(a10).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        AbstractC4862t.d(inputStream, "getInputStream(...)");
        return Fe.v.j(inputStream);
    }

    public final List w() {
        return (List) this.f4746g.getValue();
    }

    public final List x(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        AbstractC4862t.d(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        AbstractC4862t.d(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            AbstractC4862t.b(url);
            C4034q c4034qY = y(url);
            if (c4034qY != null) {
                arrayList.add(c4034qY);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        AbstractC4862t.d(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        AbstractC4862t.d(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            AbstractC4862t.b(url2);
            C4034q c4034qZ = z(url2);
            if (c4034qZ != null) {
                arrayList2.add(c4034qZ);
            }
        }
        return C4179C.C0(arrayList, arrayList2);
    }

    public final C4034q y(URL url) {
        if (AbstractC4862t.a(url.getProtocol(), Constants.FILE)) {
            return AbstractC4040w.a(this.f4745f, A.a.d(A.f4048b, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    public final C4034q z(URL url) {
        int iO0;
        String string = url.toString();
        AbstractC4862t.d(string, "toString(...)");
        if (!C.P(string, "jar:file:", false, 2, null) || (iO0 = F.o0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        A.a aVar = A.f4048b;
        String strSubstring = string.substring(4, iO0);
        AbstractC4862t.d(strSubstring, "substring(...)");
        return AbstractC4040w.a(j.f(A.a.d(aVar, new File(URI.create(strSubstring)), false, 1, null), this.f4745f, c.f4748a), f4743i);
    }

    public h(ClassLoader classLoader, boolean z10, AbstractC0849k systemFileSystem) {
        AbstractC4862t.e(classLoader, "classLoader");
        AbstractC4862t.e(systemFileSystem, "systemFileSystem");
        this.f4744e = classLoader;
        this.f4745f = systemFileSystem;
        this.f4746g = C4029l.b(new b());
        if (z10) {
            w().size();
        }
    }
}
