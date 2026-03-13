package Ke;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.file.OpenOption;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7865a;

    /* JADX INFO: renamed from: Ke.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0125a extends a {
        public C0125a(byte[] bArr) {
            super(bArr);
        }

        @Override // Ke.a
        public byte[] c() {
            return (byte[]) b();
        }

        @Override // Ke.a
        public InputStream d(OpenOption... openOptionArr) {
            return new ByteArrayInputStream((byte[]) this.f7865a);
        }
    }

    public a(Object obj) {
        Objects.requireNonNull(obj, "origin");
        this.f7865a = obj;
    }

    public Object b() {
        return this.f7865a;
    }

    public abstract byte[] c();

    public abstract InputStream d(OpenOption... openOptionArr);

    public final String e() {
        return getClass().getSimpleName();
    }

    public String toString() {
        return e() + "[" + this.f7865a.toString() + "]";
    }
}
