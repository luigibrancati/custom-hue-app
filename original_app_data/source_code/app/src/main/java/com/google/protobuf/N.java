package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f32139a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f32140b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f32141c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f32142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f32143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC3724k f32144f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a extends j {
        @Override // com.google.protobuf.N.j, com.google.protobuf.N.f
        a a(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends j {
        void G0(double d10);

        @Override // com.google.protobuf.N.j, com.google.protobuf.N.f
        b a(int i10);

        double getDouble(int i10);

        double p0(int i10, double d10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        int getNumber();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        c findValueByNumber(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        boolean isInRange(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f extends j {
        f a(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface g extends j {
        int D(int i10, int i11);

        @Override // com.google.protobuf.N.j, com.google.protobuf.N.f
        g a(int i10);

        int getInt(int i10);

        void x0(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h extends AbstractList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f32145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f32146b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public interface a {
            Object convert(Object obj);
        }

        public h(List list, a aVar) {
            this.f32145a = list;
            this.f32146b = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            return this.f32146b.convert(this.f32145a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f32145a.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface i extends j {
        void C0(long j10);

        long Q0(int i10, long j10);

        @Override // com.google.protobuf.N.j, com.google.protobuf.N.f
        i a(int i10);

        long getLong(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface j extends List, RandomAccess {
        j a(int i10);

        void i();

        boolean m();
    }

    static {
        byte[] bArr = new byte[0];
        f32142d = bArr;
        f32143e = ByteBuffer.wrap(bArr);
        f32144f = AbstractC3724k.l(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return O0.s(bArr);
    }

    public static Object h(Object obj, Object obj2) {
        return ((InterfaceC3717g0) obj).toBuilder().mergeFrom((InterfaceC3717g0) obj2).buildPartial();
    }

    public static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f32140b);
    }
}
