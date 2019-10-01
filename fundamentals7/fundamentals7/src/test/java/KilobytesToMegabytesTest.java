import com.manchesterdigital.KilobytesToMegabytes;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class KilobytesToMegabytesTest {

    @Test
    public void convertOneMegabyteToKilobyte() {
        // Arrange
        int numberInKilobytes = 1024;
        String expected = "1MB";

        // Act
        String result = KilobytesToMegabytes.convert(numberInKilobytes);

        // Assert
        Assertions.assertThat(result).isEqualTo(expected);

    }

    @Test
    public void convertTwoMegabytesToKilobytes() {
        // Arrange
        int numberInKilobytes = 2048;
        String expected = "2MB";

        // Act
        String result = KilobytesToMegabytes.convert(numberInKilobytes);

        // Assert
        Assertions.assertThat(result).isEqualTo(expected);

    }

    @Test
    public void convert2050MegabytesToKilobytes() {
        // Arrange
        int numberInKilobytes = 2050;
        String expected = "2MB and 2KB";

        // Act
        String result = KilobytesToMegabytes.convert(numberInKilobytes);

        // Assert
        Assertions.assertThat(result).isEqualTo(expected);

    }
}
