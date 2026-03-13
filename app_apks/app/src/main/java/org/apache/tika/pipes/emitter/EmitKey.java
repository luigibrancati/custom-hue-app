package org.apache.tika.pipes.emitter;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class EmitKey implements Serializable {
    public static EmitKey NO_EMIT = new EmitKey(null, null);
    private static final long serialVersionUID = -3861669115439125268L;
    private String emitKey;
    private String emitterName;

    public EmitKey() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmitKey emitKey = (EmitKey) obj;
        if (Objects.equals(this.emitterName, emitKey.emitterName)) {
            return Objects.equals(this.emitKey, emitKey.emitKey);
        }
        return false;
    }

    public String getEmitKey() {
        return this.emitKey;
    }

    public String getEmitterName() {
        return this.emitterName;
    }

    public int hashCode() {
        String str = this.emitterName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.emitKey;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EmitterKey{emitterName='" + this.emitterName + "', emitterKey='" + this.emitKey + "'}";
    }

    public EmitKey(String str, String str2) {
        this.emitterName = str;
        this.emitKey = str2;
    }
}
