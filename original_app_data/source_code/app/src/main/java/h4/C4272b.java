package h4;

import kotlin.jvm.internal.AbstractC4862t;
import pe.C;

/* JADX INFO: renamed from: h4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4272b extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f36247a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4272b(C response) {
        super("HTTP " + response.g() + ": " + ((Object) response.u()));
        AbstractC4862t.e(response, "response");
        this.f36247a = response;
    }
}
