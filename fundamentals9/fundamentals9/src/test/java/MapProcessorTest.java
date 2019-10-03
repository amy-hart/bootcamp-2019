import com.manchesterdigital.MapProcessor;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapProcessorTest {
    @Test
    public void whenOnlyAKeyIsPresentReturnOriginalMap() {
        // Arrange
        MapProcessor mapProcessor = new MapProcessor();
        Map<String, String> mapWithA = new HashMap<>();
        mapWithA.put("a", "Hello");

        // Act
        Map<String, String> result = mapProcessor.mapAB(mapWithA);

        // Assert
        Assertions.assertThat(result).isEqualTo(mapWithA);
    }

    @Test
    public void whenBothAKeyAndBKeyArePresentReturnNewMap() {
        // Arrange
        MapProcessor mapProcessor = new MapProcessor();
        Map<String, String> mapWithAB = new HashMap<>();
        mapWithAB.put("a", "Hello");
        mapWithAB.put("b", "World");

        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("a", "Hello");
        expectedMap.put("ab", "HelloWorld");
        expectedMap.put("b", "World");

        // Act
        Map<String, String> result = mapProcessor.mapAB(mapWithAB);

        // Assert
        Assertions.assertThat(result).isEqualTo(expectedMap);
    }

}

