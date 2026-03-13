package ie;

import fc.C4025h;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u {
    public static final q a(Number value, String key, String output) {
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(output, "output");
        return d(-1, k(value, key, output));
    }

    public static final s b(Number value, String output) {
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(output, "output");
        return new s("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(output, 0, 1, null)));
    }

    public static final s c(ee.e keyDescriptor) {
        AbstractC4862t.e(keyDescriptor, "keyDescriptor");
        return new s("Value of type '" + keyDescriptor.i() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.f() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final q d(int i10, String message) {
        AbstractC4862t.e(message, "message");
        if (i10 >= 0) {
            message = "Unexpected JSON token at offset " + i10 + ": " + message;
        }
        return new q(message);
    }

    public static final q e(int i10, String message, CharSequence input) {
        AbstractC4862t.e(message, "message");
        AbstractC4862t.e(input, "input");
        return d(i10, message + "\nJSON input: " + ((Object) h(input, i10)));
    }

    public static final Void f(AbstractC4379a abstractC4379a, String entity) {
        AbstractC4862t.e(abstractC4379a, "<this>");
        AbstractC4862t.e(entity, "entity");
        abstractC4379a.y("Trailing comma before the end of JSON " + entity, abstractC4379a.f37518a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new C4025h();
    }

    public static /* synthetic */ Void g(AbstractC4379a abstractC4379a, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "object";
        }
        return f(abstractC4379a, str);
    }

    public static final CharSequence h(CharSequence charSequence, int i10) {
        AbstractC4862t.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                return (i11 <= 0 ? "" : ".....") + charSequence.subSequence(Bc.k.e(i11, 0), Bc.k.h(i12, charSequence.length())).toString() + (i12 >= charSequence.length() ? "" : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static /* synthetic */ CharSequence i(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return h(charSequence, i10);
    }

    public static final Void j(AbstractC4379a abstractC4379a, Number result) {
        AbstractC4862t.e(abstractC4379a, "<this>");
        AbstractC4862t.e(result, "result");
        AbstractC4379a.z(abstractC4379a, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new C4025h();
    }

    public static final String k(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(str2, 0, 1, null));
    }
}
