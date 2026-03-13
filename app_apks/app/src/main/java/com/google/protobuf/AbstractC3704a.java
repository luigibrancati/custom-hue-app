package com.google.protobuf;

import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.InterfaceC3717g0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3704a implements InterfaceC3717g0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class AbstractC0382a implements InterfaceC3717g0.a {
        public static void a(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        public static I0 newUninitializedMessageException(InterfaceC3717g0 interfaceC3717g0) {
            return new I0(interfaceC3717g0);
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract AbstractC0382a mo237clone();

        public final String e(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        public abstract AbstractC0382a internalMergeFrom(AbstractC3704a abstractC3704a);

        public boolean mergeDelimitedFrom(InputStream inputStream, D d10) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            m241mergeFrom((InputStream) new C0383a(inputStream, AbstractC3724k.C(i10, inputStream)), d10);
            return true;
        }

        @Override // com.google.protobuf.InterfaceC3717g0.a
        public abstract AbstractC0382a mergeFrom(AbstractC3724k abstractC3724k, D d10);

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            N.a(iterable);
            if (!(iterable instanceof V)) {
                if (iterable instanceof u0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    a(iterable, list);
                    return;
                }
            }
            List listO = ((V) iterable).o();
            V v10 = (V) list;
            int size = list.size();
            for (Object obj : listO) {
                if (obj == null) {
                    String str = "Element at index " + (v10.size() - size) + " is null.";
                    for (int size2 = v10.size() - 1; size2 >= size; size2--) {
                        v10.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC3722j) {
                    v10.F((AbstractC3722j) obj);
                } else {
                    v10.add((String) obj);
                }
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0383a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f32215a;

            public C0383a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f32215a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f32215a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f32215a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f32215a--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) {
                int iSkip = (int) super.skip(Math.min(j10, this.f32215a));
                if (iSkip >= 0) {
                    this.f32215a -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f32215a;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f32215a -= i13;
                }
                return i13;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, D.b());
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC0382a m239mergeFrom(AbstractC3724k abstractC3724k) {
            return mergeFrom(abstractC3724k, D.b());
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC0382a m238mergeFrom(AbstractC3722j abstractC3722j) throws O {
            try {
                AbstractC3724k abstractC3724kW = abstractC3722j.w();
                m239mergeFrom(abstractC3724kW);
                abstractC3724kW.a(0);
                return this;
            } catch (O e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(e("ByteString"), e11);
            }
        }

        @Override // com.google.protobuf.InterfaceC3717g0.a
        public AbstractC0382a mergeFrom(AbstractC3722j abstractC3722j, D d10) throws O {
            try {
                AbstractC3724k abstractC3724kW = abstractC3722j.w();
                mergeFrom(abstractC3724kW, d10);
                abstractC3724kW.a(0);
                return this;
            } catch (O e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(e("ByteString"), e11);
            }
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC0382a m242mergeFrom(byte[] bArr) {
            return m235mergeFrom(bArr, 0, bArr.length);
        }

        /* JADX INFO: renamed from: mergeFrom */
        public AbstractC0382a m235mergeFrom(byte[] bArr, int i10, int i11) throws O {
            try {
                AbstractC3724k abstractC3724kM = AbstractC3724k.m(bArr, i10, i11);
                m239mergeFrom(abstractC3724kM);
                abstractC3724kM.a(0);
                return this;
            } catch (O e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(e("byte array"), e11);
            }
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC0382a m243mergeFrom(byte[] bArr, D d10) {
            return m236mergeFrom(bArr, 0, bArr.length, d10);
        }

        /* JADX INFO: renamed from: mergeFrom */
        public AbstractC0382a m236mergeFrom(byte[] bArr, int i10, int i11, D d10) throws O {
            try {
                AbstractC3724k abstractC3724kM = AbstractC3724k.m(bArr, i10, i11);
                mergeFrom(abstractC3724kM, d10);
                abstractC3724kM.a(0);
                return this;
            } catch (O e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(e("byte array"), e11);
            }
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC0382a m240mergeFrom(InputStream inputStream) {
            AbstractC3724k abstractC3724kH = AbstractC3724k.h(inputStream);
            m239mergeFrom(abstractC3724kH);
            abstractC3724kH.a(0);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC0382a m241mergeFrom(InputStream inputStream, D d10) {
            AbstractC3724k abstractC3724kH = AbstractC3724k.h(inputStream);
            mergeFrom(abstractC3724kH, d10);
            abstractC3724kH.a(0);
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3717g0.a
        public AbstractC0382a mergeFrom(InterfaceC3717g0 interfaceC3717g0) {
            if (getDefaultInstanceForType().getClass().isInstance(interfaceC3717g0)) {
                return internalMergeFrom((AbstractC3704a) interfaceC3717g0);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0382a.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(AbstractC3722j abstractC3722j) {
        if (!abstractC3722j.s()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(A0 a02) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iD = a02.d(this);
        setMemoizedSerializedSize(iD);
        return iD;
    }

    public I0 newUninitializedMessageException() {
        return new I0(this);
    }

    public void setMemoizedSerializedSize(int i10) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            AbstractC3728m abstractC3728mF0 = AbstractC3728m.f0(bArr);
            writeTo(abstractC3728mF0);
            abstractC3728mF0.d();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(a("byte array"), e10);
        }
    }

    @Override // com.google.protobuf.InterfaceC3717g0
    public AbstractC3722j toByteString() {
        try {
            AbstractC3722j.h hVarV = AbstractC3722j.v(getSerializedSize());
            writeTo(hVarV.b());
            return hVarV.a();
        } catch (IOException e10) {
            throw new RuntimeException(this.a("ByteString"), e10);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        AbstractC3728m abstractC3728mE0 = AbstractC3728m.e0(outputStream, AbstractC3728m.I(AbstractC3728m.W(serializedSize) + serializedSize));
        abstractC3728mE0.X0(serializedSize);
        writeTo(abstractC3728mE0);
        abstractC3728mE0.b0();
    }

    public void writeTo(OutputStream outputStream) {
        AbstractC3728m abstractC3728mE0 = AbstractC3728m.e0(outputStream, AbstractC3728m.I(getSerializedSize()));
        writeTo(abstractC3728mE0);
        abstractC3728mE0.b0();
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC0382a.addAll((Iterable) iterable, (List) list);
    }
}
