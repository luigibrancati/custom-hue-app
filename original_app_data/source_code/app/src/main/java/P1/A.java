package P1;

import L1.B0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface A {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f12544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f12546c;

        public a(byte[] bArr, String str, int i10) {
            this.f12544a = bArr;
            this.f12545b = str;
            this.f12546c = i10;
        }

        public byte[] a() {
            return this.f12544a;
        }

        public String b() {
            return this.f12545b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(A a10, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        A a(UUID uuid);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f12547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12548b;

        public d(byte[] bArr, String str) {
            this.f12547a = bArr;
            this.f12548b = str;
        }

        public byte[] a() {
            return this.f12547a;
        }

        public String b() {
            return this.f12548b;
        }
    }

    Map a(byte[] bArr);

    d b();

    byte[] c();

    void d(byte[] bArr, byte[] bArr2);

    void e(byte[] bArr);

    int f();

    void h(b bVar);

    J1.b i(byte[] bArr);

    boolean j(byte[] bArr, String str);

    void k(byte[] bArr);

    byte[] l(byte[] bArr, byte[] bArr2);

    a m(byte[] bArr, List list, int i10, HashMap map);

    void release();

    default void g(byte[] bArr, B0 b02) {
    }
}
