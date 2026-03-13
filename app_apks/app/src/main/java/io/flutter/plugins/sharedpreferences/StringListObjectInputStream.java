package io.flutter.plugins.sharedpreferences;

import gc.U;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, d2 = {"Lio/flutter/plugins/sharedpreferences/StringListObjectInputStream;", "Ljava/io/ObjectInputStream;", "input", "Ljava/io/InputStream;", "<init>", "(Ljava/io/InputStream;)V", "resolveClass", "Ljava/lang/Class;", "desc", "Ljava/io/ObjectStreamClass;", "shared_preferences_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StringListObjectInputStream extends ObjectInputStream {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringListObjectInputStream(InputStream input) {
        super(input);
        AbstractC4862t.e(input, "input");
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass desc) throws ClassNotFoundException {
        Set setH = U.h("java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;");
        String name = desc != null ? desc.getName() : null;
        if (name == null || setH.contains(name)) {
            return super.resolveClass(desc);
        }
        throw new ClassNotFoundException(desc.getName());
    }
}
