package fd;

import md.j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum x implements j.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);

    private static j.b internalValueMap = new j.b() { // from class: fd.x.a
        @Override // md.j.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x findValueByNumber(int i10) {
            return x.a(i10);
        }
    };
    private final int value;

    x(int i10, int i11) {
        this.value = i11;
    }

    public static x a(int i10) {
        if (i10 == 0) {
            return INTERNAL;
        }
        if (i10 == 1) {
            return PRIVATE;
        }
        if (i10 == 2) {
            return PROTECTED;
        }
        if (i10 == 3) {
            return PUBLIC;
        }
        if (i10 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i10 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // md.j.a
    public final int getNumber() {
        return this.value;
    }
}
