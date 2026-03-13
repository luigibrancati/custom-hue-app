package ge;

import fc.C4025h;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4227c {
    public static final Void a(Cc.d subClass, Cc.d baseClass) {
        AbstractC4862t.e(subClass, "subClass");
        AbstractC4862t.e(baseClass, "baseClass");
        String strL = subClass.l();
        if (strL == null) {
            strL = String.valueOf(subClass);
        }
        b(strL, baseClass);
        throw new C4025h();
    }

    public static final Void b(String str, Cc.d baseClass) {
        String str2;
        AbstractC4862t.e(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.l() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.l() + "' has to be sealed and '@Serializable'.";
        }
        throw new ce.f(str2);
    }
}
