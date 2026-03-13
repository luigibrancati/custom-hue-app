package td;

import Ic.h;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: td.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC5882e {
    BOOLEAN(h.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(h.CHAR, "char", "C", "java.lang.Character"),
    BYTE(h.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(h.SHORT, "short", "S", "java.lang.Short"),
    INT(h.INT, "int", "I", "java.lang.Integer"),
    FLOAT(h.FLOAT, "float", "F", "java.lang.Float"),
    LONG(h.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(h.DOUBLE, "double", "D", "java.lang.Double");

    private final String desc;
    private final String name;
    private final h primitiveType;
    private final kd.c wrapperFqName;
    private static final Set<kd.c> WRAPPERS_CLASS_NAMES = new HashSet();
    private static final Map<String, EnumC5882e> TYPE_BY_NAME = new HashMap();
    private static final Map<h, EnumC5882e> TYPE_BY_PRIMITIVE_TYPE = new EnumMap(h.class);
    private static final Map<String, EnumC5882e> TYPE_BY_DESC = new HashMap();

    static {
        for (EnumC5882e enumC5882e : values()) {
            WRAPPERS_CLASS_NAMES.add(enumC5882e.u());
            TYPE_BY_NAME.put(enumC5882e.q(), enumC5882e);
            TYPE_BY_PRIMITIVE_TYPE.put(enumC5882e.s(), enumC5882e);
            TYPE_BY_DESC.put(enumC5882e.p(), enumC5882e);
        }
    }

    EnumC5882e(h hVar, String str, String str2, String str3) {
        if (hVar == null) {
            a(6);
        }
        if (str == null) {
            a(7);
        }
        if (str2 == null) {
            a(8);
        }
        if (str3 == null) {
            a(9);
        }
        this.primitiveType = hVar;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new kd.c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r7) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: td.EnumC5882e.a(int):void");
    }

    public static EnumC5882e b(h hVar) {
        if (hVar == null) {
            a(3);
        }
        EnumC5882e enumC5882e = TYPE_BY_PRIMITIVE_TYPE.get(hVar);
        if (enumC5882e == null) {
            a(4);
        }
        return enumC5882e;
    }

    public static EnumC5882e j(String str) {
        if (str == null) {
            a(1);
        }
        EnumC5882e enumC5882e = TYPE_BY_NAME.get(str);
        if (enumC5882e != null) {
            return enumC5882e;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public String p() {
        String str = this.desc;
        if (str == null) {
            a(12);
        }
        return str;
    }

    public String q() {
        String str = this.name;
        if (str == null) {
            a(11);
        }
        return str;
    }

    public h s() {
        h hVar = this.primitiveType;
        if (hVar == null) {
            a(10);
        }
        return hVar;
    }

    public kd.c u() {
        kd.c cVar = this.wrapperFqName;
        if (cVar == null) {
            a(13);
        }
        return cVar;
    }
}
