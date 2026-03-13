package org.apache.tika.parser;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ParseContext implements Serializable {
    private static final long serialVersionUID = -5921436862145826534L;
    private final Map<String, Object> context = new HashMap();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.context.equals(((ParseContext) obj).context);
    }

    public <T> T get(Class<T> cls) {
        return (T) this.context.get(cls.getName());
    }

    public int hashCode() {
        return this.context.hashCode();
    }

    public boolean isEmpty() {
        return this.context.size() == 0;
    }

    public Set<String> keySet() {
        return Collections.unmodifiableSet(this.context.keySet());
    }

    public <T> void set(Class<T> cls, T t10) {
        if (t10 != null) {
            this.context.put(cls.getName(), t10);
        } else {
            this.context.remove(cls.getName());
        }
    }

    public <T> T get(Class<T> cls, T t10) {
        T t11 = (T) get(cls);
        return t11 != null ? t11 : t10;
    }
}
