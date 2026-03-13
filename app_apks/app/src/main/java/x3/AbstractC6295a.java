package x3;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: x3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6295a implements x3.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f47350c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47352b;

    /* JADX INFO: renamed from: x3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0643a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Set f47353a = new HashSet(Arrays.asList(l.d().a()));
    }

    /* JADX INFO: renamed from: x3.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends AbstractC6295a {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // x3.AbstractC6295a
        public final boolean b() {
            return true;
        }
    }

    /* JADX INFO: renamed from: x3.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends AbstractC6295a {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // x3.AbstractC6295a
        public final boolean b() {
            return true;
        }
    }

    /* JADX INFO: renamed from: x3.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends AbstractC6295a {
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // x3.AbstractC6295a
        public final boolean b() {
            return false;
        }
    }

    /* JADX INFO: renamed from: x3.a$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e extends AbstractC6295a {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // x3.AbstractC6295a
        public final boolean b() {
            return true;
        }
    }

    /* JADX INFO: renamed from: x3.a$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f extends AbstractC6295a {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // x3.AbstractC6295a
        public final boolean b() {
            return true;
        }
    }

    /* JADX INFO: renamed from: x3.a$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends AbstractC6295a {
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // x3.AbstractC6295a
        public final boolean b() {
            return true;
        }
    }

    /* JADX INFO: renamed from: x3.a$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h extends AbstractC6295a {
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // x3.AbstractC6295a
        public final boolean b() {
            return true;
        }
    }

    /* JADX INFO: renamed from: x3.a$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i extends AbstractC6295a {
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // x3.AbstractC6295a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public AbstractC6295a(String str, String str2) {
        this.f47351a = str;
        this.f47352b = str2;
        f47350c.add(this);
    }

    public static Set d() {
        return Collections.unmodifiableSet(f47350c);
    }

    @Override // x3.f
    public String a() {
        return this.f47351a;
    }

    public abstract boolean b();

    public boolean c() {
        return Se.a.b(C0643a.f47353a, this.f47352b);
    }

    @Override // x3.f
    public boolean isSupported() {
        return b() || c();
    }
}
