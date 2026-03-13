package q2;

import G1.AbstractC0853a;
import i2.InterfaceC4337q;
import i2.z;

/* JADX INFO: renamed from: q2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5482d extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43098b;

    public C5482d(InterfaceC4337q interfaceC4337q, long j10) {
        super(interfaceC4337q);
        AbstractC0853a.a(interfaceC4337q.getPosition() >= j10);
        this.f43098b = j10;
    }

    @Override // i2.z, i2.InterfaceC4337q
    public long getLength() {
        return super.getLength() - this.f43098b;
    }

    @Override // i2.z, i2.InterfaceC4337q
    public long getPosition() {
        return super.getPosition() - this.f43098b;
    }

    @Override // i2.z, i2.InterfaceC4337q
    public long m() {
        return super.m() - this.f43098b;
    }
}
