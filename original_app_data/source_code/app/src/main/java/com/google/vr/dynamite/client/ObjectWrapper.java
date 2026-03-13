package com.google.vr.dynamite.client;

import android.os.IBinder;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByReflection
public final class ObjectWrapper<T> extends c {

    @UsedByReflection
    private final T wrappedObject;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectWrapper(Object obj) {
        this.wrappedObject = obj;
    }

    public static IObjectWrapper b(Object obj) {
        return new ObjectWrapper(obj);
    }

    @UsedByReflection
    public static <T> T unwrap(IObjectWrapper iObjectWrapper, Class<T> cls) {
        if (iObjectWrapper == null) {
            return null;
        }
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).wrappedObject;
        }
        IBinder iBinderAsBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i10 = 0;
        Field field = null;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Field field2 = declaredFields[i10];
            if (!field2.isSynthetic()) {
                if (field != null) {
                    field = null;
                    break;
                }
                field = field2;
            }
            i10++;
        }
        if (field == null) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        if (field.isAccessible()) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        field.setAccessible(true);
        try {
            Object obj = field.get(iBinderAsBinder);
            if (obj == null) {
                return null;
            }
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
            throw new IllegalArgumentException("remoteBinder is the wrong class.");
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (IllegalArgumentException e11) {
            throw new IllegalArgumentException("remoteBinder is the wrong class.", e11);
        } catch (NullPointerException e12) {
            throw new IllegalArgumentException("Binder object is null.", e12);
        }
    }
}
