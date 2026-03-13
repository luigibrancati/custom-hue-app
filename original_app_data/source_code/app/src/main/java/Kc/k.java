package Kc;

import Ic.j;
import dd.y;
import gc.C4206t;
import gc.V;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import td.EnumC5882e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f7858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f7859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f7860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f7861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f7862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f7863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f7864g;

    static {
        k kVar = new k();
        f7858a = kVar;
        y yVar = y.f33464a;
        f7859b = V.l(yVar.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f7860c = V.k(V.k(V.k(V.k(V.k(V.k(kVar.b(), yVar.f("List", "sort(Ljava/util/Comparator;)V")), yVar.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), yVar.e("Double", "isInfinite()Z", "isNaN()Z")), yVar.e("Float", "isInfinite()Z", "isNaN()Z")), yVar.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), yVar.e("CharSequence", "isEmpty()Z"));
        f7861d = V.k(V.k(V.k(V.k(V.k(V.k(yVar.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), yVar.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), yVar.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), yVar.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), yVar.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), yVar.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), yVar.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f7862e = V.k(V.k(yVar.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), yVar.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), yVar.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set setA = kVar.a();
        String[] strArrB = yVar.b("D");
        Set setK = V.k(setA, yVar.e("Float", (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        String[] strArrB2 = yVar.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f7863f = V.k(setK, yVar.e("String", (String[]) Arrays.copyOf(strArrB2, strArrB2.length)));
        String[] strArrB3 = yVar.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f7864g = yVar.e("Throwable", (String[]) Arrays.copyOf(strArrB3, strArrB3.length));
    }

    public final Set a() {
        y yVar = y.f33464a;
        EnumC5882e enumC5882e = EnumC5882e.BOOLEAN;
        EnumC5882e enumC5882e2 = EnumC5882e.BYTE;
        List listN = C4206t.n(enumC5882e, enumC5882e2, EnumC5882e.DOUBLE, EnumC5882e.FLOAT, enumC5882e2, EnumC5882e.INT, EnumC5882e.LONG, EnumC5882e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            String strB = ((EnumC5882e) it.next()).u().g().b();
            AbstractC4862t.d(strB, "it.wrapperFqName.shortName().asString()");
            String[] strArrB = yVar.b("Ljava/lang/String;");
            gc.y.C(linkedHashSet, yVar.e(strB, (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        }
        return linkedHashSet;
    }

    public final Set b() {
        y yVar = y.f33464a;
        List<EnumC5882e> listN = C4206t.n(EnumC5882e.BOOLEAN, EnumC5882e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC5882e enumC5882e : listN) {
            String strB = enumC5882e.u().g().b();
            AbstractC4862t.d(strB, "it.wrapperFqName.shortName().asString()");
            gc.y.C(linkedHashSet, yVar.e(strB, enumC5882e.q() + "Value()" + enumC5882e.p()));
        }
        return linkedHashSet;
    }

    public final Set c() {
        return f7859b;
    }

    public final Set d() {
        return f7863f;
    }

    public final Set e() {
        return f7860c;
    }

    public final Set f() {
        return f7862e;
    }

    public final Set g() {
        return f7864g;
    }

    public final Set h() {
        return f7861d;
    }

    public final boolean i(kd.d fqName) {
        AbstractC4862t.e(fqName, "fqName");
        return AbstractC4862t.a(fqName, j.a.f5797i) || Ic.j.e(fqName);
    }

    public final boolean j(kd.d fqName) {
        AbstractC4862t.e(fqName, "fqName");
        if (i(fqName)) {
            return true;
        }
        kd.b bVarN = c.f7792a.n(fqName);
        if (bVarN == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(bVarN.b().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
