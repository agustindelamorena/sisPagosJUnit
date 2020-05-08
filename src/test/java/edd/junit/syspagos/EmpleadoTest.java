package edd.junit.syspagos;

import edd.junit.syspagos.excepciones.CargoException;
import edd.junit.syspagos.excepciones.MesesTrabajoException;
import edd.junit.syspagos.excepciones.NombreEmpleadoException;
import edd.junit.syspagos.excepciones.NumeroEmpleadoException;
import org.junit.jupiter.api.*;

import static edd.junit.syspagos.Prima.*;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class EmpleadoTest {

    @Test
    public void establecerNumero_empleado_625() {
        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("625");
        } catch (NumeroEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(625, e.getNumero_empleado());
    }

    @Test
    public void establecerNumero_empleado_464() {
        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("464");
        } catch (NumeroEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(464, e.getNumero_empleado());
    }

    @Test
    public void establecerNumero_empleado_345() {
        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("345");
        } catch (NumeroEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(345, e.getNumero_empleado());
    }

    @Test
    public void establecerNumero_empleado_056() {
        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("56");
        } catch (NumeroEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(56, e.getNumero_empleado());
    }

//    @Test
//    public void establecerNumero_empleado_1() {
//
//        Empleado e = new Empleado();
//        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
//            e.establecerNumero_empleado("1");
//        });
//    }

    @Test
    public void establecerNumero_empleado_4648() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("4648");
        });
    }

    @Test
    public void establecerNumero_empleado_000() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("000");
        });
    }

    @Test
    public void establecerNumero_empleado__5() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("-5");
        });
    }

    @Test
    public void establecerNumero_empleado_vfe() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("vfe");
        });
    }

    @Test
    public void establecerNumero_empleado_null() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("null");
        });
    }

    @Test
    public void estableceNombre_empleado_JorgeSanz() {
        Empleado e = new Empleado();
        try {
            e.estableceNombre_empleado("JorgeSanz");
        } catch (NombreEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals("JorgeSanz", e.getNombre_empleado());
    }

    @Test
    public void estableceNombre_empleado_CarlosGil() {
        Empleado e = new Empleado();
        try {
            e.estableceNombre_empleado("CarlosGil");
        } catch (NombreEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals("CarlosGil", e.getNombre_empleado());
    }

    @Test
    public void estableceNombre_empleado_MariaClos() {
        Empleado e = new Empleado();
        try {
            e.estableceNombre_empleado("MariaClos");
        } catch (NombreEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals("MariaClos", e.getNombre_empleado());
    }

    @Test
    public void estableceNombre_empleado_AndreaRoa() {
        Empleado e = new Empleado();
        try {
            e.estableceNombre_empleado("AndreaRoa");
        } catch (NombreEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals("AndreaRoa", e.getNombre_empleado());
    }

    @Test
    public void estableceNombre_empleado_JulioSala() {
        Empleado e = new Empleado();
        try {
            e.estableceNombre_empleado("JulioSala");
        } catch (NombreEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals("JulioSala", e.getNombre_empleado());
    }

    @Test
    public void estableceNombre_empleado_SilviaBas() {
        Empleado e = new Empleado();
        try {
            e.estableceNombre_empleado("SilviaBas");
        } catch (NombreEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals("SilviaBas", e.getNombre_empleado());
    }

    @Test
    public void estableceNombre_empleado_RamonGoni() {
        Empleado e = new Empleado();
        try {
            e.estableceNombre_empleado("RamonGoni");
        } catch (NombreEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals("RamonGoni", e.getNombre_empleado());
    }

    @Test
    public void estableceNombre_empleado_LidiaColl() {
        Empleado e = new Empleado();
        try {
            e.estableceNombre_empleado("LidiaColl");
        } catch (NombreEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals("LidiaColl", e.getNombre_empleado());
    }

    @Test
    public void estableceNombre_empleado_JavierRio() {
        Empleado e = new Empleado();
        try {
            e.estableceNombre_empleado("JavierRio");
        } catch (NombreEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals("JavierRio", e.getNombre_empleado());
    }

    @Test
    public void estableceNombre_empleado_SandraDot() {
        Empleado e = new Empleado();
        try {
            e.estableceNombre_empleado("SandraDot");
        } catch (NombreEmpleadoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals("SandraDot", e.getNombre_empleado());
    }

    @Test
    public void estableceNombre_empleado_MarcosPuente() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NombreEmpleadoException.class, () -> {
            e.estableceNombre_empleado("MarcosPuente");
        });
    }

    @Test
    public void estableceNombre_empleado_Marta() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NombreEmpleadoException.class, () -> {
            e.estableceNombre_empleado("Marta");
        });
    }

    @Test
    public void estableceNombre_empleado_0123456789() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NombreEmpleadoException.class, () -> {
            e.estableceNombre_empleado("0123456789");
        });
    }

    @Test
    public void estableceNombre_empleado_null() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NombreEmpleadoException.class, () -> {
            e.estableceNombre_empleado("null");
        });
    }

    @Test
    void estableceMeses_Trabajo_035() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("35");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(35,e.getMeses_trabajo());
    }

    @Test
    void estableceMeses_Trabajo_012() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("12");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(12,e.getMeses_trabajo());
    }

    @Test
    void estableceMeses_Trabajo_005() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("5");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(5,e.getMeses_trabajo());
    }

    @Test
    void estableceMeses_Trabajo_008() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("8");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(8,e.getMeses_trabajo());
    }

    @Test
    void estableceMeses_Trabajo_156() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("156");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(156,e.getMeses_trabajo());
    }

    @Test
    void estableceMeses_Trabajo_023() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("23");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(23,e.getMeses_trabajo());
    }

    @Test
    void estableceMeses_Trabajo_522() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("522");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(522,e.getMeses_trabajo());
    }

    @Test
    void estableceMeses_Trabajo_025() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("25");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(25,e.getMeses_trabajo());
    }

    @Test
    void estableceMeses_Trabajo_301() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("301");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(301,e.getMeses_trabajo());
    }

    @Test
    void estableceMeses_Trabajo_026() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("26");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(26,e.getMeses_trabajo());
    }

    @Test
    void estableceMeses_Trabajo_059() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("59");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(59,e.getMeses_trabajo());
    }

    @Test
    void estableceMeses_Trabajo_101() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("101");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(101,e.getMeses_trabajo());
    }

    @Test
    void estableceMeses_Trabajo_068() {
        Empleado e = new Empleado();
        try {
            e.estableceMeses_Trabajo("68");
        } catch (MesesTrabajoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(68,e.getMeses_trabajo());
    }

//    @Test
//    public void estableceMeses_Trabajo_12() {
//
//        Empleado e = new Empleado();
//        Exception exception = Assertions.assertThrows(MesesTrabajoException.class, () -> {
//            e.estableceMeses_Trabajo("12");
//        });
//    }

    @Test
    public void estableceMeses_Trabajo_6548() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(MesesTrabajoException.class, () -> {
            e.estableceMeses_Trabajo("6548");
        });
    }

    @Test
    public void estableceMeses_Trabajo__32() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(MesesTrabajoException.class, () -> {
            e.estableceMeses_Trabajo("-32");
        });
    }

    @Test
    public void estableceMeses_Trabajo_Dos() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(MesesTrabajoException.class, () -> {
            e.estableceMeses_Trabajo("Dos");
        });
    }

    @Test
    public void estableceMeses_Trabajo_null() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(MesesTrabajoException.class, () -> {
            e.estableceMeses_Trabajo("null");
        });
    }

    @Test
    public void establecerSerDirectivo_1() {
        Empleado e = new Empleado();
        try {
            e.establecerSerDirectivo("+");
        } catch (CargoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(true,e.getDirectivo());
    }

    @Test
    public void establecerSerDirectivo_2() {
        Empleado e = new Empleado();
        try {
            e.establecerSerDirectivo("-");
        } catch (CargoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(false,e.getDirectivo());
    }

    @Test
    public void establecerSerDirectivo_3() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(CargoException.class, () -> {
            e.establecerSerDirectivo("=");
        });
    }

    @Test
    public void establecerSerDirectivo_4() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(CargoException.class, () -> {
            e.establecerSerDirectivo("++");
        });
    }

    @Test
    public void establecerSerDirectivo_5() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(CargoException.class, () -> {
            e.establecerSerDirectivo("null");
        });
    }

    @Test
    public void calcularPrima1() {
        Empleado e = new Empleado();
        try {
            e.calcularPrima("625", "JorgeSanz", "35", "+");
        } catch (RuntimeException | NumeroEmpleadoException | NombreEmpleadoException | MesesTrabajoException |
                CargoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(P1,e.getPrima());
    }

    @Test
    public void calcularPrima2() {
        Empleado e = new Empleado();
        try {
            e.calcularPrima("464", "CarlosGil", "12", "-");
        } catch (RuntimeException | NumeroEmpleadoException | NombreEmpleadoException | MesesTrabajoException |
                CargoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(P2,e.getPrima());
    }

    @Test
    public void calcularPrima3() {
        Empleado e = new Empleado();
        try {
            e.calcularPrima("345", "MariaClos", "5", "+");
        } catch (RuntimeException | NumeroEmpleadoException | NombreEmpleadoException | MesesTrabajoException |
                CargoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(P3,e.getPrima());
    }

    @Test
    public void calcularPrima4() {
        Empleado e = new Empleado();
        try {
            e.calcularPrima("56", "AndreaRoa", "8", "-");
        } catch (RuntimeException | NumeroEmpleadoException | NombreEmpleadoException | MesesTrabajoException |
                CargoException ex) {
            Assertions.fail();
        }
        Assertions.assertEquals(P4,e.getPrima());
    }
}