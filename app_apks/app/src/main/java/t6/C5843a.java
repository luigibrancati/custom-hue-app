package t6;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.a;
import java.util.Set;
import s6.C5785d;
import t6.AbstractC5847e;
import u6.InterfaceC5950d;
import u6.InterfaceC5964k;
import v6.AbstractC6056k;
import v6.C6048c;

/* JADX INFO: renamed from: t6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5843a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0606a f44750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f44751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44752c;

    /* JADX INFO: renamed from: t6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class AbstractC0606a extends e {
        public f a(Context context, Looper looper, C6048c c6048c, Object obj, AbstractC5847e.a aVar, AbstractC5847e.b bVar) {
            return b(context, looper, c6048c, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, C6048c c6048c, Object obj, InterfaceC5950d interfaceC5950d, InterfaceC5964k interfaceC5964k) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* JADX INFO: renamed from: t6.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
    }

    /* JADX INFO: renamed from: t6.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
    }

    /* JADX INFO: renamed from: t6.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0607a f44753a = new C0607a(null);

        /* JADX INFO: renamed from: t6.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0607a implements d {
            public /* synthetic */ C0607a(byte[] bArr) {
            }
        }
    }

    /* JADX INFO: renamed from: t6.a$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class e {
    }

    /* JADX INFO: renamed from: t6.a$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f extends b {
        void a(String str);

        boolean b();

        String c();

        void d(a.c cVar);

        boolean e();

        boolean h();

        Set i();

        boolean isConnected();

        void j(IAccountAccessor iAccountAccessor, Set set);

        void k();

        void l(a.e eVar);

        int m();

        C5785d[] n();

        String o();
    }

    /* JADX INFO: renamed from: t6.a$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends c {
    }

    public C5843a(String str, AbstractC0606a abstractC0606a, g gVar) {
        AbstractC6056k.m(abstractC0606a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC6056k.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f44752c = str;
        this.f44750a = abstractC0606a;
        this.f44751b = gVar;
    }

    public final AbstractC0606a a() {
        return this.f44750a;
    }

    public final String b() {
        return this.f44752c;
    }
}
