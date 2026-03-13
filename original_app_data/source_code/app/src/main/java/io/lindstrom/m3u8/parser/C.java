package io.lindstrom.m3u8.parser;

import Db.A;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C implements InterfaceC4574d {
    public static final C TYPE = new a("TYPE", 0);
    public static final C URI = new C("URI", 1) { // from class: io.lindstrom.m3u8.parser.C.b
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(A.a aVar, String str) {
            aVar.j(str);
        }
    };
    public static final C BYTERANGE_START = new C("BYTERANGE_START", 2) { // from class: io.lindstrom.m3u8.parser.C.c
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(A.a aVar, String str) {
            aVar.g(Long.parseLong(str));
        }
    };
    public static final C BYTERANGE_LENGTH = new C("BYTERANGE_LENGTH", 3) { // from class: io.lindstrom.m3u8.parser.C.d
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(A.a aVar, String str) {
            aVar.f(Long.parseLong(str));
        }
    };
    private static final /* synthetic */ C[] $VALUES = j();
    static final Map<String, C> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.B
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((C) obj).key();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends C {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(A.a aVar, String str) {
            aVar.i(Db.C.valueOf(str));
        }
    }

    public C(String str, int i10) {
    }

    public static /* synthetic */ C[] j() {
        return new C[]{TYPE, URI, BYTERANGE_START, BYTERANGE_LENGTH};
    }

    public static Db.A p(String str, C4589t c4589t) throws y {
        A.a aVarBuilder = Db.A.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.e();
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) $VALUES.clone();
    }

    public /* synthetic */ C(String str, int i10, a aVar) {
        this(str, i10);
    }
}
