package com.fasterxml.jackson.databind.node;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
class NodeSerialization implements Serializable, Externalizable {
    private static final long serialVersionUID = 1;
    public byte[] json;

    public NodeSerialization() {
    }

    public static NodeSerialization from(Object obj) {
        try {
            return new NodeSerialization(InternalNodeMapper.valueToBytes(obj));
        } catch (IOException e10) {
            throw new IllegalArgumentException("Failed to JDK serialize `" + obj.getClass().getSimpleName() + "` value: " + e10.getMessage(), e10);
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        int i10 = objectInput.readInt();
        byte[] bArr = new byte[i10];
        this.json = bArr;
        objectInput.readFully(bArr, 0, i10);
    }

    public Object readResolve() {
        try {
            return InternalNodeMapper.bytesToNode(this.json);
        } catch (IOException e10) {
            throw new IllegalArgumentException("Failed to JDK deserialize `JsonNode` value: " + e10.getMessage(), e10);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.json.length);
        objectOutput.write(this.json);
    }

    public NodeSerialization(byte[] bArr) {
        this.json = bArr;
    }
}
