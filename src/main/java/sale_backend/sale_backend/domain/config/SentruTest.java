package sale_backend.sale_backend.domain.config;

import io.sentry.Sentry;

public class SentruTest {
    public  void sentrTest() {
        try {
            throw new IllegalArgumentException("This is a test.");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
    }
}
