package io.lindstrom.m3u8.parser;

import Db.N;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class M implements InterfaceC4574d {
    public static final M DATA_ID = new a("DATA_ID", 0);
    public static final M VALUE = new M("VALUE", 1) { // from class: io.lindstrom.m3u8.parser.M.b
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(N.a aVar, String str) {
            aVar.j(str);
        }
    };
    public static final M URI = new M("URI", 2) { // from class: io.lindstrom.m3u8.parser.M.c
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(N.a aVar, String str) {
            aVar.i(str);
        }
    };
    public static final M LANGUAGE = new M("LANGUAGE", 3) { // from class: io.lindstrom.m3u8.parser.M.d
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(N.a aVar, String str) {
            aVar.h(str);
        }
    };
    private static final /* synthetic */ M[] $VALUES = j();
    static final Map<String, M> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.L
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((M) obj).key();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends M {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(N.a aVar, String str) {
            aVar.f(str);
        }
    }

    public M(String str, int i10) {
    }

    public static /* synthetic */ M[] j() {
        return new M[]{DATA_ID, VALUE, URI, LANGUAGE};
    }

    public static Db.N p(String str, C4589t c4589t) throws y {
        N.a aVarBuilder = Db.N.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.e();
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) $VALUES.clone();
    }

    public /* synthetic */ M(String str, int i10, a aVar) {
        this(str, i10);
    }
}
