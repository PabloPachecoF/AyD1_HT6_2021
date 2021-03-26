package Proceso;

import Objetos.Carrera;
import Objetos.Estudiante;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;


/**
 *
 * @author Pablo
 */
public class PabloCesarPachecoFuentesUedi {   
    
    @Mock
    private AsignarHorario AsignarHorario;

    @Mock
    private RegistroAcademico RegistroAcademico;
    
    @Mock
    private Horario Horario;
    
    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void Mock1ObtenerHorario()
    {
        //Objeto para asignar el horario
        AsignarHorario = new AsignarHorario();
        
        when(Horario.getDescripcion()).thenReturn("HorarioActual");
        
        assertEquals("HorarioActual", AsignarHorario.VerDescripcion());
        
    }
    
    @Test
    public void Mock2RegistroAcademico()
    {        
        when(RegistroAcademico.getAnio()).thenReturn(2021);
        when(RegistroAcademico.getCorrelativo()).thenReturn("000000");
        
        assertEquals(false, RegistroAcademico.cheequearCarnet());
    }

}