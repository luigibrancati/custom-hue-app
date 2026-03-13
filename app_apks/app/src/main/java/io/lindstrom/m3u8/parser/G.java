package io.lindstrom.m3u8.parser;

import Db.EnumC0764k;
import Db.H;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class G implements InterfaceC4574d {
    public static final G METHOD = new a("METHOD", 0);
    public static final G URI = new G("URI", 1) { // from class: io.lindstrom.m3u8.parser.G.b
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(H.a aVar, String str) {
            aVar.l(str);
        }
    };
    public static final G IV = new G("IV", 2) { // from class: io.lindstrom.m3u8.parser.G.c
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(H.a aVar, String str) {
            aVar.h(str);
        }
    };
    public static final G KEYFORMAT = new G("KEYFORMAT", 3) { // from class: io.lindstrom.m3u8.parser.G.d
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(H.a aVar, String str) {
            aVar.i(str);
        }
    };
    public static final G KEYFORMATVERSIONS = new G("KEYFORMATVERSIONS", 4) { // from class: io.lindstrom.m3u8.parser.G.e
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(H.a aVar, String str) {
            aVar.j(str);
        }
    };
    private static final /* synthetic */ G[] $VALUES = j();
    static final Map<String, G> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.F
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((G) obj).key();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends G {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(H.a aVar, String str) {
            aVar.k(EnumC0764k.b(str));
        }
    }

    public G(String str, int i10) {
    }

    public static /* synthetic */ G[] j() {
        return new G[]{METHOD, URI, IV, KEYFORMAT, KEYFORMATVERSIONS};
    }

    public static Db.H p(String str, C4589t c4589t) throws y {
        H.a aVarBuilder = Db.H.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.f();
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) $VALUES.clone();
    }

    public /* synthetic */ G(String str, int i10, a aVar) {
        this(str, i10);
    }
}
