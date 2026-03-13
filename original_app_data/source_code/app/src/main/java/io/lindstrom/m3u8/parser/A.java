package io.lindstrom.m3u8.parser;

import Db.y;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class A implements InterfaceC4574d {
    public static final A NAME = new a("NAME", 0);
    public static final A VALUE = new A("VALUE", 1) { // from class: io.lindstrom.m3u8.parser.A.b
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(y.a aVar, String str) {
            aVar.g(str);
        }
    };
    public static final A IMPORT = new A("IMPORT", 2) { // from class: io.lindstrom.m3u8.parser.A.c
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(y.a aVar, String str) {
            aVar.e(str);
        }
    };
    private static final /* synthetic */ A[] $VALUES = j();
    static final Map<String, A> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.z
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((A) obj).key();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends A {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(y.a aVar, String str) {
            aVar.f(name());
        }
    }

    public A(String str, int i10) {
    }

    public static /* synthetic */ A[] j() {
        return new A[]{NAME, VALUE, IMPORT};
    }

    public static Db.y p(String str, C4589t c4589t) throws y {
        y.a aVarBuilder = Db.y.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.d();
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }

    public /* synthetic */ A(String str, int i10, a aVar) {
        this(str, i10);
    }
}
