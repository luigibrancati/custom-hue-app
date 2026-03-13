package io.lindstrom.m3u8.parser;

import Db.InterfaceC0754a;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: io.lindstrom.m3u8.parser.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC4573c implements InterfaceC4574d {
    public static final EnumC4573c TYPE = new e("TYPE", 0);
    public static final EnumC4573c URI = new EnumC4573c("URI", 1) { // from class: io.lindstrom.m3u8.parser.c.f
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.E(str);
        }
    };
    public static final EnumC4573c GROUP_ID = new EnumC4573c("GROUP_ID", 2) { // from class: io.lindstrom.m3u8.parser.c.g
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.y(str);
        }
    };
    public static final EnumC4573c LANGUAGE = new EnumC4573c("LANGUAGE", 3) { // from class: io.lindstrom.m3u8.parser.c.h
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.A(str);
        }
    };
    public static final EnumC4573c ASSOC_LANGUAGE = new EnumC4573c("ASSOC_LANGUAGE", 4) { // from class: io.lindstrom.m3u8.parser.c.i
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.p(str);
        }
    };
    public static final EnumC4573c NAME = new EnumC4573c("NAME", 5) { // from class: io.lindstrom.m3u8.parser.c.j
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.B(str);
        }
    };
    public static final EnumC4573c STABLE_RENDITION_ID = new EnumC4573c("STABLE_RENDITION_ID", 6) { // from class: io.lindstrom.m3u8.parser.c.k
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.C(str);
        }
    };
    public static final EnumC4573c DEFAULT = new EnumC4573c("DEFAULT", 7) { // from class: io.lindstrom.m3u8.parser.c.l
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.v(AbstractC4588s.g(str));
        }
    };
    public static final EnumC4573c AUTOSELECT = new EnumC4573c("AUTOSELECT", 8) { // from class: io.lindstrom.m3u8.parser.c.m
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.q(AbstractC4588s.g(str));
        }
    };
    public static final EnumC4573c FORCED = new EnumC4573c("FORCED", 9) { // from class: io.lindstrom.m3u8.parser.c.a
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.w(AbstractC4588s.g(str));
        }
    };
    public static final EnumC4573c INSTREAM_ID = new EnumC4573c("INSTREAM_ID", 10) { // from class: io.lindstrom.m3u8.parser.c.b
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.z(str);
        }
    };
    public static final EnumC4573c CHARACTERISTICS = new EnumC4573c("CHARACTERISTICS", 11) { // from class: io.lindstrom.m3u8.parser.c.c
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.t(AbstractC4588s.e(str, ","));
        }
    };
    public static final EnumC4573c CHANNELS = new EnumC4573c("CHANNELS", 12) { // from class: io.lindstrom.m3u8.parser.c.d
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.s(AbstractC4588s.b(str));
        }
    };
    private static final /* synthetic */ EnumC4573c[] $VALUES = j();
    static final Map<String, EnumC4573c> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.b
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((EnumC4573c) obj).key();
        }
    });

    /* JADX INFO: renamed from: io.lindstrom.m3u8.parser.c$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum e extends EnumC4573c {
        public e(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0754a.C0039a c0039a, String str) {
            c0039a.D(Db.r.b(str));
        }
    }

    public EnumC4573c(String str, int i10) {
    }

    public static /* synthetic */ EnumC4573c[] j() {
        return new EnumC4573c[]{TYPE, URI, GROUP_ID, LANGUAGE, ASSOC_LANGUAGE, NAME, STABLE_RENDITION_ID, DEFAULT, AUTOSELECT, FORCED, INSTREAM_ID, CHARACTERISTICS, CHANNELS};
    }

    public static InterfaceC0754a p(String str, C4589t c4589t) throws y {
        InterfaceC0754a.C0039a c0039aBuilder = InterfaceC0754a.builder();
        AbstractC4588s.d(attributeMap, str, c0039aBuilder, c4589t);
        return c0039aBuilder.r();
    }

    public static EnumC4573c valueOf(String str) {
        return (EnumC4573c) Enum.valueOf(EnumC4573c.class, str);
    }

    public static EnumC4573c[] values() {
        return (EnumC4573c[]) $VALUES.clone();
    }

    public /* synthetic */ EnumC4573c(String str, int i10, e eVar) {
        this(str, i10);
    }
}
