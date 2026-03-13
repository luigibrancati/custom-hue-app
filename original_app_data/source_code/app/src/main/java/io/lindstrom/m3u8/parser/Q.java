package io.lindstrom.m3u8.parser;

import Db.S;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Q implements InterfaceC4574d {
    public static final Q TIME_OFFSET = new a("TIME_OFFSET", 0);
    public static final Q PRECISE = new Q("PRECISE", 1) { // from class: io.lindstrom.m3u8.parser.Q.b
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(S.a aVar, String str) {
            aVar.f(AbstractC4588s.g(str));
        }
    };
    private static final /* synthetic */ Q[] $VALUES = j();
    static final Map<String, Q> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.P
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((Q) obj).key();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends Q {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(S.a aVar, String str) {
            aVar.h(Double.parseDouble(str));
        }
    }

    public Q(String str, int i10) {
    }

    public static /* synthetic */ Q[] j() {
        return new Q[]{TIME_OFFSET, PRECISE};
    }

    public static Db.S p(String str, C4589t c4589t) throws y {
        S.a aVarBuilder = Db.S.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.d();
    }

    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) $VALUES.clone();
    }

    public /* synthetic */ Q(String str, int i10, a aVar) {
        this(str, i10);
    }
}
