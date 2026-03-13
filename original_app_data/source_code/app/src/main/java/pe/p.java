package pe;

import Fe.C0846h;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f42849a = new p();

    public static final String a(String username, String password, Charset charset) {
        AbstractC4862t.e(username, "username");
        AbstractC4862t.e(password, "password");
        AbstractC4862t.e(charset, "charset");
        return "Basic " + C0846h.f4117d.c(username + ':' + password, charset).a();
    }
}
