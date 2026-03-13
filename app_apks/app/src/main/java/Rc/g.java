package Rc;

import bd.InterfaceC2909a;
import bd.InterfaceC2911c;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends f implements InterfaceC2911c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Annotation f15076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kd.f fVar, Annotation annotation) {
        super(fVar, null);
        AbstractC4862t.e(annotation, "annotation");
        this.f15076c = annotation;
    }

    @Override // bd.InterfaceC2911c
    public InterfaceC2909a a() {
        return new e(this.f15076c);
    }
}
