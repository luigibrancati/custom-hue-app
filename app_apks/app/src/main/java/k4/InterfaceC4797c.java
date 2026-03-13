package k4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: k4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4797c {

    /* JADX INFO: renamed from: k4.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static void a(InterfaceC4797c interfaceC4797c, Drawable drawable) {
            AbstractC4862t.e(interfaceC4797c, "this");
        }

        public static void b(InterfaceC4797c interfaceC4797c, Drawable drawable) {
            AbstractC4862t.e(interfaceC4797c, "this");
        }

        public static void c(InterfaceC4797c interfaceC4797c, Drawable result) {
            AbstractC4862t.e(interfaceC4797c, "this");
            AbstractC4862t.e(result, "result");
        }
    }

    void onError(Drawable drawable);

    void onStart(Drawable drawable);

    void onSuccess(Drawable drawable);
}
