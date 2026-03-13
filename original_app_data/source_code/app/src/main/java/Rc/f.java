package Rc;

import bd.InterfaceC2910b;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements InterfaceC2910b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15074b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd.f f15075a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final f a(Object value, kd.f fVar) {
            AbstractC4862t.e(value, "value");
            return d.h(value.getClass()) ? new q(fVar, (Enum) value) : value instanceof Annotation ? new g(fVar, (Annotation) value) : value instanceof Object[] ? new j(fVar, (Object[]) value) : value instanceof Class ? new m(fVar, (Class) value) : new s(fVar, value);
        }

        public a() {
        }
    }

    public /* synthetic */ f(kd.f fVar, AbstractC4854k abstractC4854k) {
        this(fVar);
    }

    @Override // bd.InterfaceC2910b
    public kd.f getName() {
        return this.f15075a;
    }

    public f(kd.f fVar) {
        this.f15075a = fVar;
    }
}
