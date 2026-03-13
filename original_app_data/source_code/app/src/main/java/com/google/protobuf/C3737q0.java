package com.google.protobuf;

import com.google.protobuf.AbstractC3722j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3737q0 extends AbstractC3722j.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteBuffer f32328e;

    public C3737q0(ByteBuffer byteBuffer) {
        N.b(byteBuffer, "buffer");
        this.f32328e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    @Override // com.google.protobuf.AbstractC3722j
    public String I(Charset charset) {
        byte[] bArrA;
        int length;
        int iArrayOffset;
        if (this.f32328e.hasArray()) {
            bArrA = this.f32328e.array();
            iArrayOffset = this.f32328e.arrayOffset() + this.f32328e.position();
            length = this.f32328e.remaining();
        } else {
            bArrA = A();
            length = bArrA.length;
            iArrayOffset = 0;
        }
        return new String(bArrA, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.AbstractC3722j
    public void P(AbstractC3720i abstractC3720i) {
        abstractC3720i.a(this.f32328e.slice());
    }

    public final ByteBuffer Q(int i10, int i11) {
        if (i10 < this.f32328e.position() || i11 > this.f32328e.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = this.f32328e.slice();
        P.b(byteBufferSlice, i10 - this.f32328e.position());
        P.a(byteBufferSlice, i11 - this.f32328e.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.AbstractC3722j
    public ByteBuffer d() {
        return this.f32328e.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC3722j
    public byte e(int i10) {
        try {
            return this.f32328e.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC3722j
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3722j)) {
            return false;
        }
        AbstractC3722j abstractC3722j = (AbstractC3722j) obj;
        if (size() != abstractC3722j.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof C3737q0 ? this.f32328e.equals(((C3737q0) obj).f32328e) : this.f32328e.equals(abstractC3722j.d());
    }

    @Override // com.google.protobuf.AbstractC3722j
    public void p(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.f32328e.slice();
        P.b(byteBufferSlice, i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // com.google.protobuf.AbstractC3722j
    public byte r(int i10) {
        return e(i10);
    }

    @Override // com.google.protobuf.AbstractC3722j
    public boolean s() {
        return O0.r(this.f32328e);
    }

    @Override // com.google.protobuf.AbstractC3722j
    public int size() {
        return this.f32328e.remaining();
    }

    @Override // com.google.protobuf.AbstractC3722j
    public AbstractC3724k w() {
        return AbstractC3724k.k(this.f32328e, true);
    }

    @Override // com.google.protobuf.AbstractC3722j
    public int x(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f32328e.get(i13);
        }
        return i10;
    }

    @Override // com.google.protobuf.AbstractC3722j
    public AbstractC3722j z(int i10, int i11) {
        try {
            return new C3737q0(Q(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }
}
