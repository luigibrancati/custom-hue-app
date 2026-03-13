package ie;

import ee.k;
import ge.AbstractC4222K;
import he.AbstractC4304b;
import he.EnumC4303a;
import he.InterfaceC4307e;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class F {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37493a;

        static {
            int[] iArr = new int[EnumC4303a.values().length];
            try {
                iArr[EnumC4303a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4303a.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4303a.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37493a = iArr;
        }
    }

    public static final void b(ee.k kind) {
        AbstractC4862t.e(kind, "kind");
        if (kind instanceof k.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof ee.d) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof ee.c) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(ee.e eVar, AbstractC4304b json) {
        AbstractC4862t.e(eVar, "<this>");
        AbstractC4862t.e(json, "json");
        for (Annotation annotation : eVar.getAnnotations()) {
            if (annotation instanceof InterfaceC4307e) {
                return ((InterfaceC4307e) annotation).discriminator();
            }
        }
        return json.c().e();
    }

    public static final void d(ce.g gVar, ce.g gVar2, String str) {
        if ((gVar instanceof ce.e) && AbstractC4222K.a(gVar2.getDescriptor()).contains(str)) {
            android.support.v4.media.session.a.a(gVar);
            throw null;
        }
    }
}
