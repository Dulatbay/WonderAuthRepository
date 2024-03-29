package kz.wonder.wonderauthrepository.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.ZoneId;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValueConstants {
    public static ZoneId ZONE_ID = ZoneId.of("UTC+06:00"); // Almaty, Kazakhstan
}
