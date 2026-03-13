package com.cloudwebrtc.webrtc.utils;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintsArray {
    private final ArrayList<Object> mArray;

    public ConstraintsArray() {
        this.mArray = new ArrayList<>();
    }

    public ConstraintsArray getArray(int i10) {
        return new ConstraintsArray((ArrayList) this.mArray.get(i10));
    }

    public boolean getBoolean(int i10) {
        return ((Boolean) this.mArray.get(i10)).booleanValue();
    }

    public Byte[] getByte(int i10) {
        return (Byte[]) this.mArray.get(i10);
    }

    public double getDouble(int i10) {
        return ((Double) this.mArray.get(i10)).doubleValue();
    }

    public int getInt(int i10) {
        return ((Integer) this.mArray.get(i10)).intValue();
    }

    public ConstraintsMap getMap(int i10) {
        return new ConstraintsMap((Map) this.mArray.get(i10));
    }

    public String getString(int i10) {
        return (String) this.mArray.get(i10);
    }

    public ObjectType getType(int i10) {
        Object obj = this.mArray.get(i10);
        return obj == null ? ObjectType.Null : obj instanceof Boolean ? ObjectType.Boolean : ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer)) ? ObjectType.Number : obj instanceof String ? ObjectType.String : obj instanceof ArrayList ? ObjectType.Array : obj instanceof Map ? ObjectType.Map : obj instanceof Byte ? ObjectType.Byte : ObjectType.Null;
    }

    public boolean isNull(int i10) {
        return this.mArray.get(i10) == null;
    }

    public void pushArray(ConstraintsArray constraintsArray) {
        this.mArray.add(constraintsArray.toArrayList());
    }

    public void pushBoolean(boolean z10) {
        this.mArray.add(Boolean.valueOf(z10));
    }

    public void pushByte(byte[] bArr) {
        this.mArray.add(bArr);
    }

    public void pushDouble(double d10) {
        this.mArray.add(Double.valueOf(d10));
    }

    public void pushInt(int i10) {
        this.mArray.add(Integer.valueOf(i10));
    }

    public void pushMap(ConstraintsMap constraintsMap) {
        this.mArray.add(constraintsMap.toMap());
    }

    public void pushNull() {
        this.mArray.add(null);
    }

    public void pushString(String str) {
        this.mArray.add(str);
    }

    public int size() {
        return this.mArray.size();
    }

    public ArrayList<Object> toArrayList() {
        return this.mArray;
    }

    public ConstraintsArray(ArrayList<Object> arrayList) {
        this.mArray = arrayList;
    }
}
