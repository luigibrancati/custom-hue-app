package C4;

import A4.a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements A4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0028a f1152b = new C0028a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1153c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.EnumC0004a f1154a = a.EnumC0004a.INFO;

    /* JADX INFO: renamed from: C4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0028a {
        public /* synthetic */ C0028a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final a a() {
            return a.f1153c;
        }

        public C0028a() {
        }
    }

    @Override // A4.a
    public void a(String message) {
        AbstractC4862t.e(message, "message");
        h(a.EnumC0004a.DEBUG, message);
    }

    @Override // A4.a
    public void b(String message) {
        AbstractC4862t.e(message, "message");
        h(a.EnumC0004a.INFO, message);
    }

    @Override // A4.a
    public void c(String message) {
        AbstractC4862t.e(message, "message");
        h(a.EnumC0004a.WARN, message);
    }

    @Override // A4.a
    public void d(String message) {
        AbstractC4862t.e(message, "message");
        h(a.EnumC0004a.ERROR, message);
    }

    @Override // A4.a
    public void e(a.EnumC0004a enumC0004a) {
        AbstractC4862t.e(enumC0004a, "<set-?>");
        this.f1154a = enumC0004a;
    }

    public a.EnumC0004a g() {
        return this.f1154a;
    }

    public final void h(a.EnumC0004a enumC0004a, String str) {
        if (g().compareTo(enumC0004a) <= 0) {
            System.out.println((Object) str);
        }
    }
}
