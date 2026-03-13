package w8;

import com.google.ar.core.ImageMetadata;
import java.io.File;

/* JADX INFO: renamed from: w8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6169f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f46341c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A8.g f46342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC6167d f46343b;

    public C6169f(A8.g gVar) {
        this.f46342a = gVar;
        this.f46343b = f46341c;
    }

    public void a() {
        this.f46343b.d();
    }

    public byte[] b() {
        return this.f46343b.c();
    }

    public String c() {
        return this.f46343b.b();
    }

    public final File d(String str) {
        return this.f46342a.q(str, "userlog");
    }

    public final void e(String str) {
        this.f46343b.a();
        this.f46343b = f46341c;
        if (str == null) {
            return;
        }
        f(d(str), ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
    }

    public void f(File file, int i10) {
        this.f46343b = new i(file, i10);
    }

    public void g(long j10, String str) {
        this.f46343b.e(j10, str);
    }

    public C6169f(A8.g gVar, String str) {
        this(gVar);
        e(str);
    }

    /* JADX INFO: renamed from: w8.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC6167d {
        public b() {
        }

        @Override // w8.InterfaceC6167d
        public String b() {
            return null;
        }

        @Override // w8.InterfaceC6167d
        public byte[] c() {
            return null;
        }

        @Override // w8.InterfaceC6167d
        public void a() {
        }

        @Override // w8.InterfaceC6167d
        public void d() {
        }

        @Override // w8.InterfaceC6167d
        public void e(long j10, String str) {
        }
    }
}
