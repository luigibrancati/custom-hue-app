package f8;

import f8.j;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f34202b = new i(new j.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f34203c = new i(new j.e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f34204d = new i(new j.g());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f34205e = new i(new j.f());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f34206f = new i(new j.b());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f34207g = new i(new j.d());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f34208h = new i(new j.c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f34209a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f34210a;

        @Override // f8.i.e
        public Object a(String str) {
            Iterator it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f34210a.a(str, (Provider) it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f34210a.a(str, null);
        }

        public b(j jVar) {
            this.f34210a = jVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f34211a;

        @Override // f8.i.e
        public Object a(String str) {
            return this.f34211a.a(str, null);
        }

        public c(j jVar) {
            this.f34211a = jVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f34212a;

        @Override // f8.i.e
        public Object a(String str) throws GeneralSecurityException {
            Iterator it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f34212a.a(str, (Provider) it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        public d(j jVar) {
            this.f34212a = jVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        Object a(String str);
    }

    public i(j jVar) {
        if (U7.b.c()) {
            this.f34209a = new d(jVar);
        } else if (q.a()) {
            this.f34209a = new b(jVar);
        } else {
            this.f34209a = new c(jVar);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.f34209a.a(str);
    }
}
