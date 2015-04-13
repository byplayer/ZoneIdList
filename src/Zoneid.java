import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Zoneid {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        Set<String> allZones = ZoneId.getAvailableZoneIds();
        List<String> zoneList = new ArrayList<String>(allZones);
        Collections.sort(zoneList);

        for (String s : zoneList) {
            ZoneId zone = ZoneId.of(s);
            ZonedDateTime zdt = dt.atZone(zone);
            ZoneOffset offset = zdt.getOffset();
            System.out.printf(String.format("%35s %10s%n", zone, offset));
        }
    }
}
