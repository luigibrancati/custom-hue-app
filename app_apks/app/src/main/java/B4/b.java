package B4;

import A4.a;
import android.util.Log;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements A4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f644c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f645d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.EnumC0004a f646a = a.EnumC0004a.INFO;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f647b = "Amplitude";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final b a() {
            return b.f645d;
        }

        public a() {
        }
    }

    @Override // A4.a
    public void a(String message) {
        AbstractC4862t.e(message, "message");
        if (g().compareTo(a.EnumC0004a.DEBUG) <= 0) {
            Log.d(this.f647b, message);
        }
    }

    @Override // A4.a
    public void b(String message) {
        AbstractC4862t.e(message, "message");
        if (g().compareTo(a.EnumC0004a.INFO) <= 0) {
            Log.i(this.f647b, message);
        }
    }

    @Override // A4.a
    public void c(String message) {
        AbstractC4862t.e(message, "message");
        if (g().compareTo(a.EnumC0004a.WARN) <= 0) {
            Log.w(this.f647b, message);
        }
    }

    @Override // A4.a
    public void d(String message) {
        AbstractC4862t.e(message, "message");
        if (g().compareTo(a.EnumC0004a.ERROR) <= 0) {
            Log.e(this.f647b, message);
        }
    }

    @Override // A4.a
    public void e(a.EnumC0004a enumC0004a) {
        AbstractC4862t.e(enumC0004a, "<set-?>");
        this.f646a = enumC0004a;
    }

    public a.EnumC0004a g() {
        return this.f646a;
    }
}
