package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import com.google.crypto.tink.shaded.protobuf.Q;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3654a implements Q {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class AbstractC0368a implements Q.a {
        public static l0 g(Q q10) {
            return new l0(q10);
        }

        @Override // 
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public abstract AbstractC0368a clone();
    }

    public int b() {
        throw new UnsupportedOperationException();
    }

    public int c(f0 f0Var) {
        int iB = b();
        if (iB != -1) {
            return iB;
        }
        int iD = f0Var.d(this);
        f(iD);
        return iD;
    }

    public final String d(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public l0 e() {
        return new l0(this);
    }

    public void f(int i10) {
        throw new UnsupportedOperationException();
    }

    public byte[] g() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            AbstractC3664k abstractC3664kW = AbstractC3664k.W(bArr);
            a(abstractC3664kW);
            abstractC3664kW.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(d("byte array"), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public AbstractC3661h toByteString() {
        try {
            AbstractC3661h.C0369h c0369hS = AbstractC3661h.s(getSerializedSize());
            a(c0369hS.b());
            return c0369hS.a();
        } catch (IOException e10) {
            throw new RuntimeException(this.d("ByteString"), e10);
        }
    }
}
