package com.cloudwebrtc.webrtc.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintsMap {
    private final Map<String, Object> mMap;

    public ConstraintsMap() {
        this.mMap = new HashMap();
    }

    public ConstraintsArray getArray(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        return new ConstraintsArray((ArrayList) obj);
    }

    public boolean getBoolean(String str) {
        return ((Boolean) this.mMap.get(str)).booleanValue();
    }

    public double getDouble(String str) {
        return ((Double) this.mMap.get(str)).doubleValue();
    }

    public int getInt(String str) {
        return getType(str) == ObjectType.String ? Integer.parseInt((String) this.mMap.get(str)) : ((Integer) this.mMap.get(str)).intValue();
    }

    public ArrayList<Object> getListArray(String str) {
        return (ArrayList) this.mMap.get(str);
    }

    public ConstraintsMap getMap(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return null;
        }
        return new ConstraintsMap((Map) obj);
    }

    public String getString(String str) {
        return (String) this.mMap.get(str);
    }

    public ObjectType getType(String str) {
        Object obj = this.mMap.get(str);
        if (obj == null) {
            return ObjectType.Null;
        }
        if (obj instanceof Number) {
            return ObjectType.Number;
        }
        if (obj instanceof String) {
            return ObjectType.String;
        }
        if (obj instanceof Boolean) {
            return ObjectType.Boolean;
        }
        if (obj instanceof Map) {
            return ObjectType.Map;
        }
        if (obj instanceof ArrayList) {
            return ObjectType.Array;
        }
        if (obj instanceof Byte) {
            return ObjectType.Byte;
        }
        throw new IllegalArgumentException("Invalid value " + obj + " for key " + str + "contained in ConstraintsMap");
    }

    public boolean hasKey(String str) {
        return this.mMap.containsKey(str);
    }

    public boolean isNull(String str) {
        return this.mMap.get(str) == null;
    }

    public void merge(Map<String, Object> map) {
        this.mMap.putAll(map);
    }

    public void putArray(String str, ArrayList<Object> arrayList) {
        this.mMap.put(str, arrayList);
    }

    public void putBoolean(String str, boolean z10) {
        this.mMap.put(str, Boolean.valueOf(z10));
    }

    public void putByte(String str, byte[] bArr) {
        this.mMap.put(str, bArr);
    }

    public void putDouble(String str, double d10) {
        this.mMap.put(str, Double.valueOf(d10));
    }

    public void putInt(String str, int i10) {
        this.mMap.put(str, Integer.valueOf(i10));
    }

    public void putLong(String str, long j10) {
        this.mMap.put(str, Long.valueOf(j10));
    }

    public void putMap(String str, Map<String, Object> map) {
        this.mMap.put(str, map);
    }

    public void putNull(String str) {
        this.mMap.put(str, null);
    }

    public void putString(String str, String str2) {
        this.mMap.put(str, str2);
    }

    public Map<String, Object> toMap() {
        return this.mMap;
    }

    public String toString() {
        return "ConstraintsMap{mMap=" + this.mMap + '}';
    }

    public ConstraintsMap(Map<String, Object> map) {
        this.mMap = map;
    }
}
