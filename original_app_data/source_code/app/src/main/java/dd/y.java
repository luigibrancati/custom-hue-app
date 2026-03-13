package dd;

import gc.C4179C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f33464a = new y();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33465a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            AbstractC4862t.e(it, "it");
            return y.f33464a.c(it);
        }
    }

    public final String[] b(String... signatures) {
        AbstractC4862t.e(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    public final Set d(String internalName, String... signatures) {
        AbstractC4862t.e(internalName, "internalName");
        AbstractC4862t.e(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public final Set e(String name, String... signatures) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(signatures, "signatures");
        return d(h(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final Set f(String name, String... signatures) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(signatures, "signatures");
        return d(i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String g(String name) {
        AbstractC4862t.e(name, "name");
        return "java/util/function/" + name;
    }

    public final String h(String name) {
        AbstractC4862t.e(name, "name");
        return "java/lang/" + name;
    }

    public final String i(String name) {
        AbstractC4862t.e(name, "name");
        return "java/util/" + name;
    }

    public final String j(String name, List parameters, String ret) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(parameters, "parameters");
        AbstractC4862t.e(ret, "ret");
        return name + '(' + C4179C.q0(parameters, "", null, null, 0, null, a.f33465a, 30, null) + ')' + c(ret);
    }

    public final String k(String internalName, String jvmDescriptor) {
        AbstractC4862t.e(internalName, "internalName");
        AbstractC4862t.e(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }
}
