package org.slf4j.helpers;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f41638a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f41639b = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends SecurityManager {
        public b() {
        }

        @Override // java.lang.SecurityManager
        public Class[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static Class a() {
        int i10;
        b bVarB = b();
        if (bVarB == null) {
            return null;
        }
        Class[] classContext = bVarB.getClassContext();
        String name = q.class.getName();
        int i11 = 0;
        while (i11 < classContext.length && !name.equals(classContext[i11].getName())) {
            i11++;
        }
        if (i11 >= classContext.length || (i10 = i11 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i10];
    }

    public static b b() {
        b bVar = f41638a;
        if (bVar != null) {
            return bVar;
        }
        if (f41639b) {
            return null;
        }
        b bVarC = c();
        f41638a = bVarC;
        f41639b = true;
        return bVarC;
    }

    public static b c() {
        try {
            return new b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean d(String str) {
        String strE = e(str);
        if (strE == null) {
            return false;
        }
        return strE.equalsIgnoreCase("true");
    }

    public static String e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
