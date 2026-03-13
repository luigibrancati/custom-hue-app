package y4;

import M4.l;
import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;
import q4.C5488d;

/* JADX INFO: renamed from: y4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6401e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6401e f48404a = new C6401e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D4.g f48405b = new C6397a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f48406c = new M4.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D4.g f48407d = new C6398b();

    public final File a(C5488d configuration) {
        AbstractC4862t.e(configuration, "configuration");
        return new File(configuration.M(), "events");
    }

    public final D4.g b() {
        return f48405b;
    }

    public final File c(C5488d configuration) {
        AbstractC4862t.e(configuration, "configuration");
        return new File(configuration.M(), "identify-intercept");
    }

    public final D4.g d() {
        return f48407d;
    }

    public final File e(C5488d configuration) {
        AbstractC4862t.e(configuration, "configuration");
        return configuration.M();
    }

    public final String f() {
        return "identity";
    }

    public final l g() {
        return f48406c;
    }
}
