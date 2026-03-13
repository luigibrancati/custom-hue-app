package Mc;

import fc.AbstractC4040w;
import gc.C4179C;
import gc.C4204q;
import gc.C4205s;
import gc.C4206t;
import gc.Q;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.protocol.SentryStackFrame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum n {
    CLASS(Constants.CLASS, false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION(SentryStackFrame.JsonKeys.FUNCTION, false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE(Constants.FILE, false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY(Constants.CLASS, false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);

    private static final Set<n> ALL_TARGET_SET;
    private static final List<n> ANNOTATION_CLASS_LIST;
    private static final List<n> CLASS_LIST;
    private static final List<n> COMPANION_OBJECT_LIST;
    private static final Set<n> DEFAULT_TARGET_SET;
    private static final List<n> ENUM_ENTRY_LIST;
    private static final List<n> ENUM_LIST;
    private static final List<n> FILE_LIST;
    private static final List<n> FUNCTION_LIST;
    private static final List<n> INTERFACE_LIST;
    private static final List<n> LOCAL_CLASS_LIST;
    private static final List<n> OBJECT_LIST;
    private static final List<n> PROPERTY_GETTER_LIST;
    private static final List<n> PROPERTY_SETTER_LIST;
    private static final Map<e, n> USE_SITE_MAPPING;
    private final String description;
    private final boolean isDefault;
    public static final a Companion = new a(null);
    private static final HashMap<String, n> map = new HashMap<>();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    static {
        for (n nVar : values()) {
            map.put(nVar.name(), nVar);
        }
        n[] nVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (n nVar2 : nVarArrValues) {
            if (nVar2.isDefault) {
                arrayList.add(nVar2);
            }
        }
        DEFAULT_TARGET_SET = C4179C.Z0(arrayList);
        ALL_TARGET_SET = C4204q.b1(values());
        n nVar3 = ANNOTATION_CLASS;
        n nVar4 = CLASS;
        ANNOTATION_CLASS_LIST = C4206t.n(nVar3, nVar4);
        LOCAL_CLASS_LIST = C4206t.n(LOCAL_CLASS, nVar4);
        CLASS_LIST = C4206t.n(CLASS_ONLY, nVar4);
        n nVar5 = COMPANION_OBJECT;
        n nVar6 = OBJECT;
        COMPANION_OBJECT_LIST = C4206t.n(nVar5, nVar6, nVar4);
        OBJECT_LIST = C4206t.n(STANDALONE_OBJECT, nVar6, nVar4);
        INTERFACE_LIST = C4206t.n(INTERFACE, nVar4);
        ENUM_LIST = C4206t.n(ENUM_CLASS, nVar4);
        n nVar7 = ENUM_ENTRY;
        n nVar8 = PROPERTY;
        n nVar9 = FIELD;
        ENUM_ENTRY_LIST = C4206t.n(nVar7, nVar8, nVar9);
        n nVar10 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = C4205s.d(nVar10);
        n nVar11 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = C4205s.d(nVar11);
        FUNCTION_LIST = C4205s.d(FUNCTION);
        n nVar12 = FILE;
        FILE_LIST = C4205s.d(nVar12);
        e eVar = e.CONSTRUCTOR_PARAMETER;
        n nVar13 = VALUE_PARAMETER;
        USE_SITE_MAPPING = Q.l(AbstractC4040w.a(eVar, nVar13), AbstractC4040w.a(e.FIELD, nVar9), AbstractC4040w.a(e.PROPERTY, nVar8), AbstractC4040w.a(e.FILE, nVar12), AbstractC4040w.a(e.PROPERTY_GETTER, nVar11), AbstractC4040w.a(e.PROPERTY_SETTER, nVar10), AbstractC4040w.a(e.RECEIVER, nVar13), AbstractC4040w.a(e.SETTER_PARAMETER, nVar13), AbstractC4040w.a(e.PROPERTY_DELEGATE_FIELD, nVar9));
    }

    n(String str, boolean z10) {
        this.description = str;
        this.isDefault = z10;
    }

    /* synthetic */ n(String str, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
