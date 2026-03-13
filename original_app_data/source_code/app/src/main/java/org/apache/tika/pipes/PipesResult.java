package org.apache.tika.pipes;

import org.apache.tika.pipes.emitter.EmitData;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PipesResult {
    private final EmitData emitData;
    private boolean intermediate;
    private final String message;
    private final STATUS status;
    public static final PipesResult CLIENT_UNAVAILABLE_WITHIN_MS = new PipesResult(STATUS.CLIENT_UNAVAILABLE_WITHIN_MS);
    public static final PipesResult TIMEOUT = new PipesResult(STATUS.TIMEOUT);
    public static final PipesResult OOM = new PipesResult(STATUS.OOM);
    public static final PipesResult UNSPECIFIED_CRASH = new PipesResult(STATUS.UNSPECIFIED_CRASH);
    public static final PipesResult EMIT_SUCCESS = new PipesResult(STATUS.EMIT_SUCCESS);
    public static final PipesResult INTERRUPTED_EXCEPTION = new PipesResult(STATUS.INTERRUPTED_EXCEPTION);
    public static final PipesResult EMPTY_OUTPUT = new PipesResult(STATUS.EMPTY_OUTPUT);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum STATUS {
        CLIENT_UNAVAILABLE_WITHIN_MS,
        FETCHER_INITIALIZATION_EXCEPTION,
        FETCH_EXCEPTION,
        EMPTY_OUTPUT,
        PARSE_EXCEPTION_NO_EMIT,
        PARSE_EXCEPTION_EMIT,
        PARSE_SUCCESS,
        PARSE_SUCCESS_WITH_EXCEPTION,
        OOM,
        TIMEOUT,
        UNSPECIFIED_CRASH,
        NO_EMITTER_FOUND,
        EMIT_SUCCESS,
        EMIT_SUCCESS_PARSE_EXCEPTION,
        EMIT_EXCEPTION,
        INTERRUPTED_EXCEPTION,
        NO_FETCHER_FOUND,
        INTERMEDIATE_RESULT
    }

    private PipesResult(STATUS status, EmitData emitData, String str, boolean z10) {
        this.status = status;
        this.emitData = emitData;
        this.message = str;
        this.intermediate = z10;
    }

    public EmitData getEmitData() {
        return this.emitData;
    }

    public String getMessage() {
        return this.message;
    }

    public STATUS getStatus() {
        return this.status;
    }

    public boolean isIntermediate() {
        return this.intermediate;
    }

    public String toString() {
        return "PipesResult{intermediate=" + this.intermediate + ", status=" + String.valueOf(this.status) + ", emitData=" + String.valueOf(this.emitData) + ", message='" + this.message + "'}";
    }

    public PipesResult(STATUS status) {
        this(status, null, null, false);
    }

    public PipesResult(STATUS status, String str) {
        this(status, null, str, false);
    }

    public PipesResult(EmitData emitData) {
        this(STATUS.PARSE_SUCCESS, emitData, null, false);
    }

    public PipesResult(STATUS status, EmitData emitData, boolean z10) {
        this(status, emitData, null, z10);
    }

    public PipesResult(EmitData emitData, String str) {
        this(STATUS.PARSE_SUCCESS_WITH_EXCEPTION, emitData, str, false);
    }
}
