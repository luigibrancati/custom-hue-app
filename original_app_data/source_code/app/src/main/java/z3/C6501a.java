package z3;

import android.util.Log;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: z3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6501a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6501a f48703a = new C6501a();

    @Override // z3.g
    public void a(String tag, String message) {
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(message, "message");
        Log.d(tag, message);
    }
}
