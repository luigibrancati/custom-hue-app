package org.apache.tika.utils;

import androidx.core.app.NotificationManagerCompat;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ProcessUtils {
    private static final ConcurrentHashMap<String, Process> PROCESS_MAP = new ConcurrentHashMap<>();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() { // from class: org.apache.tika.utils.b
            @Override // java.lang.Runnable
            public final void run() {
                ProcessUtils.PROCESS_MAP.forEachValue(1L, new org.apache.tika.parser.b());
            }
        }));
    }

    public static String escapeCommandLine(String str) {
        if (str == null || !str.contains(StringUtils.SPACE) || !SystemUtils.IS_OS_WINDOWS || str.startsWith("\"") || str.endsWith("\"")) {
            return str;
        }
        return "\"" + str + "\"";
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.tika.utils.FileProcessResult execute(java.lang.ProcessBuilder r11, long r12, int r14, int r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.utils.ProcessUtils.execute(java.lang.ProcessBuilder, long, int, int):org.apache.tika.utils.FileProcessResult");
    }

    private static String register(Process process) {
        String string = UUID.randomUUID().toString();
        PROCESS_MAP.put(string, process);
        return string;
    }

    private static Process release(String str) {
        return PROCESS_MAP.remove(str);
    }

    public static String unescapeCommandLine(String str) {
        return (str.contains(StringUtils.SPACE) && SystemUtils.IS_OS_WINDOWS && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }

    public static FileProcessResult execute(ProcessBuilder processBuilder, long j10, Path path, int i10) throws Throwable {
        String str;
        Process processStart;
        boolean zWaitFor;
        int iExitValue;
        if (!Files.isDirectory(path.getParent(), new LinkOption[0])) {
            Files.createDirectories(path.getParent(), new FileAttribute[0]);
        }
        processBuilder.redirectOutput(path.toFile());
        Process process = null;
        String strRegister = null;
        try {
            processStart = processBuilder.start();
        } catch (Throwable th) {
            th = th;
            str = null;
        }
        try {
            strRegister = register(processStart);
            long jCurrentTimeMillis = System.currentTimeMillis();
            StreamGobbler streamGobbler = new StreamGobbler(processStart.getErrorStream(), i10);
            Thread thread = new Thread(streamGobbler);
            thread.start();
            long jCurrentTimeMillis2 = -1;
            try {
                zWaitFor = processStart.waitFor(j10, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                zWaitFor = false;
            }
            try {
                jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (zWaitFor) {
                    iExitValue = processStart.exitValue();
                    thread.join(1000L);
                } else {
                    processStart.destroyForcibly();
                    thread.join(1000L);
                    iExitValue = -1;
                }
            } catch (InterruptedException unused2) {
                iExitValue = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            }
            FileProcessResult fileProcessResult = new FileProcessResult();
            fileProcessResult.processTimeMillis = jCurrentTimeMillis2;
            fileProcessResult.stderrLength = streamGobbler.getStreamLength();
            fileProcessResult.stdoutLength = Files.size(path);
            fileProcessResult.isTimeout = !zWaitFor;
            fileProcessResult.exitValue = iExitValue;
            fileProcessResult.stdout = "";
            fileProcessResult.stderr = StringUtils.joinWith("\n", streamGobbler.getLines());
            fileProcessResult.stdoutTruncated = false;
            fileProcessResult.stderrTruncated = streamGobbler.getIsTruncated();
            processStart.destroyForcibly();
            release(strRegister);
            return fileProcessResult;
        } catch (Throwable th2) {
            th = th2;
            String str2 = strRegister;
            process = processStart;
            str = str2;
            if (process != null) {
                process.destroyForcibly();
            }
            release(str);
            throw th;
        }
    }
}
