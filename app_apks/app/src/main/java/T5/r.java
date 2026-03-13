package T5;

import android.util.Log;
import fc.C4029l;
import fc.InterfaceC4028k;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16248c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC4028k f16249d = C4029l.b(new InterfaceC6082a() { // from class: T5.q
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return r.g();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f16250a = b.FLUTTER_ONLY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16251b = "ArPlugin";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final r a() {
            return (r) r.f16249d.getValue();
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b FLUTTER_ONLY = new b("FLUTTER_ONLY", 0);
        public static final b LOGCAT_AND_FLUTTER = new b("LOGCAT_AND_FLUTTER", 1);

        static {
            b[] bVarArrA = a();
            $VALUES = bVarArrA;
            $ENTRIES = AbstractC5277b.a(bVarArrA);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{FLUTTER_ONLY, LOGCAT_AND_FLUTTER};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ void d(r rVar, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        rVar.c(str, th);
    }

    public static final r g() {
        return new r();
    }

    public final void c(String message, Throwable th) {
        AbstractC4862t.e(message, "message");
        System.err.println("[" + this.f16251b + "][ERROR] " + message);
        if (th != null) {
            th.printStackTrace();
        }
        Log.e(this.f16251b, message, th);
    }

    public final void e(String message) {
        AbstractC4862t.e(message, "message");
        System.out.println((Object) ("[" + this.f16251b + "] " + message));
        if (this.f16250a == b.LOGCAT_AND_FLUTTER) {
            Log.d(this.f16251b, message);
        }
    }

    public final void f(boolean z10) {
        this.f16250a = z10 ? b.LOGCAT_AND_FLUTTER : b.FLUTTER_ONLY;
        e("Debug logging = " + z10);
    }
}
