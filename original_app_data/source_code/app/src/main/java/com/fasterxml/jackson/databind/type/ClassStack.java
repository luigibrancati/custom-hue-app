package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class ClassStack {
    protected final Class<?> _current;
    protected final ClassStack _parent;
    private ArrayList<ResolvedRecursiveType> _selfRefs;

    public ClassStack(Class<?> cls) {
        this(null, cls);
    }

    public void addSelfReference(ResolvedRecursiveType resolvedRecursiveType) {
        if (this._selfRefs == null) {
            this._selfRefs = new ArrayList<>();
        }
        this._selfRefs.add(resolvedRecursiveType);
    }

    public ClassStack child(Class<?> cls) {
        return new ClassStack(this, cls);
    }

    public ClassStack find(Class<?> cls) {
        if (this._current == cls) {
            return this;
        }
        do {
            this = this._parent;
            if (this == null) {
                return null;
            }
        } while (this._current != cls);
        return this;
    }

    public void resolveSelfReferences(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        if (arrayList != null) {
            Iterator<ResolvedRecursiveType> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setReference(javaType);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        sb2.append(arrayList == null ? WebrtcBuildVersion.maint_version : String.valueOf(arrayList.size()));
        sb2.append(')');
        while (this != null) {
            sb2.append(' ');
            sb2.append(this._current.getName());
            this = this._parent;
        }
        sb2.append(']');
        return sb2.toString();
    }

    private ClassStack(ClassStack classStack, Class<?> cls) {
        this._parent = classStack;
        this._current = cls;
    }
}
