package androidx.work;

import Cc.d;
import I3.AbstractC0876f;
import I3.AbstractC0890u;
import gc.C4179C;
import gc.C4200m;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0319b f24768b = new C0319b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f24769c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f24770a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f24771a = new LinkedHashMap();

        public final b a() {
            b bVar = new b(this.f24771a);
            b.f24768b.e(bVar);
            return bVar;
        }

        public final a b(String key, Object obj) {
            AbstractC4862t.e(key, "key");
            Map map = this.f24771a;
            if (obj == null) {
                obj = null;
            } else {
                d dVarB = M.b(obj.getClass());
                if (!AbstractC4862t.a(dVarB, M.b(Boolean.TYPE)) && !AbstractC4862t.a(dVarB, M.b(Byte.TYPE)) && !AbstractC4862t.a(dVarB, M.b(Integer.TYPE)) && !AbstractC4862t.a(dVarB, M.b(Long.TYPE)) && !AbstractC4862t.a(dVarB, M.b(Float.TYPE)) && !AbstractC4862t.a(dVarB, M.b(Double.TYPE)) && !AbstractC4862t.a(dVarB, M.b(String.class)) && !AbstractC4862t.a(dVarB, M.b(Boolean[].class)) && !AbstractC4862t.a(dVarB, M.b(Byte[].class)) && !AbstractC4862t.a(dVarB, M.b(Integer[].class)) && !AbstractC4862t.a(dVarB, M.b(Long[].class)) && !AbstractC4862t.a(dVarB, M.b(Float[].class)) && !AbstractC4862t.a(dVarB, M.b(Double[].class)) && !AbstractC4862t.a(dVarB, M.b(String[].class))) {
                    if (AbstractC4862t.a(dVarB, M.b(boolean[].class))) {
                        obj = AbstractC0876f.h((boolean[]) obj);
                    } else if (AbstractC4862t.a(dVarB, M.b(byte[].class))) {
                        obj = AbstractC0876f.i((byte[]) obj);
                    } else if (AbstractC4862t.a(dVarB, M.b(int[].class))) {
                        obj = AbstractC0876f.l((int[]) obj);
                    } else if (AbstractC4862t.a(dVarB, M.b(long[].class))) {
                        obj = AbstractC0876f.m((long[]) obj);
                    } else if (AbstractC4862t.a(dVarB, M.b(float[].class))) {
                        obj = AbstractC0876f.k((float[]) obj);
                    } else {
                        if (!AbstractC4862t.a(dVarB, M.b(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + dVarB);
                        }
                        obj = AbstractC0876f.j((double[]) obj);
                    }
                }
            }
            map.put(key, obj);
            return this;
        }

        public final a c(b data) {
            AbstractC4862t.e(data, "data");
            d(data.f24770a);
            return this;
        }

        public final a d(Map values) {
            AbstractC4862t.e(values, "values");
            for (Map.Entry entry : values.entrySet()) {
                b((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final a e(String str, Object obj) {
            this.f24771a.put(str, obj);
            return this;
        }

        public final a f(String key, int i10) {
            AbstractC4862t.e(key, "key");
            return e(key, Integer.valueOf(i10));
        }

        public final a g(String key, long j10) {
            AbstractC4862t.e(key, "key");
            return e(key, Long.valueOf(j10));
        }

        public final a h(String key, String str) {
            AbstractC4862t.e(key, "key");
            return e(key, str);
        }
    }

    /* JADX INFO: renamed from: androidx.work.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0319b {
        public /* synthetic */ C0319b(AbstractC4854k abstractC4854k) {
            this();
        }

        public static final boolean b(ByteArrayInputStream byteArrayInputStream) throws IOException {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b10 = (byte) (-21267);
            boolean z10 = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b10) {
                z10 = true;
            }
            byteArrayInputStream.reset();
            return z10;
        }

        public static final void c(DataInputStream dataInputStream) throws IOException {
            short s10 = dataInputStream.readShort();
            if (s10 != -21521) {
                throw new IllegalStateException(("Magic number doesn't match: " + ((int) s10)).toString());
            }
            short s11 = dataInputStream.readShort();
            if (s11 == 1) {
                return;
            }
            throw new IllegalStateException(("Unsupported version number: " + ((int) s11)).toString());
        }

        public static final Object d(DataInputStream dataInputStream, byte b10) throws IOException {
            if (b10 == 0) {
                return null;
            }
            if (b10 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b10 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b10 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b10 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b10 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b10 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b10 == 7) {
                return dataInputStream.readUTF();
            }
            int i10 = 0;
            if (b10 == 8) {
                int i11 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i11];
                while (i10 < i11) {
                    boolArr[i10] = Boolean.valueOf(dataInputStream.readBoolean());
                    i10++;
                }
                return boolArr;
            }
            if (b10 == 9) {
                int i12 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i12];
                while (i10 < i12) {
                    bArr[i10] = Byte.valueOf(dataInputStream.readByte());
                    i10++;
                }
                return bArr;
            }
            if (b10 == 10) {
                int i13 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i13];
                while (i10 < i13) {
                    numArr[i10] = Integer.valueOf(dataInputStream.readInt());
                    i10++;
                }
                return numArr;
            }
            if (b10 == 11) {
                int i14 = dataInputStream.readInt();
                Long[] lArr = new Long[i14];
                while (i10 < i14) {
                    lArr[i10] = Long.valueOf(dataInputStream.readLong());
                    i10++;
                }
                return lArr;
            }
            if (b10 == 12) {
                int i15 = dataInputStream.readInt();
                Float[] fArr = new Float[i15];
                while (i10 < i15) {
                    fArr[i10] = Float.valueOf(dataInputStream.readFloat());
                    i10++;
                }
                return fArr;
            }
            if (b10 == 13) {
                int i16 = dataInputStream.readInt();
                Double[] dArr = new Double[i16];
                while (i10 < i16) {
                    dArr[i10] = Double.valueOf(dataInputStream.readDouble());
                    i10++;
                }
                return dArr;
            }
            if (b10 != 14) {
                throw new IllegalStateException("Unsupported type " + ((int) b10));
            }
            int i17 = dataInputStream.readInt();
            String[] strArr = new String[i17];
            while (i10 < i17) {
                String utf = dataInputStream.readUTF();
                if (AbstractC4862t.a(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                strArr[i10] = utf;
                i10++;
            }
            return strArr;
        }

        public static final void f(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i10;
            d dVarB = M.b(objArr.getClass());
            if (AbstractC4862t.a(dVarB, M.b(Boolean[].class))) {
                i10 = 8;
            } else if (AbstractC4862t.a(dVarB, M.b(Byte[].class))) {
                i10 = 9;
            } else if (AbstractC4862t.a(dVarB, M.b(Integer[].class))) {
                i10 = 10;
            } else if (AbstractC4862t.a(dVarB, M.b(Long[].class))) {
                i10 = 11;
            } else if (AbstractC4862t.a(dVarB, M.b(Float[].class))) {
                i10 = 12;
            } else if (AbstractC4862t.a(dVarB, M.b(Double[].class))) {
                i10 = 13;
            } else {
                if (!AbstractC4862t.a(dVarB, M.b(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + M.b(objArr.getClass()).j());
                }
                i10 = 14;
            }
            dataOutputStream.writeByte(i10);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i10 == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i10 == 9) {
                    Byte b10 = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b10 != null ? b10.byteValue() : (byte) 0);
                } else if (i10 == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i10 == 11) {
                    Long l10 = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l10 != null ? l10.longValue() : 0L);
                } else if (i10 == 12) {
                    Float f10 = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f10 != null ? f10.floatValue() : 0.0f);
                } else if (i10 == 13) {
                    Double d10 = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d10 != null ? d10.doubleValue() : 0.0d);
                } else if (i10 == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        public static final void g(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + M.b(obj.getClass()).l());
                }
                f(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        public static final void h(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        public final b a(byte[] bytes) {
            AbstractC4862t.e(bytes, "bytes");
            if (bytes.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (bytes.length == 0) {
                return b.f24769c;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                int i10 = 0;
                if (b(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i11 = objectInputStream.readInt();
                        while (i10 < i11) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i10++;
                        }
                        sc.c.a(objectInputStream, null);
                    } finally {
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        c(dataInputStream);
                        int i12 = dataInputStream.readInt();
                        while (i10 < i12) {
                            linkedHashMap.put(dataInputStream.readUTF(), d(dataInputStream, dataInputStream.readByte()));
                            i10++;
                        }
                        sc.c.a(dataInputStream, null);
                    } finally {
                    }
                }
            } catch (IOException e10) {
                AbstractC0890u.e().d(AbstractC0876f.f5616a, "Error in Data#fromByteArray: ", e10);
            } catch (ClassNotFoundException e11) {
                AbstractC0890u.e().d(AbstractC0876f.f5616a, "Error in Data#fromByteArray: ", e11);
            }
            return new b(linkedHashMap);
        }

        public final byte[] e(b data) {
            AbstractC4862t.e(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    h(dataOutputStream);
                    dataOutputStream.writeInt(data.h());
                    for (Map.Entry entry : data.f24770a.entrySet()) {
                        g(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    sc.c.a(dataOutputStream, null);
                    AbstractC4862t.b(byteArray);
                    return byteArray;
                } finally {
                }
            } catch (IOException e10) {
                AbstractC0890u.e().d(AbstractC0876f.f5616a, "Error in Data#toByteArray: ", e10);
                return new byte[0];
            }
        }

        public C0319b() {
        }
    }

    public b(b other) {
        AbstractC4862t.e(other, "other");
        this.f24770a = new HashMap(other.f24770a);
    }

    public static final CharSequence i(Map.Entry entry) {
        AbstractC4862t.e(entry, "<destruct>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            AbstractC4862t.d(value, "toString(...)");
        }
        sb2.append(value);
        return sb2.toString();
    }

    public final int c(String key, int i10) {
        AbstractC4862t.e(key, "key");
        Object objValueOf = Integer.valueOf(i10);
        Object obj = this.f24770a.get(key);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    public final Map d() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f24770a);
        AbstractC4862t.d(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final long e(String key, long j10) {
        AbstractC4862t.e(key, "key");
        Object objValueOf = Long.valueOf(j10);
        Object obj = this.f24770a.get(key);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L6a
            java.lang.Class<androidx.work.b> r2 = androidx.work.b.class
            java.lang.Class r3 = r8.getClass()
            boolean r2 = kotlin.jvm.internal.AbstractC4862t.a(r2, r3)
            if (r2 != 0) goto L14
            goto L6a
        L14:
            androidx.work.b r8 = (androidx.work.b) r8
            java.util.Map r2 = r7.f24770a
            java.util.Set r2 = r2.keySet()
            java.util.Map r3 = r8.f24770a
            java.util.Set r3 = r3.keySet()
            boolean r3 = kotlin.jvm.internal.AbstractC4862t.a(r2, r3)
            if (r3 != 0) goto L29
            return r1
        L29:
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r4 = r7.f24770a
            java.lang.Object r4 = r4.get(r3)
            java.util.Map r5 = r8.f24770a
            java.lang.Object r3 = r5.get(r3)
            if (r4 == 0) goto L61
            if (r3 != 0) goto L4a
            goto L61
        L4a:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L5c
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L5c
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = gc.C4201n.d(r5, r3)
            goto L66
        L5c:
            boolean r3 = kotlin.jvm.internal.AbstractC4862t.a(r4, r3)
            goto L66
        L61:
            if (r4 != r3) goto L65
            r3 = r0
            goto L66
        L65:
            r3 = r1
        L66:
            if (r3 != 0) goto L2d
            return r1
        L69:
            return r0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.equals(java.lang.Object):boolean");
    }

    public final String f(String key) {
        AbstractC4862t.e(key, "key");
        Object obj = this.f24770a.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean g(String key, Class klass) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(klass, "klass");
        Object obj = this.f24770a.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public final int h() {
        return this.f24770a.size();
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f24770a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ C4200m.b((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public String toString() {
        return "Data {" + C4179C.q0(this.f24770a.entrySet(), null, null, null, 0, null, new l() { // from class: I3.e
            @Override // vc.l
            public final Object invoke(Object obj) {
                return androidx.work.b.i((Map.Entry) obj);
            }
        }, 31, null) + "}";
    }

    public b(Map values) {
        AbstractC4862t.e(values, "values");
        this.f24770a = new HashMap(values);
    }
}
