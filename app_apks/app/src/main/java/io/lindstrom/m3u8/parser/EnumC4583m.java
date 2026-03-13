package io.lindstrom.m3u8.parser;

import Db.InterfaceC0767n;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: io.lindstrom.m3u8.parser.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC4583m implements S {
    public static final EnumC4583m EXT_X_PART = new a("EXT_X_PART", 0);
    public static final EnumC4583m EXT_X_PRELOAD_HINT = new EnumC4583m("EXT_X_PRELOAD_HINT", 1) { // from class: io.lindstrom.m3u8.parser.m.b
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.U(C.p(str, c4589t));
        }
    };
    public static final EnumC4583m EXT_X_RENDITION_REPORT = new EnumC4583m("EXT_X_RENDITION_REPORT", 2) { // from class: io.lindstrom.m3u8.parser.m.c
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.C(E.p(str, c4589t));
        }
    };
    public static final EnumC4583m EXT_X_ENDLIST = new EnumC4583m("EXT_X_ENDLIST", 3) { // from class: io.lindstrom.m3u8.parser.m.d
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.P(false);
        }
    };
    private static final /* synthetic */ EnumC4583m[] $VALUES = b();
    static final Map<String, EnumC4583m> tags = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.l
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((EnumC4583m) obj).tag();
        }
    });

    public EnumC4583m(String str, int i10) {
    }

    public static /* synthetic */ EnumC4583m[] b() {
        return new EnumC4583m[]{EXT_X_PART, EXT_X_PRELOAD_HINT, EXT_X_RENDITION_REPORT, EXT_X_ENDLIST};
    }

    public static EnumC4583m valueOf(String str) {
        return (EnumC4583m) Enum.valueOf(EnumC4583m.class, str);
    }

    public static EnumC4583m[] values() {
        return (EnumC4583m[]) $VALUES.clone();
    }

    public /* synthetic */ EnumC4583m(String str, int i10, a aVar) {
        this(str, i10);
    }

    /* JADX INFO: renamed from: io.lindstrom.m3u8.parser.m$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends EnumC4583m {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
        }
    }
}
