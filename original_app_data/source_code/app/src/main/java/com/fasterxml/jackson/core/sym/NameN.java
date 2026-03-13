package com.fasterxml.jackson.core.sym;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class NameN extends Name {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int[] f28893q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private final int f28894q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    private final int f28895q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private final int f28896q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private final int f28897q4;
    private final int qlen;

    public NameN(String str, int i10, int i11, int i12, int i13, int i14, int[] iArr, int i15) {
        super(str, i10);
        this.f28894q1 = i11;
        this.f28895q2 = i12;
        this.f28896q3 = i13;
        this.f28897q4 = i14;
        this.f28893q = iArr;
        this.qlen = i15;
    }

    private final boolean _equals2(int[] iArr) {
        int i10 = this.qlen - 4;
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11 + 4] != this.f28893q[i11]) {
                return false;
            }
        }
        return true;
    }

    public static NameN construct(String str, int i10, int[] iArr, int i11) {
        if (i11 >= 4) {
            return new NameN(str, i10, iArr[0], iArr[1], iArr[2], iArr[3], i11 + (-4) > 0 ? Arrays.copyOfRange(iArr, 4, i11) : null, i11);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i10) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i10, int i11) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i10, int i11, int i12) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i10) {
        if (i10 != this.qlen || iArr[0] != this.f28894q1 || iArr[1] != this.f28895q2 || iArr[2] != this.f28896q3 || iArr[3] != this.f28897q4) {
            return false;
        }
        switch (i10) {
            case 5:
                if (iArr[4] == this.f28893q[0]) {
                }
                break;
            case 6:
                if (iArr[5] != this.f28893q[1]) {
                }
                if (iArr[4] == this.f28893q[0]) {
                }
                break;
            case 7:
                if (iArr[6] != this.f28893q[2]) {
                }
                if (iArr[5] != this.f28893q[1]) {
                }
                if (iArr[4] == this.f28893q[0]) {
                }
                break;
            case 8:
                if (iArr[7] != this.f28893q[3]) {
                }
                if (iArr[6] != this.f28893q[2]) {
                }
                if (iArr[5] != this.f28893q[1]) {
                }
                if (iArr[4] == this.f28893q[0]) {
                }
                break;
        }
        return false;
    }
}
