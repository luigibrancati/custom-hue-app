package U0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import com.fasterxml.jackson.core.JsonFactory;
import fc.C4034q;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final Bundle a(C4034q... c4034qArr) {
        Bundle bundle = new Bundle(c4034qArr.length);
        for (C4034q c4034q : c4034qArr) {
            String str = (String) c4034q.a();
            Object objB = c4034q.b();
            if (objB == null) {
                bundle.putString(str, null);
            } else if (objB instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objB).booleanValue());
            } else if (objB instanceof Byte) {
                bundle.putByte(str, ((Number) objB).byteValue());
            } else if (objB instanceof Character) {
                bundle.putChar(str, ((Character) objB).charValue());
            } else if (objB instanceof Double) {
                bundle.putDouble(str, ((Number) objB).doubleValue());
            } else if (objB instanceof Float) {
                bundle.putFloat(str, ((Number) objB).floatValue());
            } else if (objB instanceof Integer) {
                bundle.putInt(str, ((Number) objB).intValue());
            } else if (objB instanceof Long) {
                bundle.putLong(str, ((Number) objB).longValue());
            } else if (objB instanceof Short) {
                bundle.putShort(str, ((Number) objB).shortValue());
            } else if (objB instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objB);
            } else if (objB instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objB);
            } else if (objB instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objB);
            } else if (objB instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objB);
            } else if (objB instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objB);
            } else if (objB instanceof char[]) {
                bundle.putCharArray(str, (char[]) objB);
            } else if (objB instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objB);
            } else if (objB instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objB);
            } else if (objB instanceof int[]) {
                bundle.putIntArray(str, (int[]) objB);
            } else if (objB instanceof long[]) {
                bundle.putLongArray(str, (long[]) objB);
            } else if (objB instanceof short[]) {
                bundle.putShortArray(str, (short[]) objB);
            } else if (objB instanceof Object[]) {
                Class<?> componentType = objB.getClass().getComponentType();
                AbstractC4862t.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    AbstractC4862t.c(objB, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) objB);
                } else if (String.class.isAssignableFrom(componentType)) {
                    AbstractC4862t.c(objB, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) objB);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    AbstractC4862t.c(objB, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) objB);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR);
                    }
                    bundle.putSerializable(str, (Serializable) objB);
                }
            } else if (objB instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objB);
            } else if (objB instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objB);
            } else if (objB instanceof Size) {
                a.a(bundle, str, (Size) objB);
            } else {
                if (!(objB instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objB.getClass().getCanonicalName() + " for key \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR);
                }
                a.b(bundle, str, (SizeF) objB);
            }
        }
        return bundle;
    }
}
