package co.edu.uniandes.csw.mp.ann.test;

import co.edu.uniandes.csw.mp.ann.MPAnnotationProcessorSpoon;
import org.junit.Test;
import spoon.Launcher;
import spoon.SpoonAPI;

/**
 * Test de la anotación. Inicializa el launcher para que corra.
 *
 * @author Wilmar Fuquen
 */
public class MPAnnotationTest {

    @Test
    public void testBoundProcessor() throws Exception {
        SpoonAPI launcher = new Launcher();
        launcher.getEnvironment().setNoClasspath(true);
        launcher.addInputResource("./src/main/java");
        launcher.setSourceOutputDirectory("./target/spoon-processor");
        launcher.addProcessor(new MPAnnotationProcessorSpoon());
        launcher.run();
    }
}
