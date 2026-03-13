package Pa;

import android.util.Log;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13211a;

    public c() {
        this(false, 1, null);
    }

    @Override // Pa.b
    public void a(String tag, String message) {
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(message, "message");
        if (c()) {
            Log.d(b(tag), message);
        }
    }

    public final String b(String str) {
        return "AS/" + str;
    }

    public boolean c() {
        return this.f13211a;
    }

    public c(boolean z10) {
        this.f13211a = z10;
    }

    public /* synthetic */ c(boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
