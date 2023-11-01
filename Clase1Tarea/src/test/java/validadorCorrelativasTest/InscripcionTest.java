package validadorCorrelativasTest;

import validadorCorrelativas.Alumno;
import validadorCorrelativas.Inscripcion;
import validadorCorrelativas.Materia;
//import static org.junit.Assert.*;

public class InscripcionTest {
    @Test
    public void pruebaLoanaPuedeAnotarseAProgramacionI(){
        Alumno loana = new Alumno("Loana","42622026");
        Materia programacionI = new Materia("Programación I"); //Esta Materia no tendrá correlativas
        Inscripcion inscripcionLoanaAProgramacionI= new Inscripcion(loana,programacionI);

        //me da error el Assertions.
        //Assertions.assertTrue(inscripcionLoanaAProgramacionI.aprobada());
    }

    @Test
    public void pruebaLoanaNoPuedeAnotarseAProgramacionI(){
        Alumno loana = new Alumno("Loana","42622026");
        Materia programacionI = new Materia("Programación I"); //Esta Materia no tendrá correlativas
        Materia programacionII = new Materia("Programación II"); //Tiene correlativa Programacion I

        programacionII.agregarCorrelativa(programacionII);

        Inscripcion inscripcionLoanaAProgramacionII= new Inscripcion(loana,programacionII);


        //me da error el Assertions.
        //Assertions.assertFalse(inscripcionLoanaAProgramacionII.aprobada());
    }

    @Test
    public void pruebaLoanaSePuedeAnotarseAProgramacionI(){
        Alumno loana = new Alumno("Loana","42622026");
        Materia programacionI = new Materia("Programación I"); //Esta Materia no tendrá correlativas
        Materia programacionII = new Materia("Programación II"); //Tiene correlativa Programacion I

        programacionII.agregarCorrelativa(programacionII);

        loana.agregarMateriaAprobada(programacionI);

        Inscripcion inscripcionLoanaAProgramacionII= new Inscripcion(loana,programacionII);


        //me da error el Assertions.
        //Assertions.assertFalse(inscripcionLoanaAProgramacionII.aprobada());
    }
}
