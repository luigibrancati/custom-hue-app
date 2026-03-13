package Ed;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public static final j AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE;
    public static final j CANNOT_COMPUTE_ERASED_BOUND;
    public static final j CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER;
    public static final j ERROR_TYPE_PARAMETER;
    public static final j IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR;
    public static final j MISSED_TYPE_FOR_PARAMETER;
    public static final j STUB_TYPE;
    public static final j UNINFERRED_LAMBDA_PARAMETER_TYPE;
    public static final j UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT;
    private final String debugMessage;
    private final boolean isUnresolved;
    public static final j UNRESOLVED_TYPE = new j("UNRESOLVED_TYPE", 0, "Unresolved type for %s", true);
    public static final j UNRESOLVED_TYPE_PARAMETER_TYPE = new j("UNRESOLVED_TYPE_PARAMETER_TYPE", 1, "Unresolved type parameter type", true);
    public static final j UNRESOLVED_CLASS_TYPE = new j("UNRESOLVED_CLASS_TYPE", 2, "Unresolved class %s", true);
    public static final j UNRESOLVED_JAVA_CLASS = new j("UNRESOLVED_JAVA_CLASS", 3, "Unresolved java class %s", true);
    public static final j UNRESOLVED_DECLARATION = new j("UNRESOLVED_DECLARATION", 4, "Unresolved declaration %s", true);
    public static final j UNRESOLVED_KCLASS_CONSTANT_VALUE = new j("UNRESOLVED_KCLASS_CONSTANT_VALUE", 5, "Unresolved type for %s (arrayDimensions=%s)", true);
    public static final j UNRESOLVED_TYPE_ALIAS = new j("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", false, 2, null);
    public static final j RETURN_TYPE = new j("RETURN_TYPE", 7, "Return type for %s cannot be resolved", false, 2, null);
    public static final j RETURN_TYPE_FOR_FUNCTION = new j("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", false, 2, null);
    public static final j RETURN_TYPE_FOR_PROPERTY = new j("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", false, 2, null);
    public static final j RETURN_TYPE_FOR_CONSTRUCTOR = new j("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", false, 2, null);
    public static final j IMPLICIT_RETURN_TYPE_FOR_FUNCTION = new j("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", false, 2, null);
    public static final j IMPLICIT_RETURN_TYPE_FOR_PROPERTY = new j("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", false, 2, null);
    public static final j ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT = new j("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", false, 2, null);
    public static final j RECURSIVE_TYPE = new j("RECURSIVE_TYPE", 15, "Recursive type", false, 2, null);
    public static final j RECURSIVE_TYPE_ALIAS = new j("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", false, 2, null);
    public static final j RECURSIVE_ANNOTATION_TYPE = new j("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", false, 2, null);
    public static final j CYCLIC_UPPER_BOUNDS = new j("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", false, 2, null);
    public static final j CYCLIC_SUPERTYPES = new j("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", false, 2, null);
    public static final j UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE = new j("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", false, 2, null);
    public static final j UNINFERRED_TYPE_VARIABLE = new j("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", false, 2, null);
    public static final j RESOLUTION_ERROR_TYPE = new j("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", false, 2, null);
    public static final j ERROR_EXPECTED_TYPE = new j("ERROR_EXPECTED_TYPE", 24, "Error expected type", false, 2, null);
    public static final j ERROR_DATA_FLOW_TYPE = new j("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", false, 2, null);
    public static final j ERROR_WHILE_RECONSTRUCTING_BARE_TYPE = new j("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", false, 2, null);
    public static final j UNABLE_TO_SUBSTITUTE_TYPE = new j("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", false, 2, null);
    public static final j DONT_CARE = new j("DONT_CARE", 28, "Special DONT_CARE type", false, 2, null);
    public static final j FUNCTION_PLACEHOLDER_TYPE = new j("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", false, 2, null);
    public static final j TYPE_FOR_RESULT = new j("TYPE_FOR_RESULT", 31, "Stubbed 'Result' type", false, 2, null);
    public static final j TYPE_FOR_COMPILER_EXCEPTION = new j("TYPE_FOR_COMPILER_EXCEPTION", 32, "Error type for a compiler exception while analyzing %s", false, 2, null);
    public static final j ERROR_FLEXIBLE_TYPE = new j("ERROR_FLEXIBLE_TYPE", 33, "Error java flexible type with id %s. (%s..%s)", false, 2, null);
    public static final j ERROR_RAW_TYPE = new j("ERROR_RAW_TYPE", 34, "Error raw type %s", false, 2, null);
    public static final j TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS = new j("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 35, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false, 2, null);
    public static final j ILLEGAL_TYPE_RANGE_FOR_DYNAMIC = new j("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 36, "Illegal type range for dynamic type %s..%s", false, 2, null);
    public static final j CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME = new j("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 38, "Couldn't deserialize type parameter %s in %s", false, 2, null);
    public static final j INCONSISTENT_SUSPEND_FUNCTION = new j("INCONSISTENT_SUSPEND_FUNCTION", 39, "Inconsistent suspend function type in metadata with constructor %s", false, 2, null);
    public static final j UNEXPECTED_FLEXIBLE_TYPE_ID = new j("UNEXPECTED_FLEXIBLE_TYPE_ID", 40, "Unexpected id of a flexible type %s. (%s..%s)", false, 2, null);
    public static final j UNKNOWN_TYPE = new j("UNKNOWN_TYPE", 41, "Unknown type", false, 2, null);
    public static final j NO_TYPE_SPECIFIED = new j("NO_TYPE_SPECIFIED", 42, "No type specified for %s", false, 2, null);
    public static final j NO_TYPE_FOR_LOOP_RANGE = new j("NO_TYPE_FOR_LOOP_RANGE", 43, "Loop range has no type", false, 2, null);
    public static final j NO_TYPE_FOR_LOOP_PARAMETER = new j("NO_TYPE_FOR_LOOP_PARAMETER", 44, "Loop parameter has no type", false, 2, null);
    public static final j MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER = new j("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 46, "Missed a type argument for a type parameter %s", false, 2, null);
    public static final j PARSE_ERROR_ARGUMENT = new j("PARSE_ERROR_ARGUMENT", 47, "Error type for parse error argument %s", false, 2, null);
    public static final j STAR_PROJECTION_IN_CALL = new j("STAR_PROJECTION_IN_CALL", 48, "Error type for star projection directly passing as a call type argument", false, 2, null);
    public static final j PROHIBITED_DYNAMIC_TYPE = new j("PROHIBITED_DYNAMIC_TYPE", 49, "Dynamic type in a not allowed context", false, 2, null);
    public static final j NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT = new j("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 50, "Not an annotation type %s in the annotation context", false, 2, null);
    public static final j UNIT_RETURN_TYPE_FOR_INC_DEC = new j("UNIT_RETURN_TYPE_FOR_INC_DEC", 51, "Unit type returned by inc or dec", false, 2, null);
    public static final j RETURN_NOT_ALLOWED = new j("RETURN_NOT_ALLOWED", 52, "Return not allowed", false, 2, null);
    public static final j UNRESOLVED_PARCEL_TYPE = new j("UNRESOLVED_PARCEL_TYPE", 53, "Unresolved 'Parcel' type", true);
    public static final j KAPT_ERROR_TYPE = new j("KAPT_ERROR_TYPE", 54, "Kapt error type", false, 2, null);
    public static final j SYNTHETIC_ELEMENT_ERROR_TYPE = new j("SYNTHETIC_ELEMENT_ERROR_TYPE", 55, "Error type for synthetic element", false, 2, null);
    public static final j ERROR_EXPRESSION_TYPE = new j("ERROR_EXPRESSION_TYPE", 57, "Error expression type", false, 2, null);
    public static final j ERROR_RECEIVER_TYPE = new j("ERROR_RECEIVER_TYPE", 58, "Error receiver type for %s", false, 2, null);
    public static final j ERROR_CONSTANT_VALUE = new j("ERROR_CONSTANT_VALUE", 59, "Error constant value %s", false, 2, null);
    public static final j EMPTY_CALLABLE_REFERENCE = new j("EMPTY_CALLABLE_REFERENCE", 60, "Empty callable reference", false, 2, null);
    public static final j UNSUPPORTED_CALLABLE_REFERENCE_TYPE = new j("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 61, "Unsupported callable reference type %s", false, 2, null);
    public static final j TYPE_FOR_DELEGATION = new j("TYPE_FOR_DELEGATION", 62, "Error delegation type for %s", false, 2, null);
    public static final j UNAVAILABLE_TYPE_FOR_DECLARATION = new j("UNAVAILABLE_TYPE_FOR_DECLARATION", 63, "Type is unavailable for declaration %s", false, 2, null);
    public static final j ERROR_TYPE_PROJECTION = new j("ERROR_TYPE_PROJECTION", 65, "Error type projection", false, 2, null);
    public static final j ERROR_SUPER_TYPE = new j("ERROR_SUPER_TYPE", 66, "Error super type", false, 2, null);
    public static final j SUPER_TYPE_FOR_ERROR_TYPE = new j("SUPER_TYPE_FOR_ERROR_TYPE", 67, "Supertype of error type %s", false, 2, null);
    public static final j ERROR_PROPERTY_TYPE = new j("ERROR_PROPERTY_TYPE", 68, "Error property type", false, 2, null);
    public static final j ERROR_CLASS = new j("ERROR_CLASS", 69, "Error class", false, 2, null);
    public static final j TYPE_FOR_ERROR_TYPE_CONSTRUCTOR = new j("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 70, "Type for error type constructor (%s)", false, 2, null);
    public static final j INTERSECTION_OF_ERROR_TYPES = new j("INTERSECTION_OF_ERROR_TYPES", 71, "Intersection of error types %s", false, 2, null);
    public static final j NOT_FOUND_UNSIGNED_TYPE = new j("NOT_FOUND_UNSIGNED_TYPE", 73, "Unsigned type %s not found", false, 2, null);
    public static final j ERROR_ENUM_TYPE = new j("ERROR_ENUM_TYPE", 74, "Not found the corresponding enum class for given enum entry %s.%s", false, 2, null);
    public static final j NO_RECORDED_TYPE = new j("NO_RECORDED_TYPE", 75, "Not found recorded type for %s", false, 2, null);
    public static final j NOT_FOUND_DESCRIPTOR_FOR_FUNCTION = new j("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 76, "Descriptor not found for function %s", false, 2, null);
    public static final j NOT_FOUND_DESCRIPTOR_FOR_CLASS = new j("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 77, "Cannot build class type, descriptor not found for builder %s", false, 2, null);
    public static final j NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER = new j("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 78, "Cannot build type parameter type, descriptor not found for builder %s", false, 2, null);
    public static final j UNMAPPED_ANNOTATION_TARGET_TYPE = new j("UNMAPPED_ANNOTATION_TARGET_TYPE", 79, "Type for unmapped Java annotation target to Kotlin one", false, 2, null);
    public static final j NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION = new j("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 81, "No fqName for annotation %s", false, 2, null);
    public static final j NOT_FOUND_FQNAME = new j("NOT_FOUND_FQNAME", 82, "No fqName for %s", false, 2, null);
    public static final j TYPE_FOR_GENERATED_ERROR_EXPRESSION = new j("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 83, "Type for generated error expression", false, 2, null);
    private static final /* synthetic */ j[] $VALUES = a();

    static {
        AbstractC4854k abstractC4854k = null;
        IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR = new j("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", false, 2, abstractC4854k);
        UNINFERRED_LAMBDA_PARAMETER_TYPE = new j("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", false, 2, abstractC4854k);
        STUB_TYPE = new j("STUB_TYPE", 29, "Stub type %s", false, 2, abstractC4854k);
        CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER = new j("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 37, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", false, 2, abstractC4854k);
        MISSED_TYPE_FOR_PARAMETER = new j("MISSED_TYPE_FOR_PARAMETER", 45, "Missed a type for a value parameter %s", false, 2, abstractC4854k);
        AbstractC4854k abstractC4854k2 = null;
        AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE = new j("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 56, "Error type in ad hoc resolve for lighter classes", false, 2, abstractC4854k2);
        ERROR_TYPE_PARAMETER = new j("ERROR_TYPE_PARAMETER", 64, "Error type parameter", false, 2, abstractC4854k2);
        CANNOT_COMPUTE_ERASED_BOUND = new j("CANNOT_COMPUTE_ERASED_BOUND", 72, "Cannot compute erased upper bound of a type parameter %s", false, 2, abstractC4854k2);
        UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT = new j("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 80, "Unknown type for an array element of a java annotation argument", false, 2, abstractC4854k2);
    }

    public j(String str, int i10, String str2, boolean z10) {
        this.debugMessage = str2;
        this.isUnresolved = z10;
    }

    public static final /* synthetic */ j[] a() {
        return new j[]{UNRESOLVED_TYPE, UNRESOLVED_TYPE_PARAMETER_TYPE, UNRESOLVED_CLASS_TYPE, UNRESOLVED_JAVA_CLASS, UNRESOLVED_DECLARATION, UNRESOLVED_KCLASS_CONSTANT_VALUE, UNRESOLVED_TYPE_ALIAS, RETURN_TYPE, RETURN_TYPE_FOR_FUNCTION, RETURN_TYPE_FOR_PROPERTY, RETURN_TYPE_FOR_CONSTRUCTOR, IMPLICIT_RETURN_TYPE_FOR_FUNCTION, IMPLICIT_RETURN_TYPE_FOR_PROPERTY, IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR, ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT, RECURSIVE_TYPE, RECURSIVE_TYPE_ALIAS, RECURSIVE_ANNOTATION_TYPE, CYCLIC_UPPER_BOUNDS, CYCLIC_SUPERTYPES, UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE, UNINFERRED_LAMBDA_PARAMETER_TYPE, UNINFERRED_TYPE_VARIABLE, RESOLUTION_ERROR_TYPE, ERROR_EXPECTED_TYPE, ERROR_DATA_FLOW_TYPE, ERROR_WHILE_RECONSTRUCTING_BARE_TYPE, UNABLE_TO_SUBSTITUTE_TYPE, DONT_CARE, STUB_TYPE, FUNCTION_PLACEHOLDER_TYPE, TYPE_FOR_RESULT, TYPE_FOR_COMPILER_EXCEPTION, ERROR_FLEXIBLE_TYPE, ERROR_RAW_TYPE, TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS, ILLEGAL_TYPE_RANGE_FOR_DYNAMIC, CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, INCONSISTENT_SUSPEND_FUNCTION, UNEXPECTED_FLEXIBLE_TYPE_ID, UNKNOWN_TYPE, NO_TYPE_SPECIFIED, NO_TYPE_FOR_LOOP_RANGE, NO_TYPE_FOR_LOOP_PARAMETER, MISSED_TYPE_FOR_PARAMETER, MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, PARSE_ERROR_ARGUMENT, STAR_PROJECTION_IN_CALL, PROHIBITED_DYNAMIC_TYPE, NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT, UNIT_RETURN_TYPE_FOR_INC_DEC, RETURN_NOT_ALLOWED, UNRESOLVED_PARCEL_TYPE, KAPT_ERROR_TYPE, SYNTHETIC_ELEMENT_ERROR_TYPE, AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE, ERROR_EXPRESSION_TYPE, ERROR_RECEIVER_TYPE, ERROR_CONSTANT_VALUE, EMPTY_CALLABLE_REFERENCE, UNSUPPORTED_CALLABLE_REFERENCE_TYPE, TYPE_FOR_DELEGATION, UNAVAILABLE_TYPE_FOR_DECLARATION, ERROR_TYPE_PARAMETER, ERROR_TYPE_PROJECTION, ERROR_SUPER_TYPE, SUPER_TYPE_FOR_ERROR_TYPE, ERROR_PROPERTY_TYPE, ERROR_CLASS, TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, INTERSECTION_OF_ERROR_TYPES, CANNOT_COMPUTE_ERASED_BOUND, NOT_FOUND_UNSIGNED_TYPE, ERROR_ENUM_TYPE, NO_RECORDED_TYPE, NOT_FOUND_DESCRIPTOR_FOR_FUNCTION, NOT_FOUND_DESCRIPTOR_FOR_CLASS, NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER, UNMAPPED_ANNOTATION_TARGET_TYPE, UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, NOT_FOUND_FQNAME, TYPE_FOR_GENERATED_ERROR_EXPRESSION};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final String b() {
        return this.debugMessage;
    }

    public final boolean j() {
        return this.isUnresolved;
    }

    public /* synthetic */ j(String str, int i10, String str2, boolean z10, int i11, AbstractC4854k abstractC4854k) {
        this(str, i10, str2, (i11 & 2) != 0 ? false : z10);
    }
}
