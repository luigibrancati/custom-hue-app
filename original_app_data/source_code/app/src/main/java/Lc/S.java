package Lc;

import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1181i f8734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S f8736c;

    public S(InterfaceC1181i classifierDescriptor, List arguments, S s10) {
        AbstractC4862t.e(classifierDescriptor, "classifierDescriptor");
        AbstractC4862t.e(arguments, "arguments");
        this.f8734a = classifierDescriptor;
        this.f8735b = arguments;
        this.f8736c = s10;
    }

    public final List a() {
        return this.f8735b;
    }

    public final InterfaceC1181i b() {
        return this.f8734a;
    }

    public final S c() {
        return this.f8736c;
    }
}
