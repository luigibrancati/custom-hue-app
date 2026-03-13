package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class DefaultIndenter extends DefaultPrettyPrinter.NopIndenter {
    private static final int INDENT_LEVELS = 16;
    public static final DefaultIndenter SYSTEM_LINEFEED_INSTANCE;
    public static final String SYS_LF;
    private static final long serialVersionUID = 1;
    private final int charsPerLevel;
    private final String eol;
    private final char[] indents;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        SYS_LF = property;
        SYSTEM_LINEFEED_INSTANCE = new DefaultIndenter("  ", property);
    }

    public DefaultIndenter() {
        this("  ", SYS_LF);
    }

    public String getEol() {
        return this.eol;
    }

    public String getIndent() {
        return new String(this.indents, 0, this.charsPerLevel);
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public boolean isInline() {
        return false;
    }

    public DefaultIndenter withIndent(String str) {
        return str.equals(getIndent()) ? this : new DefaultIndenter(str, this.eol);
    }

    public DefaultIndenter withLinefeed(String str) {
        return str.equals(this.eol) ? this : new DefaultIndenter(getIndent(), str);
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public void writeIndentation(JsonGenerator jsonGenerator, int i10) {
        jsonGenerator.writeRaw(this.eol);
        if (i10 <= 0) {
            return;
        }
        int length = i10 * this.charsPerLevel;
        while (true) {
            char[] cArr = this.indents;
            if (length <= cArr.length) {
                jsonGenerator.writeRaw(cArr, 0, length);
                return;
            } else {
                jsonGenerator.writeRaw(cArr, 0, cArr.length);
                length -= this.indents.length;
            }
        }
    }

    public DefaultIndenter(String str, String str2) {
        this.charsPerLevel = str.length();
        this.indents = new char[str.length() * 16];
        int length = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            str.getChars(0, str.length(), this.indents, length);
            length += str.length();
        }
        this.eol = str2;
    }
}
